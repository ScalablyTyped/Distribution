package typings.rcDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSwitchScrollingEffect extends js.Object {
  def switchScrollingEffect(): Unit
}

object AnonSwitchScrollingEffect {
  @scala.inline
  def apply(switchScrollingEffect: () => Unit): AnonSwitchScrollingEffect = {
    val __obj = js.Dynamic.literal(switchScrollingEffect = js.Any.fromFunction0(switchScrollingEffect))
  
    __obj.asInstanceOf[AnonSwitchScrollingEffect]
  }
}

