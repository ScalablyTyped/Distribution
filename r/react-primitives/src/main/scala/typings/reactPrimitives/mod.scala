package typings.reactPrimitives

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.reactNative.anon.TypeofImage
import typings.reactNative.anon.TypeofView
import typings.reactNative.anon.Y
import typings.reactNative.mod.Animated.AnimatedComponent
import typings.reactNative.mod.Animated.AnimatedProps
import typings.reactNative.mod.Animated.AnimatedValue
import typings.reactNative.mod.Animated.AnimatedValueXY
import typings.reactNative.mod.Animated.CompositeAnimation
import typings.reactNative.mod.Animated.DecayAnimationConfig
import typings.reactNative.mod.Animated.EventConfig
import typings.reactNative.mod.Animated.LoopAnimationConfig
import typings.reactNative.mod.Animated.Mapping
import typings.reactNative.mod.Animated.ParallelConfig
import typings.reactNative.mod.Animated.SpringAnimationConfig
import typings.reactNative.mod.Animated.TimingAnimationConfig
import typings.reactNative.mod.EasingStatic
import typings.reactNative.mod.FlatListProps
import typings.reactNative.mod.ImageProps
import typings.reactNative.mod.ImageResolvedAssetSource
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.PixelRatioStatic
import typings.reactNative.mod.RegisteredStyle
import typings.reactNative.mod.SectionListProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.StyleSheet.AbsoluteFillStyle
import typings.reactNative.mod.StyleSheet.NamedStyles
import typings.reactNative.mod.TextProps
import typings.reactNative.mod.TouchableOpacityProps
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod._ScrollView
import typings.reactNative.mod._Text
import typings.reactPrimitives.reactPrimitivesStrings.disk
import typings.reactPrimitives.reactPrimitivesStrings.diskSlashmemory
import typings.reactPrimitives.reactPrimitivesStrings.memory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Animated {
    
    @JSImport("react-primitives", "Animated")
    @js.native
    val ^ : js.Any = js.native
    @JSImport("react-primitives", "Animated.Animated")
    @js.native
    class Animated ()
      extends typings.reactNative.mod.Animated.Animated
    
    @JSImport("react-primitives", "Animated.AnimatedAddition")
    @js.native
    class AnimatedAddition ()
      extends typings.reactNative.mod.Animated.AnimatedAddition
    
    @JSImport("react-primitives", "Animated.AnimatedDiffClamp")
    @js.native
    class AnimatedDiffClamp ()
      extends typings.reactNative.mod.Animated.AnimatedDiffClamp
    
    @JSImport("react-primitives", "Animated.AnimatedDivision")
    @js.native
    class AnimatedDivision ()
      extends typings.reactNative.mod.Animated.AnimatedDivision
    
    @JSImport("react-primitives", "Animated.AnimatedInterpolation")
    @js.native
    class AnimatedInterpolation ()
      extends typings.reactNative.mod.Animated.AnimatedInterpolation
    
    @JSImport("react-primitives", "Animated.AnimatedModulo")
    @js.native
    class AnimatedModulo ()
      extends typings.reactNative.mod.Animated.AnimatedModulo
    
    @JSImport("react-primitives", "Animated.AnimatedMultiplication")
    @js.native
    class AnimatedMultiplication ()
      extends typings.reactNative.mod.Animated.AnimatedMultiplication
    
    @JSImport("react-primitives", "Animated.AnimatedSubtraction")
    @js.native
    class AnimatedSubtraction ()
      extends typings.reactNative.mod.Animated.AnimatedSubtraction
    
    @JSImport("react-primitives", "Animated.AnimatedWithChildren")
    @js.native
    class AnimatedWithChildren ()
      extends typings.reactNative.mod.Animated.AnimatedWithChildren
    
    @JSImport("react-primitives", "Animated.FlatList")
    @js.native
    class FlatList[ItemT] protected ()
      extends typings.reactNative.mod.Animated.FlatList[ItemT] {
      def this(props: AnimatedProps[FlatListProps[ItemT]]) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: AnimatedProps[FlatListProps[ItemT]], context: js.Any) = this()
    }
    
    @JSImport("react-primitives", "Animated.Image")
    @js.native
    val Image: AnimatedComponent[TypeofImage] = js.native
    
    @JSImport("react-primitives", "Animated.ScrollView")
    @js.native
    val ScrollView: AnimatedComponent[Instantiable0[_ScrollView]] = js.native
    
    @JSImport("react-primitives", "Animated.SectionList")
    @js.native
    class SectionList[ItemT, SectionT] protected ()
      extends typings.reactNative.mod.Animated.SectionList[ItemT, SectionT] {
      def this(props: AnimatedProps[SectionListProps[ItemT, SectionT]]) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: AnimatedProps[SectionListProps[ItemT, SectionT]], context: js.Any) = this()
    }
    
    @JSImport("react-primitives", "Animated.Text")
    @js.native
    val Text: AnimatedComponent[Instantiable0[_Text]] = js.native
    
    @JSImport("react-primitives", "Animated.Value")
    @js.native
    class Value protected ()
      extends typings.reactNative.mod.Animated.Value {
      def this(value: Double) = this()
    }
    
    @JSImport("react-primitives", "Animated.ValueXY")
    @js.native
    class ValueXY ()
      extends typings.reactNative.mod.Animated.ValueXY {
      def this(valueIn: Y) = this()
    }
    
    @JSImport("react-primitives", "Animated.View")
    @js.native
    val View: AnimatedComponent[TypeofView] = js.native
    
    @scala.inline
    def add(a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): typings.reactNative.mod.Animated.AnimatedAddition = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedAddition]
    
    @scala.inline
    def createAnimatedComponent[T /* <: ComponentType[js.Any] */](component: T): AnimatedComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedComponent")(component.asInstanceOf[js.Any]).asInstanceOf[AnimatedComponent[T]]
    
    @scala.inline
    def decay(value: AnimatedValueXY, config: DecayAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("decay")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
    @scala.inline
    def decay(value: AnimatedValue, config: DecayAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("decay")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
    
    @scala.inline
    def delay(time: Double): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(time.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]
    
    @scala.inline
    def diffClamp(a: typings.reactNative.mod.Animated.Animated, min: Double, max: Double): typings.reactNative.mod.Animated.AnimatedDiffClamp = (^.asInstanceOf[js.Dynamic].applyDynamic("diffClamp")(a.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedDiffClamp]
    
    @scala.inline
    def divide(a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): typings.reactNative.mod.Animated.AnimatedDivision = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedDivision]
    
    @scala.inline
    def event[T](argMapping: js.Array[Mapping | Null]): js.Function1[/* repeated */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("event")(argMapping.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Unit]]
    @scala.inline
    def event[T](argMapping: js.Array[Mapping | Null], config: EventConfig[T]): js.Function1[/* repeated */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("event")(argMapping.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Unit]]
    
    @scala.inline
    def loop(animation: CompositeAnimation): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("loop")(animation.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]
    @scala.inline
    def loop(animation: CompositeAnimation, config: LoopAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("loop")(animation.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
    
    @scala.inline
    def modulo(a: typings.reactNative.mod.Animated.Animated, modulus: Double): typings.reactNative.mod.Animated.AnimatedModulo = (^.asInstanceOf[js.Dynamic].applyDynamic("modulo")(a.asInstanceOf[js.Any], modulus.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedModulo]
    
    @scala.inline
    def multiply(a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): typings.reactNative.mod.Animated.AnimatedMultiplication = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedMultiplication]
    
    @scala.inline
    def parallel(animations: js.Array[CompositeAnimation]): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(animations.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]
    @scala.inline
    def parallel(animations: js.Array[CompositeAnimation], config: ParallelConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(animations.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
    
    @scala.inline
    def sequence(animations: js.Array[CompositeAnimation]): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(animations.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]
    
    @scala.inline
    def spring(value: AnimatedValueXY, config: SpringAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
    @scala.inline
    def spring(value: AnimatedValue, config: SpringAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
    
    @scala.inline
    def stagger(time: Double, animations: js.Array[CompositeAnimation]): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(time.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
    
    @scala.inline
    def subtract(a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): typings.reactNative.mod.Animated.AnimatedSubtraction = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedSubtraction]
    
    @scala.inline
    def timing(value: AnimatedValueXY, config: TimingAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
    @scala.inline
    def timing(value: AnimatedValue, config: TimingAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
  }
  
  @JSImport("react-primitives", "Dimensions")
  @js.native
  val Dimensions: typings.reactNative.mod.Dimensions = js.native
  
  @JSImport("react-primitives", "Easing")
  @js.native
  val Easing: EasingStatic = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (args : ...any): react-native.react-native.NativeMethodsMixinType */ @JSImport("react-primitives", "Image")
  @js.native
  class Image protected ()
    extends typings.reactNative.mod.Image {
    def this(props: ImageProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ImageProps, context: js.Any) = this()
  }
  /* static members */
  object Image {
    
    @JSImport("react-primitives", "Image")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-primitives", "Image.abortPrefetch")
    @js.native
    def abortPrefetch: js.UndefOr[js.Function1[/* requestId */ Double, Unit]] = js.native
    @scala.inline
    def abortPrefetch_=(x: js.UndefOr[js.Function1[/* requestId */ Double, Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("abortPrefetch")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getSize(uri: String, success: js.Function2[/* width */ Double, /* height */ Double, Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(uri.asInstanceOf[js.Any], success.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def getSize(
      uri: String,
      success: js.Function2[/* width */ Double, /* height */ Double, Unit],
      failure: js.Function1[/* error */ js.Any, Unit]
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(uri.asInstanceOf[js.Any], success.asInstanceOf[js.Any], failure.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def getSizeWithHeaders(
      uri: String,
      headers: StringDictionary[String],
      success: js.Function2[/* width */ Double, /* height */ Double, Unit]
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSizeWithHeaders")(uri.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], success.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def getSizeWithHeaders(
      uri: String,
      headers: StringDictionary[String],
      success: js.Function2[/* width */ Double, /* height */ Double, Unit],
      failure: js.Function1[/* error */ js.Any, Unit]
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSizeWithHeaders")(uri.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], success.asInstanceOf[js.Any], failure.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def prefetch(url: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("prefetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    @JSImport("react-primitives", "Image.queryCache")
    @js.native
    def queryCache: js.UndefOr[
        js.Function1[
          /* urls */ js.Array[String], 
          js.Promise[StringDictionary[memory | disk | diskSlashmemory]]
        ]
      ] = js.native
    @scala.inline
    def queryCache_=(
      x: js.UndefOr[
          js.Function1[
            /* urls */ js.Array[String], 
            js.Promise[StringDictionary[memory | disk | diskSlashmemory]]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryCache")(x.asInstanceOf[js.Any])
    
    /**
      * @see https://reactnative.dev/docs/image#resolveassetsource
      */
    @scala.inline
    def resolveAssetSource(source: ImageSourcePropType): ImageResolvedAssetSource = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAssetSource")(source.asInstanceOf[js.Any]).asInstanceOf[ImageResolvedAssetSource]
  }
  
  @JSImport("react-primitives", "PixelRatio")
  @js.native
  val PixelRatio: PixelRatioStatic = js.native
  
  @JSImport("react-primitives", "Platform")
  @js.native
  val Platform: PlatformStatic = js.native
  
  object StyleSheet {
    
    @JSImport("react-primitives", "StyleSheet")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-primitives", "StyleSheet.absoluteFill")
    @js.native
    val absoluteFill: RegisteredStyle[AbsoluteFillStyle] = js.native
    
    @JSImport("react-primitives", "StyleSheet.absoluteFillObject")
    @js.native
    val absoluteFillObject: AbsoluteFillStyle = js.native
    
    @scala.inline
    def compose[T](style1: js.Array[StyleProp[T]], style2: js.Array[StyleProp[T]]): StyleProp[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(style1.asInstanceOf[js.Any], style2.asInstanceOf[js.Any])).asInstanceOf[StyleProp[T]]
    @scala.inline
    def compose[T](style1: js.Array[StyleProp[T]], style2: StyleProp[T]): StyleProp[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(style1.asInstanceOf[js.Any], style2.asInstanceOf[js.Any])).asInstanceOf[StyleProp[T]]
    @scala.inline
    def compose[T](style1: StyleProp[T], style2: js.Array[StyleProp[T]]): StyleProp[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(style1.asInstanceOf[js.Any], style2.asInstanceOf[js.Any])).asInstanceOf[StyleProp[T]]
    @scala.inline
    def compose[T](style1: StyleProp[T], style2: StyleProp[T]): StyleProp[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(style1.asInstanceOf[js.Any], style2.asInstanceOf[js.Any])).asInstanceOf[StyleProp[T]]
    
    @scala.inline
    def create[T /* <: NamedStyles[js.Any | T] */](styles: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any]).asInstanceOf[T]
    @scala.inline
    def create[T /* <: NamedStyles[js.Any | T] */](styles: NamedStyles[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @scala.inline
    def flatten[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[T]
    @scala.inline
    def flatten[T](style: StyleProp[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(style.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @JSImport("react-primitives", "StyleSheet.hairlineWidth")
    @js.native
    val hairlineWidth: Double = js.native
    
    @scala.inline
    def setStyleAttributePreprocessor(property: String, process: js.Function1[/* nextProp */ js.Any, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyleAttributePreprocessor")(property.asInstanceOf[js.Any], process.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (args : ...any): react-native.react-native.NativeMethodsMixinType */ @JSImport("react-primitives", "Text")
  @js.native
  class Text protected ()
    extends typings.reactNative.mod.Text {
    def this(props: TextProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TextProps, context: js.Any) = this()
  }
  
  @JSImport("react-primitives", "Touchable")
  @js.native
  val Touchable: ComponentType[TouchableOpacityProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (args : ...any): react-native.react-native.NativeMethodsMixinType */ @JSImport("react-primitives", "View")
  @js.native
  class View protected ()
    extends typings.reactNative.mod.View {
    def this(props: ViewProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ViewProps, context: js.Any) = this()
  }
  /* static members */
  object View {
    
    @JSImport("react-primitives", "View")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Is 3D Touch / Force Touch available (i.e. will touch events include `force`)
      * @platform ios
      */
    @JSImport("react-primitives", "View.forceTouchAvailable")
    @js.native
    def forceTouchAvailable: Boolean = js.native
    @scala.inline
    def forceTouchAvailable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceTouchAvailable")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNative.mod.PlatformOSType
    - typings.reactPrimitives.reactPrimitivesStrings.sketch
    - typings.reactPrimitives.reactPrimitivesStrings.vr
  */
  type PlatformOSType = _PlatformOSType | typings.reactNative.mod.PlatformOSType
  
  trait PlatformStatic extends StObject {
    
    var OS: PlatformOSType
    
    var Version: Double | String
    
    @JSName("select")
    def select_default[T](
      specifics: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ platform in react-primitives.react-primitives.PlatformOSType | 'default' ]:? T}
      */ typings.reactPrimitives.reactPrimitivesStrings.PlatformStatic & TopLevel[js.Any]
    ): T
  }
  object PlatformStatic {
    
    @scala.inline
    def apply(
      OS: PlatformOSType,
      Version: Double | String,
      select: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ platform in react-primitives.react-primitives.PlatformOSType | 'default' ]:? T}
      */ typings.reactPrimitives.reactPrimitivesStrings.PlatformStatic & TopLevel[js.Any] => js.Any
    ): PlatformStatic = {
      val __obj = js.Dynamic.literal(OS = OS.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], select = js.Any.fromFunction1(select))
      __obj.asInstanceOf[PlatformStatic]
    }
    
    @scala.inline
    implicit class PlatformStaticMutableBuilder[Self <: PlatformStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOS(value: PlatformOSType): Self = StObject.set(x, "OS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelect(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ platform in react-primitives.react-primitives.PlatformOSType | 'default' ]:? T}
        */ typings.reactPrimitives.reactPrimitivesStrings.PlatformStatic & TopLevel[js.Any] => js.Any
      ): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVersion(value: Double | String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    }
  }
  
  trait _PlatformOSType extends StObject
}
