package typings.reactFns

import typings.react.mod.Component
import typings.reactFns.typesMod.SharedRenderProps
import typings.std.DeviceAcceleration
import typings.std.DeviceMotionEvent
import typings.std.DeviceRotationRate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceMotionDeviceMotionMod {
  
  @JSImport("react-fns/dist/DeviceMotion/DeviceMotion", "DeviceMotion")
  @js.native
  class DeviceMotion protected ()
    extends Component[SharedRenderProps[DeviceMotionProps], DeviceMotionProps, js.Any] {
    def this(props: SharedRenderProps[DeviceMotionProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[DeviceMotionProps], context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MDeviceMotion(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDeviceMotion(): Unit = js.native
    
    def handleDeviceMotion(e: DeviceMotionEvent): Unit = js.native
  }
  
  trait DeviceMotionProps extends StObject {
    
    var acceleration: DeviceAcceleration | Null
    
    var accelerationIncludingGravity: DeviceAcceleration | Null
    
    var interval: Double | Null
    
    var rotationRate: DeviceRotationRate | Null
  }
  object DeviceMotionProps {
    
    @scala.inline
    def apply(): DeviceMotionProps = {
      val __obj = js.Dynamic.literal(acceleration = null, accelerationIncludingGravity = null, interval = null, rotationRate = null)
      __obj.asInstanceOf[DeviceMotionProps]
    }
    
    @scala.inline
    implicit class DeviceMotionPropsMutableBuilder[Self <: DeviceMotionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceleration(value: DeviceAcceleration): Self = StObject.set(x, "acceleration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccelerationIncludingGravity(value: DeviceAcceleration): Self = StObject.set(x, "accelerationIncludingGravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccelerationIncludingGravityNull: Self = StObject.set(x, "accelerationIncludingGravity", null)
      
      @scala.inline
      def setAccelerationNull: Self = StObject.set(x, "acceleration", null)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalNull: Self = StObject.set(x, "interval", null)
      
      @scala.inline
      def setRotationRate(value: DeviceRotationRate): Self = StObject.set(x, "rotationRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationRateNull: Self = StObject.set(x, "rotationRate", null)
    }
  }
}
