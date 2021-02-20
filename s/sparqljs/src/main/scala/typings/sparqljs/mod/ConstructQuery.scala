package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sparqljs.sparqljsStrings.CONSTRUCT
import typings.sparqljs.sparqljsStrings.query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstructQuery
  extends Query
     with BaseQuery {
  
  var queryType: CONSTRUCT = js.native
  
  var template: js.UndefOr[js.Array[Triple]] = js.native
}
object ConstructQuery {
  
  @scala.inline
  def apply(prefixes: StringDictionary[String], queryType: CONSTRUCT, `type`: query): ConstructQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructQuery]
  }
  
  @scala.inline
  implicit class ConstructQueryMutableBuilder[Self <: ConstructQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryType(value: CONSTRUCT): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: js.Array[Triple]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTemplateVarargs(value: Triple*): Self = StObject.set(x, "template", js.Array(value :_*))
  }
}
