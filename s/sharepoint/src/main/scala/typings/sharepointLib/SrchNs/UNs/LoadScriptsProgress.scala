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
  
  /* 2 */ val failure: failure with scala.Double = js.native
  /* 0 */ val loading: loading with scala.Double = js.native
  /* 1 */ val success: success with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SrchNs.UNs.LoadScriptsProgress with scala.Double] = js.native
}

