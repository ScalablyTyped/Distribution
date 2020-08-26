package typings.reactElemental.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PulsatorProps extends js.Object {
  val color: js.UndefOr[String] = js.native
  val inactive: js.UndefOr[Boolean] = js.native
  val size: js.UndefOr[PulsatorSize] = js.native
  val style: js.UndefOr[CSSProperties] = js.native
  val transparent: js.UndefOr[Boolean] = js.native
}

object PulsatorProps {
  @scala.inline
  def apply(): PulsatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PulsatorProps]
  }
  @scala.inline
  implicit class PulsatorPropsOps[Self <: PulsatorProps] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setInactive(value: Boolean): Self = this.set("inactive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInactive: Self = this.set("inactive", js.undefined)
    @scala.inline
    def setSize(value: PulsatorSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransparent: Self = this.set("transparent", js.undefined)
  }
  
}

