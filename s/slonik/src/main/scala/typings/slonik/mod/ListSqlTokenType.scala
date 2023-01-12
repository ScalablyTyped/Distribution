package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSqlTokenType
  extends StObject
     with _SqlTokenType {
  
  var glue: SqlTokenType
  
  var members: js.Array[SqlTokenType]
  
  var `type`: js.Symbol
}
object ListSqlTokenType {
  
  inline def apply(glue: SqlTokenType, members: js.Array[SqlTokenType], `type`: js.Symbol): ListSqlTokenType = {
    val __obj = js.Dynamic.literal(glue = glue.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSqlTokenType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSqlTokenType] (val x: Self) extends AnyVal {
    
    inline def setGlue(value: SqlTokenType): Self = StObject.set(x, "glue", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[SqlTokenType]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: SqlTokenType*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setType(value: js.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
