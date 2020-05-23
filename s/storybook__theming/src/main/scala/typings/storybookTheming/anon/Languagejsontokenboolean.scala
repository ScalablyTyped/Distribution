package typings.storybookTheming.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Languagejsontokenboolean extends js.Object {
  @JSName("language-json .token.boolean")
  var `language-json DottokenDotboolean`: ColorString
  @JSName("language-json .token.number")
  var `language-json DottokenDotnumber`: ColorString
  @JSName("language-json .token.property")
  var `language-json DottokenDotproperty`: ColorString
  var namespace: Opacity
  var token: Atrule
}

object Languagejsontokenboolean {
  @scala.inline
  def apply(
    `language-json DottokenDotboolean`: ColorString,
    `language-json DottokenDotnumber`: ColorString,
    `language-json DottokenDotproperty`: ColorString,
    namespace: Opacity,
    token: Atrule
  ): Languagejsontokenboolean = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("language-json .token.boolean")((`language-json DottokenDotboolean`).asInstanceOf[js.Any])
    __obj.updateDynamic("language-json .token.number")((`language-json DottokenDotnumber`).asInstanceOf[js.Any])
    __obj.updateDynamic("language-json .token.property")((`language-json DottokenDotproperty`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Languagejsontokenboolean]
  }
}

