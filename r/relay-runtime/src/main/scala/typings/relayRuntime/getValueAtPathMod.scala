package typings.relayRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getValueAtPathMod {
  
  @JSImport("relay-runtime/lib/util/getValueAtPath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(data: Any, path: js.Array[String | Double]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
}
