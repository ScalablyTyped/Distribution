package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UrlZone extends js.Object

@JSGlobal("SP.UrlZone")
@js.native
object UrlZone extends js.Object {
  @js.native
  sealed trait custom extends UrlZone
  
  @js.native
  sealed trait defaultZone extends UrlZone
  
  @js.native
  sealed trait extranet extends UrlZone
  
  @js.native
  sealed trait internet extends UrlZone
  
  @js.native
  sealed trait intranet extends UrlZone
  
  /* 3 */ val custom: typings.sharepoint.SPNs.UrlZone.custom with Double = js.native
  /* 0 */ val defaultZone: typings.sharepoint.SPNs.UrlZone.defaultZone with Double = js.native
  /* 4 */ val extranet: typings.sharepoint.SPNs.UrlZone.extranet with Double = js.native
  /* 2 */ val internet: typings.sharepoint.SPNs.UrlZone.internet with Double = js.native
  /* 1 */ val intranet: typings.sharepoint.SPNs.UrlZone.intranet with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UrlZone with Double] = js.native
}

