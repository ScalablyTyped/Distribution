package typings.atStorybookTheming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Languagejsontokenboolean extends js.Object {
  var `language-json .token.boolean`: Anon_ColorString
  var `language-json .token.number`: Anon_ColorString
  var `language-json .token.property`: Anon_ColorString
  var namespace: Anon_Opacity
  var token: Anon_Atrule
}

object Anon_Languagejsontokenboolean {
  @scala.inline
  def apply(
    `language-json .token.boolean`: Anon_ColorString,
    `language-json .token.number`: Anon_ColorString,
    `language-json .token.property`: Anon_ColorString,
    namespace: Anon_Opacity,
    token: Anon_Atrule
  ): Anon_Languagejsontokenboolean = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("language-json .token.boolean")(`language-json .token.boolean`.asInstanceOf[js.Any])
    __obj.updateDynamic("language-json .token.number")(`language-json .token.number`.asInstanceOf[js.Any])
    __obj.updateDynamic("language-json .token.property")(`language-json .token.property`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Languagejsontokenboolean]
  }
}

