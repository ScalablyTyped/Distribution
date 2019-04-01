package typings
package screenfullLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object screenfullLibStrings {
  @js.native
  sealed trait change
    extends screenfullLib.screenfullMod.screenfullNs.EventName
  
  @js.native
  sealed trait error
    extends screenfullLib.screenfullMod.screenfullNs.EventName
  
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
}

