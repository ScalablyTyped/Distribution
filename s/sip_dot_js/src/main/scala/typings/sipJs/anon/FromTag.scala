package typings.sipJs.anon

import typings.sipJs.coreMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromTag extends StObject {
  
  var fromDisplayName: js.UndefOr[String] = js.undefined
  
  var fromTag: js.UndefOr[String] = js.undefined
  
  var fromUri: js.UndefOr[URI] = js.undefined
  
  var toDisplayName: js.UndefOr[String] = js.undefined
  
  var toUri: js.UndefOr[URI] = js.undefined
}
object FromTag {
  
  inline def apply(): FromTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromTag]
  }
  
  extension [Self <: FromTag](x: Self) {
    
    inline def setFromDisplayName(value: String): Self = StObject.set(x, "fromDisplayName", value.asInstanceOf[js.Any])
    
    inline def setFromDisplayNameUndefined: Self = StObject.set(x, "fromDisplayName", js.undefined)
    
    inline def setFromTag(value: String): Self = StObject.set(x, "fromTag", value.asInstanceOf[js.Any])
    
    inline def setFromTagUndefined: Self = StObject.set(x, "fromTag", js.undefined)
    
    inline def setFromUri(value: URI): Self = StObject.set(x, "fromUri", value.asInstanceOf[js.Any])
    
    inline def setFromUriUndefined: Self = StObject.set(x, "fromUri", js.undefined)
    
    inline def setToDisplayName(value: String): Self = StObject.set(x, "toDisplayName", value.asInstanceOf[js.Any])
    
    inline def setToDisplayNameUndefined: Self = StObject.set(x, "toDisplayName", js.undefined)
    
    inline def setToUri(value: URI): Self = StObject.set(x, "toUri", value.asInstanceOf[js.Any])
    
    inline def setToUriUndefined: Self = StObject.set(x, "toUri", js.undefined)
  }
}
