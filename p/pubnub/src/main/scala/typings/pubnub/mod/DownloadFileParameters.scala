package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadFileParameters extends StObject {
  
  var channel: String
  
  var cipherKey: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var name: String
}
object DownloadFileParameters {
  
  inline def apply(channel: String, id: String, name: String): DownloadFileParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileParameters]
  }
  
  extension [Self <: DownloadFileParameters](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setCipherKey(value: String): Self = StObject.set(x, "cipherKey", value.asInstanceOf[js.Any])
    
    inline def setCipherKeyUndefined: Self = StObject.set(x, "cipherKey", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
