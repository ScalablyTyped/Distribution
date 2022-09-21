package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MainjavaAny extends StObject {
  
  @JSName("Main.java")
  var MainDotjava: Any
}
object MainjavaAny {
  
  inline def apply(MainDotjava: Any): MainjavaAny = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Main.java")(MainDotjava.asInstanceOf[js.Any])
    __obj.asInstanceOf[MainjavaAny]
  }
  
  extension [Self <: MainjavaAny](x: Self) {
    
    inline def setMainDotjava(value: Any): Self = StObject.set(x, "Main.java", value.asInstanceOf[js.Any])
  }
}
