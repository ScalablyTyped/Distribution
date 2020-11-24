package typings.storybookTheming.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Languagejsontokenboolean extends js.Object {
  
  @JSName("language-json .token.boolean")
  var `language-json DottokenDotboolean`: Color = js.native
  
  @JSName("language-json .token.number")
  var `language-json DottokenDotnumber`: Color = js.native
  
  @JSName("language-json .token.property")
  var `language-json DottokenDotproperty`: Color = js.native
  
  var namespace: Opacity = js.native
  
  var token: Atrule = js.native
}
object Languagejsontokenboolean {
  
  @scala.inline
  def apply(
    `language-json DottokenDotboolean`: Color,
    `language-json DottokenDotnumber`: Color,
    `language-json DottokenDotproperty`: Color,
    namespace: Opacity,
    token: Atrule
  ): Languagejsontokenboolean = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("language-json .token.boolean")((`language-json DottokenDotboolean`).asInstanceOf[js.Any])
    __obj.updateDynamic("language-json .token.number")((`language-json DottokenDotnumber`).asInstanceOf[js.Any])
    __obj.updateDynamic("language-json .token.property")((`language-json DottokenDotproperty`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Languagejsontokenboolean]
  }
  
  @scala.inline
  implicit class LanguagejsontokenbooleanOps[Self <: Languagejsontokenboolean] (val x: Self) extends AnyVal {
    
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
    def `setLanguage-json DottokenDotboolean`(value: Color): Self = this.set("language-json .token.boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLanguage-json DottokenDotnumber`(value: Color): Self = this.set("language-json .token.number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLanguage-json DottokenDotproperty`(value: Color): Self = this.set("language-json .token.property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: Opacity): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: Atrule): Self = this.set("token", value.asInstanceOf[js.Any])
  }
}
