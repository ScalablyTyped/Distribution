package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorConcurrentHardware extends js.Object {
  val hardwareConcurrency: Double
}

object NavigatorConcurrentHardware {
  @scala.inline
  def apply(hardwareConcurrency: Double): NavigatorConcurrentHardware = {
    val __obj = js.Dynamic.literal(hardwareConcurrency = hardwareConcurrency)
  
    __obj.asInstanceOf[NavigatorConcurrentHardware]
  }
}

