package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mainjava extends StObject {
  
  @JSName("Main.java")
  var MainDotjava: Any
  
  @JSName("ReactPackage.java")
  var ReactPackageDotjava: Any
}
object Mainjava {
  
  inline def apply(MainDotjava: Any, ReactPackageDotjava: Any): Mainjava = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Main.java")(MainDotjava.asInstanceOf[js.Any])
    __obj.updateDynamic("ReactPackage.java")(ReactPackageDotjava.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mainjava]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mainjava] (val x: Self) extends AnyVal {
    
    inline def setMainDotjava(value: Any): Self = StObject.set(x, "Main.java", value.asInstanceOf[js.Any])
    
    inline def setReactPackageDotjava(value: Any): Self = StObject.set(x, "ReactPackage.java", value.asInstanceOf[js.Any])
  }
}
