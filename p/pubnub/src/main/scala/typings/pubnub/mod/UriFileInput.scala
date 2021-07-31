package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UriFileInput extends StObject {
  
  var mimeType: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var uri: String
}
object UriFileInput {
  
  @scala.inline
  def apply(name: String, uri: String): UriFileInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[UriFileInput]
  }
  
  @scala.inline
  implicit class UriFileInputMutableBuilder[Self <: UriFileInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
