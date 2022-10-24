package typings.redisClient.distLibCommandsGenericTransformersMod

import typings.redisClient.anon.ANY
import typings.redisClient.anon.Messages
import typings.redisClient.distLibCommandsGenericTransformersMod.^
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.description
import typings.redisClient.redisClientStrings.engine
import typings.redisClient.redisClientStrings.flags
import typings.redisClient.redisClientStrings.functions
import typings.redisClient.redisClientStrings.library_name
import typings.redisClient.redisClientStrings.name
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def evalFirstKeyIndex(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("evalFirstKeyIndex")().asInstanceOf[js.UndefOr[String]]
inline def evalFirstKeyIndex(options: EvalOptions): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("evalFirstKeyIndex")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]

inline def pushEvalArguments(args: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pushEvalArguments")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
inline def pushEvalArguments(args: js.Array[String], options: EvalOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("pushEvalArguments")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]

inline def pushGeoCountArgument(args: RedisCommandArguments): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("pushGeoCountArgument")(args.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
inline def pushGeoCountArgument(args: RedisCommandArguments, count: GeoCountArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushGeoCountArgument")(args.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushGeoRadiusArguments(
  args: RedisCommandArguments,
  key: RedisCommandArgument,
  from: GeoSearchFrom,
  radius: Double,
  unit: GeoUnits
): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushGeoRadiusArguments")(args.asInstanceOf[js.Any], key.asInstanceOf[js.Any], from.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def pushGeoRadiusArguments(
  args: RedisCommandArguments,
  key: RedisCommandArgument,
  from: GeoSearchFrom,
  radius: Double,
  unit: GeoUnits,
  options: GeoSearchOptions
): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushGeoRadiusArguments")(args.asInstanceOf[js.Any], key.asInstanceOf[js.Any], from.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushGeoRadiusStoreArguments(
  args: RedisCommandArguments,
  key: RedisCommandArgument,
  from: GeoSearchFrom,
  radius: Double,
  unit: GeoUnits,
  destination: RedisCommandArgument
): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushGeoRadiusStoreArguments")(args.asInstanceOf[js.Any], key.asInstanceOf[js.Any], from.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def pushGeoRadiusStoreArguments(
  args: RedisCommandArguments,
  key: RedisCommandArgument,
  from: GeoSearchFrom,
  radius: Double,
  unit: GeoUnits,
  destination: RedisCommandArgument,
  options: GeoRadiusStoreOptions
): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushGeoRadiusStoreArguments")(args.asInstanceOf[js.Any], key.asInstanceOf[js.Any], from.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushGeoSearchArguments(args: RedisCommandArguments, key: RedisCommandArgument, from: GeoSearchFrom, by: GeoSearchBy): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushGeoSearchArguments")(args.asInstanceOf[js.Any], key.asInstanceOf[js.Any], from.asInstanceOf[js.Any], by.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def pushGeoSearchArguments(
  args: RedisCommandArguments,
  key: RedisCommandArgument,
  from: GeoSearchFrom,
  by: GeoSearchBy,
  options: GeoSearchOptions
): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushGeoSearchArguments")(args.asInstanceOf[js.Any], key.asInstanceOf[js.Any], from.asInstanceOf[js.Any], by.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushOptionalVerdictArgument(args: RedisCommandArguments, name: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushOptionalVerdictArgument")(args.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def pushOptionalVerdictArgument(args: RedisCommandArguments, name: RedisCommandArgument, value: js.Array[RedisCommandArgument]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushOptionalVerdictArgument")(args.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def pushOptionalVerdictArgument(args: RedisCommandArguments, name: RedisCommandArgument, value: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushOptionalVerdictArgument")(args.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushScanArguments(args: RedisCommandArguments, cursor: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushScanArguments")(args.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def pushScanArguments(args: RedisCommandArguments, cursor: Double, options: ScanOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushScanArguments")(args.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushSlotRangesArguments(args: RedisCommandArguments, ranges: js.Array[SlotRange]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushSlotRangesArguments")(args.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def pushSlotRangesArguments(args: RedisCommandArguments, ranges: SlotRange): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushSlotRangesArguments")(args.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushSortArguments(args: RedisCommandArguments): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("pushSortArguments")(args.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
inline def pushSortArguments(args: RedisCommandArguments, options: SortOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushSortArguments")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushVerdictArgument(args: RedisCommandArguments, value: js.Array[RedisCommandArgument]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushVerdictArgument")(args.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def pushVerdictArgument(args: RedisCommandArguments, value: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushVerdictArgument")(args.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushVerdictArguments(args: RedisCommandArguments, value: js.Array[RedisCommandArgument]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushVerdictArguments")(args.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def pushVerdictArguments(args: RedisCommandArguments, value: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushVerdictArguments")(args.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushVerdictNumberArguments(args: RedisCommandArguments, value: js.Array[Double]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushVerdictNumberArguments")(args.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def pushVerdictNumberArguments(args: RedisCommandArguments, value: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushVerdictNumberArguments")(args.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def transformBooleanArrayReply(reply: js.Array[Double]): js.Array[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformBooleanArrayReply")(reply.asInstanceOf[js.Any]).asInstanceOf[js.Array[Boolean]]

inline def transformBooleanReply(reply: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("transformBooleanReply")(reply.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def transformCommandReply(param1: CommandRawReply): CommandReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformCommandReply")(param1.asInstanceOf[js.Any]).asInstanceOf[CommandReply]

inline def transformEXAT(EXAT: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformEXAT")(EXAT.asInstanceOf[js.Any]).asInstanceOf[String]
inline def transformEXAT(EXAT: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformEXAT")(EXAT.asInstanceOf[js.Any]).asInstanceOf[String]

inline def transformFunctionListItemReply(reply: FunctionListRawItemReply): FunctionListItemReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformFunctionListItemReply")(reply.asInstanceOf[js.Any]).asInstanceOf[FunctionListItemReply]

inline def transformGeoMembersWithReply(reply: js.Array[js.Array[Any]], replyWith: js.Array[GeoReplyWith]): js.Array[GeoReplyWithMember] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformGeoMembersWithReply")(reply.asInstanceOf[js.Any], replyWith.asInstanceOf[js.Any])).asInstanceOf[js.Array[GeoReplyWithMember]]

inline def transformLMPopArguments(args: RedisCommandArguments, keys: js.Array[RedisCommandArgument], side: ListSide): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformLMPopArguments")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def transformLMPopArguments(
  args: RedisCommandArguments,
  keys: js.Array[RedisCommandArgument],
  side: ListSide,
  options: LMPopOptions
): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformLMPopArguments")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def transformLMPopArguments(args: RedisCommandArguments, keys: RedisCommandArgument, side: ListSide): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformLMPopArguments")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def transformLMPopArguments(args: RedisCommandArguments, keys: RedisCommandArgument, side: ListSide, options: LMPopOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformLMPopArguments")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def transformNumberInfinityArgument(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformNumberInfinityArgument")(num.asInstanceOf[js.Any]).asInstanceOf[String]

inline def transformNumberInfinityNullArrayReply(reply: js.Array[RedisCommandArgument | Null]): js.Array[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformNumberInfinityNullArrayReply")(reply.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double | Null]]

inline def transformNumberInfinityNullReply(): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformNumberInfinityNullReply")().asInstanceOf[Double | Null]
inline def transformNumberInfinityNullReply(reply: RedisCommandArgument): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformNumberInfinityNullReply")(reply.asInstanceOf[js.Any]).asInstanceOf[Double | Null]

inline def transformNumberInfinityReply(reply: RedisCommandArgument): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("transformNumberInfinityReply")(reply.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def transformPXAT(PXAT: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformPXAT")(PXAT.asInstanceOf[js.Any]).asInstanceOf[String]
inline def transformPXAT(PXAT: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformPXAT")(PXAT.asInstanceOf[js.Any]).asInstanceOf[String]

inline def transformRangeReply(param0: RawRangeReply): RangeReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformRangeReply")(param0.asInstanceOf[js.Any]).asInstanceOf[RangeReply]

inline def transformSortedSetMemberNullReply(reply: js.Array[Any]): ZMember | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformSortedSetMemberNullReply")(reply.asInstanceOf[js.Any]).asInstanceOf[ZMember | Null]
inline def transformSortedSetMemberNullReply(reply: js.Tuple2[RedisCommandArgument, RedisCommandArgument]): ZMember | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformSortedSetMemberNullReply")(reply.asInstanceOf[js.Any]).asInstanceOf[ZMember | Null]

inline def transformSortedSetMemberReply(reply: js.Tuple2[RedisCommandArgument, RedisCommandArgument]): ZMember = ^.asInstanceOf[js.Dynamic].applyDynamic("transformSortedSetMemberReply")(reply.asInstanceOf[js.Any]).asInstanceOf[ZMember]

inline def transformSortedSetWithScoresReply(reply: js.Array[RedisCommandArgument]): js.Array[ZMember] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformSortedSetWithScoresReply")(reply.asInstanceOf[js.Any]).asInstanceOf[js.Array[ZMember]]

inline def transformStreamMessagesReply(reply: js.Array[Any]): StreamMessagesReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformStreamMessagesReply")(reply.asInstanceOf[js.Any]).asInstanceOf[StreamMessagesReply]

inline def transformStreamsMessagesReply(): StreamsMessagesReply | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformStreamsMessagesReply")().asInstanceOf[StreamsMessagesReply | Null]
inline def transformStreamsMessagesReply(reply: js.Array[Any]): StreamsMessagesReply | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformStreamsMessagesReply")(reply.asInstanceOf[js.Any]).asInstanceOf[StreamsMessagesReply | Null]

inline def transformStringNumberInfinityArgument(num: Double): RedisCommandArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("transformStringNumberInfinityArgument")(num.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArgument]
inline def transformStringNumberInfinityArgument(num: RedisCommandArgument): RedisCommandArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("transformStringNumberInfinityArgument")(num.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArgument]

inline def transformTuplesReply(reply: js.Array[RedisCommandArgument]): Record[String, RedisCommandArgument] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformTuplesReply")(reply.asInstanceOf[js.Any]).asInstanceOf[Record[String, RedisCommandArgument]]

inline def transformZMPopArguments(args: RedisCommandArguments, keys: js.Array[RedisCommandArgument], side: SortedSetSide): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformZMPopArguments")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def transformZMPopArguments(
  args: RedisCommandArguments,
  keys: js.Array[RedisCommandArgument],
  side: SortedSetSide,
  options: ZMPopOptions
): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformZMPopArguments")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def transformZMPopArguments(args: RedisCommandArguments, keys: RedisCommandArgument, side: SortedSetSide): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformZMPopArguments")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def transformZMPopArguments(
  args: RedisCommandArguments,
  keys: RedisCommandArgument,
  side: SortedSetSide,
  options: ZMPopOptions
): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformZMPopArguments")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

type CommandRawReply = js.Tuple7[
/* name */ String, 
/* arity */ Double, 
/* flags */ js.Array[CommandFlags], 
/* firstKeyIndex */ Double, 
/* lastKeyIndex */ Double, 
/* step */ Double, 
/* categories */ js.Array[CommandCategories]]

type FunctionListRawItemReply = js.Tuple6[
library_name, 
String, 
engine, 
String, 
functions, 
js.Array[
  js.Tuple6[name, String, description, String | Null, flags, js.Array[RedisFunctionFlags]]
]]

type GeoCountArgument = Double | ANY

type GeoSearchFrom = GeoSearchFromMember | GeoCoordinates

type GeoSearchFromMember = String

type RawRangeReply = js.Tuple2[/* start */ Double, /* end */ Double]

type StreamMessagesReply = js.Array[StreamMessageReply]

type StreamsMessagesReply = js.Array[Messages] | Null
