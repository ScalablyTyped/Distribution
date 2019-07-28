package typings.sipDotJs.libWebSimpleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SimpleStatus extends js.Object

@JSImport("sip.js/lib/Web/Simple", "SimpleStatus")
@js.native
object SimpleStatus extends js.Object {
  @js.native
  sealed trait STATUS_COMPLETED extends SimpleStatus
  
  @js.native
  sealed trait STATUS_CONNECTED extends SimpleStatus
  
  @js.native
  sealed trait STATUS_CONNECTING extends SimpleStatus
  
  @js.native
  sealed trait STATUS_NEW extends SimpleStatus
  
  @js.native
  sealed trait STATUS_NULL extends SimpleStatus
  
  /* 4 */ val STATUS_COMPLETED: typings.sipDotJs.libWebSimpleMod.SimpleStatus.STATUS_COMPLETED with Double = js.native
  /* 3 */ val STATUS_CONNECTED: typings.sipDotJs.libWebSimpleMod.SimpleStatus.STATUS_CONNECTED with Double = js.native
  /* 2 */ val STATUS_CONNECTING: typings.sipDotJs.libWebSimpleMod.SimpleStatus.STATUS_CONNECTING with Double = js.native
  /* 1 */ val STATUS_NEW: typings.sipDotJs.libWebSimpleMod.SimpleStatus.STATUS_NEW with Double = js.native
  /* 0 */ val STATUS_NULL: typings.sipDotJs.libWebSimpleMod.SimpleStatus.STATUS_NULL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SimpleStatus with Double] = js.native
}

