package typings.reactThemeableTs.hocMod

import typings.reactThemeableTs.themeableMod.IStaticFnReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHOCDefaultNoThemeProps extends js.Object {
  var t: IStaticFnReturn = js.native
}

object IHOCDefaultNoThemeProps {
  @scala.inline
  def apply(t: IStaticFnReturn): IHOCDefaultNoThemeProps = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHOCDefaultNoThemeProps]
  }
  @scala.inline
  implicit class IHOCDefaultNoThemePropsOps[Self <: IHOCDefaultNoThemeProps] (val x: Self) extends AnyVal {
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
    def setT(value: IStaticFnReturn): Self = this.set("t", value.asInstanceOf[js.Any])
  }
  
}

