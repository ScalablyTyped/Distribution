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
  
  val defaultValue: defaultValue with java.lang.String = js.native
  val filesOnly: filesOnly with java.lang.String = js.native
  val recursive: recursive with java.lang.String = js.native
  val recursiveAll: recursiveAll with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.ViewScope with java.lang.String] = js.native
}

