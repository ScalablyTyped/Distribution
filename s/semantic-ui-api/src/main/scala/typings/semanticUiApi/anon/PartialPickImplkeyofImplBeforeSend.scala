package typings.semanticUiApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl>> */
trait PartialPickImplkeyofImplBeforeSend extends js.Object {
  var JSONParse: js.UndefOr[String] = js.undefined
  var beforeSend: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var exitConditions: js.UndefOr[String] = js.undefined
  var legacyParameters: js.UndefOr[String] = js.undefined
  var missingAction: js.UndefOr[String] = js.undefined
  var missingSerialize: js.UndefOr[String] = js.undefined
  var missingURL: js.UndefOr[String] = js.undefined
  var noReturnedValue: js.UndefOr[String] = js.undefined
  var parseError: js.UndefOr[String] = js.undefined
  var requiredParameter: js.UndefOr[String] = js.undefined
  var statusMessage: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplBeforeSend {
  @scala.inline
  def apply(
    JSONParse: String = null,
    beforeSend: String = null,
    error: String = null,
    exitConditions: String = null,
    legacyParameters: String = null,
    missingAction: String = null,
    missingSerialize: String = null,
    missingURL: String = null,
    noReturnedValue: String = null,
    parseError: String = null,
    requiredParameter: String = null,
    statusMessage: String = null,
    timeout: String = null
  ): PartialPickImplkeyofImplBeforeSend = {
    val __obj = js.Dynamic.literal()
    if (JSONParse != null) __obj.updateDynamic("JSONParse")(JSONParse.asInstanceOf[js.Any])
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (exitConditions != null) __obj.updateDynamic("exitConditions")(exitConditions.asInstanceOf[js.Any])
    if (legacyParameters != null) __obj.updateDynamic("legacyParameters")(legacyParameters.asInstanceOf[js.Any])
    if (missingAction != null) __obj.updateDynamic("missingAction")(missingAction.asInstanceOf[js.Any])
    if (missingSerialize != null) __obj.updateDynamic("missingSerialize")(missingSerialize.asInstanceOf[js.Any])
    if (missingURL != null) __obj.updateDynamic("missingURL")(missingURL.asInstanceOf[js.Any])
    if (noReturnedValue != null) __obj.updateDynamic("noReturnedValue")(noReturnedValue.asInstanceOf[js.Any])
    if (parseError != null) __obj.updateDynamic("parseError")(parseError.asInstanceOf[js.Any])
    if (requiredParameter != null) __obj.updateDynamic("requiredParameter")(requiredParameter.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplBeforeSend]
  }
}

