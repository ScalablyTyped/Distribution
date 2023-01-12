package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.mod.ReactToolbox.Props
import typings.reactToolbox.reactToolboxStrings.circular
import typings.reactToolbox.reactToolboxStrings.determinate
import typings.reactToolbox.reactToolboxStrings.indeterminate
import typings.reactToolbox.reactToolboxStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsProgressBarProgressBarMod {
  
  @JSImport("react-toolbox/components/progress_bar/ProgressBar", JSImport.Default)
  @js.native
  open class default protected () extends ProgressBar {
    def this(props: ProgressBarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ProgressBarProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/progress_bar/ProgressBar", "ProgressBar")
  @js.native
  open class ProgressBar protected ()
    extends Component[ProgressBarProps, js.Object, Any] {
    def this(props: ProgressBarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ProgressBarProps, context: Any) = this()
  }
  
  trait ProgressBarProps
    extends StObject
       with Props {
    
    /**
      * Value of a secondary progress bar useful for buffering.
      * @default 0
      */
    var buffer: js.UndefOr[Double] = js.undefined
    
    /**
      * If true, component will be disabled.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum value permitted.
      * @default 100
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum value permitted.
      * @default 0
      */
    var min: js.UndefOr[Double] = js.undefined
    
    /**
      * Mode of the progress bar, it can be determinate or indeterminate.
      * @default indeterminate
      */
    var mode: js.UndefOr[determinate | indeterminate] = js.undefined
    
    /**
      * If true, the circular progress bar will be changing its color.
      * @default false
      */
    var multicolor: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[ProgressBarTheme] = js.undefined
    
    /**
      * Type of the progress bar, it can be circular or linear.
      * @default linear
      */
    var `type`: js.UndefOr[linear | circular] = js.undefined
    
    /**
      * Value of the current progress.
      * @default 0
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object ProgressBarProps {
    
    inline def apply(): ProgressBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressBarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProgressBarProps] (val x: Self) extends AnyVal {
      
      inline def setBuffer(value: Double): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMode(value: determinate | indeterminate): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMulticolor(value: Boolean): Self = StObject.set(x, "multicolor", value.asInstanceOf[js.Any])
      
      inline def setMulticolorUndefined: Self = StObject.set(x, "multicolor", js.undefined)
      
      inline def setTheme(value: ProgressBarTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: linear | circular): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ProgressBarTheme extends StObject {
    
    /**
      * Used to style the buffer element in the linear progress.
      */
    var buffer: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the circle element in the circular progress.
      */
    var circle: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the root element when the type is circular.
      */
    var circular: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root element if mode is indeterminate.
      */
    var indeterminate: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the root element when the type is linear.
      */
    var linear: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root if the component is multicolor (circular).
      */
    var multicolor: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the inner path in the circular progress.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Used to style the value element in the linear progress.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object ProgressBarTheme {
    
    inline def apply(): ProgressBarTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressBarTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProgressBarTheme] (val x: Self) extends AnyVal {
      
      inline def setBuffer(value: String): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setCircle(value: String): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      inline def setCircular(value: String): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      inline def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
      
      inline def setIndeterminate(value: String): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      inline def setLinear(value: String): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
      
      inline def setLinearUndefined: Self = StObject.set(x, "linear", js.undefined)
      
      inline def setMulticolor(value: String): Self = StObject.set(x, "multicolor", value.asInstanceOf[js.Any])
      
      inline def setMulticolorUndefined: Self = StObject.set(x, "multicolor", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
