package typings.atPulumiAws.typesOutputMod.wafregionalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAclLoggingConfigurationRedactedFieldsFieldToMatch extends js.Object {
  /**
    * When the value of `type` is `HEADER`, enter the name of the header that you want the WAF to search, for example, `User-Agent` or `Referer`. If the value of `type` is any other value, omit `data`.
    */
  var data: js.UndefOr[String] = js.undefined
  /**
    * Specifies how you want AWS WAF Regional to respond to requests that match the settings in a rule. e.g. `ALLOW`, `BLOCK` or `COUNT`
    */
  var `type`: String
}

object WebAclLoggingConfigurationRedactedFieldsFieldToMatch {
  @scala.inline
  def apply(`type`: String, data: String = null): WebAclLoggingConfigurationRedactedFieldsFieldToMatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[WebAclLoggingConfigurationRedactedFieldsFieldToMatch]
  }
}

