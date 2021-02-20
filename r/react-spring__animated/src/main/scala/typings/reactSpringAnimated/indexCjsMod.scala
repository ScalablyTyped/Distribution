package typings.reactSpringAnimated

import org.scalablytyped.runtime.StringDictionary
import typings.reactSpringAnimated.anon.PartialHostConfig
import typings.reactSpringAnimated.anon.Style
import typings.std.Exclude
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexCjsMod {
  
  @JSImport("@react-spring/animated/index.cjs", "Animated")
  @js.native
  abstract class Animated[T] () extends StObject {
    
    /** Get every `AnimatedValue` used by this node. */
    def getPayload(): Payload = js.native
    
    /** Get the current value. Pass `true` for only animated values. */
    def getValue(): T = js.native
    def getValue(animated: Boolean): T = js.native
    
    /** The cache of animated values */
    var payload: js.UndefOr[Payload] = js.native
    
    /** Reset any animation state. */
    def reset(): Unit = js.native
    def reset(goal: T): Unit = js.native
    
    /** Set the current value. */
    def setValue(value: T): Unit = js.native
  }
  
  /** An array of animated nodes */
  @JSImport("@react-spring/animated/index.cjs", "AnimatedArray")
  @js.native
  class AnimatedArray[T /* <: js.Array[Value1] */] protected () extends AnimatedObject {
    def this(from: T) = this()
    def this(from: T, to: T) = this()
    
    /** Convert the `from` and `to` values to an array of `Animated` nodes */
    /* protected */ def _makeAnimated(): js.Array[AnimatedValue[String | Double]] = js.native
    /* protected */ def _makeAnimated(from: T): js.Array[AnimatedValue[String | Double]] = js.native
    /* protected */ def _makeAnimated(from: T, to: T): js.Array[AnimatedValue[String | Double]] = js.native
    /* protected */ def _makeAnimated(from: Null, to: T): js.Array[AnimatedValue[String | Double]] = js.native
    
    def setValue(): Unit = js.native
    def setValue(newValue: T): Unit = js.native
    
    @JSName("source")
    var source_AnimatedArray: Source1 = js.native
  }
  object AnimatedArray {
    
    /* static member */
    @JSImport("@react-spring/animated/index.cjs", "AnimatedArray.create")
    @js.native
    def create[T /* <: js.Array[Value1] */](from: T): AnimatedArray[T] = js.native
    @JSImport("@react-spring/animated/index.cjs", "AnimatedArray.create")
    @js.native
    def create[T /* <: js.Array[Value1] */](from: T, to: T): AnimatedArray[T] = js.native
  }
  
  /** An object containing `Animated` nodes */
  @JSImport("@react-spring/animated/index.cjs", "AnimatedObject")
  @js.native
  class AnimatedObject ()
    extends Animated[js.Any] {
    def this(source: Source) = this()
    
    /** Add to a payload set. */
    /* protected */ def _addToPayload(source: js.Any): Unit = js.native
    
    /** Create a payload set. */
    /* protected */ def _makePayload(source: Source): js.UndefOr[js.Array[AnimatedValue[_]]] = js.native
    
    /** Replace the raw object data */
    def setValue(source: Source): Unit = js.native
    
    var source: Source = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidObserver * / any */ @JSImport("@react-spring/animated/index.cjs", "AnimatedProps")
  @js.native
  class AnimatedProps protected () extends AnimatedObject {
    def this(update: js.Function0[Unit]) = this()
    
    /** Equals true when an update is scheduled for "end of frame" */
    var dirty: Boolean = js.native
    
    /** @internal */
    def onParentChange(
      hasType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidEvent */ js.Any
    ): Unit = js.native
    
    def setValue(): Unit = js.native
    def setValue(props: Null, context: TreeContext): Unit = js.native
    def setValue(props: Props): Unit = js.native
    def setValue(props: Props, context: TreeContext): Unit = js.native
    
    def update(): Unit = js.native
  }
  
  @JSImport("@react-spring/animated/index.cjs", "AnimatedString")
  @js.native
  class AnimatedString protected () extends AnimatedValue[Value] {
    def this(from: String, to: String) = this()
    
    var _string: String | Null = js.native
    
    /* protected */ def _toString(input: Double): String = js.native
    
    @JSName("_value")
    var _value_AnimatedString: Double = js.native
    
    def reset(goal: String): Unit = js.native
  }
  object AnimatedString {
    
    /* static member */
    @JSImport("@react-spring/animated/index.cjs", "AnimatedString.create")
    @js.native
    def create[T](from: T): AnimatedValue[T] = js.native
    @JSImport("@react-spring/animated/index.cjs", "AnimatedString.create")
    @js.native
    def create[T](from: T, to: T): AnimatedValue[T] = js.native
  }
  
  /** An animated number or a native attribute value */
  @JSImport("@react-spring/animated/index.cjs", "AnimatedValue")
  @js.native
  class AnimatedValue[T] protected ()
    extends Animated[js.Any] {
    def this(_value: T) = this()
    
    var _value: T = js.native
    
    var done: Boolean = js.native
    
    var elapsedTime: Double = js.native
    
    var lastPosition: Double = js.native
    
    var lastVelocity: js.UndefOr[Double | Null] = js.native
    
    /**
      * Set the current value and optionally round it.
      *
      * The `step` argument does nothing whenever it equals `undefined` or `0`.
      * It works with fractions and whole numbers. The best use case is (probably)
      * rounding to the pixel grid with a step of:
      *
      *      1 / window.devicePixelRatio
      */
    def setValue(value: T): Boolean = js.native
    def setValue(value: T, step: Double): Boolean = js.native
    
    var v0: js.UndefOr[Double | Null] = js.native
  }
  object AnimatedValue {
    
    /* static member */
    @JSImport("@react-spring/animated/index.cjs", "AnimatedValue.create")
    @js.native
    def create[T](from: T): AnimatedValue[T] = js.native
    @JSImport("@react-spring/animated/index.cjs", "AnimatedValue.create")
    @js.native
    def create[T](from: T, _to: T): AnimatedValue[T] = js.native
  }
  
  @JSImport("@react-spring/animated/index.cjs", "createHost")
  @js.native
  def createHost(components: js.Array[AnimatableComponent]): typings.reactSpringAnimated.anon.Animated = js.native
  @JSImport("@react-spring/animated/index.cjs", "createHost")
  @js.native
  def createHost(
    components: js.Array[AnimatableComponent],
    hasApplyAnimatedValuesCreateAnimatedStyleGetComponentProps: PartialHostConfig
  ): typings.reactSpringAnimated.anon.Animated = js.native
  @JSImport("@react-spring/animated/index.cjs", "createHost")
  @js.native
  def createHost(components: StringDictionary[AnimatableComponent]): typings.reactSpringAnimated.anon.Animated = js.native
  @JSImport("@react-spring/animated/index.cjs", "createHost")
  @js.native
  def createHost(
    components: StringDictionary[AnimatableComponent],
    hasApplyAnimatedValuesCreateAnimatedStyleGetComponentProps: PartialHostConfig
  ): typings.reactSpringAnimated.anon.Animated = js.native
  
  /** Get the owner's `Animated` node. */
  @JSImport("@react-spring/animated/index.cjs", "getAnimated")
  @js.native
  def getAnimated[T](owner: js.Any): js.UndefOr[Animated[T]] = js.native
  
  /** Get every `AnimatedValue` in the owner's `Animated` node. */
  @JSImport("@react-spring/animated/index.cjs", "getPayload")
  @js.native
  def getPayload(owner: js.Any): js.UndefOr[js.Array[AnimatedValue[_]]] = js.native
  
  @JSImport("@react-spring/animated/index.cjs", "isAnimated")
  @js.native
  def isAnimated[T](value: js.Any): /* is @react-spring/animated.@react-spring/animated/index.cjs.Animated<T> */ Boolean = js.native
  
  /** Set the owner's `Animated` node. */
  @JSImport("@react-spring/animated/index.cjs", "setAnimated")
  @js.native
  def setAnimated(owner: js.Any, node: Animated[_]): js.Any = js.native
  
  type AnimatableComponent = String | (Exclude[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementType */ js.Any, 
    String
  ])
  
  /* Inlined std.Function & {create (from : any, goal : any | undefined): T extends std.ReadonlyArray<number | string> ? @react-spring/animated.@react-spring/animated/index.cjs.AnimatedArray<T> : @react-spring/animated.@react-spring/animated/index.cjs.AnimatedValue<T>} */
  @js.native
  trait AnimatedType[T] extends StObject {
    
    /**
      * Calls the function, substituting the specified object for the this value of the function, and the specified array for the arguments of the function.
      * @param thisArg The object to be used as the this object.
      * @param argArray A set of arguments to be passed to the function.
      */
    @JSName("apply")
    def apply(thisArg: js.Any): js.Any = js.native
    @JSName("apply")
    def apply(thisArg: js.Any, argArray: js.Any): js.Any = js.native
    
    // Non-standard extensions
    var arguments: js.Any = js.native
    
    /**
      * For a given function, creates a bound function that has the same body as the original function.
      * The this object of the bound function is associated with the specified object, and has the specified initial parameters.
      * @param thisArg An object to which the this keyword can refer inside the new function.
      * @param argArray A list of arguments to be passed to the new function.
      */
    def bind(thisArg: js.Any, argArray: js.Any*): js.Any = js.native
    
    /**
      * Calls a method of an object, substituting another object for the current object.
      * @param thisArg The object to be used as the current object.
      * @param argArray A list of arguments to be passed to the method.
      */
    def call(thisArg: js.Any, argArray: js.Any*): js.Any = js.native
    
    var caller: js.Function = js.native
    
    def create(from: js.Any): AnimatedValue[T] | AnimatedArray[T] = js.native
    def create(from: js.Any, goal: js.Any): AnimatedValue[T] | AnimatedArray[T] = js.native
    
    /**
      * Determines whether the given value inherits from this function if this function was used
      * as a constructor function.
      *
      * A constructor function can control which objects are recognized as its instances by
      * 'instanceof' by overriding this method.
      */
    @JSName(js.Symbol.hasInstance)
    var hasInstance: js.Function1[/* value */ js.Any, Boolean] = js.native
    
    val length: Double = js.native
    
    /**
      * Returns the name of the function. Function names are read-only and can not be changed.
      */
    val name: String = js.native
  }
  
  @js.native
  trait HostConfig extends StObject {
    
    /** Provide custom logic for native updates */
    def applyAnimatedValues(
      node: js.Any,
      props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ js.Any
    ): Boolean | Unit = js.native
    
    /** Wrap the `style` prop with an animated node */
    def createAnimatedStyle(
      style: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ js.Any
    ): Animated[_] = js.native
    
    /** Intercept props before they're passed to an animated component */
    def getComponentProps(
      props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ js.Any
    ): js.Any = js.native
  }
  object HostConfig {
    
    @scala.inline
    def apply(
      applyAnimatedValues: (js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ js.Any) => Boolean | Unit,
      createAnimatedStyle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ js.Any => Animated[_],
      getComponentProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ js.Any => js.Any
    ): HostConfig = {
      val __obj = js.Dynamic.literal(applyAnimatedValues = js.Any.fromFunction2(applyAnimatedValues), createAnimatedStyle = js.Any.fromFunction1(createAnimatedStyle), getComponentProps = js.Any.fromFunction1(getComponentProps))
      __obj.asInstanceOf[HostConfig]
    }
    
    @scala.inline
    implicit class HostConfigMutableBuilder[Self <: HostConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyAnimatedValues(
        value: (js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ js.Any) => Boolean | Unit
      ): Self = StObject.set(x, "applyAnimatedValues", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateAnimatedStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ js.Any => Animated[_]
      ): Self = StObject.set(x, "createAnimatedStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetComponentProps(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ js.Any => js.Any
      ): Self = StObject.set(x, "getComponentProps", js.Any.fromFunction1(value))
    }
  }
  
  type Payload = js.Array[AnimatedValue[js.Any]]
  
  type Props = js.Object with Style
  
  type Source = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ js.Any) | Null
  
  type Source1 = js.Array[AnimatedValue[Value1]]
  
  @js.native
  trait TreeContext extends StObject {
    
    var dependencies: Set[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue */ _
      ] = js.native
    
    var host: HostConfig = js.native
  }
  object TreeContext {
    
    @scala.inline
    def apply(
      dependencies: Set[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue */ _
        ],
      host: HostConfig
    ): TreeContext = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeContext]
    }
    
    @scala.inline
    implicit class TreeContextMutableBuilder[Self <: TreeContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDependencies(
        value: Set[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue */ _
            ]
      ): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: HostConfig): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    }
  }
  
  type Value = String | Double
  
  type Value1 = Double | String
  
  @js.native
  trait WithAnimated
    extends /* key */ StringDictionary[js.Any] {
    
    def apply(Component: AnimatableComponent): js.Any = js.native
  }
}
