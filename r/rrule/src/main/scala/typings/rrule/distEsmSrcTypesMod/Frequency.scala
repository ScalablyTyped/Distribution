package typings.rrule.distEsmSrcTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Frequency extends js.Object

@JSImport("rrule/dist/esm/src/types", "Frequency")
@js.native
object Frequency extends js.Object {
  @js.native
  sealed trait DAILY extends Frequency
  
  @js.native
  sealed trait HOURLY extends Frequency
  
  @js.native
  sealed trait MINUTELY extends Frequency
  
  @js.native
  sealed trait MONTHLY extends Frequency
  
  @js.native
  sealed trait SECONDLY extends Frequency
  
  @js.native
  sealed trait WEEKLY extends Frequency
  
  @js.native
  sealed trait YEARLY extends Frequency
  
  /* 3 */ val DAILY: typings.rrule.distEsmSrcTypesMod.Frequency.DAILY with Double = js.native
  /* 4 */ val HOURLY: typings.rrule.distEsmSrcTypesMod.Frequency.HOURLY with Double = js.native
  /* 5 */ val MINUTELY: typings.rrule.distEsmSrcTypesMod.Frequency.MINUTELY with Double = js.native
  /* 1 */ val MONTHLY: typings.rrule.distEsmSrcTypesMod.Frequency.MONTHLY with Double = js.native
  /* 6 */ val SECONDLY: typings.rrule.distEsmSrcTypesMod.Frequency.SECONDLY with Double = js.native
  /* 2 */ val WEEKLY: typings.rrule.distEsmSrcTypesMod.Frequency.WEEKLY with Double = js.native
  /* 0 */ val YEARLY: typings.rrule.distEsmSrcTypesMod.Frequency.YEARLY with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Frequency with Double] = js.native
}

