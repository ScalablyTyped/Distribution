package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sparqljs.sparqljsStrings.CONSTRUCT
import typings.sparqljs.sparqljsStrings.query
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
  implicit class ConstructQueryOps[Self <: ConstructQuery] (val x: Self) extends AnyVal {
    
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
    def setQueryType(value: CONSTRUCT): Self = this.set("queryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateVarargs(value: Triple*): Self = this.set("template", js.Array(value :_*))
    
    @scala.inline
    def setTemplate(value: js.Array[Triple]): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}
