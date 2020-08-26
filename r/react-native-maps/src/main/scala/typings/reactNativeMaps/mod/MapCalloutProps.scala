package typings.reactNativeMaps.mod

import typings.reactNative.mod.ViewProps
import typings.reactNativeMaps.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapCalloutProps extends ViewProps {
  var onPress: js.UndefOr[js.Function1[/* event */ MapEvent[`0`], Unit]] = js.native
  var tooltip: js.UndefOr[Boolean] = js.native
}

object MapCalloutProps {
  @scala.inline
  def apply(): MapCalloutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapCalloutProps]
  }
  @scala.inline
  implicit class MapCalloutPropsOps[Self <: MapCalloutProps] (val x: Self) extends AnyVal {
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
    def setOnPress(value: /* event */ MapEvent[`0`] => Unit): Self = this.set("onPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setTooltip(value: Boolean): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
  
}

