package typings.reactStickyBox.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StickyBoxProps extends js.Object {
  var bottom: js.UndefOr[Boolean] = js.native
  var children: ReactNode = js.native
  var className: js.UndefOr[String] = js.native
  var offsetBottom: js.UndefOr[Double] = js.native
  var offsetTop: js.UndefOr[Double] = js.native
  var onChangeMode: js.UndefOr[
    js.Function2[/* oldMode */ js.UndefOr[StickyBoxMode], /* newMode */ StickyBoxMode, _]
  ] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object StickyBoxProps {
  @scala.inline
  def apply(): StickyBoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StickyBoxProps]
  }
  @scala.inline
  implicit class StickyBoxPropsOps[Self <: StickyBoxProps] (val x: Self) extends AnyVal {
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
    def setBottom(value: Boolean): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setOffsetBottom(value: Double): Self = this.set("offsetBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetBottom: Self = this.set("offsetBottom", js.undefined)
    @scala.inline
    def setOffsetTop(value: Double): Self = this.set("offsetTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetTop: Self = this.set("offsetTop", js.undefined)
    @scala.inline
    def setOnChangeMode(value: (/* oldMode */ js.UndefOr[StickyBoxMode], /* newMode */ StickyBoxMode) => _): Self = this.set("onChangeMode", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChangeMode: Self = this.set("onChangeMode", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

