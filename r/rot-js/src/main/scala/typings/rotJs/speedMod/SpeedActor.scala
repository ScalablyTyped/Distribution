package typings.rotJs.speedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeedActor extends js.Object {
  def getSpeed(): Double
}

object SpeedActor {
  @scala.inline
  def apply(getSpeed: () => Double): SpeedActor = {
    val __obj = js.Dynamic.literal(getSpeed = js.Any.fromFunction0(getSpeed))
  
    __obj.asInstanceOf[SpeedActor]
  }
}

