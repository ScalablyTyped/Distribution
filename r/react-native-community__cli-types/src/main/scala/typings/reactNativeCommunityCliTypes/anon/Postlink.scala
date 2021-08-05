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
  
  inline def apply(): Postlink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Postlink]
  }
  
  extension [Self <: Postlink](x: Self) {
    
    inline def setPostlink(value: String): Self = StObject.set(x, "postlink", value.asInstanceOf[js.Any])
    
    inline def setPostlinkUndefined: Self = StObject.set(x, "postlink", js.undefined)
    
    inline def setPostunlink(value: String): Self = StObject.set(x, "postunlink", value.asInstanceOf[js.Any])
    
    inline def setPostunlinkUndefined: Self = StObject.set(x, "postunlink", js.undefined)
    
    inline def setPrelink(value: String): Self = StObject.set(x, "prelink", value.asInstanceOf[js.Any])
    
    inline def setPrelinkUndefined: Self = StObject.set(x, "prelink", js.undefined)
    
    inline def setPreunlink(value: String): Self = StObject.set(x, "preunlink", value.asInstanceOf[js.Any])
    
    inline def setPreunlinkUndefined: Self = StObject.set(x, "preunlink", js.undefined)
  }
}
