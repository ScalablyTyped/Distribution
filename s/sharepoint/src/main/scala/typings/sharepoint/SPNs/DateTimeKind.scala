package typings.sharepoint.SPNs

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
  
  /* 2 */ val local: typings.sharepoint.SPNs.DateTimeKind.local with Double = js.native
  /* 0 */ val unspecified: typings.sharepoint.SPNs.DateTimeKind.unspecified with Double = js.native
  /* 1 */ val utc: typings.sharepoint.SPNs.DateTimeKind.utc with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateTimeKind with Double] = js.native
}

