package typings.rdflib

import typings.rdflib.storeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryMod {
  
  @JSImport("rdflib/lib/query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rdflib/lib/query", "Query")
  @js.native
  open class Query protected () extends StObject {
    def this(name: Any, id: Any) = this()
    
    var id: Any = js.native
    
    var name: Any = js.native
    
    var pat: default = js.native
    
    var vars: js.Array[Any] = js.native
  }
  
  inline def indexedFormulaQuery(myQuery: Any, callback: Any, fetcher: Any, onDone: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("indexedFormulaQuery")(myQuery.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], fetcher.asInstanceOf[js.Any], onDone.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
