package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileLevel extends js.Object

@JSGlobal("SP.FileLevel")
@js.native
object FileLevel extends js.Object {
  @js.native
  sealed trait checkout
    extends sharepointLib.SPNs.FileLevel
  
  @js.native
  sealed trait draft
    extends sharepointLib.SPNs.FileLevel
  
  @js.native
  sealed trait published
    extends sharepointLib.SPNs.FileLevel
  
  val checkout: checkout with java.lang.String = js.native
  val draft: draft with java.lang.String = js.native
  val published: published with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.FileLevel with java.lang.String] = js.native
}

