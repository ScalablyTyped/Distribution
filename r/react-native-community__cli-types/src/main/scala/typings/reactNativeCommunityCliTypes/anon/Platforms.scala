package typings.reactNativeCommunityCliTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Platforms extends StObject {
  
  var platforms: AndroidIos
  
  var root: String
}
object Platforms {
  
  inline def apply(platforms: AndroidIos, root: String): Platforms = {
    val __obj = js.Dynamic.literal(platforms = platforms.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Platforms]
  }
  
  extension [Self <: Platforms](x: Self) {
    
    inline def setPlatforms(value: AndroidIos): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
