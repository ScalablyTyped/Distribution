package typings.siesta.Siesta.Test.Action.Role

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @mixin
  */
@js.native
trait IHasTarget extends js.Object {
  var el: js.UndefOr[js.Any] = js.native
  var passTargetToNext: js.UndefOr[Boolean] = js.native
  var target: js.UndefOr[js.Any] = js.native
}

object IHasTarget {
  @scala.inline
  def apply(): IHasTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHasTarget]
  }
  @scala.inline
  implicit class IHasTargetOps[Self <: IHasTarget] (val x: Self) extends AnyVal {
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
    def setEl(value: js.Any): Self = this.set("el", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEl: Self = this.set("el", js.undefined)
    @scala.inline
    def setPassTargetToNext(value: Boolean): Self = this.set("passTargetToNext", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassTargetToNext: Self = this.set("passTargetToNext", js.undefined)
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

