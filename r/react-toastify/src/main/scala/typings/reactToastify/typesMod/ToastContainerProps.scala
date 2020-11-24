package typings.reactToastify.typesMod

import typings.react.mod.CSSProperties
import typings.reactToastify.anon.DefaultClassName
import typings.reactToastify.anon.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastContainerProps extends CommonOptions {
  
  /**
    * An optional css class to set.
    */
  var className: js.UndefOr[ClassName] = js.native
  
  /**
    * Show the toast only if it includes containerId and it's the same as containerId
    * `Default: false`
    */
  var enableMultiContainer: js.UndefOr[Boolean] = js.native
  
  /**
    * Limit the number of toast displayed at the same time
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * Whether or not to display the newest toast on top.
    * `Default: false`
    */
  var newestOnTop: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional inline style to apply.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  
  /**
    * An optional css class for the toast.
    */
  var toastClassName: js.UndefOr[ToastClassName] = js.native
  
  /**
    * An optional inline style to apply for the toast.
    */
  var toastStyle: js.UndefOr[CSSProperties] = js.native
}
object ToastContainerProps {
  
  @scala.inline
  def apply(): ToastContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastContainerProps]
  }
  
  @scala.inline
  implicit class ToastContainerPropsOps[Self <: ToastContainerProps] (val x: Self) extends AnyVal {
    
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
    def setClassNameFunction1(value: /* context */ js.UndefOr[DefaultClassName] => String): Self = this.set("className", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClassName(value: ClassName): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setEnableMultiContainer(value: Boolean): Self = this.set("enableMultiContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMultiContainer: Self = this.set("enableMultiContainer", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setNewestOnTop(value: Boolean): Self = this.set("newestOnTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewestOnTop: Self = this.set("newestOnTop", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setToastClassNameFunction1(value: /* context */ js.UndefOr[Position] => String): Self = this.set("toastClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToastClassName(value: ToastClassName): Self = this.set("toastClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToastClassName: Self = this.set("toastClassName", js.undefined)
    
    @scala.inline
    def setToastStyle(value: CSSProperties): Self = this.set("toastStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToastStyle: Self = this.set("toastStyle", js.undefined)
  }
}
