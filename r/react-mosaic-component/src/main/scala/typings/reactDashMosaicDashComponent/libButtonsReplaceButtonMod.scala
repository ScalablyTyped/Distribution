package typings.reactDashMosaicDashComponent

import typings.react.reactMod.Context
import typings.react.reactMod.PureComponent
import typings.reactDashMosaicDashComponent.libButtonsMosaicButtonMod.MosaicButtonProps
import typings.reactDashMosaicDashComponent.libContextTypesMod.MosaicWindowContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component/lib/buttons/ReplaceButton", JSImport.Namespace)
@js.native
object libButtonsReplaceButtonMod extends js.Object {
  @js.native
  class ReplaceButton ()
    extends PureComponent[MosaicButtonProps, js.Object, js.Any] {
    @JSName("context")
    var context_ReplaceButton: MosaicWindowContext = js.native
    var replace: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object ReplaceButton extends js.Object {
    var contextType: Context[MosaicWindowContext] = js.native
  }
  
}

