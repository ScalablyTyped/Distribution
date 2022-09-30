package typings.reactDnd

import typings.dndCore.interfacesMod.Identifier
import typings.reactDnd.typesMod.DragSourceHookSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDragTypeMod {
  
  @JSImport("react-dnd/dist/hooks/useDrag/useDragType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDragType(spec: DragSourceHookSpec[Any, Any, Any]): Identifier = ^.asInstanceOf[js.Dynamic].applyDynamic("useDragType")(spec.asInstanceOf[js.Any]).asInstanceOf[Identifier]
}
