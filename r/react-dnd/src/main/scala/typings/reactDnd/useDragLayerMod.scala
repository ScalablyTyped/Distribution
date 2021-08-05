package typings.reactDnd

import typings.reactDnd.monitorsMod.DragLayerMonitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDragLayerMod {
  
  @JSImport("react-dnd/lib/hooks/useDragLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDragLayer[CollectedProps](collect: js.Function1[/* monitor */ DragLayerMonitor, CollectedProps]): CollectedProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useDragLayer")(collect.asInstanceOf[js.Any]).asInstanceOf[CollectedProps]
}
