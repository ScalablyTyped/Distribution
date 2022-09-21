package typings.redisSearch.aggregateMod

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisSearch.aggregateMod.AggregateGroupByReducers.COUNT
import typings.redisSearch.aggregateMod.^
import typings.redisSearch.anon.AS
import typings.redisSearch.commandsMod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def FIRST_KEY_INDEX: /* 1 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FIRST_KEY_INDEX").asInstanceOf[/* 1 */ Double]

inline def IS_READ_ONLY: /* true */ Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("IS_READ_ONLY").asInstanceOf[/* true */ Boolean]

inline def pushAggregatehOptions(args: RedisCommandArguments): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("pushAggregatehOptions")(args.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
inline def pushAggregatehOptions(args: RedisCommandArguments, options: AggregateOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushAggregatehOptions")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def transformArguments(index: String, query: String): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def transformArguments(index: String, query: String, options: AggregateOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def transformReply(rawReply: AggregateRawReply): AggregateReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(rawReply.asInstanceOf[js.Any]).asInstanceOf[AggregateReply]

type AggregateRawReply = /* results */ Array[Double | js.Array[RedisCommandArgument]]

type CountReducer = GroupByReducer[COUNT]

/* Rewritten from type alias, can be one of: 
  - typings.redisSearch.aggregateMod.CountReducer
  - typings.redisSearch.aggregateMod.CountDistinctReducer
  - typings.redisSearch.aggregateMod.CountDistinctishReducer
  - typings.redisSearch.aggregateMod.SumReducer
  - typings.redisSearch.aggregateMod.MinReducer
  - typings.redisSearch.aggregateMod.MaxReducer
  - typings.redisSearch.aggregateMod.AvgReducer
  - typings.redisSearch.aggregateMod.StdDevReducer
  - typings.redisSearch.aggregateMod.QuantileReducer
  - typings.redisSearch.aggregateMod.ToListReducer
  - typings.redisSearch.aggregateMod.FirstValueReducer
  - typings.redisSearch.aggregateMod.RandomSampleReducer
*/
type GroupByReducers = _GroupByReducers | CountReducer

type LoadField = PropertyName | AS
