package typings
package rruleLib.distEsmSrcTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Frequency extends js.Object

@JSImport("rrule/dist/esm/src/types", "Frequency")
@js.native
object Frequency extends js.Object {
  @js.native
  sealed trait DAILY
    extends rruleLib.distEsmSrcTypesMod.Frequency
  
  @js.native
  sealed trait HOURLY
    extends rruleLib.distEsmSrcTypesMod.Frequency
  
  @js.native
  sealed trait MINUTELY
    extends rruleLib.distEsmSrcTypesMod.Frequency
  
  @js.native
  sealed trait MONTHLY
    extends rruleLib.distEsmSrcTypesMod.Frequency
  
  @js.native
  sealed trait SECONDLY
    extends rruleLib.distEsmSrcTypesMod.Frequency
  
  @js.native
  sealed trait WEEKLY
    extends rruleLib.distEsmSrcTypesMod.Frequency
  
  @js.native
  sealed trait YEARLY
    extends rruleLib.distEsmSrcTypesMod.Frequency
  
  /* 3 */ val DAILY: DAILY with scala.Double = js.native
  /* 4 */ val HOURLY: HOURLY with scala.Double = js.native
  /* 5 */ val MINUTELY: MINUTELY with scala.Double = js.native
  /* 1 */ val MONTHLY: MONTHLY with scala.Double = js.native
  /* 6 */ val SECONDLY: SECONDLY with scala.Double = js.native
  /* 2 */ val WEEKLY: WEEKLY with scala.Double = js.native
  /* 0 */ val YEARLY: YEARLY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[rruleLib.distEsmSrcTypesMod.Frequency with scala.Double] = js.native
}

