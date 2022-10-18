package typings.slonik.mod

import typings.node.streamMod.Readable
import typings.slonik.anon.Format
import typings.slonik.anon.StripComments
import typings.slonik.mod.^
import typings.std.Parameters
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createBenchmarkingInterceptor(): InterceptorType = ^.asInstanceOf[js.Dynamic].applyDynamic("createBenchmarkingInterceptor")().asInstanceOf[InterceptorType]

inline def createBigintTypeParser(): TypeParserType[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBigintTypeParser")().asInstanceOf[TypeParserType[Double]]

inline def createFieldNameTransformationInterceptor(configuration: Format): InterceptorType = ^.asInstanceOf[js.Dynamic].applyDynamic("createFieldNameTransformationInterceptor")(configuration.asInstanceOf[js.Any]).asInstanceOf[InterceptorType]

inline def createInterceptorPreset(): js.Array[InterceptorType] = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptorPreset")().asInstanceOf[js.Array[InterceptorType]]

inline def createPool(connectionUri: String): DatabasePoolType = ^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(connectionUri.asInstanceOf[js.Any]).asInstanceOf[DatabasePoolType]
inline def createPool(connectionUri: String, clientUserConfiguration: ClientConfigurationInputType): DatabasePoolType = (^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(connectionUri.asInstanceOf[js.Any], clientUserConfiguration.asInstanceOf[js.Any])).asInstanceOf[DatabasePoolType]

inline def createQueryNormalizationInterceptor(): InterceptorType = ^.asInstanceOf[js.Dynamic].applyDynamic("createQueryNormalizationInterceptor")().asInstanceOf[InterceptorType]
inline def createQueryNormalizationInterceptor(configuration: StripComments): InterceptorType = ^.asInstanceOf[js.Dynamic].applyDynamic("createQueryNormalizationInterceptor")(configuration.asInstanceOf[js.Any]).asInstanceOf[InterceptorType]

inline def createSqlTag(): SqlTaggedTemplateType = ^.asInstanceOf[js.Dynamic].applyDynamic("createSqlTag")().asInstanceOf[SqlTaggedTemplateType]
inline def createSqlTag(configuration: SqlTagConfigurationType): SqlTaggedTemplateType = ^.asInstanceOf[js.Dynamic].applyDynamic("createSqlTag")(configuration.asInstanceOf[js.Any]).asInstanceOf[SqlTaggedTemplateType]

inline def createTimestampTypeParser(): TypeParserType[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTimestampTypeParser")().asInstanceOf[TypeParserType[Double | Null]]

inline def createTimestampWithTimeZoneTypeParser(): TypeParserType[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTimestampWithTimeZoneTypeParser")().asInstanceOf[TypeParserType[Double | Null]]

inline def createTypeParserPreset(): js.Array[TypeParserType[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeParserPreset")().asInstanceOf[js.Array[TypeParserType[Any]]]

inline def sql: SqlTaggedTemplateType = ^.asInstanceOf[js.Dynamic].selectDynamic("sql").asInstanceOf[SqlTaggedTemplateType]

type ClientConfigurationInputType = ClientConfigurationType

type ConnectionRoutineType[T] = js.Function1[/* connection */ DatabasePoolConnectionType, js.Promise[T]]

type DatabaseConnectionType = DatabasePoolConnectionType & DatabasePoolType

type IdentifierNormalizerType = js.Function1[/* identifierName */ String, String]

type MaybePromiseType[T] = T | js.Promise[T]

type NamedAssignmentType = Record[String, ValueExpressionType]

type NamedParameterValuesType = Record[String, ValueExpressionType]

type PrimitiveValueExpressionType = String | Double | Boolean | Null | PrimitiveValueExpressionTypeArray

type QueryAnyFunctionType = js.Function1[/* args */ QueryMethodParams[Any], js.Promise[js.Array[Any]]]

type QueryExistsFunctionType = js.Function1[/* args */ QueryMethodParams[Any], js.Promise[Boolean]]

type QueryFunctionType = js.Function1[/* args */ QueryMethodParams[Any], js.Promise[QueryResultType[Any]]]

type QueryIdType = String

type QueryManyFirstFunctionType = QueryAnyFirstFunctionType

type QueryMaybeOneFirstFunctionType = js.Function1[
/* args */ QueryMethodParams[Any], 
js.Promise[
  (/* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any) | Null
]]

type QueryMaybeOneFunctionType = js.Function1[/* args */ QueryMethodParams[Any], js.Promise[Any | Null]]

type QueryMethodParams[T] = Parameters[QueryMethodType[T, scala.Nothing]]

type QueryOneFirstFunctionType = js.Function1[
/* args */ QueryMethodParams[Any], 
js.Promise[
  /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
]]

type QueryOneFunctionType = js.Function1[/* args */ QueryMethodParams[Any], js.Promise[Any]]

type QueryResultRowColumnType = String | Double

type SerializableValueArray = js.Array[SerializableValueType]

type SerializableValueType = String | Double | Boolean | Null | js.Object | SerializableValueObject | Any

type SqlSqlTokenType[T] = TaggedTemplateLiteralInvocationType[T]

/* Rewritten from type alias, can be one of: 
  - typings.slonik.mod.ArraySqlTokenType
  - typings.slonik.mod.BinarySqlTokenType
  - typings.slonik.mod.IdentifierSqlTokenType
  - typings.slonik.mod.JsonSqlTokenType
  - typings.slonik.mod.ListSqlTokenType
  - typings.slonik.mod.SqlSqlTokenType[scala.Any]
  - typings.slonik.mod.UnnestSqlTokenType
*/
type SqlTokenType = _SqlTokenType | SqlSqlTokenType[Any]

type StreamHandlerType = js.Function1[/* stream */ Readable, Unit]

type TransactionFunctionType[T] = js.Function1[/* connection */ DatabaseTransactionConnectionType, js.Promise[T]]

type ValueExpressionType = SqlTokenType | Any
