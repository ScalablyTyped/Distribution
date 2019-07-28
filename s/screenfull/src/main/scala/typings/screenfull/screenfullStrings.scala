package typings.screenfull

import typings.screenfull.screenfullMod.EventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object screenfullStrings {
  @js.native
  sealed trait change extends EventName
  
  @js.native
  sealed trait error extends EventName
  
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
}

