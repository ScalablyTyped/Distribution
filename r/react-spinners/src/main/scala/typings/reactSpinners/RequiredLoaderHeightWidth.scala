package typings.reactSpinners

import typings.reactSpinners.interfacesMod.LengthType
import typings.reactSpinners.interfacesMod.PrecompiledCss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<react-spinners.react-spinners/interfaces.LoaderHeightWidthProps> */
trait RequiredLoaderHeightWidth extends js.Object {
  var color: String
  var css: String | PrecompiledCss
  var height: LengthType
  var loading: Boolean
  var width: LengthType
}

object RequiredLoaderHeightWidth {
  @scala.inline
  def apply(
    color: String,
    css: String | PrecompiledCss,
    height: LengthType,
    loading: Boolean,
    width: LengthType
  ): RequiredLoaderHeightWidth = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequiredLoaderHeightWidth]
  }
}

