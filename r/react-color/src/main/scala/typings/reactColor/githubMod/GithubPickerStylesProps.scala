package typings.reactColor.githubMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GithubPickerStylesProps extends js.Object {
  var card: CSSProperties = js.native
  var triangle: CSSProperties = js.native
  var triangleShadow: CSSProperties = js.native
}

object GithubPickerStylesProps {
  @scala.inline
  def apply(card: CSSProperties, triangle: CSSProperties, triangleShadow: CSSProperties): GithubPickerStylesProps = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], triangle = triangle.asInstanceOf[js.Any], triangleShadow = triangleShadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[GithubPickerStylesProps]
  }
  @scala.inline
  implicit class GithubPickerStylesPropsOps[Self <: GithubPickerStylesProps] (val x: Self) extends AnyVal {
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
    def setTriangle(value: CSSProperties): Self = this.set("triangle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriangleShadow(value: CSSProperties): Self = this.set("triangleShadow", value.asInstanceOf[js.Any])
  }
  
}

