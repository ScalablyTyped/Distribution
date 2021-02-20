package typings.reactNativeCommunityCliTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Platforms extends StObject {
  
  var platforms: AndroidIos = js.native
  
  var root: String = js.native
}
object Platforms {
  
  @scala.inline
  def apply(platforms: AndroidIos, root: String): Platforms = {
    val __obj = js.Dynamic.literal(platforms = platforms.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Platforms]
  }
  
  @scala.inline
  implicit class PlatformsMutableBuilder[Self <: Platforms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlatforms(value: AndroidIos): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
