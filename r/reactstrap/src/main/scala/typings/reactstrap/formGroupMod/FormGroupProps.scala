package typings.reactstrap.formGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactType
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormGroupProps
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement]
     with /* key */ StringDictionary[js.Any] {
  var check: js.UndefOr[Boolean] = js.native
  var cssModule: js.UndefOr[CSSModule] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  var row: js.UndefOr[Boolean] = js.native
  var tag: js.UndefOr[String | ReactType[_]] = js.native
}

object FormGroupProps {
  @scala.inline
  def apply(): FormGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormGroupProps]
  }
  @scala.inline
  implicit class FormGroupPropsOps[Self <: FormGroupProps] (val x: Self) extends AnyVal {
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
    def setCheck(value: Boolean): Self = this.set("check", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    @scala.inline
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setRow(value: Boolean): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    @scala.inline
    def setTag(value: String | ReactType[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

