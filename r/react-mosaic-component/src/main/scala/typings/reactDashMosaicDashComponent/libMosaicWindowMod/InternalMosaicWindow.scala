package typings.reactDashMosaicDashComponent.libMosaicWindowMod

import typings.react.reactMod.Component
import typings.react.reactMod.Context
import typings.reactDashMosaicDashComponent.libContextTypesMod.MosaicContext
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicKey
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component/lib/MosaicWindow", "InternalMosaicWindow")
@js.native
class InternalMosaicWindow[T /* <: MosaicKey */] ()
  extends Component[InternalMosaicWindowProps[T], InternalMosaicWindowState, js.Any] {
  var checkCreateNode: js.Any = js.native
  val childContext: js.Any = js.native
  var connectDragSource: js.Any = js.native
  @JSName("context")
  var context_InternalMosaicWindow: MosaicContext[T] = js.native
  var getPath: js.Any = js.native
  var getToolbarControls: js.Any = js.native
  var renderDropTarget: js.Any = js.native
  var renderToolbar: js.Any = js.native
  var rootElement: js.Any = js.native
  var setAdditionalControlsOpen: js.Any = js.native
  var split: js.Any = js.native
  var swap: js.Any = js.native
}

/* static members */
@JSImport("react-mosaic-component/lib/MosaicWindow", "InternalMosaicWindow")
@js.native
object InternalMosaicWindow extends js.Object {
  var contextType: Context[MosaicContext[String | Double]] = js.native
  var defaultProps: Partial[InternalMosaicWindowProps[_]] = js.native
}

