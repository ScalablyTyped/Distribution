package typings.slonik.slonikMod

import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlTaggedTemplateType extends js.Object {
  // tslint:disable-next-line no-unnecessary-generics (the sql<Foo>`select foo` is cleaner in this case than casting with 'as')
  def apply[T](template: TemplateStringsArray, vals: ValueExpressionType*): SqlSqlTokenType[T] = js.native
  def array(values: js.Array[PrimitiveValueExpressionType], memberType: SqlTokenType): ArraySqlTokenType = js.native
  def array(values: js.Array[PrimitiveValueExpressionType], memberType: TypeNameIdentifierType): ArraySqlTokenType = js.native
  def identifier(names: js.Array[String]): IdentifierSqlTokenType = js.native
  def join(members: js.Array[ValueExpressionType], glue: SqlTokenType): ListSqlTokenType = js.native
  def json(value: SerializableValueType): JsonSqlTokenType = js.native
  def raw(rawSql: String): SqlTokenType = js.native
  def raw(rawSql: String, values: js.Array[PrimitiveValueExpressionType]): SqlTokenType = js.native
  def unnest(
    // Value might be ReadonlyArray<ReadonlyArray<PrimitiveValueExpressionType>>,
  // or it can be infinitely nested array, e.g.
  // https://github.com/gajus/slonik/issues/44
  tuples: js.Array[js.Array[_]],
    columnTypes: js.Array[String]
  ): UnnestSqlTokenType = js.native
}

