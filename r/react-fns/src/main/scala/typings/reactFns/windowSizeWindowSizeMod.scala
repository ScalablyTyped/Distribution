package typings.reactFns

import typings.react.mod.Component
import typings.reactFns.anon.PartialWindowSizeConfig
import typings.reactFns.typesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowSizeWindowSizeMod {
  
  @JSImport("react-fns/dist/WindowSize/WindowSize", "WindowSize")
  @js.native
  class WindowSize protected ()
    extends Component[WindowSizeConfig & SharedRenderProps[WindowSizeProps], WindowSizeProps, js.Any] {
    def this(props: WindowSizeConfig & SharedRenderProps[WindowSizeProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: WindowSizeConfig & SharedRenderProps[WindowSizeProps], context: js.Any) = this()
    
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
    inline def defaultProps_=(x: PartialWindowSizeConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait WindowSizeConfig extends StObject {
    
    var throttle: js.UndefOr[Double] = js.undefined
  }
  object WindowSizeConfig {
    
    inline def apply(): WindowSizeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WindowSizeConfig]
    }
    
    extension [Self <: WindowSizeConfig](x: Self) {
      
      inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    }
  }
  
  trait WindowSizeProps extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object WindowSizeProps {
    
    inline def apply(height: Double, width: Double): WindowSizeProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowSizeProps]
    }
    
    extension [Self <: WindowSizeProps](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
