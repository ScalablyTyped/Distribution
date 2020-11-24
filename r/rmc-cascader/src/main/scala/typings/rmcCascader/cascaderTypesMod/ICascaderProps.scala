package typings.rmcCascader.cascaderTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICascaderProps extends js.Object {
  
  /** web only */
  var className: js.UndefOr[String] = js.native
  
  var cols: js.UndefOr[Double] = js.native
  
  var data: js.Array[ICascaderDataItem] = js.native
  
  var defaultValue: js.UndefOr[CascaderValue] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var indicatorStyle: js.UndefOr[js.Object] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* value */ CascaderValue, Unit]] = js.native
  
  /** web only */
  var onScrollChange: js.UndefOr[js.Function1[/* value */ CascaderValue, Unit]] = js.native
  
  var pickerItemStyle: js.UndefOr[js.Object] = js.native
  
  /** web only */
  var pickerPrefixCls: js.UndefOr[String] = js.native
  
  /** web only */
  var prefixCls: js.UndefOr[String] = js.native
  
  var rootNativeProps: js.UndefOr[js.Object] = js.native
  
  var style: js.UndefOr[js.Any] = js.native
  
  var value: js.UndefOr[CascaderValue] = js.native
}
object ICascaderProps {
  
  @scala.inline
  def apply(data: js.Array[ICascaderDataItem]): ICascaderProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICascaderProps]
  }
  
  @scala.inline
  implicit class ICascaderPropsOps[Self <: ICascaderProps] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: ICascaderDataItem*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[ICascaderDataItem]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    
    @scala.inline
    def setDefaultValueVarargs(value: CascaderOneValue*): Self = this.set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setDefaultValue(value: CascaderValue): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setIndicatorStyle(value: js.Object): Self = this.set("indicatorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorStyle: Self = this.set("indicatorStyle", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ CascaderValue => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnScrollChange(value: /* value */ CascaderValue => Unit): Self = this.set("onScrollChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScrollChange: Self = this.set("onScrollChange", js.undefined)
    
    @scala.inline
    def setPickerItemStyle(value: js.Object): Self = this.set("pickerItemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickerItemStyle: Self = this.set("pickerItemStyle", js.undefined)
    
    @scala.inline
    def setPickerPrefixCls(value: String): Self = this.set("pickerPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickerPrefixCls: Self = this.set("pickerPrefixCls", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setRootNativeProps(value: js.Object): Self = this.set("rootNativeProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootNativeProps: Self = this.set("rootNativeProps", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: CascaderOneValue*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: CascaderValue): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
