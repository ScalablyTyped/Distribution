package typings.printj

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("printj", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sprintf(fmt: String, args: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sprintf")(fmt.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("printj", "version")
  @js.native
  val version: String = js.native
  
  inline def vsprintf(fmt: String, args: js.Array[js.Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("vsprintf")(fmt.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
}
