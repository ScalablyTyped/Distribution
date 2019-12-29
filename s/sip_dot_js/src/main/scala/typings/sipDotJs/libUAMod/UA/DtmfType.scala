package typings.sipDotJs.libUAMod.UA

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DtmfType extends js.Object

@JSImport("sip.js/lib/UA", "UA.DtmfType")
@js.native
object DtmfType extends js.Object {
  @js.native
  sealed trait INFO extends DtmfType
  
  @js.native
  sealed trait RTP extends DtmfType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DtmfType with String] = js.native
  /* "info" */ @js.native
  object INFO extends TopLevel[INFO with String]
  
  /* "rtp" */ @js.native
  object RTP extends TopLevel[RTP with String]
  
}

