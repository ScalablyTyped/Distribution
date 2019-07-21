package typings
package slonikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object slonikMod {
  type ClientUserConfigurationType = ClientConfigurationType
  type ConnectionRoutineType[T] = js.Function1[/* connection */ DatabasePoolConnectionType, js.Promise[T]]
  type DatabaseConfigurationType = java.lang.String | slonikLib.Anon_Database
  type DatabaseConnectionType = DatabasePoolConnectionType with DatabasePoolType
  type DatabasePoolConnectionType = CommonQueryMethodsType with slonikLib.Anon_HandlerSql
  type DatabasePoolType = CommonQueryMethodsType with slonikLib.Anon_Connect
  type DatabaseTransactionConnectionType = CommonQueryMethodsType with slonikLib.Anon_Handler
  type IdentifierListMemberType = js.Array[java.lang.String] | slonikLib.Anon_Alias
  type IdentifierNormalizerType = js.Function1[/* identifierName */ java.lang.String, java.lang.String]
  type LoggerType = js.Function1[/* repeated */ java.lang.String, scala.Nothing]
  type MaybePromiseType[T] = T | js.Promise[T]
  type NamedAssignmentType = stdLib.Record[java.lang.String, ValueExpressionType]
  type PrimitiveValueExpressionType = java.lang.String | scala.Double | scala.Boolean | scala.Null
  type QueryAnyFirstFunctionType = js.Function1[
    /* args */ QueryMethodParams[js.Any], 
    js.Promise[
      js.Array[
        /* import warning: ImportType.apply Failed type conversion: any[keyof any] */ js.Any
      ]
    ]
  ]
  type QueryAnyFunctionType = js.Function1[/* args */ QueryMethodParams[js.Any], js.Promise[js.Array[js.Any]]]
  type QueryFunctionType = js.Function1[/* args */ QueryMethodParams[js.Any], js.Promise[QueryResultType[js.Any]]]
  type QueryIdType = java.lang.String
  type QueryManyFirstFunctionType = QueryAnyFirstFunctionType
  type QueryManyFunctionType = QueryAnyFunctionType
  type QueryMaybeOneFirstFunctionType = js.Function1[
    /* args */ QueryMethodParams[js.Any], 
    js.Promise[
      (/* import warning: ImportType.apply Failed type conversion: any[keyof any] */ js.Any) | scala.Null
    ]
  ]
  type QueryMaybeOneFunctionType = js.Function1[/* args */ QueryMethodParams[js.Any], js.Promise[js.Any | scala.Null]]
  type QueryMethodParams[T] = stdLib.Parameters[QueryMethodType[T, scala.Nothing]]
  type QueryMethodType[RowType, Result] = js.Function2[
    /* sql */ TaggedTemplateLiteralInvocationType[RowType], 
    /* values */ js.UndefOr[js.Array[PrimitiveValueExpressionType]], 
    js.Promise[Result]
  ]
  type QueryOneFirstFunctionType = js.Function1[
    /* args */ QueryMethodParams[js.Any], 
    js.Promise[
      /* import warning: ImportType.apply Failed type conversion: any[keyof any] */ js.Any
    ]
  ]
  type QueryOneFunctionType = js.Function1[/* args */ QueryMethodParams[js.Any], js.Promise[js.Any]]
  type QueryResultRowColumnType = java.lang.String | scala.Double
  type QueryResultRowType[ColumnName /* <: java.lang.String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ name in ColumnName ]: slonik.slonik.QueryResultRowColumnType}
    */ slonikLib.slonikLibStrings.QueryResultRowType with js.Any
  type SqlSqlTokenType[T] = TaggedTemplateLiteralInvocationType[T]
  /* Rewritten from type alias, can be one of: 
    - ArraySqlTokenType
    - AssignmentListTokenType
    - IdentifierTokenType
    - IdentifierListTokenType
    - RawSqlTokenType
    - SqlSqlTokenType[js.Any]
    - TupleListSqlTokenType
    - TupleSqlTokenType
    - UnnestSqlTokenType
    - ValueListSqlTokenType
    - ComparisonPredicateTokenType
    - BooleanExpressionTokenType
  */
  type SqlTokenType = _SqlTokenType | SqlSqlTokenType[js.Any]
  type StreamHandlerType = js.Function1[/* stream */ nodeLib.streamMod.Readable, scala.Unit]
  type TransactionFunctionType[T] = js.Function1[/* connection */ DatabaseTransactionConnectionType, js.Promise[T]]
  type ValueExpressionType = SqlTokenType | PrimitiveValueExpressionType
}
