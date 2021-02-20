package typings.reactToastify

import typings.react.mod.CSSProperties
import typings.react.mod.global.JSX.Element
import typings.reactToastify.anon.Position
import typings.reactToastify.typesMod.ToastClassName
import typings.reactToastify.typesMod.TypeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressBarMod {
  
  object ProgressBar {
    
    @JSImport("react-toastify/dist/components/ProgressBar", "ProgressBar")
    @js.native
    def apply(
      hasDelayIsRunningCloseToastTypeHideClassNameStyleControlledProgressProgressRtlIsIn: ProgressBarProps
    ): Element = js.native
    
    object defaultProps {
      
      @JSImport("react-toastify/dist/components/ProgressBar", "ProgressBar.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-toastify/dist/components/ProgressBar", "ProgressBar.defaultProps.hide")
      @js.native
      def hide: Boolean = js.native
      @scala.inline
      def hide_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hide")(x.asInstanceOf[js.Any])
      
      @JSImport("react-toastify/dist/components/ProgressBar", "ProgressBar.defaultProps.type")
      @js.native
      val `type`: TypeOptions = js.native
    }
  }
  
  @js.native
  trait ProgressBarProps extends StObject {
    
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
    implicit class ProgressBarPropsMutableBuilder[Self <: ProgressBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: ToastClassName): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameFunction1(value: /* context */ js.UndefOr[Position] => String): Self = StObject.set(x, "className", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCloseToast(value: () => Unit): Self = StObject.set(x, "closeToast", js.Any.fromFunction0(value))
      
      @scala.inline
      def setControlledProgress(value: Boolean): Self = StObject.set(x, "controlledProgress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlledProgressUndefined: Self = StObject.set(x, "controlledProgress", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setIsIn(value: Boolean): Self = StObject.set(x, "isIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInUndefined: Self = StObject.set(x, "isIn", js.undefined)
      
      @scala.inline
      def setIsRunning(value: Boolean): Self = StObject.set(x, "isRunning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: Double | String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: TypeOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
