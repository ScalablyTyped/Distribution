package typings.atStorybookTheming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Languagejsontokenboolean extends js.Object {
  @JSName("language-json .token.boolean")
  var `language-json DottokenDotboolean`: Anon_ColorString
  @JSName("language-json .token.number")
  var `language-json DottokenDotnumber`: Anon_ColorString
  @JSName("language-json .token.property")
  var `language-json DottokenDotproperty`: Anon_ColorString
  var namespace: Anon_Opacity
  var token: Anon_Atrule
}

object Anon_Languagejsontokenboolean {
  @scala.inline
  def apply(
    `language-json DottokenDotboolean`: Anon_ColorString,
    `language-json DottokenDotnumber`: Anon_ColorString,
    `language-json DottokenDotproperty`: Anon_ColorString,
    namespace: Anon_Opacity,
    token: Anon_Atrule
  ): Anon_Languagejsontokenboolean = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("language-json .token.boolean")(`language-json DottokenDotboolean`.asInstanceOf[js.Any])
    __obj.updateDynamic("language-json .token.number")(`language-json DottokenDotnumber`.asInstanceOf[js.Any])
    __obj.updateDynamic("language-json .token.property")(`language-json DottokenDotproperty`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Languagejsontokenboolean]
  }
}

