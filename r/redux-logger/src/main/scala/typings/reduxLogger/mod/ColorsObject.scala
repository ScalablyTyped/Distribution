package typings.reduxLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorsObject extends js.Object {
  var action: js.UndefOr[Boolean | ActionToString] = js.native
  var error: js.UndefOr[Boolean | ErrorToString] = js.native
  var nextState: js.UndefOr[Boolean | StateToString] = js.native
  var prevState: js.UndefOr[Boolean | StateToString] = js.native
  var title: js.UndefOr[Boolean | ActionToString] = js.native
}

object ColorsObject {
  @scala.inline
  def apply(): ColorsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorsObject]
  }
  @scala.inline
  implicit class ColorsObjectOps[Self <: ColorsObject] (val x: Self) extends AnyVal {
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
    def setActionFunction1(value: /* action */ js.Any => String): Self = this.set("action", js.Any.fromFunction1(value))
    @scala.inline
    def setAction(value: Boolean | ActionToString): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setErrorFunction2(value: (/* error */ js.Any, /* prevState */ js.Any) => String): Self = this.set("error", js.Any.fromFunction2(value))
    @scala.inline
    def setError(value: Boolean | ErrorToString): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setNextStateFunction1(value: /* state */ js.Any => String): Self = this.set("nextState", js.Any.fromFunction1(value))
    @scala.inline
    def setNextState(value: Boolean | StateToString): Self = this.set("nextState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextState: Self = this.set("nextState", js.undefined)
    @scala.inline
    def setPrevStateFunction1(value: /* state */ js.Any => String): Self = this.set("prevState", js.Any.fromFunction1(value))
    @scala.inline
    def setPrevState(value: Boolean | StateToString): Self = this.set("prevState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevState: Self = this.set("prevState", js.undefined)
    @scala.inline
    def setTitleFunction1(value: /* action */ js.Any => String): Self = this.set("title", js.Any.fromFunction1(value))
    @scala.inline
    def setTitle(value: Boolean | ActionToString): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

