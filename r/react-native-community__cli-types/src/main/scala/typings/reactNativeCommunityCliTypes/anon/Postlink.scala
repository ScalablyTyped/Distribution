package typings.reactNativeCommunityCliTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Postlink extends StObject {
  
  var postlink: js.UndefOr[String] = js.undefined
  
  var postunlink: js.UndefOr[String] = js.undefined
  
  var prelink: js.UndefOr[String] = js.undefined
  
  var preunlink: js.UndefOr[String] = js.undefined
}
object Postlink {
  
  @scala.inline
  def apply(): Postlink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Postlink]
  }
  
  @scala.inline
  implicit class PostlinkMutableBuilder[Self <: Postlink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPostlink(value: String): Self = StObject.set(x, "postlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlinkUndefined: Self = StObject.set(x, "postlink", js.undefined)
    
    @scala.inline
    def setPostunlink(value: String): Self = StObject.set(x, "postunlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostunlinkUndefined: Self = StObject.set(x, "postunlink", js.undefined)
    
    @scala.inline
    def setPrelink(value: String): Self = StObject.set(x, "prelink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrelinkUndefined: Self = StObject.set(x, "prelink", js.undefined)
    
    @scala.inline
    def setPreunlink(value: String): Self = StObject.set(x, "preunlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreunlinkUndefined: Self = StObject.set(x, "preunlink", js.undefined)
  }
}
