package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sparqljs.anon.Default
import typings.sparqljs.sparqljsStrings.SELECT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectQuery
  extends StObject
     with BaseQuery
     with Pattern
     with Query {
  
  var distinct: js.UndefOr[Boolean] = js.undefined
  
  var from: js.UndefOr[Default] = js.undefined
  
  var group: js.UndefOr[js.Array[Grouping]] = js.undefined
  
  var having: js.UndefOr[js.Array[Expression]] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var order: js.UndefOr[js.Array[Ordering]] = js.undefined
  
  var queryType: SELECT
  
  var reduced: js.UndefOr[Boolean] = js.undefined
  
  var variables: js.Array[Variable | Wildcard]
}
object SelectQuery {
  
  @scala.inline
  def apply(prefixes: StringDictionary[String], variables: js.Array[Variable | Wildcard]): SelectQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = "SELECT", variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("query")
    __obj.asInstanceOf[SelectQuery]
  }
  
  @scala.inline
  implicit class SelectQueryMutableBuilder[Self <: SelectQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistinct(value: Boolean): Self = StObject.set(x, "distinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistinctUndefined: Self = StObject.set(x, "distinct", js.undefined)
    
    @scala.inline
    def setFrom(value: Default): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setGroup(value: js.Array[Grouping]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setGroupVarargs(value: Grouping*): Self = StObject.set(x, "group", js.Array(value :_*))
    
    @scala.inline
    def setHaving(value: js.Array[Expression]): Self = StObject.set(x, "having", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHavingUndefined: Self = StObject.set(x, "having", js.undefined)
    
    @scala.inline
    def setHavingVarargs(value: Expression*): Self = StObject.set(x, "having", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOrder(value: js.Array[Ordering]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setOrderVarargs(value: Ordering*): Self = StObject.set(x, "order", js.Array(value :_*))
    
    @scala.inline
    def setQueryType(value: SELECT): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReduced(value: Boolean): Self = StObject.set(x, "reduced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReducedUndefined: Self = StObject.set(x, "reduced", js.undefined)
    
    @scala.inline
    def setVariables(value: js.Array[Variable | Wildcard]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesVarargs(value: (Variable | Wildcard)*): Self = StObject.set(x, "variables", js.Array(value :_*))
  }
}
