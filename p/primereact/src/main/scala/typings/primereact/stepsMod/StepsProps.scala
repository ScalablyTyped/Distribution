package typings.primereact.stepsMod

import typings.primereact.anon.IndexItem
import typings.primereact.menuItemMod.MenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepsProps extends js.Object {
  var activeIndex: js.UndefOr[Double] = js.native
  var className: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var model: js.Array[MenuItem] = js.native
  var onSelect: js.UndefOr[js.Function1[/* e */ IndexItem, Unit]] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[js.Object] = js.native
}

object StepsProps {
  @scala.inline
  def apply(model: js.Array[MenuItem]): StepsProps = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepsProps]
  }
  @scala.inline
  implicit class StepsPropsOps[Self <: StepsProps] (val x: Self) extends AnyVal {
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
    def setModelVarargs(value: MenuItem*): Self = this.set("model", js.Array(value :_*))
    @scala.inline
    def setModel(value: js.Array[MenuItem]): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveIndex: Self = this.set("activeIndex", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOnSelect(value: /* e */ IndexItem => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

