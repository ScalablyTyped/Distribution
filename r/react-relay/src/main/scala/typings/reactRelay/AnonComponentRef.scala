package typings.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponentRef extends js.Object {
  var componentRef: js.UndefOr[js.Function1[/* ref */ js.Any, Unit]] = js.undefined
}

object AnonComponentRef {
  @scala.inline
  def apply(componentRef: /* ref */ js.Any => Unit = null): AnonComponentRef = {
    val __obj = js.Dynamic.literal()
    if (componentRef != null) __obj.updateDynamic("componentRef")(js.Any.fromFunction1(componentRef))
    __obj.asInstanceOf[AnonComponentRef]
  }
}

