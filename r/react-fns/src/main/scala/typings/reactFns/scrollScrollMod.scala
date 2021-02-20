package typings.reactFns

import typings.react.mod.Component
import typings.reactFns.anon.PartialScrollConfig
import typings.reactFns.typesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollScrollMod {
  
  @JSImport("react-fns/dist/Scroll/Scroll", "Scroll")
  @js.native
  class Scroll protected ()
    extends Component[ScrollConfig with SharedRenderProps[ScrollProps], ScrollProps, js.Any] {
    def this(props: ScrollConfig with SharedRenderProps[ScrollProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollConfig with SharedRenderProps[ScrollProps], context: js.Any) = this()
    
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
    @scala.inline
    def defaultProps_=(x: PartialScrollConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ScrollConfig extends StObject {
    
    var throttle: js.UndefOr[Double] = js.native
  }
  object ScrollConfig {
    
    @scala.inline
    def apply(): ScrollConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollConfig]
    }
    
    @scala.inline
    implicit class ScrollConfigMutableBuilder[Self <: ScrollConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    }
  }
  
  @js.native
  trait ScrollProps extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object ScrollProps {
    
    @scala.inline
    def apply(x: Double, y: Double): ScrollProps = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollProps]
    }
    
    @scala.inline
    implicit class ScrollPropsMutableBuilder[Self <: ScrollProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
