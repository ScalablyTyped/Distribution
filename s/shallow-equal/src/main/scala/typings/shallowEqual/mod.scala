package typings.shallowEqual

import typings.shallowEqual.distArraysMod.validArrayValue
import typings.shallowEqual.distObjectsMod.validObjectValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("shallow-equal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shallowEqual[T /* <: Comparable */](a: T, b: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def shallowEqualArrays(arrA: validArrayValue, arrB: validArrayValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqualArrays")(arrA.asInstanceOf[js.Any], arrB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def shallowEqualObjects[T](objA: validObjectValue, objB: validObjectValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqualObjects")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type Comparable = js.UndefOr[(Record[String, Any]) | js.Array[Any] | Null]
}
