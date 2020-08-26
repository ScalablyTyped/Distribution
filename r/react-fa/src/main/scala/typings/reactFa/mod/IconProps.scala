package typings.reactFa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconProps extends SizeOverrideHTMLProps[Icon] {
  var Component: js.UndefOr[CustomComponent] = js.native
  var fixedWidth: js.UndefOr[Boolean] = js.native
  var flip: js.UndefOr[IconFlip] = js.native
  var inverse: js.UndefOr[Boolean] = js.native
  @JSName("name")
  var name_IconProps: String = js.native
  var pulse: js.UndefOr[Boolean] = js.native
  var rotate: js.UndefOr[IconRotation] = js.native
  @JSName("size")
  var size_IconProps: js.UndefOr[IconSize] = js.native
  var spin: js.UndefOr[Boolean] = js.native
  var stack: js.UndefOr[IconStackSize] = js.native
}

object IconProps {
  @scala.inline
  def apply(name: String): IconProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
  @scala.inline
  implicit class IconPropsOps[Self <: IconProps] (val x: Self) extends AnyVal {
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
    def setComponent(value: CustomComponent): Self = this.set("Component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("Component", js.undefined)
    @scala.inline
    def setFixedWidth(value: Boolean): Self = this.set("fixedWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedWidth: Self = this.set("fixedWidth", js.undefined)
    @scala.inline
    def setFlip(value: IconFlip): Self = this.set("flip", value.asInstanceOf[js.Any])
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
    def setRotate(value: IconRotation): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setSize(value: IconSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSpin(value: Boolean): Self = this.set("spin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpin: Self = this.set("spin", js.undefined)
    @scala.inline
    def setStack(value: IconStackSize): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
  
}

