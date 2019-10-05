package typings.reactDashColor

import typings.react.reactMod.Component
import typings.reactDashColor.libComponentsCommonAlphaMod.Alpha
import typings.reactDashColor.libComponentsCommonAlphaMod.AlphaProps
import typings.reactDashColor.reactDashColorMod.CustomPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-color/lib/components/common/Alpha", JSImport.Namespace)
@js.native
object libComponentsCommonAlphaMod extends js.Object {
  @js.native
  trait Alpha
    extends Component[AlphaProps, js.Object, js.Any]
  
  @js.native
  class default () extends Alpha
  
  type AlphaProps = CustomPickerProps[Alpha]
}

