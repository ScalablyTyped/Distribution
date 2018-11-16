package typings
package sharepointLib.SrchNs.UNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LoadScriptsProgress extends js.Object

@JSGlobal("Srch.U.LoadScriptsProgress")
@js.native
object LoadScriptsProgress extends js.Object {
  @js.native
  sealed trait failure
    extends sharepointLib.SrchNs.UNs.LoadScriptsProgress
  
  @js.native
  sealed trait loading
    extends sharepointLib.SrchNs.UNs.LoadScriptsProgress
  
  @js.native
  sealed trait success
    extends sharepointLib.SrchNs.UNs.LoadScriptsProgress
  
  val failure: failure with java.lang.String = js.native
  val loading: loading with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SrchNs.UNs.LoadScriptsProgress with java.lang.String] = js.native
}

