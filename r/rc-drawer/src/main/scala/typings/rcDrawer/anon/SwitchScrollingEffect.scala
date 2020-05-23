package typings.rcDrawer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchScrollingEffect extends js.Object {
  def switchScrollingEffect(): Unit
}

object SwitchScrollingEffect {
  @scala.inline
  def apply(switchScrollingEffect: () => Unit): SwitchScrollingEffect = {
    val __obj = js.Dynamic.literal(switchScrollingEffect = js.Any.fromFunction0(switchScrollingEffect))
    __obj.asInstanceOf[SwitchScrollingEffect]
  }
}

