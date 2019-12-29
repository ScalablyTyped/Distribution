package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateTimeKind extends js.Object

@JSGlobal("SP.DateTimeKind")
@js.native
object DateTimeKind extends js.Object {
  @js.native
  sealed trait local extends DateTimeKind
  
  @js.native
  sealed trait unspecified extends DateTimeKind
  
  @js.native
  sealed trait utc extends DateTimeKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateTimeKind with Double] = js.native
  /* 2 */ @js.native
  object local extends TopLevel[local with Double]
  
  /* 0 */ @js.native
  object unspecified extends TopLevel[unspecified with Double]
  
  /* 1 */ @js.native
  object utc extends TopLevel[utc with Double]
  
}

