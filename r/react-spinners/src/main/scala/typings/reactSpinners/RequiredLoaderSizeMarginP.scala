package typings.reactSpinners

import typings.reactSpinners.interfacesMod.LengthType
import typings.reactSpinners.interfacesMod.PrecompiledCss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<react-spinners.react-spinners/interfaces.LoaderSizeMarginProps> */
trait RequiredLoaderSizeMarginP extends js.Object {
  var color: String
  var css: String | PrecompiledCss
  var loading: Boolean
  var margin: LengthType
  var size: LengthType
}

object RequiredLoaderSizeMarginP {
  @scala.inline
  def apply(
    color: String,
    css: String | PrecompiledCss,
    loading: Boolean,
    margin: LengthType,
    size: LengthType
  ): RequiredLoaderSizeMarginP = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequiredLoaderSizeMarginP]
  }
}

