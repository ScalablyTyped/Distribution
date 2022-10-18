package typings.redisTimeSeries.distCommandsMod

import org.scalablytyped.runtime.StringDictionary
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisTimeSeries.distCommandsMod.^
import typings.redisTimeSeries.redisTimeSeriesStrings.TSDotDECRBY
import typings.redisTimeSeries.redisTimeSeriesStrings.TSDotINCRBY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def pushChunkSizeArgument(args: RedisCommandArguments): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("pushChunkSizeArgument")(args.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
inline def pushChunkSizeArgument(args: RedisCommandArguments, chunkSize: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushChunkSizeArgument")(args.asInstanceOf[js.Any], chunkSize.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushEncodingArgument(args: RedisCommandArguments): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("pushEncodingArgument")(args.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
inline def pushEncodingArgument(args: RedisCommandArguments, encoding: TimeSeriesEncoding): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushEncodingArgument")(args.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushFilterArgument(args: RedisCommandArguments, filter: String): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushFilterArgument")(args.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def pushFilterArgument(args: RedisCommandArguments, filter: js.Array[String]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushFilterArgument")(args.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushLabelsArgument(args: RedisCommandArguments): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("pushLabelsArgument")(args.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
inline def pushLabelsArgument(args: RedisCommandArguments, labels: Labels): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushLabelsArgument")(args.asInstanceOf[js.Any], labels.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushMRangeArguments(args: RedisCommandArguments, fromTimestamp: Timestamp, toTimestamp: Timestamp, filter: Filter): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushMRangeArguments")(args.asInstanceOf[js.Any], fromTimestamp.asInstanceOf[js.Any], toTimestamp.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def pushMRangeArguments(
  args: RedisCommandArguments,
  fromTimestamp: Timestamp,
  toTimestamp: Timestamp,
  filter: Filter,
  options: MRangeOptions
): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushMRangeArguments")(args.asInstanceOf[js.Any], fromTimestamp.asInstanceOf[js.Any], toTimestamp.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushMRangeGroupByArguments(args: RedisCommandArguments): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("pushMRangeGroupByArguments")(args.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
inline def pushMRangeGroupByArguments(args: RedisCommandArguments, groupBy: MRangeGroupBy): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushMRangeGroupByArguments")(args.asInstanceOf[js.Any], groupBy.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushMRangeWithLabelsArguments(args: RedisCommandArguments, fromTimestamp: Timestamp, toTimestamp: Timestamp, filter: Filter): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushMRangeWithLabelsArguments")(args.asInstanceOf[js.Any], fromTimestamp.asInstanceOf[js.Any], toTimestamp.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def pushMRangeWithLabelsArguments(
  args: RedisCommandArguments,
  fromTimestamp: Timestamp,
  toTimestamp: Timestamp,
  filter: Filter,
  options: MRangeWithLabelsOptions
): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushMRangeWithLabelsArguments")(args.asInstanceOf[js.Any], fromTimestamp.asInstanceOf[js.Any], toTimestamp.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushRangeArguments(args: RedisCommandArguments, fromTimestamp: Timestamp, toTimestamp: Timestamp): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushRangeArguments")(args.asInstanceOf[js.Any], fromTimestamp.asInstanceOf[js.Any], toTimestamp.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def pushRangeArguments(
  args: RedisCommandArguments,
  fromTimestamp: Timestamp,
  toTimestamp: Timestamp,
  options: RangeOptions
): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushRangeArguments")(args.asInstanceOf[js.Any], fromTimestamp.asInstanceOf[js.Any], toTimestamp.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushRetentionArgument(args: RedisCommandArguments): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("pushRetentionArgument")(args.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
inline def pushRetentionArgument(args: RedisCommandArguments, retention: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushRetentionArgument")(args.asInstanceOf[js.Any], retention.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushWithLabelsArgument(args: RedisCommandArguments): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("pushWithLabelsArgument")(args.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
inline def pushWithLabelsArgument(args: RedisCommandArguments, selectedLabels: SelectedLabels): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushWithLabelsArgument")(args.asInstanceOf[js.Any], selectedLabels.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def transformIncrDecrArguments(command: TSDotINCRBY | TSDotDECRBY, key: String, value: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformIncrDecrArguments")(command.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def transformIncrDecrArguments(command: TSDotINCRBY | TSDotDECRBY, key: String, value: Double, options: IncrDecrOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformIncrDecrArguments")(command.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def transformLablesReply(reply: RawLabels): Labels = ^.asInstanceOf[js.Dynamic].applyDynamic("transformLablesReply")(reply.asInstanceOf[js.Any]).asInstanceOf[Labels]

inline def transformMRangeReply(reply: MRangeRawReply): js.Array[MRangeReplyItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformMRangeReply")(reply.asInstanceOf[js.Any]).asInstanceOf[js.Array[MRangeReplyItem]]

inline def transformMRangeWithLabelsReply(reply: MRangeRawReply): js.Array[MRangeWithLabelsReplyItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformMRangeWithLabelsReply")(reply.asInstanceOf[js.Any]).asInstanceOf[js.Array[MRangeWithLabelsReplyItem]]

inline def transformRangeReply(reply: js.Array[SampleRawReply]): js.Array[SampleReply] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformRangeReply")(reply.asInstanceOf[js.Any]).asInstanceOf[js.Array[SampleReply]]

inline def transformSampleReply(reply: SampleRawReply): SampleReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformSampleReply")(reply.asInstanceOf[js.Any]).asInstanceOf[SampleReply]

inline def transformTimestampArgument(timestamp: Timestamp): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformTimestampArgument")(timestamp.asInstanceOf[js.Any]).asInstanceOf[String]

type Filter = String | js.Array[String]

type Labels = StringDictionary[String]

type MRangeRawReply = js.Array[
js.Tuple3[/* key */ String, /* labels */ RawLabels, /* samples */ js.Array[SampleRawReply]]]

type RawLabels = js.Array[js.Tuple2[/* label */ String, /* value */ String]]

type SampleRawReply = js.Tuple2[/* timestamp */ Double, /* value */ String]

type SelectedLabels = String | js.Array[String]

type Timestamp = Double | js.Date | String
