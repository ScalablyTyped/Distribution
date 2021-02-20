package typings.rcSelect.anon

import typings.rcSelect.generatorMod.OnClear
import typings.rcSelect.generatorMod.RawValueType
import typings.rcSelect.generatorMod.SelectSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mark[OptionsType /* <: js.Array[js.Object] */] extends StObject {
  
  var mark: js.UndefOr[String] = js.native
  
  var onClear: js.UndefOr[OnClear] = js.native
  
  var onRawDeselect: js.UndefOr[
    js.Function3[
      /* value */ RawValueType, 
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ /* option */ js.Any, 
      /* source */ SelectSource, 
      Unit
    ]
  ] = js.native
  
  var onRawSelect: js.UndefOr[
    js.Function3[
      /* value */ RawValueType, 
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ /* option */ js.Any, 
      /* source */ SelectSource, 
      Unit
    ]
  ] = js.native
  
  var skipTriggerChange: js.UndefOr[Boolean] = js.native
  
  var skipTriggerSelect: js.UndefOr[Boolean] = js.native
}
object Mark {
  
  @scala.inline
  def apply[OptionsType /* <: js.Array[js.Object] */](): Mark[OptionsType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mark[OptionsType]]
  }
  
  @scala.inline
  implicit class MarkMutableBuilder[Self <: Mark[_], OptionsType /* <: js.Array[js.Object] */] (val x: Self with Mark[OptionsType]) extends AnyVal {
    
    @scala.inline
    def setMark(value: String): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
    
    @scala.inline
    def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
    
    @scala.inline
    def setOnRawDeselect(
      value: (/* value */ RawValueType, /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ /* option */ js.Any, /* source */ SelectSource) => Unit
    ): Self = StObject.set(x, "onRawDeselect", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnRawDeselectUndefined: Self = StObject.set(x, "onRawDeselect", js.undefined)
    
    @scala.inline
    def setOnRawSelect(
      value: (/* value */ RawValueType, /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ /* option */ js.Any, /* source */ SelectSource) => Unit
    ): Self = StObject.set(x, "onRawSelect", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnRawSelectUndefined: Self = StObject.set(x, "onRawSelect", js.undefined)
    
    @scala.inline
    def setSkipTriggerChange(value: Boolean): Self = StObject.set(x, "skipTriggerChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipTriggerChangeUndefined: Self = StObject.set(x, "skipTriggerChange", js.undefined)
    
    @scala.inline
    def setSkipTriggerSelect(value: Boolean): Self = StObject.set(x, "skipTriggerSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipTriggerSelectUndefined: Self = StObject.set(x, "skipTriggerSelect", js.undefined)
  }
}
