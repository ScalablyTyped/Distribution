package typings.reactNativeVectorIcons

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.reactNative.mod.BackgroundPropType
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.TabBarIOSItemProps
import typings.reactNative.mod.TargetedEvent
import typings.reactNative.mod.TextProps
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.TouchableWithoutFeedbackPropsAndroid
import typings.reactNative.mod.TouchableWithoutFeedbackPropsIOS
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod {
  
  @JSImport("react-native-vector-icons/Icon", "Icon")
  @js.native
  class Icon protected ()
    extends Component[IconProps, js.Any, js.Any] {
    def this(props: IconProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IconProps, context: js.Any) = this()
  }
  /* static members */
  object Icon {
    
    @JSImport("react-native-vector-icons/Icon", "Icon.Button")
    @js.native
    class Button protected ()
      extends Component[IconButtonProps, js.Any, js.Any] {
      def this(props: IconButtonProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: IconButtonProps, context: js.Any) = this()
    }
    
    @JSImport("react-native-vector-icons/Icon", "Icon.TabBarItem")
    @js.native
    class TabBarItem protected ()
      extends Component[TabBarItemIOSProps, js.Any, js.Any] {
      def this(props: TabBarItemIOSProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: TabBarItemIOSProps, context: js.Any) = this()
    }
    
    @JSImport("react-native-vector-icons/Icon", "Icon.TabBarItemIOS")
    @js.native
    class TabBarItemIOS protected ()
      extends Component[TabBarItemIOSProps, js.Any, js.Any] {
      def this(props: TabBarItemIOSProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: TabBarItemIOSProps, context: js.Any) = this()
    }
    
    @JSImport("react-native-vector-icons/Icon", "Icon.ToolbarAndroid")
    @js.native
    class ToolbarAndroid protected ()
      extends Component[ToolbarAndroidProps, js.Any, js.Any] {
      def this(props: ToolbarAndroidProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: ToolbarAndroidProps, context: js.Any) = this()
    }
    
    @JSImport("react-native-vector-icons/Icon", "Icon.getImageSource")
    @js.native
    def getImageSource(name: String): js.Promise[ImageSource] = js.native
    @JSImport("react-native-vector-icons/Icon", "Icon.getImageSource")
    @js.native
    def getImageSource(name: String, size: js.UndefOr[scala.Nothing], color: String): js.Promise[ImageSource] = js.native
    @JSImport("react-native-vector-icons/Icon", "Icon.getImageSource")
    @js.native
    def getImageSource(name: String, size: Double): js.Promise[ImageSource] = js.native
    @JSImport("react-native-vector-icons/Icon", "Icon.getImageSource")
    @js.native
    def getImageSource(name: String, size: Double, color: String): js.Promise[ImageSource] = js.native
    
    @JSImport("react-native-vector-icons/Icon", "Icon.getImageSourceSync")
    @js.native
    def getImageSourceSync(name: String): ImageSource = js.native
    @JSImport("react-native-vector-icons/Icon", "Icon.getImageSourceSync")
    @js.native
    def getImageSourceSync(name: String, size: js.UndefOr[scala.Nothing], color: String): ImageSource = js.native
    @JSImport("react-native-vector-icons/Icon", "Icon.getImageSourceSync")
    @js.native
    def getImageSourceSync(name: String, size: Double): ImageSource = js.native
    @JSImport("react-native-vector-icons/Icon", "Icon.getImageSourceSync")
    @js.native
    def getImageSourceSync(name: String, size: Double, color: String): ImageSource = js.native
    
    @JSImport("react-native-vector-icons/Icon", "Icon.getRawGlyphMap")
    @js.native
    def getRawGlyphMap(): StringDictionary[Double] = js.native
    
    @JSImport("react-native-vector-icons/Icon", "Icon.hasIcon")
    @js.native
    def hasIcon(name: String): Boolean = js.native
    
    @JSImport("react-native-vector-icons/Icon", "Icon.loadFont")
    @js.native
    def loadFont(): js.Promise[Unit] = js.native
    @JSImport("react-native-vector-icons/Icon", "Icon.loadFont")
    @js.native
    def loadFont(file: String): js.Promise[Unit] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactNative.mod.AccessibilityPropsIOS because Already inherited
  - typings.reactNative.mod.AccessibilityPropsAndroid because Already inherited
  - typings.reactNative.mod.AccessibilityProps because Already inherited
  - typings.reactNative.mod.TouchableWithoutFeedbackProps because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, importantForAccessibility, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onLongPress, onMagicTap, onPress, style, testID. Inlined onPressOut, hitSlop, onFocus, delayLongPress, onBlur, delayPressOut, disabled, pressRetentionOffset, delayPressIn, onPressIn
  - typings.reactNative.mod.TouchableNativeFeedbackProps because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, importantForAccessibility, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onLongPress, onMagicTap, onPress, style, testID. Inlined useForeground, background
  - typings.reactNative.mod.TouchableHighlightProps because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, importantForAccessibility, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onLongPress, onMagicTap, onPress, style, testID. Inlined onShowUnderlay, onHideUnderlay, underlayColor, activeOpacity */ @js.native
  trait IconButtonProps
    extends IconProps
       with TouchableWithoutFeedbackPropsIOS
       with TouchableWithoutFeedbackPropsAndroid {
    
    /**
      * Determines what the opacity of the wrapped view should be when touch is active.
      */
    var activeOpacity: js.UndefOr[Double] = js.native
    
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
    var background: js.UndefOr[BackgroundPropType] = js.native
    
    /**
      * Background color of the button
      *
      * @default '#007AFF'
      */
    var backgroundColor: js.UndefOr[String] = js.native
    
    /**
      * Border radius of the button
      * Set to 0 to disable.
      *
      * @default 5
      */
    var borderRadius: js.UndefOr[Double] = js.native
    
    /**
      * Delay in ms, from onPressIn, before onLongPress is called.
      */
    var delayLongPress: js.UndefOr[Double] = js.native
    
    /**
      * Delay in ms, from the start of the touch, before onPressIn is called.
      */
    var delayPressIn: js.UndefOr[Double] = js.native
    
    /**
      * Delay in ms, from the release of the touch, before onPressOut is called.
      */
    var delayPressOut: js.UndefOr[Double] = js.native
    
    /**
      * If true, disable all interactions for this component.
      */
    var disabled: js.UndefOr[Boolean | Null] = js.native
    
    /**
      * This defines how far your touch can start away from the button.
      * This is added to pressRetentionOffset when moving off of the button.
      * NOTE The touch area never extends past the parent view bounds and
      * the Z-index of sibling views always takes precedence if a touch hits
      * two overlapping views.
      */
    var hitSlop: js.UndefOr[Insets] = js.native
    
    /**
      * Styles applied to the icon only
      * Good for setting margins or a different color.
      *
      * @default {marginRight: 10}
      */
    var iconStyle: js.UndefOr[TextStyle] = js.native
    
    /**
      * When `accessible` is true (which is the default) this may be called when
      * the OS-specific concept of "blur" occurs, meaning the element lost focus.
      * Some platforms may not have the concept of blur.
      */
    var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.native
    
    /**
      * When `accessible` is true (which is the default) this may be called when
      * the OS-specific concept of "focus" occurs. Some platforms may not have
      * the concept of focus.
      */
    var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.native
    
    /**
      *
      * Called immediately after the underlay is hidden
      */
    var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
    
    var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
    
    /**
      * Called immediately after the underlay is shown
      */
    var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * When the scroll view is disabled, this defines how far your
      * touch may move off of the button, before deactivating the button.
      * Once deactivated, try moving it back and you'll see that the button
      * is once again reactivated! Move it back and forth several times
      * while the scroll view is disabled. Ensure you pass in a constant
      * to reduce memory allocations.
      */
    var pressRetentionOffset: js.UndefOr[Insets] = js.native
    
    /**
      * Style prop inherited from TextProps and TouchableWithoutFeedbackProperties
      * Only exist here so we can have ViewStyle or TextStyle
      *
      */
    @JSName("style")
    var style_IconButtonProps: js.UndefOr[ViewStyle | TextStyle] = js.native
    
    /**
      * The color of the underlay that will show through when the touch is active.
      */
    var underlayColor: js.UndefOr[ColorValue] = js.native
    
    var useForeground: js.UndefOr[Boolean] = js.native
  }
  object IconButtonProps {
    
    @scala.inline
    def apply(name: String): IconButtonProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconButtonProps]
    }
    
    @scala.inline
    implicit class IconButtonPropsMutableBuilder[Self <: IconButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
      
      @scala.inline
      def setBackground(value: BackgroundPropType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      @scala.inline
      def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
      
      @scala.inline
      def setDelayPressIn(value: Double): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
      
      @scala.inline
      def setDelayPressOut(value: Double): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayPressOutUndefined: Self = StObject.set(x, "delayPressOut", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledNull: Self = StObject.set(x, "disabled", null)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      @scala.inline
      def setIconStyle(value: TextStyle): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnHideUnderlay(value: () => Unit): Self = StObject.set(x, "onHideUnderlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnHideUnderlayUndefined: Self = StObject.set(x, "onHideUnderlay", js.undefined)
      
      @scala.inline
      def setOnPressIn(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
      
      @scala.inline
      def setOnPressOut(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
      
      @scala.inline
      def setOnShowUnderlay(value: () => Unit): Self = StObject.set(x, "onShowUnderlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShowUnderlayUndefined: Self = StObject.set(x, "onShowUnderlay", js.undefined)
      
      @scala.inline
      def setPressRetentionOffset(value: Insets): Self = StObject.set(x, "pressRetentionOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPressRetentionOffsetUndefined: Self = StObject.set(x, "pressRetentionOffset", js.undefined)
      
      @scala.inline
      def setStyle(value: ViewStyle | TextStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUnderlayColor(value: ColorValue): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
      
      @scala.inline
      def setUseForeground(value: Boolean): Self = StObject.set(x, "useForeground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseForegroundUndefined: Self = StObject.set(x, "useForeground", js.undefined)
    }
  }
  
  @js.native
  trait IconProps extends TextProps {
    
    /**
      * Color of the icon
      *
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Name of the icon to show
      *
      * See Icon Explorer app
      * {@link https://github.com/oblador/react-native-vector-icons/tree/master/Examples/IconExplorer}
      */
    var name: String = js.native
    
    /**
      * Size of the icon, can also be passed as fontSize in the style object.
      *
      * @default 12
      */
    var size: js.UndefOr[Double] = js.native
  }
  object IconProps {
    
    @scala.inline
    def apply(name: String): IconProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps]
    }
    
    @scala.inline
    implicit class IconPropsMutableBuilder[Self <: IconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type ImageSource = js.Any
  
  @js.native
  trait TabBarItemIOSProps extends TabBarIOSItemProps {
    
    /**
      * Color of the icon
      *
      */
    var iconColor: js.UndefOr[String] = js.native
    
    /**
      * Name of the default icon (similar to TabBarIOS.Item icon)
      *
      */
    var iconName: String = js.native
    
    /**
      * Size of the icon
      *
      * @default 30
      */
    var iconSize: js.UndefOr[Double] = js.native
    
    /**
      * Color of the selected icon.
      *
      * Defaults to iconColor
      *
      */
    var selectedIconColor: js.UndefOr[String] = js.native
    
    /**
      * Name of the selected icon (similar to TabBarIOS.Item selectedIcon)
      *
      * Defaults to iconName
      *
      */
    var selectedIconName: js.UndefOr[String] = js.native
  }
  object TabBarItemIOSProps {
    
    @scala.inline
    def apply(iconName: String): TabBarItemIOSProps = {
      val __obj = js.Dynamic.literal(iconName = iconName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabBarItemIOSProps]
    }
    
    @scala.inline
    implicit class TabBarItemIOSPropsMutableBuilder[Self <: TabBarItemIOSProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
      
      @scala.inline
      def setIconName(value: String): Self = StObject.set(x, "iconName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
      
      @scala.inline
      def setSelectedIconColor(value: String): Self = StObject.set(x, "selectedIconColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIconColorUndefined: Self = StObject.set(x, "selectedIconColor", js.undefined)
      
      @scala.inline
      def setSelectedIconName(value: String): Self = StObject.set(x, "selectedIconName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIconNameUndefined: Self = StObject.set(x, "selectedIconName", js.undefined)
    }
  }
  
  @js.native
  trait ToolbarAndroidProps
    extends typings.reactNative.mod.ToolbarAndroidProps {
    
    /**
      * Color of the icons
      *
      * @default 'black'
      */
    var iconColor: String = js.native
    
    /**
      * Size of the icons
      *
      * @default 24
      */
    var iconSize: Double = js.native
    
    /**
      * Name of the navigation logo icon
      * (similar to ToolbarAndroid logo)
      *
      */
    var logoName: String = js.native
    
    /**
      * Name of the navigation icon
      * (similar to ToolbarAndroid navIcon)
      *
      */
    var navIconName: String = js.native
    
    /**
      * Name of the overflow icon
      * (similar to ToolbarAndroid overflowIcon)
      *
      */
    var overflowIconName: String = js.native
  }
  object ToolbarAndroidProps {
    
    @scala.inline
    def apply(
      iconColor: String,
      iconSize: Double,
      logoName: String,
      navIconName: String,
      overflowIconName: String
    ): ToolbarAndroidProps = {
      val __obj = js.Dynamic.literal(iconColor = iconColor.asInstanceOf[js.Any], iconSize = iconSize.asInstanceOf[js.Any], logoName = logoName.asInstanceOf[js.Any], navIconName = navIconName.asInstanceOf[js.Any], overflowIconName = overflowIconName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarAndroidProps]
    }
    
    @scala.inline
    implicit class ToolbarAndroidPropsMutableBuilder[Self <: ToolbarAndroidProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoName(value: String): Self = StObject.set(x, "logoName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavIconName(value: String): Self = StObject.set(x, "navIconName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowIconName(value: String): Self = StObject.set(x, "overflowIconName", value.asInstanceOf[js.Any])
    }
  }
}
