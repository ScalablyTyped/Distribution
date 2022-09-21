package typings.slonik.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _SqlTokenType extends StObject
object _SqlTokenType {
  
  inline def ArraySqlTokenType(
    memberType: TypeNameIdentifierType | SqlTokenType,
    `type`: js.Symbol,
    values: js.Array[ValueExpressionType]
  ): typings.slonik.mod.ArraySqlTokenType = {
    val __obj = js.Dynamic.literal(memberType = memberType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.slonik.mod.ArraySqlTokenType]
  }
  
  inline def BinarySqlTokenType(data: Buffer, `type`: js.Symbol): typings.slonik.mod.BinarySqlTokenType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.slonik.mod.BinarySqlTokenType]
  }
  
  inline def IdentifierSqlTokenType(names: js.Array[String], `type`: js.Symbol): typings.slonik.mod.IdentifierSqlTokenType = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.slonik.mod.IdentifierSqlTokenType]
  }
  
  inline def JsonSqlTokenType(`type`: js.Symbol): typings.slonik.mod.JsonSqlTokenType = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.slonik.mod.JsonSqlTokenType]
  }
  
  inline def ListSqlTokenType(glue: SqlTokenType, members: js.Array[SqlTokenType], `type`: js.Symbol): typings.slonik.mod.ListSqlTokenType = {
    val __obj = js.Dynamic.literal(glue = glue.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.slonik.mod.ListSqlTokenType]
  }
  
  inline def UnnestSqlTokenType(columnTypes: js.Array[String], tuples: js.Array[js.Array[ValueExpressionType]], `type`: js.Symbol): typings.slonik.mod.UnnestSqlTokenType = {
    val __obj = js.Dynamic.literal(columnTypes = columnTypes.asInstanceOf[js.Any], tuples = tuples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.slonik.mod.UnnestSqlTokenType]
  }
}
