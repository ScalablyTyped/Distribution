package typings.reactNativeSvg

import org.scalablytyped.runtime.Shortcut
import typings.reactNative.librariesTypesCodegenTypesMod.Double
import typings.reactNative.librariesTypesCodegenTypesMod.Float
import typings.reactNative.librariesTypesCodegenTypesMod.Int32
import typings.reactNative.librariesUtilitiesCodegenNativeComponentMod.NativeComponentType
import typings.reactNative.mod.ColorValue
import typings.reactNativeSvg.libTypescriptFabricUtilsMod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptFabricAndroidSvgViewNativeComponentMod extends Shortcut {
  
  @JSImport("react-native-svg/lib/typescript/fabric/AndroidSvgViewNativeComponent", JSImport.Default)
  @js.native
  val default: NativeComponentType[NativeProps] = js.native
  
  /* Inlined std.Readonly<{  left :react-native.react-native/Libraries/Types/CodegenTypes.Float | undefined,   top :react-native.react-native/Libraries/Types/CodegenTypes.Float | undefined,   right :react-native.react-native/Libraries/Types/CodegenTypes.Float | undefined,   bottom :react-native.react-native/Libraries/Types/CodegenTypes.Float | undefined}> */
  trait HitSlop extends StObject {
    
    val bottom: js.UndefOr[Float] = js.undefined
    
    val left: js.UndefOr[Float] = js.undefined
    
    val right: js.UndefOr[Float] = js.undefined
    
    val top: js.UndefOr[Float] = js.undefined
  }
  object HitSlop {
    
    inline def apply(): HitSlop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HitSlop]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HitSlop] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Float): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Float): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Float): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Float): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<{  type :string | undefined,   color :react-native.react-native/Libraries/Types/CodegenTypes.Float | undefined,   borderless :boolean | undefined,   rippleRadius :react-native.react-native/Libraries/Types/CodegenTypes.Float | undefined}> */
  trait NativeBackgroundProp extends StObject {
    
    val borderless: js.UndefOr[Boolean] = js.undefined
    
    val color: js.UndefOr[Float] = js.undefined
    
    val rippleRadius: js.UndefOr[Float] = js.undefined
    
    val `type`: js.UndefOr[String] = js.undefined
  }
  object NativeBackgroundProp {
    
    inline def apply(): NativeBackgroundProp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeBackgroundProp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeBackgroundProp] (val x: Self) extends AnyVal {
      
      inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
      
      inline def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
      
      inline def setColor(value: Float): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setRippleRadius(value: Float): Self = StObject.set(x, "rippleRadius", value.asInstanceOf[js.Any])
      
      inline def setRippleRadiusUndefined: Self = StObject.set(x, "rippleRadius", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait NativeProps
    extends StObject
       with ViewProps {
    
    var align: js.UndefOr[String] = js.undefined
    
    var backfaceVisibility: js.UndefOr[String] = js.undefined
    
    var bbHeight: js.UndefOr[String] = js.undefined
    
    var bbWidth: js.UndefOr[String] = js.undefined
    
    var borderBottomColor: js.UndefOr[ColorValue] = js.undefined
    
    var borderBottomEndRadius: js.UndefOr[Float] = js.undefined
    
    var borderBottomLeftRadius: js.UndefOr[Double] = js.undefined
    
    var borderBottomRightRadius: js.UndefOr[Double] = js.undefined
    
    var borderBottomStartRadius: js.UndefOr[Float] = js.undefined
    
    var borderColor: js.UndefOr[ColorValue] = js.undefined
    
    var borderEndColor: js.UndefOr[ColorValue] = js.undefined
    
    var borderLeftColor: js.UndefOr[ColorValue] = js.undefined
    
    var borderRadius: js.UndefOr[Double] = js.undefined
    
    var borderRightColor: js.UndefOr[ColorValue] = js.undefined
    
    var borderStartColor: js.UndefOr[ColorValue] = js.undefined
    
    var borderStyle: js.UndefOr[String] = js.undefined
    
    var borderTopColor: js.UndefOr[ColorValue] = js.undefined
    
    var borderTopEndRadius: js.UndefOr[Float] = js.undefined
    
    var borderTopLeftRadius: js.UndefOr[Double] = js.undefined
    
    var borderTopRightRadius: js.UndefOr[Double] = js.undefined
    
    var borderTopStartRadius: js.UndefOr[Float] = js.undefined
    
    var color: js.UndefOr[ColorValue] = js.undefined
    
    @JSName("hitSlop")
    var hitSlop_NativeProps: js.UndefOr[HitSlop] = js.undefined
    
    var meetOrSlice: js.UndefOr[Int32] = js.undefined
    
    var minX: js.UndefOr[Float] = js.undefined
    
    var minY: js.UndefOr[Float] = js.undefined
    
    var nativeBackgroundAndroid: js.UndefOr[NativeBackgroundProp] = js.undefined
    
    var nativeForegroundAndroid: js.UndefOr[NativeBackgroundProp] = js.undefined
    
    var nextFocusDown: js.UndefOr[Int32] = js.undefined
    
    var nextFocusForward: js.UndefOr[Int32] = js.undefined
    
    var nextFocusLeft: js.UndefOr[Int32] = js.undefined
    
    var nextFocusRight: js.UndefOr[Int32] = js.undefined
    
    var nextFocusUp: js.UndefOr[Int32] = js.undefined
    
    var pointerEvents: js.UndefOr[String] = js.undefined
    
    var tintColor: js.UndefOr[ColorValue] = js.undefined
    
    var vbHeight: js.UndefOr[Float] = js.undefined
    
    var vbWidth: js.UndefOr[Float] = js.undefined
  }
  object NativeProps {
    
    inline def apply(): NativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeProps] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBackfaceVisibility(value: String): Self = StObject.set(x, "backfaceVisibility", value.asInstanceOf[js.Any])
      
      inline def setBackfaceVisibilityUndefined: Self = StObject.set(x, "backfaceVisibility", js.undefined)
      
      inline def setBbHeight(value: String): Self = StObject.set(x, "bbHeight", value.asInstanceOf[js.Any])
      
      inline def setBbHeightUndefined: Self = StObject.set(x, "bbHeight", js.undefined)
      
      inline def setBbWidth(value: String): Self = StObject.set(x, "bbWidth", value.asInstanceOf[js.Any])
      
      inline def setBbWidthUndefined: Self = StObject.set(x, "bbWidth", js.undefined)
      
      inline def setBorderBottomColor(value: ColorValue): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
      
      inline def setBorderBottomEndRadius(value: Float): Self = StObject.set(x, "borderBottomEndRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomEndRadiusUndefined: Self = StObject.set(x, "borderBottomEndRadius", js.undefined)
      
      inline def setBorderBottomLeftRadius(value: Double): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "borderBottomLeftRadius", js.undefined)
      
      inline def setBorderBottomRightRadius(value: Double): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomRightRadiusUndefined: Self = StObject.set(x, "borderBottomRightRadius", js.undefined)
      
      inline def setBorderBottomStartRadius(value: Float): Self = StObject.set(x, "borderBottomStartRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomStartRadiusUndefined: Self = StObject.set(x, "borderBottomStartRadius", js.undefined)
      
      inline def setBorderColor(value: ColorValue): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderEndColor(value: ColorValue): Self = StObject.set(x, "borderEndColor", value.asInstanceOf[js.Any])
      
      inline def setBorderEndColorUndefined: Self = StObject.set(x, "borderEndColor", js.undefined)
      
      inline def setBorderLeftColor(value: ColorValue): Self = StObject.set(x, "borderLeftColor", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftColorUndefined: Self = StObject.set(x, "borderLeftColor", js.undefined)
      
      inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setBorderRightColor(value: ColorValue): Self = StObject.set(x, "borderRightColor", value.asInstanceOf[js.Any])
      
      inline def setBorderRightColorUndefined: Self = StObject.set(x, "borderRightColor", js.undefined)
      
      inline def setBorderStartColor(value: ColorValue): Self = StObject.set(x, "borderStartColor", value.asInstanceOf[js.Any])
      
      inline def setBorderStartColorUndefined: Self = StObject.set(x, "borderStartColor", js.undefined)
      
      inline def setBorderStyle(value: String): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setBorderTopColor(value: ColorValue): Self = StObject.set(x, "borderTopColor", value.asInstanceOf[js.Any])
      
      inline def setBorderTopColorUndefined: Self = StObject.set(x, "borderTopColor", js.undefined)
      
      inline def setBorderTopEndRadius(value: Float): Self = StObject.set(x, "borderTopEndRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderTopEndRadiusUndefined: Self = StObject.set(x, "borderTopEndRadius", js.undefined)
      
      inline def setBorderTopLeftRadius(value: Double): Self = StObject.set(x, "borderTopLeftRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderTopLeftRadiusUndefined: Self = StObject.set(x, "borderTopLeftRadius", js.undefined)
      
      inline def setBorderTopRightRadius(value: Double): Self = StObject.set(x, "borderTopRightRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderTopRightRadiusUndefined: Self = StObject.set(x, "borderTopRightRadius", js.undefined)
      
      inline def setBorderTopStartRadius(value: Float): Self = StObject.set(x, "borderTopStartRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderTopStartRadiusUndefined: Self = StObject.set(x, "borderTopStartRadius", js.undefined)
      
      inline def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setHitSlop(value: HitSlop): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      inline def setMeetOrSlice(value: Int32): Self = StObject.set(x, "meetOrSlice", value.asInstanceOf[js.Any])
      
      inline def setMeetOrSliceUndefined: Self = StObject.set(x, "meetOrSlice", js.undefined)
      
      inline def setMinX(value: Float): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinXUndefined: Self = StObject.set(x, "minX", js.undefined)
      
      inline def setMinY(value: Float): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
      
      inline def setMinYUndefined: Self = StObject.set(x, "minY", js.undefined)
      
      inline def setNativeBackgroundAndroid(value: NativeBackgroundProp): Self = StObject.set(x, "nativeBackgroundAndroid", value.asInstanceOf[js.Any])
      
      inline def setNativeBackgroundAndroidUndefined: Self = StObject.set(x, "nativeBackgroundAndroid", js.undefined)
      
      inline def setNativeForegroundAndroid(value: NativeBackgroundProp): Self = StObject.set(x, "nativeForegroundAndroid", value.asInstanceOf[js.Any])
      
      inline def setNativeForegroundAndroidUndefined: Self = StObject.set(x, "nativeForegroundAndroid", js.undefined)
      
      inline def setNextFocusDown(value: Int32): Self = StObject.set(x, "nextFocusDown", value.asInstanceOf[js.Any])
      
      inline def setNextFocusDownUndefined: Self = StObject.set(x, "nextFocusDown", js.undefined)
      
      inline def setNextFocusForward(value: Int32): Self = StObject.set(x, "nextFocusForward", value.asInstanceOf[js.Any])
      
      inline def setNextFocusForwardUndefined: Self = StObject.set(x, "nextFocusForward", js.undefined)
      
      inline def setNextFocusLeft(value: Int32): Self = StObject.set(x, "nextFocusLeft", value.asInstanceOf[js.Any])
      
      inline def setNextFocusLeftUndefined: Self = StObject.set(x, "nextFocusLeft", js.undefined)
      
      inline def setNextFocusRight(value: Int32): Self = StObject.set(x, "nextFocusRight", value.asInstanceOf[js.Any])
      
      inline def setNextFocusRightUndefined: Self = StObject.set(x, "nextFocusRight", js.undefined)
      
      inline def setNextFocusUp(value: Int32): Self = StObject.set(x, "nextFocusUp", value.asInstanceOf[js.Any])
      
      inline def setNextFocusUpUndefined: Self = StObject.set(x, "nextFocusUp", js.undefined)
      
      inline def setPointerEvents(value: String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setTintColor(value: ColorValue): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
      
      inline def setVbHeight(value: Float): Self = StObject.set(x, "vbHeight", value.asInstanceOf[js.Any])
      
      inline def setVbHeightUndefined: Self = StObject.set(x, "vbHeight", js.undefined)
      
      inline def setVbWidth(value: Float): Self = StObject.set(x, "vbWidth", value.asInstanceOf[js.Any])
      
      inline def setVbWidthUndefined: Self = StObject.set(x, "vbWidth", js.undefined)
    }
  }
  
  type _To = NativeComponentType[NativeProps]
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptFabricAndroidSvgViewNativeComponentMod.foo` */
  override def _to: NativeComponentType[NativeProps] = default
}
