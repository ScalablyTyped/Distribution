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
  
  @scala.inline
  def apply(): FromTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromTag]
  }
  
  @scala.inline
  implicit class FromTagMutableBuilder[Self <: FromTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromDisplayName(value: String): Self = StObject.set(x, "fromDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromDisplayNameUndefined: Self = StObject.set(x, "fromDisplayName", js.undefined)
    
    @scala.inline
    def setFromTag(value: String): Self = StObject.set(x, "fromTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromTagUndefined: Self = StObject.set(x, "fromTag", js.undefined)
    
    @scala.inline
    def setFromUri(value: URI): Self = StObject.set(x, "fromUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUriUndefined: Self = StObject.set(x, "fromUri", js.undefined)
    
    @scala.inline
    def setToDisplayName(value: String): Self = StObject.set(x, "toDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToDisplayNameUndefined: Self = StObject.set(x, "toDisplayName", js.undefined)
    
    @scala.inline
    def setToUri(value: URI): Self = StObject.set(x, "toUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUriUndefined: Self = StObject.set(x, "toUri", js.undefined)
  }
}
