package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactPackagejava extends StObject {
  
  @JSName("Main.java")
  var MainDotjava: Any
  
  @JSName("ReactPackage.java")
  var ReactPackageDotjava: Any
}
object ReactPackagejava {
  
  inline def apply(MainDotjava: Any, ReactPackageDotjava: Any): ReactPackagejava = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Main.java")(MainDotjava.asInstanceOf[js.Any])
    __obj.updateDynamic("ReactPackage.java")(ReactPackageDotjava.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactPackagejava]
  }
  
  extension [Self <: ReactPackagejava](x: Self) {
    
    inline def setMainDotjava(value: Any): Self = StObject.set(x, "Main.java", value.asInstanceOf[js.Any])
    
    inline def setReactPackageDotjava(value: Any): Self = StObject.set(x, "ReactPackage.java", value.asInstanceOf[js.Any])
  }
}
