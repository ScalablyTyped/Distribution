package typings.reactSpinners.anon

import typings.reactSpinners.interfacesMod.LengthType
import typings.reactSpinners.interfacesMod.PrecompiledCss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<react-spinners.react-spinners/interfaces.LoaderSizeProps> */
trait RequiredLoaderSizeProps extends js.Object {
  var color: String
  var css: String | PrecompiledCss
  var loading: Boolean
  var size: LengthType
}

object RequiredLoaderSizeProps {
  @scala.inline
  def apply(color: String, css: String | PrecompiledCss, loading: Boolean, size: LengthType): RequiredLoaderSizeProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredLoaderSizeProps]
  }
}

