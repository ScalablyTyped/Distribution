package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewScope extends js.Object

@JSGlobal("SP.ViewScope")
@js.native
object ViewScope extends js.Object {
  @js.native
  sealed trait defaultValue
    extends sharepointLib.SPNs.ViewScope
  
  @js.native
  sealed trait filesOnly
    extends sharepointLib.SPNs.ViewScope
  
  @js.native
  sealed trait recursive
    extends sharepointLib.SPNs.ViewScope
  
  @js.native
  sealed trait recursiveAll
    extends sharepointLib.SPNs.ViewScope
  
  /* 0 */ val defaultValue: defaultValue with scala.Double = js.native
  /* 3 */ val filesOnly: filesOnly with scala.Double = js.native
  /* 1 */ val recursive: recursive with scala.Double = js.native
  /* 2 */ val recursiveAll: recursiveAll with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.ViewScope with scala.Double] = js.native
}

