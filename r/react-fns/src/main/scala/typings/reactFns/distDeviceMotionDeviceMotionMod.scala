package typings.reactFns

import typings.react.mod.Component
import typings.reactFns.distTypesMod.SharedRenderProps
import typings.std.DeviceMotionEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeviceMotionDeviceMotionMod {
  
  @JSImport("react-fns/dist/DeviceMotion/DeviceMotion", "DeviceMotion")
  @js.native
  open class DeviceMotion protected () extends Component[SharedRenderProps[DeviceMotionProps], DeviceMotionProps, Any] {
    def this(props: SharedRenderProps[DeviceMotionProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[DeviceMotionProps], context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MDeviceMotion(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDeviceMotion(): Unit = js.native
    
    def handleDeviceMotion(e: DeviceMotionEvent): Unit = js.native
  }
  
  trait DeviceMotionProps extends StObject {
    
    var acceleration: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeviceAcceleration */ Any) | Null
    
    var accelerationIncludingGravity: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeviceAcceleration */ Any) | Null
    
    var interval: Double | Null
    
    var rotationRate: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeviceRotationRate */ Any) | Null
  }
  object DeviceMotionProps {
    
    inline def apply(): DeviceMotionProps = {
      val __obj = js.Dynamic.literal(acceleration = null, accelerationIncludingGravity = null, interval = null, rotationRate = null)
      __obj.asInstanceOf[DeviceMotionProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeviceMotionProps] (val x: Self) extends AnyVal {
      
      inline def setAcceleration(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeviceAcceleration */ Any
      ): Self = StObject.set(x, "acceleration", value.asInstanceOf[js.Any])
      
      inline def setAccelerationIncludingGravity(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeviceAcceleration */ Any
      ): Self = StObject.set(x, "accelerationIncludingGravity", value.asInstanceOf[js.Any])
      
      inline def setAccelerationIncludingGravityNull: Self = StObject.set(x, "accelerationIncludingGravity", null)
      
      inline def setAccelerationNull: Self = StObject.set(x, "acceleration", null)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalNull: Self = StObject.set(x, "interval", null)
      
      inline def setRotationRate(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeviceRotationRate */ Any
      ): Self = StObject.set(x, "rotationRate", value.asInstanceOf[js.Any])
      
      inline def setRotationRateNull: Self = StObject.set(x, "rotationRate", null)
    }
  }
}
