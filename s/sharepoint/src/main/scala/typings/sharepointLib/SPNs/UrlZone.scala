package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UrlZone extends js.Object

@JSGlobal("SP.UrlZone")
@js.native
object UrlZone extends js.Object {
  @js.native
  sealed trait custom
    extends sharepointLib.SPNs.UrlZone
  
  @js.native
  sealed trait defaultZone
    extends sharepointLib.SPNs.UrlZone
  
  @js.native
  sealed trait extranet
    extends sharepointLib.SPNs.UrlZone
  
  @js.native
  sealed trait internet
    extends sharepointLib.SPNs.UrlZone
  
  @js.native
  sealed trait intranet
    extends sharepointLib.SPNs.UrlZone
  
  /* 3 */ val custom: custom with scala.Double = js.native
  /* 0 */ val defaultZone: defaultZone with scala.Double = js.native
  /* 4 */ val extranet: extranet with scala.Double = js.native
  /* 2 */ val internet: internet with scala.Double = js.native
  /* 1 */ val intranet: intranet with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.UrlZone with scala.Double] = js.native
}

