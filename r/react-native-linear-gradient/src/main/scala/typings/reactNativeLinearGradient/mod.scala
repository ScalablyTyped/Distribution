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
  class default protected () extends LinearGradient {
    def this(props: LinearGradientProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LinearGradientProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-linear-gradient", "LinearGradient")
  @js.native
  class LinearGradient protected ()
    extends Component[LinearGradientProps, js.Object, js.Any] {
    def this(props: LinearGradientProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LinearGradientProps, context: js.Any) = this()
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
    
    @scala.inline
    def apply(colors: js.Array[String | Double]): LinearGradientProps = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinearGradientProps]
    }
    
    @scala.inline
    implicit class LinearGradientPropsMutableBuilder[Self <: LinearGradientProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleCenter(value: X): Self = StObject.set(x, "angleCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleCenterUndefined: Self = StObject.set(x, "angleCenter", js.undefined)
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setColors(value: js.Array[String | Double]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsVarargs(value: (String | Double)*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setEnd(value: X): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setLocations(value: js.Array[Double]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
      
      @scala.inline
      def setLocationsVarargs(value: Double*): Self = StObject.set(x, "locations", js.Array(value :_*))
      
      @scala.inline
      def setStart(value: X): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setUseAngle(value: Boolean): Self = StObject.set(x, "useAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseAngleUndefined: Self = StObject.set(x, "useAngle", js.undefined)
    }
  }
}
