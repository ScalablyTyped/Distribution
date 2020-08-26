package typings.reactColor.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-color.react-color/lib/components/github/Github.GithubPickerStylesProps> */
@js.native
trait PartialGithubPickerStyles extends js.Object {
  var card: js.UndefOr[CSSProperties] = js.native
  var triangle: js.UndefOr[CSSProperties] = js.native
  var triangleShadow: js.UndefOr[CSSProperties] = js.native
}

object PartialGithubPickerStyles {
  @scala.inline
  def apply(): PartialGithubPickerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGithubPickerStyles]
  }
  @scala.inline
  implicit class PartialGithubPickerStylesOps[Self <: PartialGithubPickerStyles] (val x: Self) extends AnyVal {
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
    def setCard(value: CSSProperties): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
    @scala.inline
    def setTriangle(value: CSSProperties): Self = this.set("triangle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriangle: Self = this.set("triangle", js.undefined)
    @scala.inline
    def setTriangleShadow(value: CSSProperties): Self = this.set("triangleShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriangleShadow: Self = this.set("triangleShadow", js.undefined)
  }
  
}

