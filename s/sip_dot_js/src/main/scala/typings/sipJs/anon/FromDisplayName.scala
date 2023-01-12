package typings.sipJs.anon

import typings.sipJs.libGrammarUriMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromDisplayName extends StObject {
  
  var fromDisplayName: js.UndefOr[String] = js.undefined
  
  var fromTag: js.UndefOr[String] = js.undefined
  
  var fromUri: js.UndefOr[String | URI] = js.undefined
  
  var toDisplayName: js.UndefOr[String] = js.undefined
  
  var toUri: js.UndefOr[String | URI] = js.undefined
}
object FromDisplayName {
  
  inline def apply(): FromDisplayName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromDisplayName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FromDisplayName] (val x: Self) extends AnyVal {
    
    inline def setFromDisplayName(value: String): Self = StObject.set(x, "fromDisplayName", value.asInstanceOf[js.Any])
    
    inline def setFromDisplayNameUndefined: Self = StObject.set(x, "fromDisplayName", js.undefined)
    
    inline def setFromTag(value: String): Self = StObject.set(x, "fromTag", value.asInstanceOf[js.Any])
    
    inline def setFromTagUndefined: Self = StObject.set(x, "fromTag", js.undefined)
    
    inline def setFromUri(value: String | URI): Self = StObject.set(x, "fromUri", value.asInstanceOf[js.Any])
    
    inline def setFromUriUndefined: Self = StObject.set(x, "fromUri", js.undefined)
    
    inline def setToDisplayName(value: String): Self = StObject.set(x, "toDisplayName", value.asInstanceOf[js.Any])
    
    inline def setToDisplayNameUndefined: Self = StObject.set(x, "toDisplayName", js.undefined)
    
    inline def setToUri(value: String | URI): Self = StObject.set(x, "toUri", value.asInstanceOf[js.Any])
    
    inline def setToUriUndefined: Self = StObject.set(x, "toUri", js.undefined)
  }
}
