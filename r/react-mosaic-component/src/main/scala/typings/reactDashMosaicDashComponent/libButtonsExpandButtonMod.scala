package typings.reactDashMosaicDashComponent

import typings.react.reactMod.Context
import typings.react.reactMod.PureComponent
import typings.reactDashMosaicDashComponent.libButtonsMosaicButtonMod.MosaicButtonProps
import typings.reactDashMosaicDashComponent.libContextTypesMod.MosaicWindowContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component/lib/buttons/ExpandButton", JSImport.Namespace)
@js.native
object libButtonsExpandButtonMod extends js.Object {
  @js.native
  class ExpandButton ()
    extends PureComponent[MosaicButtonProps, js.Object, js.Any] {
    @JSName("context")
    var context_ExpandButton: MosaicWindowContext = js.native
    var createExpand: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object ExpandButton extends js.Object {
    var contextType: Context[MosaicWindowContext] = js.native
  }
  
}

