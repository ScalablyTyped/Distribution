package typings.ssUtils.ssutils

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
  
}

