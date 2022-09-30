package typings.reactNativeVectorIcons

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.reactNative.mod.BackgroundPropType
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.Insets
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.TVProps
import typings.reactNative.mod.TabBarIOSItemProps
import typings.reactNative.mod.TargetedEvent
import typings.reactNative.mod.TextProps
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.TouchableWithoutFeedbackPropsAndroid
import typings.reactNative.mod.TouchableWithoutFeedbackPropsIOS
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod {
  
  @JSImport("react-native-vector-icons/Icon", "Icon")
  @js.native
  open class Icon protected () extends Component[IconProps, Any, Any] {
    def this(props: IconProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IconProps, context: Any) = this()
  }
  /* static members */
  object Icon {
    
    @JSImport("react-native-vector-icons/Icon", "Icon")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-vector-icons/Icon", "Icon.Button")
    @js.native
    open class Button protected () extends Component[IconButtonProps, Any, Any] {
      def this(props: IconButtonProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: IconButtonProps, context: Any) = this()
    }
    
    @JSImport("react-native-vector-icons/Icon", "Icon.TabBarItem")
    @js.native
    open class TabBarItem protected () extends Component[TabBarItemIOSProps, Any, Any] {
      def this(props: TabBarItemIOSProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: TabBarItemIOSProps, context: Any) = this()
    }
    
    @JSImport("react-native-vector-icons/Icon", "Icon.TabBarItemIOS")
    @js.native
    open class TabBarItemIOS protected () extends Component[TabBarItemIOSProps, Any, Any] {
      def this(props: TabBarItemIOSProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: TabBarItemIOSProps, context: Any) = this()
    }
    
    inline def getFontFamily(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontFamily")().asInstanceOf[String]
    
    inline def getImageSource(name: String): js.Promise[ImageSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageSource]]
    inline def getImageSource(name: String, size: Double): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    inline def getImageSource(name: String, size: Double, color: Double): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    inline def getImageSource(name: String, size: Double, color: ColorValue): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    inline def getImageSource(name: String, size: Unit, color: Double): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    inline def getImageSource(name: String, size: Unit, color: ColorValue): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    
    inline def getImageSourceSync(name: String): ImageSource = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any]).asInstanceOf[ImageSource]
    inline def getImageSourceSync(name: String, size: Double): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    inline def getImageSourceSync(name: String, size: Double, color: Double): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    inline def getImageSourceSync(name: String, size: Double, color: ColorValue): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    inline def getImageSourceSync(name: String, size: Unit, color: Double): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    inline def getImageSourceSync(name: String, size: Unit, color: ColorValue): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    
    inline def getRawGlyphMap(): StringDictionary[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRawGlyphMap")().asInstanceOf[StringDictionary[Double]]
    
    inline def hasIcon(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasIcon")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def loadFont(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFont")().asInstanceOf[js.Promise[Unit]]
    inline def loadFont(file: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFont")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactNative.mod.AccessibilityPropsIOS because Already inherited
  - typings.reactNative.mod.AccessibilityPropsAndroid because Already inherited
  - typings.reactNative.mod.AccessibilityProps because Already inherited
  - typings.reactNative.mod.TouchableWithoutFeedbackProps because var conflicts: accessibilityActions, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLabelledBy, accessibilityLanguage, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityValue, accessibilityViewIsModal, accessible, children, disabled, importantForAccessibility, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onLongPress, onMagicTap, onPress, onPressIn, onPressOut, style, testID. Inlined hitSlop, onFocus, delayLongPress, onBlur, delayPressOut, pressRetentionOffset, delayPressIn
  - typings.reactNative.mod.TouchableNativeFeedbackProps because var conflicts: accessibilityActions, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLabelledBy, accessibilityLanguage, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityValue, accessibilityViewIsModal, accessible, children, disabled, importantForAccessibility, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onLongPress, onMagicTap, onPress, onPressIn, onPressOut, style, testID. Inlined useForeground, background
  - typings.reactNative.mod.TouchableHighlightProps because var conflicts: accessibilityActions, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLabelledBy, accessibilityLanguage, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityValue, accessibilityViewIsModal, accessible, children, disabled, importantForAccessibility, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onLongPress, onMagicTap, onPress, onPressIn, onPressOut, style, testID. Inlined onShowUnderlay, onHideUnderlay, underlayColor, activeOpacity */ trait IconButtonProps
    extends StObject
       with IconProps
       with TVProps
       with TouchableWithoutFeedbackPropsIOS
       with TouchableWithoutFeedbackPropsAndroid {
    
    /**
      * Determines what the opacity of the wrapped view should be when touch is active.
      */
    var activeOpacity: js.UndefOr[Double] = js.undefined
    
    /**
      * Determines the type of background drawable that's going to be used to display feedback.
      * It takes an object with type property and extra data depending on the type.
      * It's recommended to use one of the following static methods to generate that dictionary:
      *      1) TouchableNativeFeedback.SelectableBackground() - will create object that represents android theme's
      *         default background for selectable elements (?android:attr/selectableItemBackground)
      *      2) TouchableNativeFeedback.SelectableBackgroundBorderless() - will create object that represent android
      *         theme's default background for borderless selectable elements
      *         (?android:attr/selectableItemBackgroundBorderless). Available on android API level 21+
      *      3) TouchableNativeFeedback.Ripple(color, borderless) - will create object that represents ripple drawable
      *         with specified color (as a string). If property borderless evaluates to true the ripple will render
      *         outside of the view bounds (see native actionbar buttons as an example of that behavior). This background
      *         type is available on Android API level 21+
      */
    var background: js.UndefOr[BackgroundPropType] = js.undefined
    
    /**
      * Background color of the button
      *
      * @default '#007AFF'
      */
    var backgroundColor: js.UndefOr[ColorValue | Double] = js.undefined
    
    /**
      * Border radius of the button
      * Set to 0 to disable.
      *
      * @default 5
      */
    var borderRadius: js.UndefOr[Double] = js.undefined
    
    /**
      * Delay in ms, from onPressIn, before onLongPress is called.
      */
    var delayLongPress: js.UndefOr[Double] = js.undefined
    
    /**
      * Delay in ms, from the start of the touch, before onPressIn is called.
      */
    var delayPressIn: js.UndefOr[Double] = js.undefined
    
    /**
      * Delay in ms, from the release of the touch, before onPressOut is called.
      */
    var delayPressOut: js.UndefOr[Double] = js.undefined
    
    /**
      * This defines how far your touch can start away from the button.
      * This is added to pressRetentionOffset when moving off of the button.
      * NOTE The touch area never extends past the parent view bounds and
      * the Z-index of sibling views always takes precedence if a touch hits
      * two overlapping views.
      */
    var hitSlop: js.UndefOr[Insets] = js.undefined
    
    /**
      * Styles applied to the icon only
      * Good for setting margins or a different color.
      *
      * @default {marginRight: 10}
      */
    var iconStyle: js.UndefOr[TextStyle] = js.undefined
    
    /**
      * When `accessible` is true (which is the default) this may be called when
      * the OS-specific concept of "blur" occurs, meaning the element lost focus.
      * Some platforms may not have the concept of blur.
      */
    var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
    
    /**
      * When `accessible` is true (which is the default) this may be called when
      * the OS-specific concept of "focus" occurs. Some platforms may not have
      * the concept of focus.
      */
    var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
    
    /**
      *
      * Called immediately after the underlay is hidden
      */
    var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Called immediately after the underlay is shown
      */
    var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * When the scroll view is disabled, this defines how far your
      * touch may move off of the button, before deactivating the button.
      * Once deactivated, try moving it back and you'll see that the button
      * is once again reactivated! Move it back and forth several times
      * while the scroll view is disabled. Ensure you pass in a constant
      * to reduce memory allocations.
      */
    var pressRetentionOffset: js.UndefOr[Insets] = js.undefined
    
    /**
      * Style prop inherited from TextProps and TouchableWithoutFeedbackProperties
      * Only exist here so we can have ViewStyle or TextStyle
      *
      */
    @JSName("style")
    var style_IconButtonProps: js.UndefOr[ViewStyle | TextStyle] = js.undefined
    
    /**
      * The color of the underlay that will show through when the touch is active.
      */
    var underlayColor: js.UndefOr[ColorValue] = js.undefined
    
    var useForeground: js.UndefOr[Boolean] = js.undefined
  }
  object IconButtonProps {
    
    inline def apply(name: String): IconButtonProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconButtonProps]
    }
    
    extension [Self <: IconButtonProps](x: Self) {
      
      inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
      
      inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
      
      inline def setBackground(value: BackgroundPropType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColor(value: ColorValue | Double): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
      
      inline def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
      
      inline def setDelayPressIn(value: Double): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
      
      inline def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
      
      inline def setDelayPressOut(value: Double): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
      
      inline def setDelayPressOutUndefined: Self = StObject.set(x, "delayPressOut", js.undefined)
      
      inline def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      inline def setIconStyle(value: TextStyle): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setOnBlur(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnFocus(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnHideUnderlay(value: () => Unit): Self = StObject.set(x, "onHideUnderlay", js.Any.fromFunction0(value))
      
      inline def setOnHideUnderlayUndefined: Self = StObject.set(x, "onHideUnderlay", js.undefined)
      
      inline def setOnShowUnderlay(value: () => Unit): Self = StObject.set(x, "onShowUnderlay", js.Any.fromFunction0(value))
      
      inline def setOnShowUnderlayUndefined: Self = StObject.set(x, "onShowUnderlay", js.undefined)
      
      inline def setPressRetentionOffset(value: Insets): Self = StObject.set(x, "pressRetentionOffset", value.asInstanceOf[js.Any])
      
      inline def setPressRetentionOffsetUndefined: Self = StObject.set(x, "pressRetentionOffset", js.undefined)
      
      inline def setStyle(value: ViewStyle | TextStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUnderlayColor(value: ColorValue): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      inline def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
      
      inline def setUseForeground(value: Boolean): Self = StObject.set(x, "useForeground", value.asInstanceOf[js.Any])
      
      inline def setUseForegroundUndefined: Self = StObject.set(x, "useForeground", js.undefined)
    }
  }
  
  trait IconProps
    extends StObject
       with TextProps {
    
    /**
      * Color of the icon
      *
      */
    var color: js.UndefOr[ColorValue | Double] = js.undefined
    
    /**
      * Name of the icon to show
      *
      * See Icon Explorer app
      * {@link https://github.com/oblador/react-native-vector-icons/tree/master/Examples/IconExplorer}
      */
    var name: String
    
    /**
      * Size of the icon, can also be passed as fontSize in the style object.
      *
      * @default 12
      */
    var size: js.UndefOr[Double] = js.undefined
  }
  object IconProps {
    
    inline def apply(name: String): IconProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps]
    }
    
    extension [Self <: IconProps](x: Self) {
      
      inline def setColor(value: ColorValue | Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type ImageSource = Any
  
  trait TabBarItemIOSProps
    extends StObject
       with TabBarIOSItemProps {
    
    /**
      * Color of the icon
      *
      */
    var iconColor: js.UndefOr[ColorValue | Double] = js.undefined
    
    /**
      * Name of the default icon (similar to TabBarIOS.Item icon)
      *
      */
    var iconName: String
    
    /**
      * Size of the icon
      *
      * @default 30
      */
    var iconSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Color of the selected icon.
      *
      * Defaults to iconColor
      *
      */
    var selectedIconColor: js.UndefOr[String] = js.undefined
    
    /**
      * Name of the selected icon (similar to TabBarIOS.Item selectedIcon)
      *
      * Defaults to iconName
      *
      */
    var selectedIconName: js.UndefOr[String] = js.undefined
  }
  object TabBarItemIOSProps {
    
    inline def apply(iconName: String): TabBarItemIOSProps = {
      val __obj = js.Dynamic.literal(iconName = iconName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabBarItemIOSProps]
    }
    
    extension [Self <: TabBarItemIOSProps](x: Self) {
      
      inline def setIconColor(value: ColorValue | Double): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
      
      inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
      
      inline def setIconName(value: String): Self = StObject.set(x, "iconName", value.asInstanceOf[js.Any])
      
      inline def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
      
      inline def setSelectedIconColor(value: String): Self = StObject.set(x, "selectedIconColor", value.asInstanceOf[js.Any])
      
      inline def setSelectedIconColorUndefined: Self = StObject.set(x, "selectedIconColor", js.undefined)
      
      inline def setSelectedIconName(value: String): Self = StObject.set(x, "selectedIconName", value.asInstanceOf[js.Any])
      
      inline def setSelectedIconNameUndefined: Self = StObject.set(x, "selectedIconName", js.undefined)
    }
  }
}
