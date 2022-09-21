package typings.reactNativeWebrtc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationParamWithUrls
  extends StObject
     with ConfigurationParam {
  
  var urls: js.Array[String]
}
object ConfigurationParamWithUrls {
  
  inline def apply(urls: js.Array[String]): ConfigurationParamWithUrls = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationParamWithUrls]
  }
  
  extension [Self <: ConfigurationParamWithUrls](x: Self) {
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
