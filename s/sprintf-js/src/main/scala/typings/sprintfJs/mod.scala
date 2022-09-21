package typings.sprintfJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sprintf-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sprintf(format: String, args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sprintf")(List(format.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def vsprintf(format: String, args: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("vsprintf")(format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
}
