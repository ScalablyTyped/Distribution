package typings.redisSearch.aggregateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AggregateSteps extends StObject
@JSImport("@redis/search/dist/commands/AGGREGATE", "AggregateSteps")
@js.native
object AggregateSteps extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AggregateSteps & String] = js.native
  
  @js.native
  sealed trait APPLY
    extends StObject
       with AggregateSteps
  /* "APPLY" */ val APPLY: typings.redisSearch.aggregateMod.AggregateSteps.APPLY & String = js.native
  
  @js.native
  sealed trait FILTER
    extends StObject
       with AggregateSteps
  /* "FILTER" */ val FILTER: typings.redisSearch.aggregateMod.AggregateSteps.FILTER & String = js.native
  
  @js.native
  sealed trait GROUPBY
    extends StObject
       with AggregateSteps
  /* "GROUPBY" */ val GROUPBY: typings.redisSearch.aggregateMod.AggregateSteps.GROUPBY & String = js.native
  
  @js.native
  sealed trait LIMIT
    extends StObject
       with AggregateSteps
  /* "LIMIT" */ val LIMIT: typings.redisSearch.aggregateMod.AggregateSteps.LIMIT & String = js.native
  
  @js.native
  sealed trait SORTBY
    extends StObject
       with AggregateSteps
  /* "SORTBY" */ val SORTBY: typings.redisSearch.aggregateMod.AggregateSteps.SORTBY & String = js.native
}
