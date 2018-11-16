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
  
  val custom: custom with java.lang.String = js.native
  val defaultZone: defaultZone with java.lang.String = js.native
  val extranet: extranet with java.lang.String = js.native
  val internet: internet with java.lang.String = js.native
  val intranet: intranet with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.UrlZone with java.lang.String] = js.native
}

