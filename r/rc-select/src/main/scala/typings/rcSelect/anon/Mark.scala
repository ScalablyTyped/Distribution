package typings.rcSelect.anon

import typings.rcSelect.generatorMod.OnClear
import typings.rcSelect.generatorMod.RawValueType
import typings.rcSelect.generatorMod.SelectSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mark[OptionsType /* <: js.Array[js.Object] */] extends js.Object {
  
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
  implicit class MarkOps[Self <: Mark[_], OptionsType /* <: js.Array[js.Object] */] (val x: Self with Mark[OptionsType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMark(value: String): Self = this.set("mark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMark: Self = this.set("mark", js.undefined)
    
    @scala.inline
    def setOnClear(value: () => Unit): Self = this.set("onClear", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClear: Self = this.set("onClear", js.undefined)
    
    @scala.inline
    def setOnRawDeselect(
      value: (/* value */ RawValueType, /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ /* option */ js.Any, /* source */ SelectSource) => Unit
    ): Self = this.set("onRawDeselect", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnRawDeselect: Self = this.set("onRawDeselect", js.undefined)
    
    @scala.inline
    def setOnRawSelect(
      value: (/* value */ RawValueType, /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ /* option */ js.Any, /* source */ SelectSource) => Unit
    ): Self = this.set("onRawSelect", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnRawSelect: Self = this.set("onRawSelect", js.undefined)
    
    @scala.inline
    def setSkipTriggerChange(value: Boolean): Self = this.set("skipTriggerChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipTriggerChange: Self = this.set("skipTriggerChange", js.undefined)
    
    @scala.inline
    def setSkipTriggerSelect(value: Boolean): Self = this.set("skipTriggerSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipTriggerSelect: Self = this.set("skipTriggerSelect", js.undefined)
  }
}
