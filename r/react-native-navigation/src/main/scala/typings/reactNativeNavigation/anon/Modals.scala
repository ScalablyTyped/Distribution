package typings.reactNativeNavigation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modals extends js.Object {
  var modals: js.Array[_]
  var overlays: js.Array[_]
  var root: js.Any
}

object Modals {
  @scala.inline
  def apply(modals: js.Array[_], overlays: js.Array[_], root: js.Any): Modals = {
    val __obj = js.Dynamic.literal(modals = modals.asInstanceOf[js.Any], overlays = overlays.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modals]
  }
}

