package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentifierSqlTokenType extends _SqlTokenType {
  
  var names: js.Array[String] = js.native
  
  var `type`: js.Symbol = js.native
}
object IdentifierSqlTokenType {
  
  @scala.inline
  def apply(names: js.Array[String], `type`: js.Symbol): IdentifierSqlTokenType = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifierSqlTokenType]
  }
  
  @scala.inline
  implicit class IdentifierSqlTokenTypeMutableBuilder[Self <: IdentifierSqlTokenType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
