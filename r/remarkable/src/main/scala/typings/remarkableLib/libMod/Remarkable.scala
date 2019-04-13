package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Remarkable extends js.Object {
  var block: remarkableLib.Anon_RulerBlockParsingRule = js.native
  var core: remarkableLib.Anon_RulerCoreParsingRule = js.native
  var `inline`: remarkableLib.Anon_Ruler = js.native
  var renderer: remarkableLib.libRendererMod.^ = js.native
  /**
    * Batch loader for components rules states, and options.
    */
  def configure(presets: Presets): scala.Unit = js.native
  /**
    * Parse the input `string` and return a tokens array.
    * Modifies `env` with definitions data.
    */
  def parse(str: java.lang.String, env: Env): js.Array[Token] = js.native
  /**
    * Parse the given content `string` as a single string.
    */
  def parseInline(str: java.lang.String, env: Env): js.Array[Token] = js.native
  /**
    * `"# Remarkable rulezz!"` => `"<h1>Remarkable rulezz!</h1>"`
    */
  def render(markdown: java.lang.String): java.lang.String = js.native
  def render(markdown: java.lang.String, env: Env): java.lang.String = js.native
  /**
    * Render a single content `string`, without wrapping it
    * to paragraphs.
    */
  def renderInline(str: java.lang.String): java.lang.String = js.native
  def renderInline(str: java.lang.String, env: Env): java.lang.String = js.native
  /**
    * Define options.
    *
    * Note: To achieve the best possible performance, don't modify a Remarkable instance
    * on the fly. If you need multiple configurations, create multiple instances and
    * initialize each with a configuration that is ideal for that instance.
    */
  def set(options: Options): scala.Unit = js.native
  /**
    * Use a plugin.
    */
  def use(plugin: Plugin): Remarkable = js.native
  def use(plugin: Plugin, options: js.Any): Remarkable = js.native
}

