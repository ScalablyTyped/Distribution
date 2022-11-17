package typings.reactPrimitives

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.reactNative.anon.TypeofImage
import typings.reactNative.anon.Typeof_View
import typings.reactNative.anon.Y
import typings.reactNative.mod.Animated.AnimatedComponent
import typings.reactNative.mod.Animated.AnimatedComponentOptions
import typings.reactNative.mod.Animated.AnimatedConfig
import typings.reactNative.mod.Animated.AnimatedProps
import typings.reactNative.mod.Animated.AnimatedValue
import typings.reactNative.mod.Animated.AnimatedValueXY
import typings.reactNative.mod.Animated.CompositeAnimation
import typings.reactNative.mod.Animated.DecayAnimationConfig
import typings.reactNative.mod.Animated.EventConfig
import typings.reactNative.mod.Animated.LoopAnimationConfig
import typings.reactNative.mod.Animated.Mapping
import typings.reactNative.mod.Animated.ParallelConfig
import typings.reactNative.mod.Animated.RgbaAnimatedValue
import typings.reactNative.mod.Animated.RgbaValue
import typings.reactNative.mod.Animated.SpringAnimationConfig
import typings.reactNative.mod.Animated.TimingAnimationConfig
import typings.reactNative.mod.ColorValue
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
    open class Animated ()
      extends typings.reactNative.mod.Animated.Animated
    
    @JSImport("react-primitives", "Animated.AnimatedAddition")
    @js.native
    open class AnimatedAddition[OutputT /* <: Double | String */] ()
      extends typings.reactNative.mod.Animated.AnimatedAddition[OutputT]
    
    @JSImport("react-primitives", "Animated.AnimatedColor")
    @js.native
    open class AnimatedColor ()
      extends typings.reactNative.mod.Animated.AnimatedColor {
      def this(valueIn: RgbaAnimatedValue) = this()
      def this(valueIn: RgbaValue) = this()
      def this(valueIn: ColorValue) = this()
      def this(valueIn: Null, config: AnimatedConfig) = this()
      def this(valueIn: Unit, config: AnimatedConfig) = this()
      def this(valueIn: RgbaAnimatedValue, config: AnimatedConfig) = this()
      def this(valueIn: RgbaValue, config: AnimatedConfig) = this()
      def this(valueIn: ColorValue, config: AnimatedConfig) = this()
    }
    
    @JSImport("react-primitives", "Animated.AnimatedDiffClamp")
    @js.native
    open class AnimatedDiffClamp[OutputT /* <: Double | String */] ()
      extends typings.reactNative.mod.Animated.AnimatedDiffClamp[OutputT]
    
    @JSImport("react-primitives", "Animated.AnimatedDivision")
    @js.native
    open class AnimatedDivision[OutputT /* <: Double | String */] ()
      extends typings.reactNative.mod.Animated.AnimatedDivision[OutputT]
    
    @JSImport("react-primitives", "Animated.AnimatedInterpolation")
    @js.native
    open class AnimatedInterpolation[OutputT /* <: Double | String */] ()
      extends typings.reactNative.mod.Animated.AnimatedInterpolation[OutputT]
    
    @JSImport("react-primitives", "Animated.AnimatedModulo")
    @js.native
    open class AnimatedModulo[OutputT /* <: Double | String */] ()
      extends typings.reactNative.mod.Animated.AnimatedModulo[OutputT]
    
    @JSImport("react-primitives", "Animated.AnimatedMultiplication")
    @js.native
    open class AnimatedMultiplication[OutputT /* <: Double | String */] ()
      extends typings.reactNative.mod.Animated.AnimatedMultiplication[OutputT]
    
    @JSImport("react-primitives", "Animated.AnimatedNode")
    @js.native
    open class AnimatedNode ()
      extends typings.reactNative.mod.Animated.AnimatedNode
    
    @JSImport("react-primitives", "Animated.AnimatedSubtraction")
    @js.native
    open class AnimatedSubtraction[OutputT /* <: Double | String */] ()
      extends typings.reactNative.mod.Animated.AnimatedSubtraction[OutputT]
    
    @JSImport("react-primitives", "Animated.AnimatedWithChildren")
    @js.native
    open class AnimatedWithChildren ()
      extends typings.reactNative.mod.Animated.AnimatedWithChildren
    
    @JSImport("react-primitives", "Animated.FlatList")
    @js.native
    open class FlatList[ItemT] protected ()
      extends typings.reactNative.mod.Animated.FlatList[ItemT] {
      def this(props: AnimatedProps[FlatListProps[ItemT]]) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: AnimatedProps[FlatListProps[ItemT]], context: Any) = this()
    }
    
    @JSImport("react-primitives", "Animated.Image")
    @js.native
    val Image: AnimatedComponent[TypeofImage] = js.native
    
    @JSImport("react-primitives", "Animated.ScrollView")
    @js.native
    val ScrollView: AnimatedComponent[Instantiable0[_ScrollView]] = js.native
    
    @JSImport("react-primitives", "Animated.SectionList")
    @js.native
    open class SectionList[ItemT, SectionT] protected ()
      extends typings.reactNative.mod.Animated.SectionList[ItemT, SectionT] {
      def this(props: AnimatedProps[SectionListProps[ItemT, SectionT]]) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: AnimatedProps[SectionListProps[ItemT, SectionT]], context: Any) = this()
    }
    
    @JSImport("react-primitives", "Animated.Text")
    @js.native
    val Text: AnimatedComponent[Instantiable0[_Text]] = js.native
    
    @JSImport("react-primitives", "Animated.Value")
    @js.native
    open class Value protected ()
      extends typings.reactNative.mod.Animated.Value {
      def this(value: Double) = this()
      def this(value: Double, config: AnimatedConfig) = this()
    }
    
    @JSImport("react-primitives", "Animated.ValueXY")
    @js.native
    open class ValueXY ()
      extends typings.reactNative.mod.Animated.ValueXY {
      def this(valueIn: Y) = this()
      def this(valueIn: Unit, config: AnimatedConfig) = this()
      def this(valueIn: Y, config: AnimatedConfig) = this()
    }
    
    @JSImport("react-primitives", "Animated.View")
    @js.native
    val View: AnimatedComponent[Typeof_View] = js.native
    
    inline def add[OutputT /* <: Double | String */](a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): typings.reactNative.mod.Animated.AnimatedAddition[OutputT] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedAddition[OutputT]]
    
    inline def createAnimatedComponent[T /* <: ComponentType[Any] */](component: T): AnimatedComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedComponent")(component.asInstanceOf[js.Any]).asInstanceOf[AnimatedComponent[T]]
    inline def createAnimatedComponent[T /* <: ComponentType[Any] */](component: T, options: AnimatedComponentOptions): AnimatedComponent[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedComponent")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimatedComponent[T]]
    
    inline def decay(value: AnimatedValueXY, config: DecayAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("decay")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
    inline def decay(value: AnimatedValue, config: DecayAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("decay")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
    
    inline def delay(time: Double): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(time.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]
    
    inline def diffClamp[OutputT /* <: Double | String */](a: typings.reactNative.mod.Animated.Animated, min: Double, max: Double): typings.reactNative.mod.Animated.AnimatedDiffClamp[OutputT] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffClamp")(a.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedDiffClamp[OutputT]]
    
    inline def divide[OutputT /* <: Double | String */](a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): typings.reactNative.mod.Animated.AnimatedDivision[OutputT] = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedDivision[OutputT]]
    
    inline def event[T](argMapping: js.Array[Mapping | Null]): js.Function1[/* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("event")(argMapping.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
    inline def event[T](argMapping: js.Array[Mapping | Null], config: EventConfig[T]): js.Function1[/* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("event")(argMapping.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
    
    inline def loop(animation: CompositeAnimation): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("loop")(animation.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]
    inline def loop(animation: CompositeAnimation, config: LoopAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("loop")(animation.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
    
    inline def modulo[OutputT /* <: Double | String */](a: typings.reactNative.mod.Animated.Animated, modulus: Double): typings.reactNative.mod.Animated.AnimatedModulo[OutputT] = (^.asInstanceOf[js.Dynamic].applyDynamic("modulo")(a.asInstanceOf[js.Any], modulus.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedModulo[OutputT]]
    
    inline def multiply[OutputT /* <: Double | String */](a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): typings.reactNative.mod.Animated.AnimatedMultiplication[OutputT] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedMultiplication[OutputT]]
    
    inline def parallel(animations: js.Array[CompositeAnimation]): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(animations.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]
    inline def parallel(animations: js.Array[CompositeAnimation], config: ParallelConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(animations.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
    
    inline def sequence(animations: js.Array[CompositeAnimation]): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(animations.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]
    
    inline def spring(value: AnimatedValueXY, config: SpringAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
    inline def spring(value: AnimatedValue, config: SpringAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
    
    inline def stagger(time: Double, animations: js.Array[CompositeAnimation]): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(time.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
    
    inline def subtract[OutputT /* <: Double | String */](a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): typings.reactNative.mod.Animated.AnimatedSubtraction[OutputT] = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedSubtraction[OutputT]]
    
    inline def timing(value: AnimatedValueXY, config: TimingAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
    inline def timing(value: AnimatedValue, config: TimingAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
  }
  
  @JSImport("react-primitives", "Dimensions")
  @js.native
  val Dimensions: typings.reactNative.mod.Dimensions = js.native
  
  @JSImport("react-primitives", "Easing")
  @js.native
  val Easing: EasingStatic = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (args : ...any): react-native.react-native.NativeMethods */ @JSImport("react-primitives", "Image")
  @js.native
  open class Image protected ()
    extends typings.reactNative.mod.Image {
    def this(props: ImageProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ImageProps, context: Any) = this()
  }
  /* static members */
  object Image {
    
    @JSImport("react-primitives", "Image")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-primitives", "Image.abortPrefetch")
    @js.native
    def abortPrefetch: js.UndefOr[js.Function1[/* requestId */ Double, Unit]] = js.native
    inline def abortPrefetch_=(x: js.UndefOr[js.Function1[/* requestId */ Double, Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("abortPrefetch")(x.asInstanceOf[js.Any])
    
    inline def getSize(uri: String, success: js.Function2[/* width */ Double, /* height */ Double, Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(uri.asInstanceOf[js.Any], success.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getSize(
      uri: String,
      success: js.Function2[/* width */ Double, /* height */ Double, Unit],
      failure: js.Function1[/* error */ Any, Unit]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(uri.asInstanceOf[js.Any], success.asInstanceOf[js.Any], failure.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getSizeWithHeaders(
      uri: String,
      headers: StringDictionary[String],
      success: js.Function2[/* width */ Double, /* height */ Double, Unit]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSizeWithHeaders")(uri.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], success.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getSizeWithHeaders(
      uri: String,
      headers: StringDictionary[String],
      success: js.Function2[/* width */ Double, /* height */ Double, Unit],
      failure: js.Function1[/* error */ Any, Unit]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSizeWithHeaders")(uri.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], success.asInstanceOf[js.Any], failure.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def prefetch(url: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("prefetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    inline def prefetchWithMetadata(url: String, queryRootName: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("prefetchWithMetadata")(url.asInstanceOf[js.Any], queryRootName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def prefetchWithMetadata(url: String, queryRootName: String, rootTag: Double): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("prefetchWithMetadata")(url.asInstanceOf[js.Any], queryRootName.asInstanceOf[js.Any], rootTag.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    @JSImport("react-primitives", "Image.queryCache")
    @js.native
    def queryCache: js.UndefOr[
        js.Function1[
          /* urls */ js.Array[String], 
          js.Promise[StringDictionary["memory" | "disk" | "disk/memory"]]
        ]
      ] = js.native
    inline def queryCache_=(
      x: js.UndefOr[
          js.Function1[
            /* urls */ js.Array[String], 
            js.Promise[StringDictionary["memory" | "disk" | "disk/memory"]]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryCache")(x.asInstanceOf[js.Any])
    
    /**
      * @see https://reactnative.dev/docs/image#resolveassetsource
      */
    inline def resolveAssetSource(source: ImageSourcePropType): ImageResolvedAssetSource = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAssetSource")(source.asInstanceOf[js.Any]).asInstanceOf[ImageResolvedAssetSource]
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
    
    inline def compose[T](style1: js.Array[StyleProp[T]], style2: js.Array[StyleProp[T]]): StyleProp[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(style1.asInstanceOf[js.Any], style2.asInstanceOf[js.Any])).asInstanceOf[StyleProp[T]]
    inline def compose[T](style1: js.Array[StyleProp[T]], style2: StyleProp[T]): StyleProp[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(style1.asInstanceOf[js.Any], style2.asInstanceOf[js.Any])).asInstanceOf[StyleProp[T]]
    inline def compose[T](style1: StyleProp[T], style2: js.Array[StyleProp[T]]): StyleProp[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(style1.asInstanceOf[js.Any], style2.asInstanceOf[js.Any])).asInstanceOf[StyleProp[T]]
    inline def compose[T](style1: StyleProp[T], style2: StyleProp[T]): StyleProp[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(style1.asInstanceOf[js.Any], style2.asInstanceOf[js.Any])).asInstanceOf[StyleProp[T]]
    
    inline def create[T /* <: NamedStyles[Any | T] */](styles: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def create[T /* <: NamedStyles[Any | T] */](styles: NamedStyles[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def flatten[T](): /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer U> ? U : T */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer U> ? U : T */ js.Any]
    inline def flatten[T](style: StyleProp[T]): /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer U> ? U : T */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(style.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer U> ? U : T */ js.Any]
    
    @JSImport("react-primitives", "StyleSheet.hairlineWidth")
    @js.native
    val hairlineWidth: Double = js.native
    
    inline def setStyleAttributePreprocessor(property: String, process: js.Function1[/* nextProp */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyleAttributePreprocessor")(property.asInstanceOf[js.Any], process.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (args : ...any): react-native.react-native.NativeMethods */ @JSImport("react-primitives", "Text")
  @js.native
  open class Text protected ()
    extends typings.reactNative.mod.Text {
    def this(props: TextProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TextProps, context: Any) = this()
  }
  
  @JSImport("react-primitives", "Touchable")
  @js.native
  val Touchable: ComponentType[TouchableOpacityProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (args : ...any): react-native.react-native.NativeMethods */ @JSImport("react-primitives", "View")
  @js.native
  open class View protected ()
    extends typings.reactNative.mod.View {
    def this(props: ViewProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ViewProps, context: Any) = this()
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
    inline def forceTouchAvailable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceTouchAvailable")(x.asInstanceOf[js.Any])
  }
  
  type PlatformOSType = typings.reactNative.mod.PlatformOSType | "sketch" | "vr"
  
  trait PlatformStatic extends StObject {
    
    var OS: PlatformOSType
    
    var Version: Double | String
    
    @JSName("select")
    @scala.annotation.targetName("select_default")
    def select[T](
      specifics: /* import warning: importer.ImportType#apply Failed type conversion: {[ platform in react-primitives.react-primitives.PlatformOSType | 'default' ]:? T} */ js.Any
    ): T
  }
  object PlatformStatic {
    
    inline def apply(
      OS: PlatformOSType,
      Version: Double | String,
      select: /* import warning: importer.ImportType#apply Failed type conversion: {[ platform in react-primitives.react-primitives.PlatformOSType | 'default' ]:? T} */ js.Any => Any
    ): PlatformStatic = {
      val __obj = js.Dynamic.literal(OS = OS.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], select = js.Any.fromFunction1(select))
      __obj.asInstanceOf[PlatformStatic]
    }
    
    extension [Self <: PlatformStatic](x: Self) {
      
      inline def setOS(value: PlatformOSType): Self = StObject.set(x, "OS", value.asInstanceOf[js.Any])
      
      inline def setSelect(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ platform in react-primitives.react-primitives.PlatformOSType | 'default' ]:? T} */ js.Any => Any
      ): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setVersion(value: Double | String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    }
  }
}
