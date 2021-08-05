package typings.protractor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chrome extends StObject {
  
  var chrome: Typeofchrome
  
  var firefox: Typeoffirefox
  
  var http: Typeofhttp
  
  var remote: Typeofremote
}
object Chrome {
  
  inline def apply(chrome: Typeofchrome, firefox: Typeoffirefox, http: Typeofhttp, remote: Typeofremote): Chrome = {
    val __obj = js.Dynamic.literal(chrome = chrome.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chrome]
  }
  
  extension [Self <: Chrome](x: Self) {
    
    inline def setChrome(value: Typeofchrome): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
    
    inline def setFirefox(value: Typeoffirefox): Self = StObject.set(x, "firefox", value.asInstanceOf[js.Any])
    
    inline def setHttp(value: Typeofhttp): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setRemote(value: Typeofremote): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
  }
}
