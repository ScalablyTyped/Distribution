package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPHeaderExtension extends StObject {
  
  var direction: js.UndefOr[SDPDirection] = js.native
  
  var id: Double = js.native
  
  var uri: String = js.native
}
object SDPHeaderExtension {
  
  @scala.inline
  def apply(id: Double, uri: String): SDPHeaderExtension = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPHeaderExtension]
  }
  
  @scala.inline
  implicit class SDPHeaderExtensionMutableBuilder[Self <: SDPHeaderExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: SDPDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
