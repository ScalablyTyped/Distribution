package typings.searchIndex.mod

import typings.searchIndex.anon.EXCLUDE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.searchIndex.mod.AND
  - typings.searchIndex.mod.NOT
  - typings.searchIndex.mod.OR
  - typings.searchIndex.mod.SEARCH
*/
trait QueryVerb
  extends StObject
     with _Token
object QueryVerb {
  
  inline def AND(AND: js.Array[Token]): typings.searchIndex.mod.AND = {
    val __obj = js.Dynamic.literal(AND = AND.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.searchIndex.mod.AND]
  }
  
  inline def NOT(NOT: EXCLUDE): typings.searchIndex.mod.NOT = {
    val __obj = js.Dynamic.literal(NOT = NOT.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.searchIndex.mod.NOT]
  }
  
  inline def OR(OR: js.Array[Token]): typings.searchIndex.mod.OR = {
    val __obj = js.Dynamic.literal(OR = OR.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.searchIndex.mod.OR]
  }
  
  inline def SEARCH(SEARCH: js.Array[Token]): typings.searchIndex.mod.SEARCH = {
    val __obj = js.Dynamic.literal(SEARCH = SEARCH.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.searchIndex.mod.SEARCH]
  }
}
