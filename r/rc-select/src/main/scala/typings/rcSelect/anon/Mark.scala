package typings.rcSelect.anon

import typings.rcSelect.generatorMod.OnClear
import typings.rcSelect.generatorMod.RawValueType
import typings.rcSelect.generatorMod.SelectSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mark[OptionsType /* <: js.Array[js.Object] */] extends StObject {
  
  var mark: js.UndefOr[String] = js.undefined
  
  var onClear: js.UndefOr[OnClear] = js.undefined
  
  var onRawDeselect: js.UndefOr[
    js.Function3[
      /* value */ RawValueType, 
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ /* option */ js.Any, 
      /* source */ SelectSource, 
      Unit
    ]
  ] = js.undefined
  
  var onRawSelect: js.UndefOr[
    js.Function3[
      /* value */ RawValueType, 
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ /* option */ js.Any, 
      /* source */ SelectSource, 
      Unit
    ]
  ] = js.undefined
  
  var skipTriggerChange: js.UndefOr[Boolean] = js.undefined
  
  var skipTriggerSelect: js.UndefOr[Boolean] = js.undefined
}
object Mark {
  
  inline def apply[OptionsType /* <: js.Array[js.Object] */](): Mark[OptionsType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mark[OptionsType]]
  }
  
  extension [Self <: Mark[?], OptionsType /* <: js.Array[js.Object] */](x: Self & Mark[OptionsType]) {
    
    inline def setMark(value: String): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
    
    inline def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
    
    inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
    
    inline def setOnRawDeselect(
      value: (/* value */ RawValueType, /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ /* option */ js.Any, /* source */ SelectSource) => Unit
    ): Self = StObject.set(x, "onRawDeselect", js.Any.fromFunction3(value))
    
    inline def setOnRawDeselectUndefined: Self = StObject.set(x, "onRawDeselect", js.undefined)
    
    inline def setOnRawSelect(
      value: (/* value */ RawValueType, /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ /* option */ js.Any, /* source */ SelectSource) => Unit
    ): Self = StObject.set(x, "onRawSelect", js.Any.fromFunction3(value))
    
    inline def setOnRawSelectUndefined: Self = StObject.set(x, "onRawSelect", js.undefined)
    
    inline def setSkipTriggerChange(value: Boolean): Self = StObject.set(x, "skipTriggerChange", value.asInstanceOf[js.Any])
    
    inline def setSkipTriggerChangeUndefined: Self = StObject.set(x, "skipTriggerChange", js.undefined)
    
    inline def setSkipTriggerSelect(value: Boolean): Self = StObject.set(x, "skipTriggerSelect", value.asInstanceOf[js.Any])
    
    inline def setSkipTriggerSelectUndefined: Self = StObject.set(x, "skipTriggerSelect", js.undefined)
  }
}
