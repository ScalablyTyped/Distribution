package typings.reactstrap.customInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.ReactNode
import typings.reactstrap.mod.CSSModule
import typings.reactstrap.reactstrapStrings.lg
import typings.reactstrap.reactstrapStrings.sm
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomInputProps
  extends InputHTMLAttributes[HTMLInputElement]
     with /* key */ StringDictionary[js.Any] {
  var bsSize: js.UndefOr[lg | sm] = js.native
  var cssModule: js.UndefOr[CSSModule] = js.native
  var htmlFor: js.UndefOr[String] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  var invalid: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[ReactNode] = js.native
  @JSName("type")
  var type_CustomInputProps: CustomInputType = js.native
  var valid: js.UndefOr[Boolean] = js.native
}

object CustomInputProps {
  @scala.inline
  def apply(`type`: CustomInputType): CustomInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomInputProps]
  }
  @scala.inline
  implicit class CustomInputPropsOps[Self <: CustomInputProps] (val x: Self) extends AnyVal {
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
    def setType(value: CustomInputType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBsSize(value: lg | sm): Self = this.set("bsSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBsSize: Self = this.set("bsSize", js.undefined)
    @scala.inline
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    @scala.inline
    def setHtmlFor(value: String): Self = this.set("htmlFor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlFor: Self = this.set("htmlFor", js.undefined)
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setInvalid(value: Boolean): Self = this.set("invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalid: Self = this.set("invalid", js.undefined)
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
  }
  
}

