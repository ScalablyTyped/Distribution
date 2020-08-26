package typings.revalidator.Revalidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions extends js.Object {
  /** When additionalProperties is true allow additional unvisited properties on the object. (default true) */
  var additionalProperties: js.UndefOr[Boolean] = js.native
  /** Enforce casting of some types (for integers/numbers are only supported) when it's possible, e.g. "42" => 42, but "forty2" => "forty2" for the integer type. */
  var cast: js.UndefOr[Boolean] = js.native
  /** When validateFormats is true also validate formats defined in validate.formatExtensions (default true) */
  var validateFormatExtensions: js.UndefOr[Boolean] = js.native
  /** Enforce format constraints (default true) */
  var validateFormats: js.UndefOr[Boolean] = js.native
  /** When validateFormats is true treat unrecognized formats as validation errors (default false) */
  var validateFormatsStrict: js.UndefOr[Boolean] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
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
    def setAdditionalProperties(value: Boolean): Self = this.set("additionalProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalProperties: Self = this.set("additionalProperties", js.undefined)
    @scala.inline
    def setCast(value: Boolean): Self = this.set("cast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCast: Self = this.set("cast", js.undefined)
    @scala.inline
    def setValidateFormatExtensions(value: Boolean): Self = this.set("validateFormatExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateFormatExtensions: Self = this.set("validateFormatExtensions", js.undefined)
    @scala.inline
    def setValidateFormats(value: Boolean): Self = this.set("validateFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateFormats: Self = this.set("validateFormats", js.undefined)
    @scala.inline
    def setValidateFormatsStrict(value: Boolean): Self = this.set("validateFormatsStrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateFormatsStrict: Self = this.set("validateFormatsStrict", js.undefined)
  }
  
}

