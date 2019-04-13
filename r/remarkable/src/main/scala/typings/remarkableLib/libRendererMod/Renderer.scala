package typings
package remarkableLib.libRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Renderer class. Renders HTML and exposes `rules` to allow
  * local modifications.
  */
@js.native
trait Renderer extends js.Object {
  /**
    * Exported helper, for custom rules only.
    */
  @JSName("getBreak")
  var getBreak_Original: remarkableLib.libMod.GetBreak = js.native
  var rules: remarkableLib.libMod.Rules = js.native
  /**
    * Exported helper, for custom rules only.
    */
  def getBreak(tokens: js.Array[remarkableLib.libMod.ContentToken], idx: scala.Double): remarkableLib.remarkableLibStrings.Empty | remarkableLib.remarkableLibStrings.BACKSLASHn = js.native
  /**
    * Render a string of HTML with the given `tokens` and
    * `options`.
    */
  def render(
    tokens: js.Array[remarkableLib.libMod.Token],
    options: remarkableLib.libMod.Options,
    env: remarkableLib.libMod.Env
  ): java.lang.String = js.native
  /**
    * Render a string of inline HTML with the given `tokens` and
    * `options`.
    */
  def renderInline(
    tokens: js.Array[remarkableLib.libMod.Token],
    options: remarkableLib.libMod.Options,
    env: remarkableLib.libMod.Env
  ): java.lang.String = js.native
}

