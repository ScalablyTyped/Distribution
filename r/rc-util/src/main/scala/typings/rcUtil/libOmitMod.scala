package typings.rcUtil

import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOmitMod {
  
  @JSImport("rc-util/lib/omit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: js.Object */, K /* <: /* keyof T */ String */](obj: T, fields: js.Array[K]): Omit[T, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(obj.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[Omit[T, K]]
}
