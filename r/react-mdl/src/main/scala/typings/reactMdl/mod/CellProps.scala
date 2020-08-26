package typings.reactMdl.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any]
     with CustomRenderedComponent
     with ShadowedComponent {
  var align: js.UndefOr[String] = js.native
  var col: Double = js.native
  var hideDesktop: js.UndefOr[Boolean] = js.native
  var hidePhone: js.UndefOr[Boolean] = js.native
  var hideTablet: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Double] = js.native
  var offsetDesktop: js.UndefOr[Double] = js.native
  var offsetPhone: js.UndefOr[Double] = js.native
  var offsetTablet: js.UndefOr[Double] = js.native
  var phone: js.UndefOr[Double] = js.native
  var tablet: js.UndefOr[Double] = js.native
}

object CellProps {
  @scala.inline
  def apply(col: Double): CellProps = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellProps]
  }
  @scala.inline
  implicit class CellPropsOps[Self <: CellProps] (val x: Self) extends AnyVal {
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
    def setCol(value: Double): Self = this.set("col", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setHideDesktop(value: Boolean): Self = this.set("hideDesktop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideDesktop: Self = this.set("hideDesktop", js.undefined)
    @scala.inline
    def setHidePhone(value: Boolean): Self = this.set("hidePhone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidePhone: Self = this.set("hidePhone", js.undefined)
    @scala.inline
    def setHideTablet(value: Boolean): Self = this.set("hideTablet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideTablet: Self = this.set("hideTablet", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOffsetDesktop(value: Double): Self = this.set("offsetDesktop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetDesktop: Self = this.set("offsetDesktop", js.undefined)
    @scala.inline
    def setOffsetPhone(value: Double): Self = this.set("offsetPhone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetPhone: Self = this.set("offsetPhone", js.undefined)
    @scala.inline
    def setOffsetTablet(value: Double): Self = this.set("offsetTablet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetTablet: Self = this.set("offsetTablet", js.undefined)
    @scala.inline
    def setPhone(value: Double): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    @scala.inline
    def setTablet(value: Double): Self = this.set("tablet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTablet: Self = this.set("tablet", js.undefined)
  }
  
}

