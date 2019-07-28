package typings.sharepoint.SrchNs.UNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LoadScriptsProgress extends js.Object

@JSGlobal("Srch.U.LoadScriptsProgress")
@js.native
object LoadScriptsProgress extends js.Object {
  @js.native
  sealed trait failure extends LoadScriptsProgress
  
  @js.native
  sealed trait loading extends LoadScriptsProgress
  
  @js.native
  sealed trait success extends LoadScriptsProgress
  
  /* 2 */ val failure: typings.sharepoint.SrchNs.UNs.LoadScriptsProgress.failure with Double = js.native
  /* 0 */ val loading: typings.sharepoint.SrchNs.UNs.LoadScriptsProgress.loading with Double = js.native
  /* 1 */ val success: typings.sharepoint.SrchNs.UNs.LoadScriptsProgress.success with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LoadScriptsProgress with Double] = js.native
}

