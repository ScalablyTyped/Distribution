package typings
package slonikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object slonikMod {
  type ConnectionRoutineType = js.Function1[/* connection */ DatabasePoolConnectionType, js.Promise[js.Any]]
  type DatabaseConfigurationType = java.lang.String | slonikLib.Anon_Database
  type DatabaseConnectionType = DatabasePoolConnectionType with DatabasePoolType
  type DatabasePoolConnectionType = CommonQueryMethodsType with slonikLib.Anon_Handler
  type DatabasePoolType = CommonQueryMethodsType with slonikLib.Anon_Connect
  type DatabaseTransactionConnectionType = CommonQueryMethodsType with slonikLib.Anon_Handler
  type LoggerType = js.Function1[/* repeated */ java.lang.String, scala.Nothing]
  type MaybePromiseType[T] = T | js.Promise[T]
  type PrimitiveValueExpressionType = java.lang.String | scala.Double | scala.Boolean | scala.Null
  type QueryAnyFirstFunctionType = QueryMethodType[js.Array[QueryResultRowColumnType]]
  type QueryAnyFunctionType = QueryMethodType[js.Array[QueryResultRowType[java.lang.String]]]
  type QueryFunctionType = QueryMethodType[QueryResultRowType[java.lang.String]]
  type QueryIdType = java.lang.String
  type QueryManyFirstFunctionType = QueryMethodType[js.Array[QueryResultRowColumnType]]
  type QueryManyFunctionType = QueryMethodType[js.Array[QueryResultRowType[java.lang.String]]]
  type QueryMaybeOneFirstFunctionType = QueryMethodType[QueryResultRowColumnType]
  type QueryMaybeOneFunctionType = QueryMethodType[QueryResultRowType[java.lang.String] | scala.Null]
  type QueryMethodType[R] = js.Function2[
    /* sql */ TaggedTemplateLiteralInvocationType, 
    /* values */ js.UndefOr[js.Array[PrimitiveValueExpressionType]], 
    js.Promise[R]
  ]
  type QueryOneFirstFunctionType = QueryMethodType[QueryResultRowColumnType]
  type QueryOneFunctionType = QueryMethodType[QueryResultRowType[java.lang.String]]
  type QueryResultRowColumnType = java.lang.String | scala.Double
  type QueryResultRowType[ColumnName /* <: java.lang.String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ name in ColumnName ]: slonik.slonik.QueryResultRowColumnType}
    */ slonikLib.slonikLibStrings.QueryResultRowType with js.Any
  type QueryResultType[T] = stdLib.Readonly[slonikLib.Anon_Command[T]]
  type TransactionFunctionType = js.Function1[/* connection */ DatabaseTransactionConnectionType, js.Promise[js.Any]]
  /* Rewritten from type alias, can be one of: 
    - PrimitiveValueExpressionType
    - IdentifierTokenType
    - RawSqlTokenType
    - SqlSqlTokenType
    - TupleListSqlTokenType
    - TupleSqlTokenType
    - UnnestSqlTokenType
    - ValueListSqlTokenType
  */
  type ValueExpressionType = _ValueExpressionType | PrimitiveValueExpressionType
}
