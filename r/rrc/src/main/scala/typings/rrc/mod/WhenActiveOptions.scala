package typings.rrc.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhenActiveOptions extends js.Object {
  var className: js.UndefOr[String] = js.native
  var exact: js.UndefOr[Boolean] = js.native
  var isActive: js.UndefOr[IsActiveCallback] = js.native
  var pathProp: js.UndefOr[String] = js.native
  var strict: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object WhenActiveOptions {
  @scala.inline
  def apply(): WhenActiveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhenActiveOptions]
  }
  @scala.inline
  implicit class WhenActiveOptionsOps[Self <: WhenActiveOptions] (val x: Self) extends AnyVal {
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
    def setExact(value: Boolean): Self = this.set("exact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
    @scala.inline
    def setIsActive(value: () => Boolean): Self = this.set("isActive", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    @scala.inline
    def setPathProp(value: String): Self = this.set("pathProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathProp: Self = this.set("pathProp", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

