package typings.reactToastify

import typings.react.mod.CSSProperties
import typings.react.mod.JSX.Element
import typings.reactToastify.anon.DefaultClassName
import typings.reactToastify.distTypesMod.Theme
import typings.reactToastify.distTypesMod.ToastClassName
import typings.reactToastify.distTypesMod.TypeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsProgressBarMod {
  
  @JSImport("react-toastify/dist/components/ProgressBar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ProgressBar(param0: ProgressBarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ProgressBar")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ProgressBarProps extends StObject {
    
    /**
      * Optionnal className
      */
    var className: js.UndefOr[ToastClassName] = js.undefined
    
    /**
      * Func to close the current toast
      */
    def closeToast(): Unit
    
    /**
      * Tell wether or not controlled progress bar is used
      */
    var controlledProgress: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The animation delay which determine when to close the toast
      */
    var delay: Double
    
    /**
      * Hide or not the progress bar
      */
    var hide: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Tell if the component is visible on screen or not
      */
    var isIn: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the animation is running or paused
      */
    var isRunning: Boolean
    
    /**
      * Controlled progress value
      */
    var progress: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Support rtl content
      */
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optionnal inline style
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * The theme that is currently used
      */
    var theme: Theme
    
    /**
      * Optional type : info, success ...
      */
    var `type`: js.UndefOr[TypeOptions] = js.undefined
  }
  object ProgressBarProps {
    
    inline def apply(closeToast: () => Unit, delay: Double, isRunning: Boolean, theme: Theme): ProgressBarProps = {
      val __obj = js.Dynamic.literal(closeToast = js.Any.fromFunction0(closeToast), delay = delay.asInstanceOf[js.Any], isRunning = isRunning.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressBarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProgressBarProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: ToastClassName): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameFunction1(value: /* context */ js.UndefOr[DefaultClassName] => String): Self = StObject.set(x, "className", js.Any.fromFunction1(value))
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCloseToast(value: () => Unit): Self = StObject.set(x, "closeToast", js.Any.fromFunction0(value))
      
      inline def setControlledProgress(value: Boolean): Self = StObject.set(x, "controlledProgress", value.asInstanceOf[js.Any])
      
      inline def setControlledProgressUndefined: Self = StObject.set(x, "controlledProgress", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setIsIn(value: Boolean): Self = StObject.set(x, "isIn", value.asInstanceOf[js.Any])
      
      inline def setIsInUndefined: Self = StObject.set(x, "isIn", js.undefined)
      
      inline def setIsRunning(value: Boolean): Self = StObject.set(x, "isRunning", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Double | String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setType(value: TypeOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
