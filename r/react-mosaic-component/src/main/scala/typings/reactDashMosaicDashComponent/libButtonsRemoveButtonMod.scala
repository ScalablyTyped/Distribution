package typings.reactDashMosaicDashComponent

import typings.react.reactMod.Component
import typings.react.reactMod.Context
import typings.reactDashMosaicDashComponent.libButtonsMosaicButtonMod.MosaicButtonProps
import typings.reactDashMosaicDashComponent.libContextTypesMod.MosaicWindowContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component/lib/buttons/RemoveButton", JSImport.Namespace)
@js.native
object libButtonsRemoveButtonMod extends js.Object {
  @js.native
  class RemoveButton ()
    extends Component[MosaicButtonProps, js.Object, js.Any] {
    @JSName("context")
    var context_RemoveButton: MosaicWindowContext = js.native
    var createRemove: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object RemoveButton extends js.Object {
    var contextType: Context[MosaicWindowContext] = js.native
  }
  
}

