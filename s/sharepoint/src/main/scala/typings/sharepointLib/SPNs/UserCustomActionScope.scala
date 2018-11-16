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
  
  val list: list with java.lang.String = js.native
  val site: site with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val web: web with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.UserCustomActionScope with java.lang.String] = js.native
}

