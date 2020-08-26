package typings.semanticUiApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplBeforeSend extends js.Object {
  var JSONParse: js.UndefOr[String] = js.native
  var beforeSend: js.UndefOr[String] = js.native
  var error: js.UndefOr[String] = js.native
  var exitConditions: js.UndefOr[String] = js.native
  var legacyParameters: js.UndefOr[String] = js.native
  var missingAction: js.UndefOr[String] = js.native
  var missingSerialize: js.UndefOr[String] = js.native
  var missingURL: js.UndefOr[String] = js.native
  var noReturnedValue: js.UndefOr[String] = js.native
  var parseError: js.UndefOr[String] = js.native
  var requiredParameter: js.UndefOr[String] = js.native
  var statusMessage: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplBeforeSend {
  @scala.inline
  def apply(): PartialPickImplkeyofImplBeforeSend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplBeforeSend]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplBeforeSendOps[Self <: PartialPickImplkeyofImplBeforeSend] (val x: Self) extends AnyVal {
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
    def setJSONParse(value: String): Self = this.set("JSONParse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJSONParse: Self = this.set("JSONParse", js.undefined)
    @scala.inline
    def setBeforeSend(value: String): Self = this.set("beforeSend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeSend: Self = this.set("beforeSend", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setExitConditions(value: String): Self = this.set("exitConditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExitConditions: Self = this.set("exitConditions", js.undefined)
    @scala.inline
    def setLegacyParameters(value: String): Self = this.set("legacyParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegacyParameters: Self = this.set("legacyParameters", js.undefined)
    @scala.inline
    def setMissingAction(value: String): Self = this.set("missingAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissingAction: Self = this.set("missingAction", js.undefined)
    @scala.inline
    def setMissingSerialize(value: String): Self = this.set("missingSerialize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissingSerialize: Self = this.set("missingSerialize", js.undefined)
    @scala.inline
    def setMissingURL(value: String): Self = this.set("missingURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissingURL: Self = this.set("missingURL", js.undefined)
    @scala.inline
    def setNoReturnedValue(value: String): Self = this.set("noReturnedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoReturnedValue: Self = this.set("noReturnedValue", js.undefined)
    @scala.inline
    def setParseError(value: String): Self = this.set("parseError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParseError: Self = this.set("parseError", js.undefined)
    @scala.inline
    def setRequiredParameter(value: String): Self = this.set("requiredParameter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiredParameter: Self = this.set("requiredParameter", js.undefined)
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

