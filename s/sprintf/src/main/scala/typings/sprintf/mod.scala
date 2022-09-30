package typings.sprintf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sprintf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sprintf(fmt: String, args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sprintf")(scala.List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def vsprintf(fmt: String, args: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("vsprintf")(fmt.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
}
