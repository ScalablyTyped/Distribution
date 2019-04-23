package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "UAStatus")
@js.native
object UAStatus extends js.Object {
  /* 0 */ val STATUS_INIT: sipDotJsLib.libEnumsMod.UAStatus.STATUS_INIT with scala.Double = js.native
  /* 4 */ val STATUS_NOT_READY: sipDotJsLib.libEnumsMod.UAStatus.STATUS_NOT_READY with scala.Double = js.native
  /* 2 */ val STATUS_READY: sipDotJsLib.libEnumsMod.UAStatus.STATUS_READY with scala.Double = js.native
  /* 1 */ val STATUS_STARTING: sipDotJsLib.libEnumsMod.UAStatus.STATUS_STARTING with scala.Double = js.native
  /* 3 */ val STATUS_USER_CLOSED: sipDotJsLib.libEnumsMod.UAStatus.STATUS_USER_CLOSED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sipDotJsLib.libEnumsMod.UAStatus with scala.Double] = js.native
}

