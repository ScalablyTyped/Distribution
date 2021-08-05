package typings.stremioAddonSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultVideo extends StObject {
  
  /**
    * Set to a Video Object id in order to open the Detail page directly to that video's streams.
    */
  var defaultVideo: js.UndefOr[Boolean | String] = js.undefined
}
object DefaultVideo {
  
  inline def apply(): DefaultVideo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultVideo]
  }
  
  extension [Self <: DefaultVideo](x: Self) {
    
    inline def setDefaultVideo(value: Boolean | String): Self = StObject.set(x, "defaultVideo", value.asInstanceOf[js.Any])
    
    inline def setDefaultVideoUndefined: Self = StObject.set(x, "defaultVideo", js.undefined)
  }
}
