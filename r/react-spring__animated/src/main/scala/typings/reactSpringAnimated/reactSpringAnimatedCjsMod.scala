package typings.reactSpringAnimated

import org.scalablytyped.runtime.StringDictionary
import typings.reactSpringAnimated.animatedArrayMod.Value
import typings.reactSpringAnimated.anon.PartialHostConfig
import typings.reactSpringAnimated.typesMod.AnimatedType
import typings.reactSpringAnimated.withAnimatedMod.AnimatableComponent
import typings.reactSpringTypes.utilMod.Lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactSpringAnimatedCjsMod {
  
  @JSImport("@react-spring/animated/dist/react-spring-animated.cjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-spring/animated/dist/react-spring-animated.cjs", "Animated")
  @js.native
  abstract class Animated[T] ()
    extends typings.reactSpringAnimated.mod.Animated[T]
  
  @JSImport("@react-spring/animated/dist/react-spring-animated.cjs", "AnimatedArray")
  @js.native
  open class AnimatedArray[T /* <: js.Array[Value] */] protected ()
    extends typings.reactSpringAnimated.mod.AnimatedArray[T] {
    def this(source: T) = this()
  }
  /* static members */
  object AnimatedArray {
    
    @JSImport("@react-spring/animated/dist/react-spring-animated.cjs", "AnimatedArray")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def create[T /* <: js.Array[Value] */](source: T): typings.reactSpringAnimated.animatedArrayMod.AnimatedArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any]).asInstanceOf[typings.reactSpringAnimated.animatedArrayMod.AnimatedArray[T]]
  }
  
  @JSImport("@react-spring/animated/dist/react-spring-animated.cjs", "AnimatedObject")
  @js.native
  open class AnimatedObject protected ()
    extends typings.reactSpringAnimated.mod.AnimatedObject {
    def this(source: Lookup[Any]) = this()
  }
  
  @JSImport("@react-spring/animated/dist/react-spring-animated.cjs", "AnimatedString")
  @js.native
  open class AnimatedString protected ()
    extends typings.reactSpringAnimated.mod.AnimatedString {
    def this(value: String) = this()
  }
  /* static members */
  object AnimatedString {
    
    @JSImport("@react-spring/animated/dist/react-spring-animated.cjs", "AnimatedString")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def create(value: String): typings.reactSpringAnimated.animatedStringMod.AnimatedString = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[typings.reactSpringAnimated.animatedStringMod.AnimatedString]
  }
  
  @JSImport("@react-spring/animated/dist/react-spring-animated.cjs", "AnimatedValue")
  @js.native
  open class AnimatedValue[T] protected ()
    extends typings.reactSpringAnimated.mod.AnimatedValue[T] {
    def this(_value: T) = this()
  }
  /* static members */
  object AnimatedValue {
    
    @JSImport("@react-spring/animated/dist/react-spring-animated.cjs", "AnimatedValue")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def create(value: Any): typings.reactSpringAnimated.animatedValueMod.AnimatedValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[typings.reactSpringAnimated.animatedValueMod.AnimatedValue[Any]]
  }
  
  inline def createHost(components: js.Array[AnimatableComponent]): typings.reactSpringAnimated.anon.Animated = ^.asInstanceOf[js.Dynamic].applyDynamic("createHost")(components.asInstanceOf[js.Any]).asInstanceOf[typings.reactSpringAnimated.anon.Animated]
  inline def createHost(
    components: js.Array[AnimatableComponent],
    hasApplyAnimatedValuesCreateAnimatedStyleGetComponentProps: PartialHostConfig
  ): typings.reactSpringAnimated.anon.Animated = (^.asInstanceOf[js.Dynamic].applyDynamic("createHost")(components.asInstanceOf[js.Any], hasApplyAnimatedValuesCreateAnimatedStyleGetComponentProps.asInstanceOf[js.Any])).asInstanceOf[typings.reactSpringAnimated.anon.Animated]
  inline def createHost(components: StringDictionary[AnimatableComponent]): typings.reactSpringAnimated.anon.Animated = ^.asInstanceOf[js.Dynamic].applyDynamic("createHost")(components.asInstanceOf[js.Any]).asInstanceOf[typings.reactSpringAnimated.anon.Animated]
  inline def createHost(
    components: StringDictionary[AnimatableComponent],
    hasApplyAnimatedValuesCreateAnimatedStyleGetComponentProps: PartialHostConfig
  ): typings.reactSpringAnimated.anon.Animated = (^.asInstanceOf[js.Dynamic].applyDynamic("createHost")(components.asInstanceOf[js.Any], hasApplyAnimatedValuesCreateAnimatedStyleGetComponentProps.asInstanceOf[js.Any])).asInstanceOf[typings.reactSpringAnimated.anon.Animated]
  
  inline def getAnimated[T](owner: Any): js.UndefOr[typings.reactSpringAnimated.animatedMod.Animated[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimated")(owner.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.reactSpringAnimated.animatedMod.Animated[T]]]
  
  inline def getAnimatedType(value: Any): AnimatedType[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimatedType")(value.asInstanceOf[js.Any]).asInstanceOf[AnimatedType[Any]]
  
  inline def getPayload(owner: Any): js.UndefOr[js.Array[typings.reactSpringAnimated.animatedValueMod.AnimatedValue[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPayload")(owner.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[typings.reactSpringAnimated.animatedValueMod.AnimatedValue[Any]]]]
  
  inline def isAnimated[T](value: Any): /* is @react-spring/animated.@react-spring/animated/dist/declarations/src/Animated.Animated<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnimated")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @react-spring/animated.@react-spring/animated/dist/declarations/src/Animated.Animated<T> */ Boolean]
  
  inline def setAnimated(owner: Any, node: typings.reactSpringAnimated.animatedMod.Animated[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setAnimated")(owner.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Any]
}
