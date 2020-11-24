package typings.reactOnsenui.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  onCancel :(): void | undefined,   isOpen :boolean | undefined,   isCancelable :boolean | undefined,   isDisabled :boolean | undefined,   animation :string | undefined,   modifier :string | undefined,   maskColor :string | undefined,   animationOptions :{} | undefined,   title :string | undefined,   onPreShow :(): void | undefined,   onPostShow :(): void | undefined,   onPreHide :(): void | undefined,   onPostHide :(): void | undefined,   onDeviceBackButton :(): void | undefined} */
@js.native
trait HTMLAttributesidclassNameIsDisabled extends js.Object {
  
  var animation: js.UndefOr[String] = js.native
  
  var animationOptions: js.UndefOr[js.Object] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var isCancelable: js.UndefOr[Boolean] = js.native
  
  var isDisabled: js.UndefOr[Boolean] = js.native
  
  var isOpen: js.UndefOr[Boolean] = js.native
  
  var maskColor: js.UndefOr[String] = js.native
  
  var modifier: js.UndefOr[String] = js.native
  
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onDeviceBackButton: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPostHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPostShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPreHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPreShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object HTMLAttributesidclassNameIsDisabled {
  
  @scala.inline
  def apply(): HTMLAttributesidclassNameIsDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributesidclassNameIsDisabled]
  }
  
  @scala.inline
  implicit class HTMLAttributesidclassNameIsDisabledOps[Self <: HTMLAttributesidclassNameIsDisabled] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAnimationOptions(value: js.Object): Self = this.set("animationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationOptions: Self = this.set("animationOptions", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsCancelable(value: Boolean): Self = this.set("isCancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCancelable: Self = this.set("isCancelable", js.undefined)
    
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setMaskColor(value: String): Self = this.set("maskColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskColor: Self = this.set("maskColor", js.undefined)
    
    @scala.inline
    def setModifier(value: String): Self = this.set("modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifier: Self = this.set("modifier", js.undefined)
    
    @scala.inline
    def setOnCancel(value: () => Unit): Self = this.set("onCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    
    @scala.inline
    def setOnDeviceBackButton(value: () => Unit): Self = this.set("onDeviceBackButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDeviceBackButton: Self = this.set("onDeviceBackButton", js.undefined)
    
    @scala.inline
    def setOnPostHide(value: () => Unit): Self = this.set("onPostHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPostHide: Self = this.set("onPostHide", js.undefined)
    
    @scala.inline
    def setOnPostShow(value: () => Unit): Self = this.set("onPostShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPostShow: Self = this.set("onPostShow", js.undefined)
    
    @scala.inline
    def setOnPreHide(value: () => Unit): Self = this.set("onPreHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPreHide: Self = this.set("onPreHide", js.undefined)
    
    @scala.inline
    def setOnPreShow(value: () => Unit): Self = this.set("onPreShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPreShow: Self = this.set("onPreShow", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
