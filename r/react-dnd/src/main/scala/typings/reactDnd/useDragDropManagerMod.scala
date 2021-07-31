package typings.reactDnd

import typings.dndCore.interfacesMod.DragDropManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDragDropManagerMod {
  
  @JSImport("react-dnd/lib/hooks/useDragDropManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useDragDropManager(): DragDropManager = ^.asInstanceOf[js.Dynamic].applyDynamic("useDragDropManager")().asInstanceOf[DragDropManager]
}
