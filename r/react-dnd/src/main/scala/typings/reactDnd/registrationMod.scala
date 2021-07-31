package typings.reactDnd

import typings.dndCore.interfacesMod.DragDropManager
import typings.dndCore.interfacesMod.DragSource
import typings.dndCore.interfacesMod.DropTarget
import typings.dndCore.interfacesMod.Identifier
import typings.dndCore.interfacesMod.SourceType
import typings.dndCore.interfacesMod.TargetType
import typings.dndCore.interfacesMod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registrationMod {
  
  @JSImport("react-dnd/lib/common/registration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def registerSource(`type`: SourceType, source: DragSource, manager: DragDropManager): js.Tuple2[Identifier, Unsubscribe] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSource")(`type`.asInstanceOf[js.Any], source.asInstanceOf[js.Any], manager.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Identifier, Unsubscribe]]
  
  @scala.inline
  def registerTarget(`type`: TargetType, target: DropTarget, manager: DragDropManager): js.Tuple2[Identifier, Unsubscribe] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTarget")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], manager.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Identifier, Unsubscribe]]
}
