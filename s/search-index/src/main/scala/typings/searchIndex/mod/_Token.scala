package typings.searchIndex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Token extends StObject
object _Token {
  
  inline def AND(AND: js.Array[Token]): typings.searchIndex.mod.AND = {
    val __obj = js.Dynamic.literal(AND = AND.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.searchIndex.mod.AND]
  }
  
  inline def FieldOnlyObject(FIELD: Field): typings.searchIndex.mod.FieldOnlyObject = {
    val __obj = js.Dynamic.literal(FIELD = FIELD.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.searchIndex.mod.FieldOnlyObject]
  }
  
  inline def FieldValueObject(FIELD: Field, VALUE: String | RangeValueObject): typings.searchIndex.mod.FieldValueObject = {
    val __obj = js.Dynamic.literal(FIELD = FIELD.asInstanceOf[js.Any], VALUE = VALUE.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.searchIndex.mod.FieldValueObject]
  }
  
  inline def NOT(EXCLUDE: Token, INCLUDE: Token): typings.searchIndex.mod.NOT = {
    val __obj = js.Dynamic.literal(EXCLUDE = EXCLUDE.asInstanceOf[js.Any], INCLUDE = INCLUDE.asInstanceOf[js.Any])
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
