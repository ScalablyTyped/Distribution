package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sparqljs.sparqljsStrings.ASK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AskQuery
  extends StObject
     with BaseQuery
     with Query {
  
  var queryType: ASK
}
object AskQuery {
  
  @scala.inline
  def apply(prefixes: StringDictionary[String]): AskQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = "ASK")
    __obj.updateDynamic("type")("query")
    __obj.asInstanceOf[AskQuery]
  }
  
  @scala.inline
  implicit class AskQueryMutableBuilder[Self <: AskQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryType(value: ASK): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
  }
}
