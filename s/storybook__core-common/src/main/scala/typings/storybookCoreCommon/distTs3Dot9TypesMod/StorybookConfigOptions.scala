package typings.storybookCoreCommon.distTs3Dot9TypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorybookConfigOptions extends StObject {
  
  var presets: Presets
  
  var presetsList: js.UndefOr[js.Array[LoadedPreset]] = js.undefined
}
object StorybookConfigOptions {
  
  inline def apply(presets: Presets): StorybookConfigOptions = {
    val __obj = js.Dynamic.literal(presets = presets.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorybookConfigOptions]
  }
  
  extension [Self <: StorybookConfigOptions](x: Self) {
    
    inline def setPresets(value: Presets): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
    
    inline def setPresetsList(value: js.Array[LoadedPreset]): Self = StObject.set(x, "presetsList", value.asInstanceOf[js.Any])
    
    inline def setPresetsListUndefined: Self = StObject.set(x, "presetsList", js.undefined)
    
    inline def setPresetsListVarargs(value: LoadedPreset*): Self = StObject.set(x, "presetsList", js.Array(value*))
  }
}
