package typings.reactNativeFirebase.mod.RNFirebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProfile extends StObject {
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var photoURL: js.UndefOr[String] = js.undefined
}
object UpdateProfile {
  
  @scala.inline
  def apply(): UpdateProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProfile]
  }
  
  @scala.inline
  implicit class UpdateProfileMutableBuilder[Self <: UpdateProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setPhotoURL(value: String): Self = StObject.set(x, "photoURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoURLUndefined: Self = StObject.set(x, "photoURL", js.undefined)
  }
}
