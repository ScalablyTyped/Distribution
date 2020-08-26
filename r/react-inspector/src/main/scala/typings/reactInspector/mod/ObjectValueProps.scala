package typings.reactInspector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectValueProps extends js.Object {
  /**
    * The object to describe.
    */
  var `object`: js.UndefOr[js.Any] = js.native
  var styles: js.UndefOr[js.Object] = js.native
}

object ObjectValueProps {
  @scala.inline
  def apply(): ObjectValueProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectValueProps]
  }
  @scala.inline
  implicit class ObjectValuePropsOps[Self <: ObjectValueProps] (val x: Self) extends AnyVal {
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
    def setObject(value: js.Any): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
    @scala.inline
    def setStyles(value: js.Object): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

