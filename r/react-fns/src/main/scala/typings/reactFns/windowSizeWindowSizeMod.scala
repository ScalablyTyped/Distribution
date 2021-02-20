package typings.reactFns

import typings.react.mod.Component
import typings.reactFns.anon.PartialWindowSizeConfig
import typings.reactFns.typesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowSizeWindowSizeMod {
  
  @JSImport("react-fns/dist/WindowSize/WindowSize", "WindowSize")
  @js.native
  class WindowSize protected ()
    extends Component[WindowSizeConfig with SharedRenderProps[WindowSizeProps], WindowSizeProps, js.Any] {
    def this(props: WindowSizeConfig with SharedRenderProps[WindowSizeProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: WindowSizeConfig with SharedRenderProps[WindowSizeProps], context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MWindowSize(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MWindowSize(): Unit = js.native
    
    def handleWindowSize(): Unit = js.native
  }
  /* static members */
  object WindowSize {
    
    @JSImport("react-fns/dist/WindowSize/WindowSize", "WindowSize")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-fns/dist/WindowSize/WindowSize", "WindowSize.defaultProps")
    @js.native
    def defaultProps: PartialWindowSizeConfig = js.native
    @scala.inline
    def defaultProps_=(x: PartialWindowSizeConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait WindowSizeConfig extends StObject {
    
    var throttle: js.UndefOr[Double] = js.native
  }
  object WindowSizeConfig {
    
    @scala.inline
    def apply(): WindowSizeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WindowSizeConfig]
    }
    
    @scala.inline
    implicit class WindowSizeConfigMutableBuilder[Self <: WindowSizeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    }
  }
  
  @js.native
  trait WindowSizeProps extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object WindowSizeProps {
    
    @scala.inline
    def apply(height: Double, width: Double): WindowSizeProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowSizeProps]
    }
    
    @scala.inline
    implicit class WindowSizePropsMutableBuilder[Self <: WindowSizeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
