package typings.reactSpringAnimated

import typings.reactSpringAnimated.distDeclarationsSrcAnimatedValueMod.AnimatedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAnimatedMod {
  
  @JSImport("@react-spring/animated/dist/declarations/src/Animated", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@react-spring/animated/dist/declarations/src/Animated", "Animated")
  @js.native
  open class Animated[T] () extends StObject {
    
    /** Get every `AnimatedValue` used by this node. */
    def getPayload(): Payload = js.native
    
    /** Get the current value. Pass `true` for only animated values. */
    def getValue(): T = js.native
    def getValue(animated: Boolean): T = js.native
    
    /** The cache of animated values */
    /* protected */ var payload: js.UndefOr[Payload] = js.native
    
    /** Reset any animation state. */
    def reset(): Unit = js.native
    def reset(goal: T): Unit = js.native
    
    /** Set the current value. Returns `true` if the value changed. */
    def setValue(value: T): Boolean | Unit = js.native
  }
  
  inline def getAnimated[T](owner: Any): js.UndefOr[Animated[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimated")(owner.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Animated[T]]]
  
  inline def getPayload(owner: Any): js.UndefOr[js.Array[AnimatedValue[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPayload")(owner.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[AnimatedValue[Any]]]]
  
  inline def isAnimated[T](value: Any): /* is @react-spring/animated.@react-spring/animated/dist/declarations/src/Animated.Animated<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnimated")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @react-spring/animated.@react-spring/animated/dist/declarations/src/Animated.Animated<T> */ Boolean]
  
  inline def setAnimated(owner: Any, node: Animated[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setAnimated")(owner.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  type Payload = js.Array[AnimatedValue[Any]]
}
