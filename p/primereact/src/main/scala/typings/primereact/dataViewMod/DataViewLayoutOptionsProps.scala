package typings.primereact.dataViewMod

import typings.primereact.anon.OriginalEventEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataViewLayoutOptionsProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var layout: js.UndefOr[String] = js.native
  var style: js.UndefOr[String] = js.native
  def onChange(e: OriginalEventEvent): Unit = js.native
}

object DataViewLayoutOptionsProps {
  @scala.inline
  def apply(onChange: OriginalEventEvent => Unit): DataViewLayoutOptionsProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[DataViewLayoutOptionsProps]
  }
  @scala.inline
  implicit class DataViewLayoutOptionsPropsOps[Self <: DataViewLayoutOptionsProps] (val x: Self) extends AnyVal {
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
    def setOnChange(value: OriginalEventEvent => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

