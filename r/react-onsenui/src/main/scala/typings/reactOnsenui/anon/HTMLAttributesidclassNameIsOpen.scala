package typings.reactOnsenui.anon

import typings.react.mod.CSSProperties
import typings.reactOnsenui.mod.AnimationOptions
import typings.reactOnsenui.reactOnsenuiStrings.fade
import typings.reactOnsenui.reactOnsenuiStrings.lift
import typings.reactOnsenui.reactOnsenuiStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  animation :'fade' | 'lift' | 'none' | undefined,   animationOptions :react-onsenui.react-onsenui.AnimationOptions | undefined,   onPreShow :(): void | undefined,   onPostShow :(): void | undefined,   onPreHide :(): void | undefined,   onPostHide :(): void | undefined,   isOpen :boolean | undefined,   onDeviceBackButton :(): void | undefined} */
@js.native
trait HTMLAttributesidclassNameIsOpen extends js.Object {
  
  var animation: js.UndefOr[fade | lift | none] = js.native
  
  var animationOptions: js.UndefOr[AnimationOptions] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var isOpen: js.UndefOr[Boolean] = js.native
  
  var onDeviceBackButton: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPostHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPostShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPreHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPreShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object HTMLAttributesidclassNameIsOpen {
  
  @scala.inline
  def apply(): HTMLAttributesidclassNameIsOpen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributesidclassNameIsOpen]
  }
  
  @scala.inline
  implicit class HTMLAttributesidclassNameIsOpenOps[Self <: HTMLAttributesidclassNameIsOpen] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: fade | lift | none): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAnimationOptions(value: AnimationOptions): Self = this.set("animationOptions", value.asInstanceOf[js.Any])
    
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
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
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
  }
}
