package typings.rxDotWamp.rxDotWampMod

import typings.autobahn.autobahnMod.IEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWampEvent extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.undefined
  var details: js.UndefOr[IEvent] = js.undefined
  var kwargs: js.UndefOr[js.Any] = js.undefined
}

object IWampEvent {
  @scala.inline
  def apply(args: js.Array[_] = null, details: IEvent = null, kwargs: js.Any = null): IWampEvent = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (kwargs != null) __obj.updateDynamic("kwargs")(kwargs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWampEvent]
  }
}

