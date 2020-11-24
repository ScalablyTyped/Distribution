package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sparqljs.anon.Default
import typings.sparqljs.sparqljsStrings.SELECT
import typings.sparqljs.sparqljsStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectQuery
  extends Query
     with BaseQuery
     with Pattern {
  
  var distinct: js.UndefOr[Boolean] = js.native
  
  var from: js.UndefOr[Default] = js.native
  
  var group: js.UndefOr[js.Array[Grouping]] = js.native
  
  var having: js.UndefOr[js.Array[Expression]] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var order: js.UndefOr[js.Array[Ordering]] = js.native
  
  var queryType: SELECT = js.native
  
  var reduced: js.UndefOr[Boolean] = js.native
  
  var variables: js.Array[Variable | Wildcard] = js.native
}
object SelectQuery {
  
  @scala.inline
  def apply(
    prefixes: StringDictionary[String],
    queryType: SELECT,
    `type`: query,
    variables: js.Array[Variable | Wildcard]
  ): SelectQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectQuery]
  }
  
  @scala.inline
  implicit class SelectQueryOps[Self <: SelectQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQueryType(value: SELECT): Self = this.set("queryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesVarargs(value: (Variable | Wildcard)*): Self = this.set("variables", js.Array(value :_*))
    
    @scala.inline
    def setVariables(value: js.Array[Variable | Wildcard]): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistinct(value: Boolean): Self = this.set("distinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistinct: Self = this.set("distinct", js.undefined)
    
    @scala.inline
    def setFrom(value: Default): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setGroupVarargs(value: Grouping*): Self = this.set("group", js.Array(value :_*))
    
    @scala.inline
    def setGroup(value: js.Array[Grouping]): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setHavingVarargs(value: Expression*): Self = this.set("having", js.Array(value :_*))
    
    @scala.inline
    def setHaving(value: js.Array[Expression]): Self = this.set("having", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHaving: Self = this.set("having", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOrderVarargs(value: Ordering*): Self = this.set("order", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: js.Array[Ordering]): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setReduced(value: Boolean): Self = this.set("reduced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReduced: Self = this.set("reduced", js.undefined)
  }
}
