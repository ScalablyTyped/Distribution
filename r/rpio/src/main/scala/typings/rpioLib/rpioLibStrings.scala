package typings
package rpioLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rpioLibStrings {
  @js.native
  sealed trait gpio extends js.Object
  
  @js.native
  sealed trait physical extends js.Object
  
  def gpio: gpio = "gpio".asInstanceOf[gpio]
  def physical: physical = "physical".asInstanceOf[physical]
}

