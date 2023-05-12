package typings.shallowEqual

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distObjectsMod {
  
  @JSImport("shallow-equal/dist/objects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](objA: validObjectValue, objB: validObjectValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type validObjectValue = js.UndefOr[(Record[String, Any]) | Null]
}
