package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClipProps extends js.Object {
  var clipPath: js.UndefOr[String] = js.native
  var clipRule: js.UndefOr[FillRule] = js.native
}

object ClipProps {
  @scala.inline
  def apply(): ClipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipProps]
  }
  @scala.inline
  implicit class ClipPropsOps[Self <: ClipProps] (val x: Self) extends AnyVal {
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
    def setClipPath(value: String): Self = this.set("clipPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipPath: Self = this.set("clipPath", js.undefined)
    @scala.inline
    def setClipRule(value: FillRule): Self = this.set("clipRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipRule: Self = this.set("clipRule", js.undefined)
  }
  
}

