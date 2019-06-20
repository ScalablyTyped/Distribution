package typings
package reactDashMosaicDashComponentLib.libMosaicWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component/lib/MosaicWindow", "InternalMosaicWindow")
@js.native
class InternalMosaicWindow[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */] ()
  extends reactLib.reactMod.Component[InternalMosaicWindowProps[T], InternalMosaicWindowState, js.Any] {
  var checkCreateNode: js.Any = js.native
  val childContext: js.Any = js.native
  var connectDragSource: js.Any = js.native
  @JSName("context")
  var context_InternalMosaicWindow: reactDashMosaicDashComponentLib.libContextTypesMod.MosaicContext[T] = js.native
  var getPath: js.Any = js.native
  var getToolbarControls: js.Any = js.native
  var renderDropTarget: js.Any = js.native
  var renderToolbar: js.Any = js.native
  var rootElement: js.Any = js.native
  var setAdditionalControlsOpen: js.Any = js.native
  var split: js.Any = js.native
  var swap: js.Any = js.native
  def getChildContext(): stdLib.Partial[reactDashMosaicDashComponentLib.libContextTypesMod.MosaicWindowContext[T]] = js.native
}

/* static members */
@JSImport("react-mosaic-component/lib/MosaicWindow", "InternalMosaicWindow")
@js.native
object InternalMosaicWindow extends js.Object {
  var childContextTypes: reactDashMosaicDashComponentLib.Anon_MosaicWindowActions = js.native
  var contextTypes: reactDashMosaicDashComponentLib.Anon_MosaicActions = js.native
  var defaultProps: stdLib.Partial[reactDashMosaicDashComponentLib.libMosaicWindowMod.InternalMosaicWindowProps[_]] = js.native
}

