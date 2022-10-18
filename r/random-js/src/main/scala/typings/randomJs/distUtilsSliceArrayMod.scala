package typings.randomJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsSliceArrayMod {
  
  @JSImport("random-js/dist/utils/sliceArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sliceArray(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sliceArray")().asInstanceOf[js.Array[Any]]
  inline def sliceArray(start: Double): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sliceArray")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def sliceArray(start: Double, end: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sliceArray")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def sliceArray(start: Unit, end: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sliceArray")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
}
