package typings.rrule.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Frequency extends js.Object
@JSImport("rrule/dist/esm/src/types", "Frequency")
@js.native
object Frequency extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Frequency with Double] = js.native
  
  @js.native
  sealed trait DAILY extends Frequency
  /* 3 */ @js.native
  object DAILY extends TopLevel[DAILY with Double]
  
  @js.native
  sealed trait HOURLY extends Frequency
  /* 4 */ @js.native
  object HOURLY extends TopLevel[HOURLY with Double]
  
  @js.native
  sealed trait MINUTELY extends Frequency
  /* 5 */ @js.native
  object MINUTELY extends TopLevel[MINUTELY with Double]
  
  @js.native
  sealed trait MONTHLY extends Frequency
  /* 1 */ @js.native
  object MONTHLY extends TopLevel[MONTHLY with Double]
  
  @js.native
  sealed trait SECONDLY extends Frequency
  /* 6 */ @js.native
  object SECONDLY extends TopLevel[SECONDLY with Double]
  
  @js.native
  sealed trait WEEKLY extends Frequency
  /* 2 */ @js.native
  object WEEKLY extends TopLevel[WEEKLY with Double]
  
  @js.native
  sealed trait YEARLY extends Frequency
  /* 0 */ @js.native
  object YEARLY extends TopLevel[YEARLY with Double]
}
