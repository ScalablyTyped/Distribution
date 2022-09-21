package typings.reactNativeSvg

import typings.reactNative.mod.AccessibilityProps
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.Insets
import typings.reactNative.mod.MeasureInWindowOnSuccessCallback
import typings.reactNative.mod.MeasureLayoutOnSuccessCallback
import typings.reactNative.mod.MeasureOnSuccessCallback
import typings.reactNative.mod.PointerEvents
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.Touchable
import typings.reactNative.mod.ViewPropsAndroid
import typings.reactNative.mod.ViewPropsIOS
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSvg.anon.ObjectwidthNumberPropunde
import typings.reactNativeSvg.anon.PreserveAspectRatio
import typings.reactNativeSvg.gMod.GProps
import typings.reactNativeSvg.typesMod.NumberProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/Svg", JSImport.Default)
  @js.native
  open class default () extends Svg
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/Svg", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/Svg", "default.defaultProps")
    @js.native
    def defaultProps: PreserveAspectRatio = js.native
    inline def defaultProps_=(x: PreserveAspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-svg/lib/typescript/elements/Svg", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Svg
    extends typings.reactNativeSvg.shapeMod.default[SvgProps] {
    
    def measure(callback: MeasureOnSuccessCallback): Unit = js.native
    
    def measureInWindow(callback: MeasureInWindowOnSuccessCallback): Unit = js.native
    
    def measureLayout(
      relativeToNativeNode: Double,
      onSuccess: MeasureLayoutOnSuccessCallback,
      onFail: js.Function0[Unit]
    ): Unit = js.native
    
    def setNativeProps(props: ObjectwidthNumberPropunde): Unit = js.native
    
    def toDataURL(callback: js.Function1[/* base64 */ String, Unit]): Unit = js.native
    def toDataURL(callback: js.Function1[/* base64 */ String, Unit], options: js.Object): Unit = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactNative.mod.GestureResponderHandlers because Already inherited
  - typings.reactNative.mod.ViewProps because var conflicts: children, onLayout, onMoveShouldSetResponder, onMoveShouldSetResponderCapture, onResponderEnd, onResponderGrant, onResponderMove, onResponderReject, onResponderRelease, onResponderStart, onResponderTerminate, onResponderTerminationRequest, onStartShouldSetResponder, onStartShouldSetResponderCapture, pointerEvents. Inlined hitSlop, style, removeClippedSubviews, nativeID, testID */ trait SvgProps
    extends StObject
       with GProps
       with ViewPropsAndroid
       with ViewPropsIOS
       with Touchable
       with PointerEvents
       with AccessibilityProps {
    
    var color: js.UndefOr[ColorValue] = js.undefined
    
    var height: js.UndefOr[NumberProp] = js.undefined
    
    /**
      * This defines how far a touch event can start away from the view.
      * Typical interface guidelines recommend touch targets that are at least
      * 30 - 40 points/density-independent pixels. If a Touchable view has
      * a height of 20 the touchable height can be extended to 40 with
      * hitSlop={{top: 10, bottom: 10, left: 0, right: 0}}
      * NOTE The touch area never extends past the parent view bounds and
      * the Z-index of sibling views always takes precedence if a touch
      * hits two overlapping views.
      */
    var hitSlop: js.UndefOr[Insets] = js.undefined
    
    /**
      * Used to reference react managed views from native code.
      */
    var nativeID: js.UndefOr[String] = js.undefined
    
    var preserveAspectRatio: js.UndefOr[String] = js.undefined
    
    /**
      *
      * This is a special performance property exposed by RCTView and is useful for scrolling content when there are many subviews,
      * most of which are offscreen. For this property to be effective, it must be applied to a view that contains many subviews that extend outside its bound.
      * The subviews must also have overflow: hidden, as should the containing view (or one of its superviews).
      */
    var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Used to locate this view in end-to-end tests.
      */
    var testID: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var viewBox: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[NumberProp] = js.undefined
  }
  object SvgProps {
    
    inline def apply(): SvgProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SvgProps]
    }
    
    extension [Self <: SvgProps](x: Self) {
      
      inline def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setHeight(value: NumberProp): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      inline def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
      
      inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
      
      inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      inline def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
      
      inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      inline def setWidth(value: NumberProp): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
