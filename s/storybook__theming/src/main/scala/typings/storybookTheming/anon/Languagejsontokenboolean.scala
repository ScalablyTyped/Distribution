package typings.storybookTheming.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Languagejsontokenboolean extends StObject {
  
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
  implicit class LanguagejsontokenbooleanMutableBuilder[Self <: Languagejsontokenboolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setLanguage-json DottokenDotboolean`(value: Color): Self = StObject.set(x, "language-json .token.boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLanguage-json DottokenDotnumber`(value: Color): Self = StObject.set(x, "language-json .token.number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLanguage-json DottokenDotproperty`(value: Color): Self = StObject.set(x, "language-json .token.property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: Opacity): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: Atrule): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
