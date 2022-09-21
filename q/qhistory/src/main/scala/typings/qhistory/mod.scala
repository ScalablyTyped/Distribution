package typings.qhistory

import typings.history.mod.History
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("qhistory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(history: History, stringify: Stringify, parse: Parse): History = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(history.asInstanceOf[js.Any], stringify.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[History]
  
  type Parse = js.Function1[/* query */ String, Any]
  
  type Stringify = js.Function1[/* query */ Any, String]
}
