package typings.storybookCoreCommon.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PresetsOptions extends StObject {
  
  var corePresets: js.Array[String]
  
  var frameworkPresets: js.Array[String]
  
  var overridePresets: js.Array[String]
}
object PresetsOptions {
  
  inline def apply(
    corePresets: js.Array[String],
    frameworkPresets: js.Array[String],
    overridePresets: js.Array[String]
  ): PresetsOptions = {
    val __obj = js.Dynamic.literal(corePresets = corePresets.asInstanceOf[js.Any], frameworkPresets = frameworkPresets.asInstanceOf[js.Any], overridePresets = overridePresets.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresetsOptions]
  }
  
  extension [Self <: PresetsOptions](x: Self) {
    
    inline def setCorePresets(value: js.Array[String]): Self = StObject.set(x, "corePresets", value.asInstanceOf[js.Any])
    
    inline def setCorePresetsVarargs(value: String*): Self = StObject.set(x, "corePresets", js.Array(value*))
    
    inline def setFrameworkPresets(value: js.Array[String]): Self = StObject.set(x, "frameworkPresets", value.asInstanceOf[js.Any])
    
    inline def setFrameworkPresetsVarargs(value: String*): Self = StObject.set(x, "frameworkPresets", js.Array(value*))
    
    inline def setOverridePresets(value: js.Array[String]): Self = StObject.set(x, "overridePresets", value.asInstanceOf[js.Any])
    
    inline def setOverridePresetsVarargs(value: String*): Self = StObject.set(x, "overridePresets", js.Array(value*))
  }
}
