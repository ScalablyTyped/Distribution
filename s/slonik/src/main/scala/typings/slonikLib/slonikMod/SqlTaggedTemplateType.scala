package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlTaggedTemplateType extends js.Object {
  def apply(template: stdLib.TemplateStringsArray, vals: ValueExpressionType*): SqlSqlTokenType = js.native
  def identifier(names: js.Array[java.lang.String]): IdentifierTokenType = js.native
  def raw(rawSql: java.lang.String): RawSqlTokenType = js.native
  def raw(rawSql: java.lang.String, values: js.Array[PrimitiveValueExpressionType]): RawSqlTokenType = js.native
  def tuple(values: js.Array[PrimitiveValueExpressionType]): TupleSqlTokenType = js.native
  def tupleList(tuples: js.Array[js.Array[PrimitiveValueExpressionType]]): TupleListSqlTokenType = js.native
  def unnest(tuples: js.Array[js.Array[PrimitiveValueExpressionType]], columnTypes: js.Array[java.lang.String]): UnnestSqlTokenType = js.native
  def valueList(values: js.Array[PrimitiveValueExpressionType]): ValueListSqlTokenType = js.native
}

