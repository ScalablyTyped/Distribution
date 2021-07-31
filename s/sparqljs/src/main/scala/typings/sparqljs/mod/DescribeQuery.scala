package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sparqljs.sparqljsStrings.DESCRIBE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeQuery
  extends StObject
     with BaseQuery
     with Query {
  
  var queryType: DESCRIBE
  
  var variables: js.Array[Variable | Wildcard]
}
object DescribeQuery {
  
  @scala.inline
  def apply(prefixes: StringDictionary[String], variables: js.Array[Variable | Wildcard]): DescribeQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = "DESCRIBE", variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("query")
    __obj.asInstanceOf[DescribeQuery]
  }
  
  @scala.inline
  implicit class DescribeQueryMutableBuilder[Self <: DescribeQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryType(value: DESCRIBE): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: js.Array[Variable | Wildcard]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesVarargs(value: (Variable | Wildcard)*): Self = StObject.set(x, "variables", js.Array(value :_*))
  }
}
