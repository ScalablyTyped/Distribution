package typings.remarkable.libMod

import typings.remarkable.AnonRuler
import typings.remarkable.AnonRulerBlockParsingRule
import typings.remarkable.AnonRulerCoreParsingRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Remarkable extends js.Object {
  var block: AnonRulerBlockParsingRule = js.native
  var core: AnonRulerCoreParsingRule = js.native
  var `inline`: AnonRuler = js.native
  var renderer: typings.remarkable.rendererMod.^ = js.native
  /**
    * Batch loader for components rules states, and options.
    */
  def configure(presets: Presets): Unit = js.native
  /**
    * Parse the input `string` and return a tokens array.
    * Modifies `env` with definitions data.
    */
  def parse(str: String, env: Env): js.Array[Token] = js.native
  /**
    * Parse the given content `string` as a single string.
    */
  def parseInline(str: String, env: Env): js.Array[Token] = js.native
  /**
    * `"# Remarkable rulezz!"` => `"<h1>Remarkable rulezz!</h1>"`
    */
  def render(markdown: String): String = js.native
  def render(markdown: String, env: Env): String = js.native
  /**
    * Render a single content `string`, without wrapping it
    * to paragraphs.
    */
  def renderInline(str: String): String = js.native
  def renderInline(str: String, env: Env): String = js.native
  /**
    * Define options.
    *
    * Note: To achieve the best possible performance, don't modify a Remarkable instance
    * on the fly. If you need multiple configurations, create multiple instances and
    * initialize each with a configuration that is ideal for that instance.
    */
  def set(options: Options): Unit = js.native
  /**
    * Use a plugin.
    */
  def use(plugin: Plugin): Remarkable = js.native
  def use(plugin: Plugin, options: js.Any): Remarkable = js.native
}

