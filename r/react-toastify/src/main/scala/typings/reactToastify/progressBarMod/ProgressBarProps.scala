package typings.reactToastify.progressBarMod

import typings.react.mod.CSSProperties
import typings.reactToastify.anon.Position
import typings.reactToastify.typesMod.ToastClassName
import typings.reactToastify.typesMod.TypeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressBarProps extends js.Object {
  
  /**
    * Optionnal className
    */
  var className: js.UndefOr[ToastClassName] = js.native
  
  /**
    * Func to close the current toast
    */
  def closeToast(): Unit = js.native
  
  /**
    * Tell wether or not controlled progress bar is used
    */
  var controlledProgress: js.UndefOr[Boolean] = js.native
  
  /**
    * The animation delay which determine when to close the toast
    */
  var delay: Double = js.native
  
  /**
    * Hide or not the progress bar
    */
  var hide: js.UndefOr[Boolean] = js.native
  
  /**
    * Tell if the component is visible on screen or not
    */
  var isIn: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not the animation is running or paused
    */
  var isRunning: Boolean = js.native
  
  /**
    * Controlled progress value
    */
  var progress: js.UndefOr[Double | String] = js.native
  
  /**
    * Support rtl content
    */
  var rtl: js.UndefOr[Boolean] = js.native
  
  /**
    * Optionnal inline style
    */
  var style: js.UndefOr[CSSProperties] = js.native
  
  /**
    * Optional type : info, success ...
    */
  var `type`: TypeOptions = js.native
}
object ProgressBarProps {
  
  @scala.inline
  def apply(closeToast: () => Unit, delay: Double, isRunning: Boolean, `type`: TypeOptions): ProgressBarProps = {
    val __obj = js.Dynamic.literal(closeToast = js.Any.fromFunction0(closeToast), delay = delay.asInstanceOf[js.Any], isRunning = isRunning.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarProps]
  }
  
  @scala.inline
  implicit class ProgressBarPropsOps[Self <: ProgressBarProps] (val x: Self) extends AnyVal {
    
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
    def setCloseToast(value: () => Unit): Self = this.set("closeToast", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRunning(value: Boolean): Self = this.set("isRunning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TypeOptions): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameFunction1(value: /* context */ js.UndefOr[Position] => String): Self = this.set("className", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClassName(value: ToastClassName): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setControlledProgress(value: Boolean): Self = this.set("controlledProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlledProgress: Self = this.set("controlledProgress", js.undefined)
    
    @scala.inline
    def setHide(value: Boolean): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setIsIn(value: Boolean): Self = this.set("isIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIn: Self = this.set("isIn", js.undefined)
    
    @scala.inline
    def setProgress(value: Double | String): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
