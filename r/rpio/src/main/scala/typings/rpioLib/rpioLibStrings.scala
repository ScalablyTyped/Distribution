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
  
  @scala.inline
  def gpio: gpio = "gpio".asInstanceOf[gpio]
  @scala.inline
  def physical: physical = "physical".asInstanceOf[physical]
}

