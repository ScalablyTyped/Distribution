package typings
package sharepointLib.SPNs.WebPartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PersonalizationScope extends js.Object

@JSGlobal("SP.WebParts.PersonalizationScope")
@js.native
object PersonalizationScope extends js.Object {
  @js.native
  sealed trait shared
    extends sharepointLib.SPNs.WebPartsNs.PersonalizationScope
  
  @js.native
  sealed trait user
    extends sharepointLib.SPNs.WebPartsNs.PersonalizationScope
  
  val shared: shared with java.lang.String = js.native
  val user: user with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.WebPartsNs.PersonalizationScope with java.lang.String] = js.native
}

