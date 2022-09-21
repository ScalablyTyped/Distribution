package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictx
  extends StObject
     with /* x */ StringDictionary[Any] {
  
  @JSName("Main.java")
  var MainDotjava: Any
}
object Dictx {
  
  inline def apply(MainDotjava: Any): Dictx = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Main.java")(MainDotjava.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictx]
  }
  
  extension [Self <: Dictx](x: Self) {
    
    inline def setMainDotjava(value: Any): Self = StObject.set(x, "Main.java", value.asInstanceOf[js.Any])
  }
}
