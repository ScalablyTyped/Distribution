package typings
package prettyjsonLib.prettyjsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RendererOptions extends js.Object {
  var dashColor: js.UndefOr[java.lang.String] = js.undefined
  var defaultIndentation: js.UndefOr[scala.Double] = js.undefined
  /**
    * Define behavior for Array objects
    */
  var emptyArrayMsg: js.UndefOr[java.lang.String] = js.undefined
    // default: (empty)
  var inlineArrays: js.UndefOr[scala.Boolean] = js.undefined
  var keysColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Color definition
    */
  var noColor: js.UndefOr[scala.Boolean] = js.undefined
  var numberColor: js.UndefOr[java.lang.String] = js.undefined
  var stringColor: js.UndefOr[java.lang.String] = js.undefined
}

object RendererOptions {
  @scala.inline
  def apply(
    dashColor: java.lang.String = null,
    defaultIndentation: scala.Int | scala.Double = null,
    emptyArrayMsg: java.lang.String = null,
    inlineArrays: js.UndefOr[scala.Boolean] = js.undefined,
    keysColor: java.lang.String = null,
    noColor: js.UndefOr[scala.Boolean] = js.undefined,
    numberColor: java.lang.String = null,
    stringColor: java.lang.String = null
  ): RendererOptions = {
    val __obj = js.Dynamic.literal()
    if (dashColor != null) __obj.updateDynamic("dashColor")(dashColor)
    if (defaultIndentation != null) __obj.updateDynamic("defaultIndentation")(defaultIndentation.asInstanceOf[js.Any])
    if (emptyArrayMsg != null) __obj.updateDynamic("emptyArrayMsg")(emptyArrayMsg)
    if (!js.isUndefined(inlineArrays)) __obj.updateDynamic("inlineArrays")(inlineArrays)
    if (keysColor != null) __obj.updateDynamic("keysColor")(keysColor)
    if (!js.isUndefined(noColor)) __obj.updateDynamic("noColor")(noColor)
    if (numberColor != null) __obj.updateDynamic("numberColor")(numberColor)
    if (stringColor != null) __obj.updateDynamic("stringColor")(stringColor)
    __obj.asInstanceOf[RendererOptions]
  }
}

