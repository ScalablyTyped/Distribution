package typings.reactNativeCommunityCliDoctor.anon

import typings.reactNativeCommunityCliDoctor.typesMod.NotFound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APILevels extends StObject {
  
  var `API Levels`: js.Array[String] | NotFound
  
  var `Android NDK`: String | NotFound
  
  var `Build Tools`: js.Array[String] | NotFound
  
  var `System Images`: js.Array[String] | NotFound
}
object APILevels {
  
  inline def apply(
    `API Levels`: js.Array[String] | NotFound,
    `Android NDK`: String | NotFound,
    `Build Tools`: js.Array[String] | NotFound,
    `System Images`: js.Array[String] | NotFound
  ): APILevels = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("API Levels")((`API Levels`).asInstanceOf[js.Any])
    __obj.updateDynamic("Android NDK")((`Android NDK`).asInstanceOf[js.Any])
    __obj.updateDynamic("Build Tools")((`Build Tools`).asInstanceOf[js.Any])
    __obj.updateDynamic("System Images")((`System Images`).asInstanceOf[js.Any])
    __obj.asInstanceOf[APILevels]
  }
  
  extension [Self <: APILevels](x: Self) {
    
    inline def `setAPI Levels`(value: js.Array[String] | NotFound): Self = StObject.set(x, "API Levels", value.asInstanceOf[js.Any])
    
    inline def `setAPI LevelsVarargs`(value: String*): Self = StObject.set(x, "API Levels", js.Array(value*))
    
    inline def `setAndroid NDK`(value: String | NotFound): Self = StObject.set(x, "Android NDK", value.asInstanceOf[js.Any])
    
    inline def `setBuild Tools`(value: js.Array[String] | NotFound): Self = StObject.set(x, "Build Tools", value.asInstanceOf[js.Any])
    
    inline def `setBuild ToolsVarargs`(value: String*): Self = StObject.set(x, "Build Tools", js.Array(value*))
    
    inline def `setSystem Images`(value: js.Array[String] | NotFound): Self = StObject.set(x, "System Images", value.asInstanceOf[js.Any])
    
    inline def `setSystem ImagesVarargs`(value: String*): Self = StObject.set(x, "System Images", js.Array(value*))
  }
}
