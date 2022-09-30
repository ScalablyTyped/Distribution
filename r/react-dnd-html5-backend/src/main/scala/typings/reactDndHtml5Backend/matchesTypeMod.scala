package typings.reactDndHtml5Backend

import typings.dndCore.interfacesMod.SourceType
import typings.dndCore.interfacesMod.TargetType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchesTypeMod {
  
  @JSImport("react-dnd-html5-backend/dist/matchesType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def matchesType(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("matchesType")().asInstanceOf[Boolean]
  inline def matchesType(targetType: Null, draggedItemType: SourceType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesType")(targetType.asInstanceOf[js.Any], draggedItemType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchesType(targetType: TargetType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("matchesType")(targetType.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def matchesType(targetType: TargetType, draggedItemType: SourceType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesType")(targetType.asInstanceOf[js.Any], draggedItemType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
