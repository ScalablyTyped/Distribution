package typings.reactNativeWebrtc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationParamWithUrl
  extends StObject
     with ConfigurationParam {
  
  var url: String
}
object ConfigurationParamWithUrl {
  
  @scala.inline
  def apply(url: String): ConfigurationParamWithUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationParamWithUrl]
  }
  
  @scala.inline
  implicit class ConfigurationParamWithUrlMutableBuilder[Self <: ConfigurationParamWithUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
