package typings.senchaTouch.Ext.direct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJsonProvider extends IProvider {
  /** [Method] Create an event from a response object
    * @param response Object The XHR response object.
    * @returns Ext.direct.Event The event.
    */
  var createEvent: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], IEvent]] = js.native
}

object IJsonProvider {
  @scala.inline
  def apply(): IJsonProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJsonProvider]
  }
  @scala.inline
  implicit class IJsonProviderOps[Self <: IJsonProvider] (val x: Self) extends AnyVal {
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
    def setCreateEvent(value: /* response */ js.UndefOr[js.Any] => IEvent): Self = this.set("createEvent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreateEvent: Self = this.set("createEvent", js.undefined)
  }
  
}

