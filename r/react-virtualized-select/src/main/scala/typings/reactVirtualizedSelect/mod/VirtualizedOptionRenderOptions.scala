package typings.reactVirtualizedSelect.mod

import typings.reactVirtualized.esListMod.ListProps
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualizedOptionRenderOptions[T] extends js.Object {
  
  def focusOption(option: T): Unit = js.native
  
  var focusedOption: T = js.native
  
  var focusedOptionIndex: Double = js.native
  
  var key: String = js.native
  
  var labelKey: /* keyof T */ String = js.native
  
  var listProps: ListProps = js.native
  
  var option: T = js.native
  
  var options: js.Array[T] = js.native
  
  def selectValue(option: T): Unit = js.native
  
  var style: Record[String, String] = js.native
  
  var valueArray: js.Array[T] = js.native
}
object VirtualizedOptionRenderOptions {
  
  @scala.inline
  def apply[T](
    focusOption: T => Unit,
    focusedOption: T,
    focusedOptionIndex: Double,
    key: String,
    labelKey: /* keyof T */ String,
    listProps: ListProps,
    option: T,
    options: js.Array[T],
    selectValue: T => Unit,
    style: Record[String, String],
    valueArray: js.Array[T]
  ): VirtualizedOptionRenderOptions[T] = {
    val __obj = js.Dynamic.literal(focusOption = js.Any.fromFunction1(focusOption), focusedOption = focusedOption.asInstanceOf[js.Any], focusedOptionIndex = focusedOptionIndex.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], labelKey = labelKey.asInstanceOf[js.Any], listProps = listProps.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectValue = js.Any.fromFunction1(selectValue), style = style.asInstanceOf[js.Any], valueArray = valueArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualizedOptionRenderOptions[T]]
  }
  
  @scala.inline
  implicit class VirtualizedOptionRenderOptionsOps[Self <: VirtualizedOptionRenderOptions[_], T] (val x: Self with VirtualizedOptionRenderOptions[T]) extends AnyVal {
    
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
    def setFocusOption(value: T => Unit): Self = this.set("focusOption", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFocusedOption(value: T): Self = this.set("focusedOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusedOptionIndex(value: Double): Self = this.set("focusedOptionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelKey(value: /* keyof T */ String): Self = this.set("labelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListProps(value: ListProps): Self = this.set("listProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOption(value: T): Self = this.set("option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: T*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[T]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectValue(value: T => Unit): Self = this.set("selectValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyle(value: Record[String, String]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueArrayVarargs(value: T*): Self = this.set("valueArray", js.Array(value :_*))
    
    @scala.inline
    def setValueArray(value: js.Array[T]): Self = this.set("valueArray", value.asInstanceOf[js.Any])
  }
}
