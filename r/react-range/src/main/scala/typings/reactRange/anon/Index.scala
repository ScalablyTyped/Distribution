package typings.reactRange.anon

import typings.reactRange.typesMod.IThumbProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Index extends js.Object {
  var index: Double = js.native
  var isDragged: Boolean = js.native
  var props: IThumbProps = js.native
  var value: Double = js.native
}

object Index {
  @scala.inline
  def apply(index: Double, isDragged: Boolean, props: IThumbProps, value: Double): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  @scala.inline
  implicit class IndexOps[Self <: Index] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDragged(value: Boolean): Self = this.set("isDragged", value.asInstanceOf[js.Any])
    @scala.inline
    def setProps(value: IThumbProps): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

