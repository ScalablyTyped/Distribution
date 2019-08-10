package typings.slonik.slonikMod

import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlTaggedTemplateType extends js.Object {
  // tslint:disable-next-line no-unnecessary-generics (the sql<Foo>`select foo` is cleaner in this case than casting with 'as')
  def apply[T](template: TemplateStringsArray, vals: ValueExpressionType*): SqlSqlTokenType[T] = js.native
  def array(values: js.Array[PrimitiveValueExpressionType], memberType: String): ArraySqlTokenType = js.native
  def assignmentList(namedAssignmentValueBindings: NamedAssignmentType): AssignmentListTokenType = js.native
  def booleanExpression(members: js.Array[ValueExpressionType], operator: LogicalBooleanOperatorType): BooleanExpressionTokenType = js.native
  def comparisonPredicate(
    leftOperand: ValueExpressionType,
    operator: ComparisonOperatorType,
    rightOperand: ValueExpressionType
  ): ComparisonPredicateTokenType = js.native
  def identifier(names: js.Array[String]): IdentifierTokenType = js.native
  def identifierList(identifiers: js.Array[IdentifierListMemberType]): IdentifierListTokenType = js.native
  def json(value: SerializableValueType): JsonSqlTokenType = js.native
  def raw(rawSql: String): RawSqlTokenType = js.native
  def raw(rawSql: String, values: js.Array[PrimitiveValueExpressionType]): RawSqlTokenType = js.native
  def tuple(values: js.Array[ValueExpressionType]): TupleSqlTokenType = js.native
  def tupleList(tuples: js.Array[js.Array[ValueExpressionType]]): TupleListSqlTokenType = js.native
  def unnest(
    // Value might be PrimitiveValueExpressionType[],
  // or it can be infinitely nested array, e.g.
  // https://github.com/gajus/slonik/issues/44
  tuples: js.Array[js.Array[_]],
    columnTypes: js.Array[String]
  ): UnnestSqlTokenType = js.native
  def valueList(values: js.Array[ValueExpressionType]): ValueListSqlTokenType = js.native
}

