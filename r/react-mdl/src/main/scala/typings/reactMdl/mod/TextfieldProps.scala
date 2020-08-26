package typings.reactMdl.mod

import typings.react.mod.DOMAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextfieldProps
  extends MDLHTMLAttributes
     with DOMAttributes[HTMLInputElement] {
  var error: js.UndefOr[ReactNode] = js.native
  var expandable: js.UndefOr[Boolean] = js.native
  var expandableIcon: js.UndefOr[String] = js.native
  var floatingLabel: js.UndefOr[Boolean] = js.native
  var inputClassName: js.UndefOr[String] = js.native
  var label: String = js.native
  var maxRows: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var rows: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  var value: js.UndefOr[String | Double] = js.native
}

object TextfieldProps {
  @scala.inline
  def apply(label: String): TextfieldProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextfieldProps]
  }
  @scala.inline
  implicit class TextfieldPropsOps[Self <: TextfieldProps] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: ReactNode): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setExpandable(value: Boolean): Self = this.set("expandable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandable: Self = this.set("expandable", js.undefined)
    @scala.inline
    def setExpandableIcon(value: String): Self = this.set("expandableIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandableIcon: Self = this.set("expandableIcon", js.undefined)
    @scala.inline
    def setFloatingLabel(value: Boolean): Self = this.set("floatingLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatingLabel: Self = this.set("floatingLabel", js.undefined)
    @scala.inline
    def setInputClassName(value: String): Self = this.set("inputClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputClassName: Self = this.set("inputClassName", js.undefined)
    @scala.inline
    def setMaxRows(value: Double): Self = this.set("maxRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRows: Self = this.set("maxRows", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

