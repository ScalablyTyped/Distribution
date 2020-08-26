package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import typings.reactNativeMaterialUi.anon.ContainerIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconToggleProps extends js.Object {
  var children: js.UndefOr[Element] = js.native
  var color: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var maxOpacity: js.UndefOr[Double] = js.native
  var name: String = js.native
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  var percent: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Double] = js.native
  var style: js.UndefOr[ContainerIcon] = js.native
  var testID: js.UndefOr[String] = js.native
  var underlayColor: js.UndefOr[String] = js.native
}

object IconToggleProps {
  @scala.inline
  def apply(name: String): IconToggleProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconToggleProps]
  }
  @scala.inline
  implicit class IconTogglePropsOps[Self <: IconToggleProps] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: Element): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setMaxOpacity(value: Double): Self = this.set("maxOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxOpacity: Self = this.set("maxOpacity", js.undefined)
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStyle(value: ContainerIcon): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    @scala.inline
    def setUnderlayColor(value: String): Self = this.set("underlayColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlayColor: Self = this.set("underlayColor", js.undefined)
  }
  
}

