package typings
package smoothieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object smoothieLibStrings {
  @js.native
  sealed trait bezier extends js.Object
  
  @js.native
  sealed trait linear extends js.Object
  
  @js.native
  sealed trait step extends js.Object
  
  def bezier: bezier = "bezier".asInstanceOf[bezier]
  def linear: linear = "linear".asInstanceOf[linear]
  def step: step = "step".asInstanceOf[step]
}

