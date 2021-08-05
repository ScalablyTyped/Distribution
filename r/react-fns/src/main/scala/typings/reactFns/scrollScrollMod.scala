package typings.reactFns

import typings.react.mod.Component
import typings.reactFns.anon.PartialScrollConfig
import typings.reactFns.typesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollScrollMod {
  
  @JSImport("react-fns/dist/Scroll/Scroll", "Scroll")
  @js.native
  class Scroll protected ()
    extends Component[ScrollConfig & SharedRenderProps[ScrollProps], ScrollProps, js.Any] {
    def this(props: ScrollConfig & SharedRenderProps[ScrollProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollConfig & SharedRenderProps[ScrollProps], context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MScroll(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MScroll(): Unit = js.native
    
    def handleWindowScroll(): Unit = js.native
  }
  /* static members */
  object Scroll {
    
    @JSImport("react-fns/dist/Scroll/Scroll", "Scroll")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-fns/dist/Scroll/Scroll", "Scroll.defaultProps")
    @js.native
    def defaultProps: PartialScrollConfig = js.native
    inline def defaultProps_=(x: PartialScrollConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait ScrollConfig extends StObject {
    
    var throttle: js.UndefOr[Double] = js.undefined
  }
  object ScrollConfig {
    
    inline def apply(): ScrollConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollConfig]
    }
    
    extension [Self <: ScrollConfig](x: Self) {
      
      inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    }
  }
  
  trait ScrollProps extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object ScrollProps {
    
    inline def apply(x: Double, y: Double): ScrollProps = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollProps]
    }
    
    extension [Self <: ScrollProps](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
