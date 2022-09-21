package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buildgradle extends StObject {
  
  @JSName("build.gradle")
  var buildDotgradle: Any
  
  var src: AndroidManifestxml
}
object Buildgradle {
  
  inline def apply(buildDotgradle: Any, src: AndroidManifestxml): Buildgradle = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("build.gradle")(buildDotgradle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buildgradle]
  }
  
  extension [Self <: Buildgradle](x: Self) {
    
    inline def setBuildDotgradle(value: Any): Self = StObject.set(x, "build.gradle", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: AndroidManifestxml): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
