package typings.slonik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ClientConfigurationInputType = typings.slonik.mod.ClientConfigurationType
  type ConnectionRoutineType[T] = js.Function1[/* connection */ typings.slonik.mod.DatabasePoolConnectionType, js.Promise[T]]
  type DatabaseConfigurationType = java.lang.String | typings.slonik.AnonDatabase
  type IdentifierNormalizerType = js.Function1[/* identifierName */ java.lang.String, java.lang.String]
  type LoggerType = js.Function1[/* repeated */ java.lang.String, scala.Nothing]
  type MaybePromiseType[T] = T | js.Promise[T]
  type NamedAssignmentType = typings.std.Record[java.lang.String, typings.slonik.mod.ValueExpressionType]
  type NamedParameterValuesType = typings.std.Record[java.lang.String, typings.slonik.mod.ValueExpressionType]
  type PrimitiveValueExpressionType = java.lang.String | scala.Double | scala.Boolean | scala.Null | typings.slonik.mod.PrimitiveValueExpressionTypeArray
  type QueryAnyFirstFunctionType = js.Function1[
    /* args */ typings.slonik.mod.QueryMethodParams[js.Any], 
    js.Promise[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
      ]
    ]
  ]
  type QueryAnyFunctionType = js.Function1[
    /* args */ typings.slonik.mod.QueryMethodParams[js.Any], 
    js.Promise[js.Array[js.Any]]
  ]
  type QueryFunctionType = js.Function1[
    /* args */ typings.slonik.mod.QueryMethodParams[js.Any], 
    js.Promise[typings.slonik.mod.QueryResultType[js.Any]]
  ]
  type QueryIdType = java.lang.String
  type QueryManyFirstFunctionType = typings.slonik.mod.QueryAnyFirstFunctionType
  type QueryManyFunctionType = typings.slonik.mod.QueryAnyFunctionType
  type QueryMaybeOneFirstFunctionType = js.Function1[
    /* args */ typings.slonik.mod.QueryMethodParams[js.Any], 
    js.Promise[
      (/* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any) | scala.Null
    ]
  ]
  type QueryMaybeOneFunctionType = js.Function1[
    /* args */ typings.slonik.mod.QueryMethodParams[js.Any], 
    js.Promise[js.Any | scala.Null]
  ]
  type QueryMethodParams[T] = typings.std.Parameters[typings.slonik.mod.QueryMethodType[T, scala.Nothing]]
  type QueryMethodType[RowType, Result] = js.Function2[
    /* sql */ typings.slonik.mod.TaggedTemplateLiteralInvocationType[RowType], 
    /* values */ js.UndefOr[js.Array[typings.slonik.mod.PrimitiveValueExpressionType]], 
    js.Promise[Result]
  ]
  type QueryOneFirstFunctionType = js.Function1[
    /* args */ typings.slonik.mod.QueryMethodParams[js.Any], 
    js.Promise[
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ]
  ]
  type QueryOneFunctionType = js.Function1[/* args */ typings.slonik.mod.QueryMethodParams[js.Any], js.Promise[js.Any]]
  type QueryResultRowColumnType = java.lang.String | scala.Double
  type QueryResultRowType[ColumnName /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in ColumnName ]: slonik.slonik.QueryResultRowColumnType}
    */ typings.slonik.slonikStrings.QueryResultRowType with js.Any
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - js.Object
    - typings.slonik.mod.SerializableValueObject
    - typings.slonik.mod.SerializableValueArray
  */
  type SerializableValueType = typings.slonik.mod._SerializableValueType | java.lang.String | scala.Double | scala.Boolean | scala.Null | js.Object
  type SqlSqlTokenType[T] = typings.slonik.mod.TaggedTemplateLiteralInvocationType[T]
  /* Rewritten from type alias, can be one of: 
    - typings.slonik.mod.ArraySqlTokenType
    - typings.slonik.mod.BinarySqlTokenType
    - typings.slonik.mod.IdentifierSqlTokenType
    - typings.slonik.mod.JsonSqlTokenType
    - typings.slonik.mod.ListSqlTokenType
    - typings.slonik.mod.SqlSqlTokenType[js.Any]
    - typings.slonik.mod.UnnestSqlTokenType
  */
  type SqlTokenType = typings.slonik.mod._SqlTokenType | typings.slonik.mod.SqlSqlTokenType[js.Any]
  type StreamHandlerType = js.Function1[/* stream */ typings.node.streamMod.Readable, scala.Unit]
  type TransactionFunctionType[T] = js.Function1[
    /* connection */ typings.slonik.mod.DatabaseTransactionConnectionType, 
    js.Promise[T]
  ]
  type ValueExpressionType = typings.slonik.mod.SqlTokenType | typings.slonik.mod.PrimitiveValueExpressionType
}
