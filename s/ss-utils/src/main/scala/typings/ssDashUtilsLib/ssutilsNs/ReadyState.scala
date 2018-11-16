package typings
package ssDashUtilsLib.ssutilsNs

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
  sealed trait CLOSED
    extends ssDashUtilsLib.ssutilsNs.ReadyState
  
  @js.native
  sealed trait CONNECTING
    extends ssDashUtilsLib.ssutilsNs.ReadyState
  
  @js.native
  sealed trait OPEN
    extends ssDashUtilsLib.ssutilsNs.ReadyState
  
  /* 2 */ val CLOSED: CLOSED with scala.Double = js.native
  /* 0 */ val CONNECTING: CONNECTING with scala.Double = js.native
  /* 1 */ val OPEN: OPEN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ssDashUtilsLib.ssutilsNs.ReadyState with scala.Double] = js.native
}

