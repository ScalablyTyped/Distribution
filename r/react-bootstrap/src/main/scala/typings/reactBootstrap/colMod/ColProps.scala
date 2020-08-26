package typings.reactBootstrap.colMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColProps
  extends AllHTMLAttributes[Col]
     with ClassAttributes[Col] {
  var componentClass: js.UndefOr[ReactType[_]] = js.native
  var lg: js.UndefOr[Double] = js.native
  var lgHidden: js.UndefOr[Boolean] = js.native
  var lgOffset: js.UndefOr[Double] = js.native
  var lgPull: js.UndefOr[Double] = js.native
  var lgPush: js.UndefOr[Double] = js.native
  var md: js.UndefOr[Double] = js.native
  var mdHidden: js.UndefOr[Boolean] = js.native
  var mdOffset: js.UndefOr[Double] = js.native
  var mdPull: js.UndefOr[Double] = js.native
  var mdPush: js.UndefOr[Double] = js.native
  var sm: js.UndefOr[Double] = js.native
  var smHidden: js.UndefOr[Boolean] = js.native
  var smOffset: js.UndefOr[Double] = js.native
  var smPull: js.UndefOr[Double] = js.native
  var smPush: js.UndefOr[Double] = js.native
  var xs: js.UndefOr[Double] = js.native
  var xsHidden: js.UndefOr[Boolean] = js.native
  var xsOffset: js.UndefOr[Double] = js.native
  var xsPull: js.UndefOr[Double] = js.native
  var xsPush: js.UndefOr[Double] = js.native
}

object ColProps {
  @scala.inline
  def apply(): ColProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColProps]
  }
  @scala.inline
  implicit class ColPropsOps[Self <: ColProps] (val x: Self) extends AnyVal {
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
    def setComponentClass(value: ReactType[_]): Self = this.set("componentClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentClass: Self = this.set("componentClass", js.undefined)
    @scala.inline
    def setLg(value: Double): Self = this.set("lg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLg: Self = this.set("lg", js.undefined)
    @scala.inline
    def setLgHidden(value: Boolean): Self = this.set("lgHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLgHidden: Self = this.set("lgHidden", js.undefined)
    @scala.inline
    def setLgOffset(value: Double): Self = this.set("lgOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLgOffset: Self = this.set("lgOffset", js.undefined)
    @scala.inline
    def setLgPull(value: Double): Self = this.set("lgPull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLgPull: Self = this.set("lgPull", js.undefined)
    @scala.inline
    def setLgPush(value: Double): Self = this.set("lgPush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLgPush: Self = this.set("lgPush", js.undefined)
    @scala.inline
    def setMd(value: Double): Self = this.set("md", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMd: Self = this.set("md", js.undefined)
    @scala.inline
    def setMdHidden(value: Boolean): Self = this.set("mdHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMdHidden: Self = this.set("mdHidden", js.undefined)
    @scala.inline
    def setMdOffset(value: Double): Self = this.set("mdOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMdOffset: Self = this.set("mdOffset", js.undefined)
    @scala.inline
    def setMdPull(value: Double): Self = this.set("mdPull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMdPull: Self = this.set("mdPull", js.undefined)
    @scala.inline
    def setMdPush(value: Double): Self = this.set("mdPush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMdPush: Self = this.set("mdPush", js.undefined)
    @scala.inline
    def setSm(value: Double): Self = this.set("sm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSm: Self = this.set("sm", js.undefined)
    @scala.inline
    def setSmHidden(value: Boolean): Self = this.set("smHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmHidden: Self = this.set("smHidden", js.undefined)
    @scala.inline
    def setSmOffset(value: Double): Self = this.set("smOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmOffset: Self = this.set("smOffset", js.undefined)
    @scala.inline
    def setSmPull(value: Double): Self = this.set("smPull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmPull: Self = this.set("smPull", js.undefined)
    @scala.inline
    def setSmPush(value: Double): Self = this.set("smPush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmPush: Self = this.set("smPush", js.undefined)
    @scala.inline
    def setXs(value: Double): Self = this.set("xs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXs: Self = this.set("xs", js.undefined)
    @scala.inline
    def setXsHidden(value: Boolean): Self = this.set("xsHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXsHidden: Self = this.set("xsHidden", js.undefined)
    @scala.inline
    def setXsOffset(value: Double): Self = this.set("xsOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXsOffset: Self = this.set("xsOffset", js.undefined)
    @scala.inline
    def setXsPull(value: Double): Self = this.set("xsPull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXsPull: Self = this.set("xsPull", js.undefined)
    @scala.inline
    def setXsPush(value: Double): Self = this.set("xsPush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXsPush: Self = this.set("xsPush", js.undefined)
  }
  
}

