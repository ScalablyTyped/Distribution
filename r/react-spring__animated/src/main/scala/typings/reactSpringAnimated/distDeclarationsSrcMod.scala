package typings.reactSpringAnimated

import org.scalablytyped.runtime.StringDictionary
import typings.reactSpringAnimated.anon.PartialHostConfig
import typings.reactSpringAnimated.distDeclarationsSrcAnimatedArrayMod.Value
import typings.reactSpringAnimated.distDeclarationsSrcTypesMod.AnimatedType
import typings.reactSpringAnimated.distDeclarationsSrcWithAnimatedMod.AnimatableComponent
import typings.reactSpringTypes.utilMod.Lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcMod {
  
  @JSImport("@react-spring/animated/dist/declarations/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@react-spring/animated/dist/declarations/src", "Animated")
  @js.native
  open class Animated[T] ()
    extends typings.reactSpringAnimated.distDeclarationsSrcAnimatedMod.Animated[T]
  
  @JSImport("@react-spring/animated/dist/declarations/src", "AnimatedArray")
  @js.native
  open class AnimatedArray[T /* <: js.Array[Value] */] protected ()
    extends typings.reactSpringAnimated.distDeclarationsSrcAnimatedArrayMod.AnimatedArray[T] {
    def this(source: T) = this()
  }
  /* static members */
  object AnimatedArray {
    
    @JSImport("@react-spring/animated/dist/declarations/src", "AnimatedArray")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def create[T /* <: js.Array[Value] */](source: T): typings.reactSpringAnimated.distDeclarationsSrcAnimatedArrayMod.AnimatedArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any]).asInstanceOf[typings.reactSpringAnimated.distDeclarationsSrcAnimatedArrayMod.AnimatedArray[T]]
  }
  
  @JSImport("@react-spring/animated/dist/declarations/src", "AnimatedObject")
  @js.native
  open class AnimatedObject protected ()
    extends typings.reactSpringAnimated.distDeclarationsSrcAnimatedObjectMod.AnimatedObject {
    def this(source: Lookup[Any]) = this()
  }
  
  @JSImport("@react-spring/animated/dist/declarations/src", "AnimatedString")
  @js.native
  open class AnimatedString protected ()
    extends typings.reactSpringAnimated.distDeclarationsSrcAnimatedStringMod.AnimatedString {
    def this(value: String) = this()
  }
  /* static members */
  object AnimatedString {
    
    @JSImport("@react-spring/animated/dist/declarations/src", "AnimatedString")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def create(value: String): typings.reactSpringAnimated.distDeclarationsSrcAnimatedStringMod.AnimatedString = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[typings.reactSpringAnimated.distDeclarationsSrcAnimatedStringMod.AnimatedString]
  }
  
  @JSImport("@react-spring/animated/dist/declarations/src", "AnimatedValue")
  @js.native
  open class AnimatedValue[T] protected ()
    extends typings.reactSpringAnimated.distDeclarationsSrcAnimatedValueMod.AnimatedValue[T] {
    def this(_value: T) = this()
  }
  /* static members */
  object AnimatedValue {
    
    @JSImport("@react-spring/animated/dist/declarations/src", "AnimatedValue")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def create(value: Any): typings.reactSpringAnimated.distDeclarationsSrcAnimatedValueMod.AnimatedValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[typings.reactSpringAnimated.distDeclarationsSrcAnimatedValueMod.AnimatedValue[Any]]
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
  
  inline def getAnimated[T](owner: Any): js.UndefOr[typings.reactSpringAnimated.distDeclarationsSrcAnimatedMod.Animated[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimated")(owner.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.reactSpringAnimated.distDeclarationsSrcAnimatedMod.Animated[T]]]
  
  inline def getAnimatedType(value: Any): AnimatedType[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimatedType")(value.asInstanceOf[js.Any]).asInstanceOf[AnimatedType[Any]]
  
  inline def getPayload(owner: Any): js.UndefOr[
    js.Array[
      typings.reactSpringAnimated.distDeclarationsSrcAnimatedValueMod.AnimatedValue[Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPayload")(owner.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    js.Array[
      typings.reactSpringAnimated.distDeclarationsSrcAnimatedValueMod.AnimatedValue[Any]
    ]
  ]]
  
  inline def isAnimated[T](value: Any): /* is @react-spring/animated.@react-spring/animated/dist/declarations/src/Animated.Animated<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnimated")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @react-spring/animated.@react-spring/animated/dist/declarations/src/Animated.Animated<T> */ Boolean]
  
  inline def setAnimated(owner: Any, node: typings.reactSpringAnimated.distDeclarationsSrcAnimatedMod.Animated[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setAnimated")(owner.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Any]
}
