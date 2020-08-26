package typings.reactMapGl.mod

import typings.reactMapGl.anon.Height
import typings.reactMapGl.anon.MaxPitch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticMapProps extends MapboxProps {
  var className: js.UndefOr[String] = js.native
  var disableTokenWarning: js.UndefOr[Boolean] = js.native
  var onResize: js.UndefOr[js.Function1[/* dimensions */ Height, Unit]] = js.native
  var preventStyleDiffing: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var visibilityConstraints: js.UndefOr[MaxPitch] = js.native
}

object StaticMapProps {
  @scala.inline
  def apply(height: Double | String, width: Double | String): StaticMapProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticMapProps]
  }
  @scala.inline
  implicit class StaticMapPropsOps[Self <: StaticMapProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisableTokenWarning(value: Boolean): Self = this.set("disableTokenWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableTokenWarning: Self = this.set("disableTokenWarning", js.undefined)
    @scala.inline
    def setOnResize(value: /* dimensions */ Height => Unit): Self = this.set("onResize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    @scala.inline
    def setPreventStyleDiffing(value: Boolean): Self = this.set("preventStyleDiffing", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventStyleDiffing: Self = this.set("preventStyleDiffing", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setVisibilityConstraints(value: MaxPitch): Self = this.set("visibilityConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibilityConstraints: Self = this.set("visibilityConstraints", js.undefined)
  }
  
}

