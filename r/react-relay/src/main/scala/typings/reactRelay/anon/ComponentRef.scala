package typings.reactRelay.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentRef extends js.Object {
  var componentRef: js.UndefOr[js.Function1[/* ref */ js.Any, Unit]] = js.undefined
}

object ComponentRef {
  @scala.inline
  def apply(componentRef: /* ref */ js.Any => Unit = null): ComponentRef = {
    val __obj = js.Dynamic.literal()
    if (componentRef != null) __obj.updateDynamic("componentRef")(js.Any.fromFunction1(componentRef))
    __obj.asInstanceOf[ComponentRef]
  }
}

