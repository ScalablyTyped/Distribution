package typings.reactstrap.inputMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.ReactType
import typings.react.mod.Ref
import typings.reactstrap.mod.CSSModule
import typings.reactstrap.reactstrapStrings.lg
import typings.reactstrap.reactstrapStrings.sm
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputProps
  extends InputHTMLAttributes[HTMLInputElement]
     with /* key */ StringDictionary[js.Any] {
  var addon: js.UndefOr[Boolean] = js.native
  var bsSize: js.UndefOr[lg | sm] = js.native
  var cssModule: js.UndefOr[CSSModule] = js.native
  var innerRef: js.UndefOr[Ref[HTMLInputElement]] = js.native
  var invalid: js.UndefOr[Boolean] = js.native
  var plaintext: js.UndefOr[Boolean] = js.native
  var state: js.UndefOr[String] = js.native
  var tag: js.UndefOr[String | ReactType[_]] = js.native
  @JSName("type")
  var type_InputProps: js.UndefOr[InputType] = js.native
  var valid: js.UndefOr[Boolean] = js.native
}

object InputProps {
  @scala.inline
  def apply(): InputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputProps]
  }
  @scala.inline
  implicit class InputPropsOps[Self <: InputProps] (val x: Self) extends AnyVal {
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
    def setAddon(value: Boolean): Self = this.set("addon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddon: Self = this.set("addon", js.undefined)
    @scala.inline
    def setBsSize(value: lg | sm): Self = this.set("bsSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBsSize: Self = this.set("bsSize", js.undefined)
    @scala.inline
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInnerRef(value: Ref[HTMLInputElement]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    @scala.inline
    def setInvalid(value: Boolean): Self = this.set("invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalid: Self = this.set("invalid", js.undefined)
    @scala.inline
    def setPlaintext(value: Boolean): Self = this.set("plaintext", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaintext: Self = this.set("plaintext", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTag(value: String | ReactType[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setType(value: InputType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
  }
  
}

