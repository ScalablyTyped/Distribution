package typings.reactDndHtml5Backend

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsUtilsMod {
  
  @JSImport("react-dnd-html5-backend/dist/utils/js_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def memoize[T](fn: js.Function0[T]): js.Function0[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function0[T]]
  
  inline def union[T /* <: String | Double */](itemsA: js.Array[T], itemsB: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(itemsA.asInstanceOf[js.Any], itemsB.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def without[T](items: js.Array[T], item: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("without")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
