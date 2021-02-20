package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadFileParameters extends StObject {
  
  var channel: String = js.native
  
  var cipherKey: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var name: String = js.native
}
object DownloadFileParameters {
  
  @scala.inline
  def apply(channel: String, id: String, name: String): DownloadFileParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileParameters]
  }
  
  @scala.inline
  implicit class DownloadFileParametersMutableBuilder[Self <: DownloadFileParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCipherKey(value: String): Self = StObject.set(x, "cipherKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCipherKeyUndefined: Self = StObject.set(x, "cipherKey", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
