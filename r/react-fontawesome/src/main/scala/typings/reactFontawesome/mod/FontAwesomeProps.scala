package typings.reactFontawesome.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontAwesomeProps extends Intermediate {
  var ariaLabel: js.UndefOr[String] = js.native
  var border: js.UndefOr[Boolean] = js.native
  var cssModule: js.UndefOr[js.Any] = js.native
  var fixedWidth: js.UndefOr[Boolean] = js.native
  var flip: js.UndefOr[FontAwesomeFlip] = js.native
  var inverse: js.UndefOr[Boolean] = js.native
  @JSName("name")
  var name_FontAwesomeProps: String = js.native
  var pulse: js.UndefOr[Boolean] = js.native
  var rotate: js.UndefOr[Double] = js.native
  @JSName("size")
  var size_FontAwesomeProps: js.UndefOr[FontAwesomeSize] = js.native
  var spin: js.UndefOr[Boolean] = js.native
  var stack: js.UndefOr[FontAwesomeStack] = js.native
  var tag: js.UndefOr[String] = js.native
}

object FontAwesomeProps {
  @scala.inline
  def apply(name: String): FontAwesomeProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontAwesomeProps]
  }
  @scala.inline
  implicit class FontAwesomePropsOps[Self <: FontAwesomeProps] (val x: Self) extends AnyVal {
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
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setBorder(value: Boolean): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setCssModule(value: js.Any): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    @scala.inline
    def setFixedWidth(value: Boolean): Self = this.set("fixedWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedWidth: Self = this.set("fixedWidth", js.undefined)
    @scala.inline
    def setFlip(value: FontAwesomeFlip): Self = this.set("flip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    @scala.inline
    def setInverse(value: Boolean): Self = this.set("inverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverse: Self = this.set("inverse", js.undefined)
    @scala.inline
    def setPulse(value: Boolean): Self = this.set("pulse", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePulse: Self = this.set("pulse", js.undefined)
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setSize(value: FontAwesomeSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSpin(value: Boolean): Self = this.set("spin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpin: Self = this.set("spin", js.undefined)
    @scala.inline
    def setStack(value: FontAwesomeStack): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

