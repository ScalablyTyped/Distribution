package typings.reactNativeCommunityCliPlatformIos.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExampleProjectxcodeproj extends StObject {
  
  var Podfile: String
  
  @JSName("exampleProject.xcodeproj")
  var exampleProjectDotxcodeproj: Projectpbxproj
}
object ExampleProjectxcodeproj {
  
  inline def apply(Podfile: String, exampleProjectDotxcodeproj: Projectpbxproj): ExampleProjectxcodeproj = {
    val __obj = js.Dynamic.literal(Podfile = Podfile.asInstanceOf[js.Any])
    __obj.updateDynamic("exampleProject.xcodeproj")(exampleProjectDotxcodeproj.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExampleProjectxcodeproj]
  }
  
  extension [Self <: ExampleProjectxcodeproj](x: Self) {
    
    inline def setExampleProjectDotxcodeproj(value: Projectpbxproj): Self = StObject.set(x, "exampleProject.xcodeproj", value.asInstanceOf[js.Any])
    
    inline def setPodfile(value: String): Self = StObject.set(x, "Podfile", value.asInstanceOf[js.Any])
  }
}
