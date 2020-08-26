package typings.rebass.mod

import typings.react.mod.ElementType
import typings.react.mod.RefAttributes
import typings.styledComponents.styledComponentsMod.CSSObject
import typings.styledComponents.styledComponentsMod.FlattenSimpleInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseProps
  extends RefAttributes[js.Any] {
  var as: js.UndefOr[ElementType[_]] = js.native
  var css: js.UndefOr[CSSObject | FlattenSimpleInterpolation | String] = js.native
}

object BaseProps {
  @scala.inline
  def apply(): BaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseProps]
  }
  @scala.inline
  implicit class BasePropsOps[Self <: BaseProps] (val x: Self) extends AnyVal {
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
    def setAs(value: ElementType[_]): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setCss(value: CSSObject | FlattenSimpleInterpolation | String): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
  }
  
}

