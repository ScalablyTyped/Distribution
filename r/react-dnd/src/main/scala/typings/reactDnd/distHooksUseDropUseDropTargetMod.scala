package typings.reactDnd

import typings.reactDnd.distHooksTypesMod.DropTargetHookSpec
import typings.reactDnd.distHooksUseDropDropTargetImplMod.DropTargetImpl
import typings.reactDnd.distTypesMonitorsMod.DropTargetMonitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUseDropUseDropTargetMod {
  
  @JSImport("react-dnd/dist/hooks/useDrop/useDropTarget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDropTarget[O, R, P](spec: DropTargetHookSpec[O, R, P], monitor: DropTargetMonitor[O, R]): DropTargetImpl[O, R, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDropTarget")(spec.asInstanceOf[js.Any], monitor.asInstanceOf[js.Any])).asInstanceOf[DropTargetImpl[O, R, P]]
}
