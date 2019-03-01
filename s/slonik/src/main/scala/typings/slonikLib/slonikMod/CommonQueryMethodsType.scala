package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonQueryMethodsType extends js.Object {
  @JSName("anyFirst")
  var anyFirst_Original: QueryAnyFirstFunctionType = js.native
  @JSName("any")
  var any_Original: QueryAnyFunctionType = js.native
  @JSName("manyFirst")
  var manyFirst_Original: QueryManyFirstFunctionType = js.native
  @JSName("many")
  var many_Original: QueryManyFunctionType = js.native
  @JSName("maybeOneFirst")
  var maybeOneFirst_Original: QueryMaybeOneFirstFunctionType = js.native
  @JSName("maybeOne")
  var maybeOne_Original: QueryMaybeOneFunctionType = js.native
  @JSName("oneFirst")
  var oneFirst_Original: QueryOneFirstFunctionType = js.native
  @JSName("one")
  var one_Original: QueryOneFunctionType = js.native
  @JSName("query")
  var query_Original: QueryFunctionType = js.native
  def any(sql: TaggedTemplateLiteralInvocationType): js.Promise[js.Array[QueryResultRowType[java.lang.String]]] = js.native
  def any(sql: TaggedTemplateLiteralInvocationType, values: js.Array[PrimitiveValueExpressionType]): js.Promise[js.Array[QueryResultRowType[java.lang.String]]] = js.native
  def anyFirst(sql: TaggedTemplateLiteralInvocationType): js.Promise[js.Array[QueryResultRowColumnType]] = js.native
  def anyFirst(sql: TaggedTemplateLiteralInvocationType, values: js.Array[PrimitiveValueExpressionType]): js.Promise[js.Array[QueryResultRowColumnType]] = js.native
  def many(sql: TaggedTemplateLiteralInvocationType): js.Promise[js.Array[QueryResultRowType[java.lang.String]]] = js.native
  def many(sql: TaggedTemplateLiteralInvocationType, values: js.Array[PrimitiveValueExpressionType]): js.Promise[js.Array[QueryResultRowType[java.lang.String]]] = js.native
  def manyFirst(sql: TaggedTemplateLiteralInvocationType): js.Promise[js.Array[QueryResultRowColumnType]] = js.native
  def manyFirst(sql: TaggedTemplateLiteralInvocationType, values: js.Array[PrimitiveValueExpressionType]): js.Promise[js.Array[QueryResultRowColumnType]] = js.native
  def maybeOne(sql: TaggedTemplateLiteralInvocationType): js.Promise[QueryResultRowType[java.lang.String] | scala.Null] = js.native
  def maybeOne(sql: TaggedTemplateLiteralInvocationType, values: js.Array[PrimitiveValueExpressionType]): js.Promise[QueryResultRowType[java.lang.String] | scala.Null] = js.native
  def maybeOneFirst(sql: TaggedTemplateLiteralInvocationType): js.Promise[QueryResultRowColumnType] = js.native
  def maybeOneFirst(sql: TaggedTemplateLiteralInvocationType, values: js.Array[PrimitiveValueExpressionType]): js.Promise[QueryResultRowColumnType] = js.native
  def one(sql: TaggedTemplateLiteralInvocationType): js.Promise[QueryResultRowType[java.lang.String]] = js.native
  def one(sql: TaggedTemplateLiteralInvocationType, values: js.Array[PrimitiveValueExpressionType]): js.Promise[QueryResultRowType[java.lang.String]] = js.native
  def oneFirst(sql: TaggedTemplateLiteralInvocationType): js.Promise[QueryResultRowColumnType] = js.native
  def oneFirst(sql: TaggedTemplateLiteralInvocationType, values: js.Array[PrimitiveValueExpressionType]): js.Promise[QueryResultRowColumnType] = js.native
  def query(sql: TaggedTemplateLiteralInvocationType): js.Promise[QueryResultRowType[java.lang.String]] = js.native
  def query(sql: TaggedTemplateLiteralInvocationType, values: js.Array[PrimitiveValueExpressionType]): js.Promise[QueryResultRowType[java.lang.String]] = js.native
}

