package typings.reactFoundation.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassNameProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var noDefaultClassName: js.UndefOr[String] = js.native
}

object ClassNameProps {
  @scala.inline
  def apply(): ClassNameProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassNameProps]
  }
  @scala.inline
  implicit class ClassNamePropsOps[Self <: ClassNameProps] (val x: Self) extends AnyVal {
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
    def setNoDefaultClassName(value: String): Self = this.set("noDefaultClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoDefaultClassName: Self = this.set("noDefaultClassName", js.undefined)
  }
  
}

