package typings.reactInspector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectRootLabelProps extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var name: js.UndefOr[String] = js.native
}

object ObjectRootLabelProps {
  @scala.inline
  def apply(): ObjectRootLabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectRootLabelProps]
  }
  @scala.inline
  implicit class ObjectRootLabelPropsOps[Self <: ObjectRootLabelProps] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

