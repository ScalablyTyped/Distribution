package typings.reactNativeCommunityCliPluginMetro.anon

import typings.reactNativeCommunityCliTypes.anon.Dictname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@react-native-community/cli-types.@react-native-community/cli-types.Config, 'root' | 'reactNativePath' | 'platforms'> */
trait PickConfigrootreactNative extends StObject {
  
  var platforms: Dictname
  
  var reactNativePath: String
  
  var root: String
}
object PickConfigrootreactNative {
  
  inline def apply(platforms: Dictname, reactNativePath: String, root: String): PickConfigrootreactNative = {
    val __obj = js.Dynamic.literal(platforms = platforms.asInstanceOf[js.Any], reactNativePath = reactNativePath.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickConfigrootreactNative]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickConfigrootreactNative] (val x: Self) extends AnyVal {
    
    inline def setPlatforms(value: Dictname): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setReactNativePath(value: String): Self = StObject.set(x, "reactNativePath", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
