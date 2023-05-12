package typings.reactSpringAnimated

import org.scalablytyped.runtime.StringDictionary
import typings.reactSpringAnimated.anon.PartialHostConfig
import typings.reactSpringTypes.mod.ElementType
import typings.reactSpringTypes.mod.Lookup
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-spring/animated", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@react-spring/animated", "Animated")
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
  
  /** An array of animated nodes */
  @JSImport("@react-spring/animated", "AnimatedArray")
  @js.native
  open class AnimatedArray[T /* <: js.Array[Value] */] protected () extends AnimatedObject {
    def this(source: T) = this()
    
    /* protected */ @JSName("source")
    var source_AnimatedArray: Source = js.native
  }
  object AnimatedArray {
    
    @JSImport("@react-spring/animated", "AnimatedArray")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    /* static member */
    inline def create[T /* <: js.Array[Value] */](source: T): AnimatedArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any]).asInstanceOf[AnimatedArray[T]]
  }
  
  /** An object containing `Animated` nodes */
  @JSImport("@react-spring/animated", "AnimatedObject")
  @js.native
  open class AnimatedObject protected () extends Animated[Any] {
    def this(source: Lookup[Any]) = this()
    
    /** Add to a payload set. */
    /* protected */ def _addToPayload(source: Any): Unit = js.native
    
    /** Create a payload set. */
    /* protected */ def _makePayload(source: Lookup[Any]): js.UndefOr[js.Array[AnimatedValue[Any]]] = js.native
    
    /** Replace the raw object data */
    def setValue(source: Lookup[Any]): Unit = js.native
    
    /* protected */ var source: Lookup[Any] = js.native
  }
  
  @JSImport("@react-spring/animated", "AnimatedString")
  @js.native
  open class AnimatedString protected () extends AnimatedValue[Value1] {
    def this(value: String) = this()
    
    /* protected */ var _string: String | Null = js.native
    
    /* protected */ def _toString(input: Double): String = js.native
    
    /* protected */ @JSName("_value")
    var _value_AnimatedString: Double = js.native
    
    def reset(goal: String): Unit = js.native
  }
  object AnimatedString {
    
    @JSImport("@react-spring/animated", "AnimatedString")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    /* static member */
    inline def create(value: String): AnimatedString = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[AnimatedString]
  }
  
  /** An animated number or a native attribute value */
  @JSImport("@react-spring/animated", "AnimatedValue")
  @js.native
  open class AnimatedValue[T] protected () extends Animated[Any] {
    def this(_value: T) = this()
    
    /* protected */ var _value: T = js.native
    
    var done: Boolean = js.native
    
    var durationProgress: Double = js.native
    
    var elapsedTime: Double = js.native
    
    var lastPosition: Double = js.native
    
    var lastVelocity: js.UndefOr[Double | Null] = js.native
    
    def setValue(value: T, step: Double): Boolean = js.native
    
    var v0: js.UndefOr[Double | Null] = js.native
  }
  object AnimatedValue {
    
    @JSImport("@react-spring/animated", "AnimatedValue")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    /* static member */
    inline def create(value: Any): AnimatedValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[AnimatedValue[Any]]
  }
  
  inline def createHost(components: js.Array[AnimatableComponent]): typings.reactSpringAnimated.anon.Animated = ^.asInstanceOf[js.Dynamic].applyDynamic("createHost")(components.asInstanceOf[js.Any]).asInstanceOf[typings.reactSpringAnimated.anon.Animated]
  inline def createHost(components: js.Array[AnimatableComponent], param1: PartialHostConfig): typings.reactSpringAnimated.anon.Animated = (^.asInstanceOf[js.Dynamic].applyDynamic("createHost")(components.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[typings.reactSpringAnimated.anon.Animated]
  inline def createHost(components: StringDictionary[AnimatableComponent]): typings.reactSpringAnimated.anon.Animated = ^.asInstanceOf[js.Dynamic].applyDynamic("createHost")(components.asInstanceOf[js.Any]).asInstanceOf[typings.reactSpringAnimated.anon.Animated]
  inline def createHost(components: StringDictionary[AnimatableComponent], param1: PartialHostConfig): typings.reactSpringAnimated.anon.Animated = (^.asInstanceOf[js.Dynamic].applyDynamic("createHost")(components.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[typings.reactSpringAnimated.anon.Animated]
  
  /** Get the owner's `Animated` node. */
  inline def getAnimated[T](owner: Any): js.UndefOr[Animated[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimated")(owner.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Animated[T]]]
  
  /** Return the `Animated` node constructor for a given value */
  inline def getAnimatedType(value: Any): AnimatedType[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimatedType")(value.asInstanceOf[js.Any]).asInstanceOf[AnimatedType[Any]]
  
  /** Get every `AnimatedValue` in the owner's `Animated` node. */
  inline def getPayload(owner: Any): js.UndefOr[js.Array[AnimatedValue[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPayload")(owner.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[AnimatedValue[Any]]]]
  
  inline def isAnimated[T](value: Any): /* is @react-spring/animated.@react-spring/animated.Animated<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnimated")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @react-spring/animated.@react-spring/animated.Animated<T> */ Boolean]
  
  /** Set the owner's `Animated` node. */
  inline def setAnimated(owner: Any, node: Animated[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setAnimated")(owner.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  type AnimatableComponent = String | (Exclude[ElementType[Any], String])
  
  @js.native
  trait AnimatedType[T]
    extends js.Function {
    
    def create(from: Any): /* import warning: importer.ImportType#apply Failed type conversion: T extends std.ReadonlyArray<number | string> ? @react-spring/animated.@react-spring/animated.AnimatedArray<T> : @react-spring/animated.@react-spring/animated.AnimatedValue<T> */ js.Any = js.native
    def create(from: Any, goal: Any): /* import warning: importer.ImportType#apply Failed type conversion: T extends std.ReadonlyArray<number | string> ? @react-spring/animated.@react-spring/animated.AnimatedArray<T> : @react-spring/animated.@react-spring/animated.AnimatedValue<T> */ js.Any = js.native
  }
  
  trait HostConfig extends StObject {
    
    /** Provide custom logic for native updates */
    def applyAnimatedValues(node: Any, props: Lookup[Any]): Boolean | Unit
    
    /** Wrap the `style` prop with an animated node */
    def createAnimatedStyle(style: Lookup[Any]): Animated[Any]
    
    /** Intercept props before they're passed to an animated component */
    def getComponentProps(props: Lookup[Any]): Any
  }
  object HostConfig {
    
    inline def apply(
      applyAnimatedValues: (Any, Lookup[Any]) => Boolean | Unit,
      createAnimatedStyle: Lookup[Any] => Animated[Any],
      getComponentProps: Lookup[Any] => Any
    ): HostConfig = {
      val __obj = js.Dynamic.literal(applyAnimatedValues = js.Any.fromFunction2(applyAnimatedValues), createAnimatedStyle = js.Any.fromFunction1(createAnimatedStyle), getComponentProps = js.Any.fromFunction1(getComponentProps))
      __obj.asInstanceOf[HostConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HostConfig] (val x: Self) extends AnyVal {
      
      inline def setApplyAnimatedValues(value: (Any, Lookup[Any]) => Boolean | Unit): Self = StObject.set(x, "applyAnimatedValues", js.Any.fromFunction2(value))
      
      inline def setCreateAnimatedStyle(value: Lookup[Any] => Animated[Any]): Self = StObject.set(x, "createAnimatedStyle", js.Any.fromFunction1(value))
      
      inline def setGetComponentProps(value: Lookup[Any] => Any): Self = StObject.set(x, "getComponentProps", js.Any.fromFunction1(value))
    }
  }
  
  type Payload = js.Array[AnimatedValue[Any]]
  
  type Source = js.Array[AnimatedValue[Value]]
  
  type Value = Double | String
  
  type Value1 = String | Double
  
  @js.native
  trait WithAnimated
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    def apply(Component: AnimatableComponent): Any = js.native
  }
}
