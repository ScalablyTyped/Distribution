package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sparqljs.sparqljsStrings.query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseQuery extends StObject {
  
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
  implicit class BaseQueryMutableBuilder[Self <: BaseQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    @scala.inline
    def setPrefixes(value: StringDictionary[String]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: query): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[ValuePatternRow]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: ValuePatternRow*): Self = StObject.set(x, "values", js.Array(value :_*))
    
    @scala.inline
    def setWhere(value: js.Array[Pattern]): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
    
    @scala.inline
    def setWhereVarargs(value: Pattern*): Self = StObject.set(x, "where", js.Array(value :_*))
  }
}
