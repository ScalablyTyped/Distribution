package typings.reactNativeLinearGradient

import typings.react.mod.Component
import typings.reactNative.mod.ViewProps
import typings.reactNativeLinearGradient.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-linear-gradient", JSImport.Default)
  @js.native
  open class default protected () extends LinearGradient {
    def this(props: LinearGradientProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LinearGradientProps, context: Any) = this()
  }
  
  @JSImport("react-native-linear-gradient", "LinearGradient")
  @js.native
  open class LinearGradient protected ()
    extends Component[LinearGradientProps, js.Object, Any] {
    def this(props: LinearGradientProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LinearGradientProps, context: Any) = this()
  }
  
  trait LinearGradientProps
    extends StObject
       with ViewProps {
    
    var angle: js.UndefOr[Double] = js.undefined
    
    var angleCenter: js.UndefOr[X] = js.undefined
    
    var colors: js.Array[String | Double]
    
    var end: js.UndefOr[X] = js.undefined
    
    var locations: js.UndefOr[js.Array[Double]] = js.undefined
    
    var start: js.UndefOr[X] = js.undefined
    
    var useAngle: js.UndefOr[Boolean] = js.undefined
  }
  object LinearGradientProps {
    
    inline def apply(colors: js.Array[String | Double]): LinearGradientProps = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinearGradientProps]
    }
    
    extension [Self <: LinearGradientProps](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleCenter(value: X): Self = StObject.set(x, "angleCenter", value.asInstanceOf[js.Any])
      
      inline def setAngleCenterUndefined: Self = StObject.set(x, "angleCenter", js.undefined)
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setColors(value: js.Array[String | Double]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsVarargs(value: (String | Double)*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setEnd(value: X): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setLocations(value: js.Array[Double]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
      
      inline def setLocationsVarargs(value: Double*): Self = StObject.set(x, "locations", js.Array(value*))
      
      inline def setStart(value: X): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setUseAngle(value: Boolean): Self = StObject.set(x, "useAngle", value.asInstanceOf[js.Any])
      
      inline def setUseAngleUndefined: Self = StObject.set(x, "useAngle", js.undefined)
    }
  }
}
