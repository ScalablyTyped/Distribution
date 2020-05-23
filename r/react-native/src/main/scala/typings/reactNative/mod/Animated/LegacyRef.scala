package typings.reactNative.mod.Animated

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacyRef[C] extends js.Object {
  def getNode(): C
}

object LegacyRef {
  @scala.inline
  def apply[C](getNode: () => C): LegacyRef[C] = {
    val __obj = js.Dynamic.literal(getNode = js.Any.fromFunction0(getNode))
    __obj.asInstanceOf[LegacyRef[C]]
  }
}

