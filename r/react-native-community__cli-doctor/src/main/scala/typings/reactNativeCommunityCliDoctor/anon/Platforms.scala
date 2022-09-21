package typings.reactNativeCommunityCliDoctor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Platforms extends StObject {
  
  var Platforms: js.Array[String]
}
object Platforms {
  
  inline def apply(Platforms: js.Array[String]): Platforms = {
    val __obj = js.Dynamic.literal(Platforms = Platforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Platforms]
  }
  
  extension [Self <: Platforms](x: Self) {
    
    inline def setPlatforms(value: js.Array[String]): Self = StObject.set(x, "Platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsVarargs(value: String*): Self = StObject.set(x, "Platforms", js.Array(value*))
  }
}
