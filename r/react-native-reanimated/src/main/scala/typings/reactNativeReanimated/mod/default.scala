package typings.reactNativeReanimated.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.reactNativeReanimated.anon.InputRange
import typings.reactNativeReanimated.mod.Animated.Adaptable
import typings.reactNativeReanimated.mod.Animated.BackwardCompatibleWrapper
import typings.reactNativeReanimated.mod.Animated.BinaryOperator
import typings.reactNativeReanimated.mod.Animated.CodeProps
import typings.reactNativeReanimated.mod.Animated.DecayConfig
import typings.reactNativeReanimated.mod.Animated.DecayState
import typings.reactNativeReanimated.mod.Animated.EventMappingArray
import typings.reactNativeReanimated.mod.Animated.InterpolationConfig
import typings.reactNativeReanimated.mod.Animated.Mapping
import typings.reactNativeReanimated.mod.Animated.MultiOperator
import typings.reactNativeReanimated.mod.Animated.Nullable
import typings.reactNativeReanimated.mod.Animated.SpringConfig
import typings.reactNativeReanimated.mod.Animated.SpringState
import typings.reactNativeReanimated.mod.Animated.TimingConfig
import typings.reactNativeReanimated.mod.Animated.TimingState
import typings.reactNativeReanimated.mod.Animated.UnaryOperator
import typings.reactNativeReanimated.reactNativeReanimatedBooleans.`true`
import typings.reactNativeReanimated.reactNativeReanimatedNumbers.`0`
import typings.reactNativeReanimated.reactNativeReanimatedNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  @JSImport("react-native-reanimated", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-reanimated", "default.AnimatedClock")
  @js.native
  class AnimatedClock ()
    extends StObject
       with typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double] {
    
    /**
      * ' __value' is not available at runtime on AnimatedNode<T>. It is
      * necessary to have some discriminating property on a type to know that
      * an AnimatedNode<number> and AnimatedNode<string> are not compatible types.
      */
    /* CompleteClass */
    @JSName(" __value")
    var Space__value: Double = js.native
    
    /* CompleteClass */
    override def isNativelyInitialized(): Boolean = js.native
  }
  
  @JSImport("react-native-reanimated", "default.AnimatedNode")
  @js.native
  class AnimatedNode[T] protected ()
    extends StObject
       with typings.reactNativeReanimated.mod.Animated.AnimatedNode[T] {
    def this(nodeConfig: js.Object) = this()
    def this(
      nodeConfig: js.Object,
      inputNodes: js.Array[typings.reactNativeReanimated.mod.Animated.AnimatedNode[js.Any]]
    ) = this()
    
    /**
      * ' __value' is not available at runtime on AnimatedNode<T>. It is
      * necessary to have some discriminating property on a type to know that
      * an AnimatedNode<number> and AnimatedNode<string> are not compatible types.
      */
    /* CompleteClass */
    @JSName(" __value")
    var Space__value: T = js.native
    
    /* CompleteClass */
    override def isNativelyInitialized(): Boolean = js.native
  }
  
  @JSImport("react-native-reanimated", "default.AnimatedValue")
  @js.native
  class AnimatedValue[T /* <: typings.reactNativeReanimated.mod.Animated.Value */] ()
    extends StObject
       with typings.reactNativeReanimated.mod.Animated.AnimatedValue[T] {
    def this(value: T) = this()
    
    /**
      * ' __value' is not available at runtime on AnimatedNode<T>. It is
      * necessary to have some discriminating property on a type to know that
      * an AnimatedNode<number> and AnimatedNode<string> are not compatible types.
      */
    /* CompleteClass */
    @JSName(" __value")
    var Space__value: T = js.native
    
    /* CompleteClass */
    override def interpolate(config: InterpolationConfig): typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double] = js.native
    
    /* CompleteClass */
    override def isNativelyInitialized(): Boolean = js.native
    
    /* CompleteClass */
    override def setValue(value: Adaptable[T]): Unit = js.native
  }
  
  @JSImport("react-native-reanimated", "default.Code")
  @js.native
  class Code ()
    extends Component[CodeProps, js.Object, js.Any]
  
  @JSImport("react-native-reanimated", "default.Extrapolate")
  @js.native
  object Extrapolate extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactNativeReanimated.mod.Animated.Extrapolate & String] = js.native
    
    /* "clamp" */ val CLAMP: typings.reactNativeReanimated.mod.Animated.Extrapolate.CLAMP & String = js.native
    
    /* "extend" */ val EXTEND: typings.reactNativeReanimated.mod.Animated.Extrapolate.EXTEND & String = js.native
    
    /* "identity" */ val IDENTITY: typings.reactNativeReanimated.mod.Animated.Extrapolate.IDENTITY & String = js.native
  }
  
  @JSImport("react-native-reanimated", "default.Image")
  @js.native
  class Image ()
    extends typings.reactNativeReanimated.mod.Animated.Image
  
  @JSImport("react-native-reanimated", "default.ScrollView")
  @js.native
  class ScrollView ()
    extends typings.reactNativeReanimated.mod.Animated.ScrollView
  
  @JSImport("react-native-reanimated", "default.SpringUtils")
  @js.native
  val SpringUtils: typings.reactNativeReanimated.mod.Animated.SpringUtils = js.native
  
  @JSImport("react-native-reanimated", "default.Text")
  @js.native
  class Text ()
    extends typings.reactNativeReanimated.mod.Animated.Text
  
  @JSImport("react-native-reanimated", "default.View")
  @js.native
  class View ()
    extends typings.reactNativeReanimated.mod.Animated.View
  
  @scala.inline
  def abs(value: Adaptable[Double]): typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(value.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double]]
  
  @scala.inline
  def acc(value: Adaptable[Double]): typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("acc")(value.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double]]
  
  @JSImport("react-native-reanimated", "default.acos")
  @js.native
  val acos: UnaryOperator = js.native
  
  @JSImport("react-native-reanimated", "default.add")
  @js.native
  val add: MultiOperator[Double] = js.native
  
  @scala.inline
  def addWhitelistedNativeProps_true(props: StringDictionary[`true`]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addWhitelistedNativeProps")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def addWhitelistedUIProps_true(props: StringDictionary[`true`]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addWhitelistedUIProps")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("react-native-reanimated", "default.and")
  @js.native
  val and: MultiOperator[`0` | `1`] = js.native
  
  @JSImport("react-native-reanimated", "default.asin")
  @js.native
  val asin: UnaryOperator = js.native
  
  @JSImport("react-native-reanimated", "default.atan")
  @js.native
  val atan: UnaryOperator = js.native
  
  @scala.inline
  def block[T1 /* <: typings.reactNativeReanimated.mod.Animated.Value */, T2 /* <: typings.reactNativeReanimated.mod.Animated.Value */](items: js.Array[Adaptable[T2]]): typings.reactNativeReanimated.mod.Animated.AnimatedNode[T1] = ^.asInstanceOf[js.Dynamic].applyDynamic("block")(items.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[T1]]
  
  @scala.inline
  def call[T](
    args: js.Array[T | typings.reactNativeReanimated.mod.Animated.AnimatedNode[T]],
    callback: js.Function1[/* args */ js.Array[T], Unit]
  ): typings.reactNativeReanimated.mod.Animated.AnimatedNode[`0`] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[`0`]]
  
  @JSImport("react-native-reanimated", "default.ceil")
  @js.native
  val ceil: UnaryOperator = js.native
  
  @scala.inline
  def clockRunning(clock: typings.reactNativeReanimated.mod.Animated.AnimatedClock): typings.reactNativeReanimated.mod.Animated.AnimatedNode[`0` | `1`] = ^.asInstanceOf[js.Dynamic].applyDynamic("clockRunning")(clock.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[`0` | `1`]]
  
  @scala.inline
  def color(r: Adaptable[Double], g: Adaptable[Double], b: Adaptable[Double]): typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("color")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double]]
  @scala.inline
  def color(r: Adaptable[Double], g: Adaptable[Double], b: Adaptable[Double], a: Adaptable[Double]): typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("color")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double]]
  
  @scala.inline
  def concat(args: (Adaptable[Double | String])*): typings.reactNativeReanimated.mod.Animated.AnimatedNode[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(args.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[String]]
  
  @scala.inline
  def cond[T1 /* <: typings.reactNativeReanimated.mod.Animated.Value */, T2 /* <: typings.reactNativeReanimated.mod.Animated.Value */](conditionNode: Adaptable[Double], ifNode: Adaptable[T1]): typings.reactNativeReanimated.mod.Animated.AnimatedNode[T1 | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("cond")(conditionNode.asInstanceOf[js.Any], ifNode.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[T1 | T2]]
  @scala.inline
  def cond[T1 /* <: typings.reactNativeReanimated.mod.Animated.Value */, T2 /* <: typings.reactNativeReanimated.mod.Animated.Value */](conditionNode: Adaptable[Double], ifNode: Adaptable[T1], elseNode: Adaptable[T2]): typings.reactNativeReanimated.mod.Animated.AnimatedNode[T1 | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("cond")(conditionNode.asInstanceOf[js.Any], ifNode.asInstanceOf[js.Any], elseNode.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[T1 | T2]]
  
  @JSImport("react-native-reanimated", "default.cos")
  @js.native
  val cos: UnaryOperator = js.native
  
  @scala.inline
  def createAnimatedComponent(component: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedComponent")(component.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def debug[T](message: String, value: typings.reactNativeReanimated.mod.Animated.AnimatedNode[T]): typings.reactNativeReanimated.mod.Animated.AnimatedNode[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(message.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[T]]
  
  @scala.inline
  def decay(
    clock: typings.reactNativeReanimated.mod.Animated.AnimatedClock,
    state: DecayState,
    config: DecayConfig
  ): typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("decay")(clock.asInstanceOf[js.Any], state.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double]]
  @scala.inline
  def decay(node: typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double], config: DecayConfig): BackwardCompatibleWrapper = (^.asInstanceOf[js.Dynamic].applyDynamic("decay")(node.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[BackwardCompatibleWrapper]
  
  @scala.inline
  def defined(value: Adaptable[js.Any]): typings.reactNativeReanimated.mod.Animated.AnimatedNode[`0` | `1`] = ^.asInstanceOf[js.Dynamic].applyDynamic("defined")(value.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[`0` | `1`]]
  
  @scala.inline
  def diff(value: Adaptable[Double]): typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("diff")(value.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double]]
  
  @scala.inline
  def diffClamp(value: Adaptable[Double], minVal: Adaptable[Double], maxVal: Adaptable[Double]): typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffClamp")(value.asInstanceOf[js.Any], minVal.asInstanceOf[js.Any], maxVal.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double]]
  
  @JSImport("react-native-reanimated", "default.divide")
  @js.native
  val divide: MultiOperator[Double] = js.native
  
  @JSImport("react-native-reanimated", "default.eq")
  @js.native
  val eq_ : BinaryOperator[`0` | `1`] = js.native
  
  @scala.inline
  def event[T](argMapping: EventMappingArray[T] | js.Array[Mapping]): js.Function1[/* repeated */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("event")(argMapping.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Unit]]
  @scala.inline
  def event[T](argMapping: EventMappingArray[T] | js.Array[Mapping], config: js.Object): js.Function1[/* repeated */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("event")(argMapping.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Unit]]
  
  @JSImport("react-native-reanimated", "default.exp")
  @js.native
  val exp: UnaryOperator = js.native
  
  @JSImport("react-native-reanimated", "default.floor")
  @js.native
  val floor: UnaryOperator = js.native
  
  @JSImport("react-native-reanimated", "default.greaterOrEq")
  @js.native
  val greaterOrEq: BinaryOperator[`0` | `1`] = js.native
  
  @JSImport("react-native-reanimated", "default.greaterThan")
  @js.native
  val greaterThan: BinaryOperator[`0` | `1`] = js.native
  
  @scala.inline
  def interpolate(value: Adaptable[Double], config: InterpolationConfig): typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double]]
  
  @scala.inline
  def interpolateColors(animationValue: Adaptable[Double], hasInputRangeOutputColorRange: InputRange): typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateColors")(animationValue.asInstanceOf[js.Any], hasInputRangeOutputColorRange.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double]]
  
  @JSImport("react-native-reanimated", "default.lessOrEq")
  @js.native
  val lessOrEq: BinaryOperator[`0` | `1`] = js.native
  
  @JSImport("react-native-reanimated", "default.lessThan")
  @js.native
  val lessThan: BinaryOperator[`0` | `1`] = js.native
  
  @JSImport("react-native-reanimated", "default.log")
  @js.native
  val log: UnaryOperator = js.native
  
  @JSImport("react-native-reanimated", "default.max")
  @js.native
  val max: BinaryOperator[Double] = js.native
  
  @JSImport("react-native-reanimated", "default.min")
  @js.native
  val min: BinaryOperator[Double] = js.native
  
  @JSImport("react-native-reanimated", "default.modulo")
  @js.native
  val modulo: MultiOperator[Double] = js.native
  
  @JSImport("react-native-reanimated", "default.multiply")
  @js.native
  val multiply: MultiOperator[Double] = js.native
  
  @JSImport("react-native-reanimated", "default.neq")
  @js.native
  val neq: BinaryOperator[`0` | `1`] = js.native
  
  @scala.inline
  def not(value: Adaptable[js.Any]): typings.reactNativeReanimated.mod.Animated.AnimatedNode[`0` | `1`] = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(value.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[`0` | `1`]]
  
  @scala.inline
  def onChange(value: Adaptable[Double], action: Adaptable[Double]): typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("onChange")(value.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double]]
  
  @JSImport("react-native-reanimated", "default.or")
  @js.native
  val or: MultiOperator[`0` | `1`] = js.native
  
  @JSImport("react-native-reanimated", "default.pow")
  @js.native
  val pow: MultiOperator[Double] = js.native
  
  @scala.inline
  def proc[T /* <: js.Array[js.UndefOr[Adaptable[typings.reactNativeReanimated.mod.Animated.Value]]] */](func: js.Function1[/* args */ T, typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double]]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("proc")(func.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("react-native-reanimated", "default.round")
  @js.native
  val round: UnaryOperator = js.native
  
  @scala.inline
  def set[T /* <: typings.reactNativeReanimated.mod.Animated.Value */](
    valueToBeUpdated: typings.reactNativeReanimated.mod.Animated.AnimatedValue[T],
    sourceNode: Adaptable[T]
  ): typings.reactNativeReanimated.mod.Animated.AnimatedNode[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(valueToBeUpdated.asInstanceOf[js.Any], sourceNode.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[T]]
  
  @JSImport("react-native-reanimated", "default.sin")
  @js.native
  val sin: UnaryOperator = js.native
  
  @scala.inline
  def spring(
    clock: typings.reactNativeReanimated.mod.Animated.AnimatedClock,
    state: SpringState,
    config: SpringConfig
  ): typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(clock.asInstanceOf[js.Any], state.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double]]
  @scala.inline
  def spring(node: typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double], config: SpringConfig): BackwardCompatibleWrapper = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(node.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[BackwardCompatibleWrapper]
  
  @JSImport("react-native-reanimated", "default.sqrt")
  @js.native
  val sqrt: UnaryOperator = js.native
  
  @scala.inline
  def startClock(clock: typings.reactNativeReanimated.mod.Animated.AnimatedClock): typings.reactNativeReanimated.mod.Animated.AnimatedNode[`0`] = ^.asInstanceOf[js.Dynamic].applyDynamic("startClock")(clock.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[`0`]]
  
  @scala.inline
  def stopClock(clock: typings.reactNativeReanimated.mod.Animated.AnimatedClock): typings.reactNativeReanimated.mod.Animated.AnimatedNode[`0`] = ^.asInstanceOf[js.Dynamic].applyDynamic("stopClock")(clock.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[`0`]]
  
  @JSImport("react-native-reanimated", "default.sub")
  @js.native
  val sub: MultiOperator[Double] = js.native
  
  @JSImport("react-native-reanimated", "default.tan")
  @js.native
  val tan: UnaryOperator = js.native
  
  @scala.inline
  def timing(
    clock: typings.reactNativeReanimated.mod.Animated.AnimatedClock,
    state: TimingState,
    config: TimingConfig
  ): typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(clock.asInstanceOf[js.Any], state.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double]]
  @scala.inline
  def timing(node: typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double], config: TimingConfig): BackwardCompatibleWrapper = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(node.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[BackwardCompatibleWrapper]
  
  @scala.inline
  def useCode(
    exec: js.Function0[
      (Nullable[
        js.Array[typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double]] | typings.reactNativeReanimated.mod.Animated.AnimatedNode[Double]
      ]) | Boolean
    ],
    deps: js.Array[js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useCode")(exec.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def useValue(initialValue: String): typings.reactNativeReanimated.mod.Animated.AnimatedValue[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useValue")(initialValue.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedValue[String]]
  @scala.inline
  def useValue(initialValue: Boolean): typings.reactNativeReanimated.mod.Animated.AnimatedValue[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useValue")(initialValue.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedValue[Boolean]]
  @scala.inline
  def useValue(initialValue: Double): typings.reactNativeReanimated.mod.Animated.AnimatedValue[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("useValue")(initialValue.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.mod.Animated.AnimatedValue[Double]]
}
