package typings.reactDnd

import typings.reactDnd.distTypesMonitorsMod.DragLayerMonitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUseDragLayerMod {
  
  @JSImport("react-dnd/dist/hooks/useDragLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDragLayer[CollectedProps, DragObject](collect: js.Function1[/* monitor */ DragLayerMonitor[DragObject], CollectedProps]): CollectedProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useDragLayer")(collect.asInstanceOf[js.Any]).asInstanceOf[CollectedProps]
}
