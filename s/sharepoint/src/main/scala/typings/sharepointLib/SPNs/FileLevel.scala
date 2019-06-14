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
  
  /* 2 */ val checkout: checkout with scala.Double = js.native
  /* 1 */ val draft: draft with scala.Double = js.native
  /* 0 */ val published: published with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.FileLevel with scala.Double] = js.native
}

