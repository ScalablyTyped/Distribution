package typings.reactFns

import typings.react.mod.Component
import typings.reactFns.distTypesMod.SharedRenderProps
import typings.std.DeviceOrientationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeviceOrientationDeviceOrientationMod {
  
  @JSImport("react-fns/dist/DeviceOrientation/DeviceOrientation", "DeviceOrientation")
  @js.native
  open class DeviceOrientation protected () extends Component[SharedRenderProps[DeviceOrientationProps], DeviceOrientationProps, Any] {
    def this(props: SharedRenderProps[DeviceOrientationProps]) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[DeviceOrientationProps], context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MDeviceOrientation(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDeviceOrientation(): Unit = js.native
    
    def handleDeviceOrientation(e: DeviceOrientationEvent): Unit = js.native
  }
  
  trait DeviceOrientationProps extends StObject {
    
    var absolute: Boolean
    
    var alpha: Double | Null
    
    var beta: Double | Null
    
    var gamma: Double | Null
  }
  object DeviceOrientationProps {
    
    inline def apply(absolute: Boolean): DeviceOrientationProps = {
      val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], alpha = null, beta = null, gamma = null)
      __obj.asInstanceOf[DeviceOrientationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeviceOrientationProps] (val x: Self) extends AnyVal {
      
      inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaNull: Self = StObject.set(x, "alpha", null)
      
      inline def setBeta(value: Double): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
      
      inline def setBetaNull: Self = StObject.set(x, "beta", null)
      
      inline def setGamma(value: Double): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
      
      inline def setGammaNull: Self = StObject.set(x, "gamma", null)
    }
  }
}
