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
  
  @scala.inline
  def apply(urls: js.Array[String]): ConfigurationParamWithUrls = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationParamWithUrls]
  }
  
  @scala.inline
  implicit class ConfigurationParamWithUrlsMutableBuilder[Self <: ConfigurationParamWithUrls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
  }
}
