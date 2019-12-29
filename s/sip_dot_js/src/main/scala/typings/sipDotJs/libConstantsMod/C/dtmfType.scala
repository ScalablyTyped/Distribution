package typings.sipDotJs.libConstantsMod.C

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait dtmfType extends js.Object

@JSImport("sip.js/lib/Constants", "C.dtmfType")
@js.native
object dtmfType extends js.Object {
  @js.native
  sealed trait INFO extends dtmfType
  
  @js.native
  sealed trait RTP extends dtmfType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[dtmfType with String] = js.native
  /* "info" */ @js.native
  object INFO
    extends TopLevel[typings.sipDotJs.libConstantsMod.C.dtmfType.INFO with String]
  
  /* "rtp" */ @js.native
  object RTP extends TopLevel[RTP with String]
  
}

