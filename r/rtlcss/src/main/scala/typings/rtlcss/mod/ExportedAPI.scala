package typings.rtlcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportedAPI extends js.Object {
  /**
    * Creates a new instance of RTLCSS using the passed configuration object.
    */
  def configure(config: ConfigOptions): js.Object = js.native
  /**
    * Creates a new RTLCSS instance, process the input and return its result.
    */
  def process(css: String): String = js.native
  def process(
    css: String,
    options: js.UndefOr[scala.Nothing],
    plugins: js.UndefOr[scala.Nothing],
    hooks: HookOptions
  ): String = js.native
  def process(css: String, options: js.UndefOr[scala.Nothing], plugins: js.Array[String]): String = js.native
  def process(css: String, options: js.UndefOr[scala.Nothing], plugins: js.Array[String], hooks: HookOptions): String = js.native
  def process(css: String, options: js.UndefOr[scala.Nothing], plugins: js.Object): String = js.native
  def process(css: String, options: js.UndefOr[scala.Nothing], plugins: js.Object, hooks: HookOptions): String = js.native
  def process(css: String, options: js.Object): String = js.native
  def process(css: String, options: js.Object, plugins: js.UndefOr[scala.Nothing], hooks: HookOptions): String = js.native
  def process(css: String, options: js.Object, plugins: js.Array[String]): String = js.native
  def process(css: String, options: js.Object, plugins: js.Array[String], hooks: HookOptions): String = js.native
  def process(css: String, options: js.Object, plugins: js.Object): String = js.native
  def process(css: String, options: js.Object, plugins: js.Object, hooks: HookOptions): String = js.native
}

