package typings.primereact.deferredContentMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeferredContentProps extends js.Object {
  var onLoad: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
}

object DeferredContentProps {
  @scala.inline
  def apply(): DeferredContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeferredContentProps]
  }
  @scala.inline
  implicit class DeferredContentPropsOps[Self <: DeferredContentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnLoad(value: /* event */ Event => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
  }
  
}

