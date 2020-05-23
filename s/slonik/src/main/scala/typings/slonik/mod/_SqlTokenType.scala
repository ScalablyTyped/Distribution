package typings.slonik.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SqlTokenType extends js.Object

object _SqlTokenType {
  @scala.inline
  def ListSqlTokenType(glue: SqlTokenType, members: js.Array[SqlTokenType], `type`: js.Symbol): _SqlTokenType = {
    val __obj = js.Dynamic.literal(glue = glue.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SqlTokenType]
  }
  @scala.inline
  def BinarySqlTokenType(data: Buffer, `type`: js.Symbol): _SqlTokenType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SqlTokenType]
  }
  @scala.inline
  def UnnestSqlTokenType(columnTypes: js.Array[String], tuples: js.Array[js.Array[ValueExpressionType]], `type`: js.Symbol): _SqlTokenType = {
    val __obj = js.Dynamic.literal(columnTypes = columnTypes.asInstanceOf[js.Any], tuples = tuples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SqlTokenType]
  }
  @scala.inline
  def IdentifierSqlTokenType(names: js.Array[String], `type`: js.Symbol): _SqlTokenType = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SqlTokenType]
  }
  @scala.inline
  def JsonSqlTokenType(`type`: js.Symbol, value: SerializableValueType = null): _SqlTokenType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SqlTokenType]
  }
  @scala.inline
  def ArraySqlTokenType(
    memberType: TypeNameIdentifierType | SqlTokenType,
    `type`: js.Symbol,
    values: js.Array[ValueExpressionType]
  ): _SqlTokenType = {
    val __obj = js.Dynamic.literal(memberType = memberType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SqlTokenType]
  }
}

