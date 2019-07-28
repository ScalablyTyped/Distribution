package typings.ssDashUtils.ssutilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadyState extends js.Object

/**
  * EventSource
  */
@JSGlobal("ssutils.ReadyState")
@js.native
object ReadyState extends js.Object {
  @js.native
  sealed trait CLOSED extends ReadyState
  
  @js.native
  sealed trait CONNECTING extends ReadyState
  
  @js.native
  sealed trait OPEN extends ReadyState
  
  /* 2 */ val CLOSED: typings.ssDashUtils.ssutilsNs.ReadyState.CLOSED with Double = js.native
  /* 0 */ val CONNECTING: typings.ssDashUtils.ssutilsNs.ReadyState.CONNECTING with Double = js.native
  /* 1 */ val OPEN: typings.ssDashUtils.ssutilsNs.ReadyState.OPEN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadyState with Double] = js.native
}

