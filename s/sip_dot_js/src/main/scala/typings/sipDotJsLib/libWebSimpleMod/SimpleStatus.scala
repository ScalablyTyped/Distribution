package typings
package sipDotJsLib.libWebSimpleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SimpleStatus extends js.Object

@JSImport("sip.js/lib/Web/Simple", "SimpleStatus")
@js.native
object SimpleStatus extends js.Object {
  @js.native
  sealed trait STATUS_COMPLETED
    extends sipDotJsLib.libWebSimpleMod.SimpleStatus
  
  @js.native
  sealed trait STATUS_CONNECTED
    extends sipDotJsLib.libWebSimpleMod.SimpleStatus
  
  @js.native
  sealed trait STATUS_CONNECTING
    extends sipDotJsLib.libWebSimpleMod.SimpleStatus
  
  @js.native
  sealed trait STATUS_NEW
    extends sipDotJsLib.libWebSimpleMod.SimpleStatus
  
  @js.native
  sealed trait STATUS_NULL
    extends sipDotJsLib.libWebSimpleMod.SimpleStatus
  
  /* 4 */ val STATUS_COMPLETED: STATUS_COMPLETED with scala.Double = js.native
  /* 3 */ val STATUS_CONNECTED: STATUS_CONNECTED with scala.Double = js.native
  /* 2 */ val STATUS_CONNECTING: STATUS_CONNECTING with scala.Double = js.native
  /* 1 */ val STATUS_NEW: STATUS_NEW with scala.Double = js.native
  /* 0 */ val STATUS_NULL: STATUS_NULL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sipDotJsLib.libWebSimpleMod.SimpleStatus with scala.Double] = js.native
}

