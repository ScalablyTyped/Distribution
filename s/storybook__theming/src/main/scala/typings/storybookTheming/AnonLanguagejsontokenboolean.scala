package typings.storybookTheming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLanguagejsontokenboolean extends js.Object {
  @JSName("language-json .token.boolean")
  var `language-json DottokenDotboolean`: AnonColorString
  @JSName("language-json .token.number")
  var `language-json DottokenDotnumber`: AnonColorString
  @JSName("language-json .token.property")
  var `language-json DottokenDotproperty`: AnonColorString
  var namespace: AnonOpacity
  var token: AnonAtrule
}

object AnonLanguagejsontokenboolean {
  @scala.inline
  def apply(
    `language-json DottokenDotboolean`: AnonColorString,
    `language-json DottokenDotnumber`: AnonColorString,
    `language-json DottokenDotproperty`: AnonColorString,
    namespace: AnonOpacity,
    token: AnonAtrule
  ): AnonLanguagejsontokenboolean = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("language-json .token.boolean")((`language-json DottokenDotboolean`).asInstanceOf[js.Any])
    __obj.updateDynamic("language-json .token.number")((`language-json DottokenDotnumber`).asInstanceOf[js.Any])
    __obj.updateDynamic("language-json .token.property")((`language-json DottokenDotproperty`).asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLanguagejsontokenboolean]
  }
}

