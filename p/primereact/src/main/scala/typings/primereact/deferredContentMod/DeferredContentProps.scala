package typings.primereact.deferredContentMod

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeferredContentProps extends js.Object {
  var onLoad: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
}

object DeferredContentProps {
  @scala.inline
  def apply(onLoad: /* event */ Event_ => Unit = null): DeferredContentProps = {
    val __obj = js.Dynamic.literal()
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    __obj.asInstanceOf[DeferredContentProps]
  }
}

