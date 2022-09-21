package typings.reactNativeCommunityCliPlatformIos.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DemoProjectxcodeproj extends StObject {
  
  var Podfile: String
  
  @JSName("demoProject.xcodeproj")
  var demoProjectDotxcodeproj: Projectpbxproj
}
object DemoProjectxcodeproj {
  
  inline def apply(Podfile: String, demoProjectDotxcodeproj: Projectpbxproj): DemoProjectxcodeproj = {
    val __obj = js.Dynamic.literal(Podfile = Podfile.asInstanceOf[js.Any])
    __obj.updateDynamic("demoProject.xcodeproj")(demoProjectDotxcodeproj.asInstanceOf[js.Any])
    __obj.asInstanceOf[DemoProjectxcodeproj]
  }
  
  extension [Self <: DemoProjectxcodeproj](x: Self) {
    
    inline def setDemoProjectDotxcodeproj(value: Projectpbxproj): Self = StObject.set(x, "demoProject.xcodeproj", value.asInstanceOf[js.Any])
    
    inline def setPodfile(value: String): Self = StObject.set(x, "Podfile", value.asInstanceOf[js.Any])
  }
}
