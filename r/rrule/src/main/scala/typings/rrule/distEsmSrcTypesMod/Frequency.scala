package typings.rrule.distEsmSrcTypesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Frequency with Double] = js.native
  /* 3 */ @js.native
  object DAILY extends TopLevel[DAILY with Double]
  
  /* 4 */ @js.native
  object HOURLY extends TopLevel[HOURLY with Double]
  
  /* 5 */ @js.native
  object MINUTELY extends TopLevel[MINUTELY with Double]
  
  /* 1 */ @js.native
  object MONTHLY extends TopLevel[MONTHLY with Double]
  
  /* 6 */ @js.native
  object SECONDLY extends TopLevel[SECONDLY with Double]
  
  /* 2 */ @js.native
  object WEEKLY extends TopLevel[WEEKLY with Double]
  
  /* 0 */ @js.native
  object YEARLY extends TopLevel[YEARLY with Double]
  
}

