package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserCustomActionScope extends js.Object

@JSGlobal("SP.UserCustomActionScope")
@js.native
object UserCustomActionScope extends js.Object {
  @js.native
  sealed trait list
    extends sharepointLib.SPNs.UserCustomActionScope
  
  @js.native
  sealed trait site
    extends sharepointLib.SPNs.UserCustomActionScope
  
  @js.native
  sealed trait unknown
    extends sharepointLib.SPNs.UserCustomActionScope
  
  @js.native
  sealed trait web
    extends sharepointLib.SPNs.UserCustomActionScope
  
  /* 3 */ val list: list with scala.Double = js.native
  /* 1 */ val site: site with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  /* 2 */ val web: web with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.UserCustomActionScope with scala.Double] = js.native
}

