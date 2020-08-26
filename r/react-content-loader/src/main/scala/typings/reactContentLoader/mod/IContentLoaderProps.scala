package typings.reactContentLoader.mod

import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContentLoaderProps extends SVGAttributes[SVGElement] {
  var animate: js.UndefOr[Boolean] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var backgroundOpacity: js.UndefOr[Double] = js.native
  var baseUrl: js.UndefOr[String] = js.native
  var foregroundColor: js.UndefOr[String] = js.native
  var foregroundOpacity: js.UndefOr[Double] = js.native
  var gradientRatio: js.UndefOr[Double] = js.native
  var interval: js.UndefOr[Double] = js.native
  var rtl: js.UndefOr[Boolean] = js.native
  @JSName("speed")
  var speed_IContentLoaderProps: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  var uniqueKey: js.UndefOr[String] = js.native
}

object IContentLoaderProps {
  @scala.inline
  def apply(): IContentLoaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContentLoaderProps]
  }
  @scala.inline
  implicit class IContentLoaderPropsOps[Self <: IContentLoaderProps] (val x: Self) extends AnyVal {
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBackgroundOpacity(value: Double): Self = this.set("backgroundOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundOpacity: Self = this.set("backgroundOpacity", js.undefined)
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    @scala.inline
    def setForegroundColor(value: String): Self = this.set("foregroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForegroundColor: Self = this.set("foregroundColor", js.undefined)
    @scala.inline
    def setForegroundOpacity(value: Double): Self = this.set("foregroundOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForegroundOpacity: Self = this.set("foregroundOpacity", js.undefined)
    @scala.inline
    def setGradientRatio(value: Double): Self = this.set("gradientRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradientRatio: Self = this.set("gradientRatio", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUniqueKey(value: String): Self = this.set("uniqueKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniqueKey: Self = this.set("uniqueKey", js.undefined)
  }
  
}

