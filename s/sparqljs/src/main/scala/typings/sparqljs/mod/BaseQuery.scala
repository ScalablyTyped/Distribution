package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sparqljs.sparqljsStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseQuery extends js.Object {
  
  var base: js.UndefOr[String] = js.native
  
  var prefixes: StringDictionary[String] = js.native
  
  var `type`: query = js.native
  
  var values: js.UndefOr[js.Array[ValuePatternRow]] = js.native
  
  var where: js.UndefOr[js.Array[Pattern]] = js.native
}
object BaseQuery {
  
  @scala.inline
  def apply(prefixes: StringDictionary[String], `type`: query): BaseQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseQuery]
  }
  
  @scala.inline
  implicit class BaseQueryOps[Self <: BaseQuery] (val x: Self) extends AnyVal {
    
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
    def setPrefixes(value: StringDictionary[String]): Self = this.set("prefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: query): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: ValuePatternRow*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[ValuePatternRow]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    
    @scala.inline
    def setWhereVarargs(value: Pattern*): Self = this.set("where", js.Array(value :_*))
    
    @scala.inline
    def setWhere(value: js.Array[Pattern]): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
}
