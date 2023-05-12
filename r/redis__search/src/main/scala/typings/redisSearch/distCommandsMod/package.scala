package typings.redisSearch.distCommandsMod

import org.scalablytyped.runtime.StringDictionary
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisSearch.anon.ALGORITHM
import typings.redisSearch.anon.BLOCKSIZE
import typings.redisSearch.anon.BY
import typings.redisSearch.anon.CASESENSITIVE
import typings.redisSearch.anon.EFCONSTRUCTION
import typings.redisSearch.anon.NOINDEX
import typings.redisSearch.anon.NOSTEM
import typings.redisSearch.anon.Type
import typings.redisSearch.distCommandsMod.SchemaFieldTypes.GEO
import typings.redisSearch.distCommandsMod.SchemaFieldTypes.NUMERIC
import typings.redisSearch.distCommandsMod.SchemaFieldTypes.TAG
import typings.redisSearch.distCommandsMod.SchemaFieldTypes.TEXT
import typings.redisSearch.distCommandsMod.SchemaFieldTypes.VECTOR
import typings.redisSearch.distCommandsMod.VectorAlgorithms.FLAT
import typings.redisSearch.distCommandsMod.VectorAlgorithms.HNSW
import typings.redisSearch.distCommandsMod.^
import typings.redisSearch.distCommandsSearchMod.SearchOptions
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def pushArgumentsWithLength(args: RedisCommandArguments, fn: js.Function1[/* args */ RedisCommandArguments, Unit]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushArgumentsWithLength")(args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushParamsArgs(args: RedisCommandArguments): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("pushParamsArgs")(args.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
inline def pushParamsArgs(args: RedisCommandArguments, params: Params): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushParamsArgs")(args.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushSchema(args: RedisCommandArguments, schema: RediSearchSchema): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pushSchema")(args.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def pushSearchOptions(args: RedisCommandArguments): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("pushSearchOptions")(args.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
inline def pushSearchOptions(args: RedisCommandArguments, options: SearchOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushSearchOptions")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushSortByArguments(args: RedisCommandArguments, name: String, sortBy: js.Array[SortByProperty]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushSortByArguments")(args.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sortBy.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def pushSortByArguments(args: RedisCommandArguments, name: String, sortBy: SortByProperty): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushSortByArguments")(args.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sortBy.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushSortByProperty(args: RedisCommandArguments, sortBy: SortByProperty): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pushSortByProperty")(args.asInstanceOf[js.Any], sortBy.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def transformProfile(reply: js.Array[Any]): ProfileData = ^.asInstanceOf[js.Dynamic].applyDynamic("transformProfile")(reply.asInstanceOf[js.Any]).asInstanceOf[ProfileData]

type CreateSchemaCommonField[T /* <: SchemaFieldTypes */, E] = CreateSchemaField[T, NOINDEX & E]

type CreateSchemaField[T /* <: SchemaFieldTypes */, E] = T | (Type[T] & E)

type CreateSchemaFlatVectorField = CreateSchemaVectorField[FLAT, BLOCKSIZE]

type CreateSchemaGeoField = CreateSchemaCommonField[GEO, Record[PropertyKey, Any]]

type CreateSchemaHNSWVectorField = CreateSchemaVectorField[HNSW, EFCONSTRUCTION]

type CreateSchemaNumericField = CreateSchemaCommonField[NUMERIC, Record[PropertyKey, Any]]

type CreateSchemaTagField = CreateSchemaCommonField[TAG, CASESENSITIVE]

type CreateSchemaTextField = CreateSchemaCommonField[TEXT, NOSTEM]

type CreateSchemaVectorField[T /* <: VectorAlgorithms */, A /* <: Record[String, Any] */] = CreateSchemaField[VECTOR, ALGORITHM[T] & A]

type Params = Record[String, RedisCommandArgument | Double]

type ProfileRawReply[T] = js.Tuple2[
/* results */ T, 
/* profile */ js.Tuple8[
  /* _ */ String, 
  /* TotalProfileTime */ String, 
  /* _ */ String, 
  /* ParsingTime */ String, 
  /* _ */ String, 
  /* PipelineCreationTime */ String, 
  /* _ */ String, 
  /* IteratorsProfile */ js.Array[Any]
]]

type PropertyName = /* template literal string: ${@|$.}${string} */ String

type RediSearchSchema = StringDictionary[
CreateSchemaTextField | CreateSchemaNumericField | CreateSchemaGeoField | CreateSchemaTagField | CreateSchemaFlatVectorField | CreateSchemaHNSWVectorField]

type SortByProperty = String | BY
