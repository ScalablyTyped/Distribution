package typings.rmcPicker.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  children :react.react.ReactNode | undefined}> & std.Readonly<rmc-picker.rmc-picker/lib/MultiPickerProps.default> */
@js.native
trait ReadonlychildrenReactNode extends js.Object {
  
  val children: js.UndefOr[ReactNode] with js.UndefOr[js.Any] = js.native
  
  val className: js.UndefOr[String] = js.native
  
  val onScrollChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], Unit]] = js.native
  
  val onValueChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], Unit]] = js.native
  
  val prefixCls: js.UndefOr[String] = js.native
  
  val rootNativeProps: js.UndefOr[js.Any] = js.native
  
  val selectedValue: js.UndefOr[js.Array[_]] = js.native
  
  val style: js.UndefOr[js.Any] = js.native
}
object ReadonlychildrenReactNode {
  
  @scala.inline
  def apply(children: js.UndefOr[ReactNode] with js.UndefOr[js.Any]): ReadonlychildrenReactNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlychildrenReactNode]
  }
  
  @scala.inline
  implicit class ReadonlychildrenReactNodeOps[Self <: ReadonlychildrenReactNode] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: js.UndefOr[ReactNode] with js.UndefOr[js.Any]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setOnScrollChange(value: (/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double]) => Unit): Self = this.set("onScrollChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnScrollChange: Self = this.set("onScrollChange", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: (/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double]) => Unit): Self = this.set("onValueChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setRootNativeProps(value: js.Any): Self = this.set("rootNativeProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootNativeProps: Self = this.set("rootNativeProps", js.undefined)
    
    @scala.inline
    def setSelectedValueVarargs(value: js.Any*): Self = this.set("selectedValue", js.Array(value :_*))
    
    @scala.inline
    def setSelectedValue(value: js.Array[_]): Self = this.set("selectedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedValue: Self = this.set("selectedValue", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
