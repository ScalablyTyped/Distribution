package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sparqljs.sparqljsStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Update
  extends StObject
     with SparqlQuery {
  
  var prefixes: StringDictionary[String]
  
  var `type`: update
  
  var updates: js.Array[UpdateOperation]
}
object Update {
  
  inline def apply(prefixes: StringDictionary[String], updates: js.Array[UpdateOperation]): Update = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], updates = updates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("update")
    __obj.asInstanceOf[Update]
  }
  
  extension [Self <: Update](x: Self) {
    
    inline def setPrefixes(value: StringDictionary[String]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
    
    inline def setType(value: update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdates(value: js.Array[UpdateOperation]): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesVarargs(value: UpdateOperation*): Self = StObject.set(x, "updates", js.Array(value*))
  }
}
