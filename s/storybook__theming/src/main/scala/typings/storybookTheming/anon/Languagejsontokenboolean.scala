package typings.storybookTheming.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Languagejsontokenboolean extends StObject {
  
  @JSName("language-json .token.boolean")
  var `language-json DottokenDotboolean`: Color
  
  @JSName("language-json .token.number")
  var `language-json DottokenDotnumber`: Color
  
  @JSName("language-json .token.property")
  var `language-json DottokenDotproperty`: Color
  
  var namespace: Opacity
  
  var token: Atrule
}
object Languagejsontokenboolean {
  
  inline def apply(
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
  
  extension [Self <: Languagejsontokenboolean](x: Self) {
    
    inline def `setLanguage-json DottokenDotboolean`(value: Color): Self = StObject.set(x, "language-json .token.boolean", value.asInstanceOf[js.Any])
    
    inline def `setLanguage-json DottokenDotnumber`(value: Color): Self = StObject.set(x, "language-json .token.number", value.asInstanceOf[js.Any])
    
    inline def `setLanguage-json DottokenDotproperty`(value: Color): Self = StObject.set(x, "language-json .token.property", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Opacity): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setToken(value: Atrule): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
