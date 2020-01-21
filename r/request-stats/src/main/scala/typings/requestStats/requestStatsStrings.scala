package typings.requestStats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object requestStatsStrings {
  @js.native
  sealed trait complete extends js.Object
  
  @js.native
  sealed trait request extends js.Object
  
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  @scala.inline
  def request: request = "request".asInstanceOf[request]
}

