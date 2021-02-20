package typings.reactNativePopupDialog

import typings.react.mod.Component
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativePopupDialog.anon.AnimationDuration
import typings.reactNativePopupDialog.anon.SlideFrom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-popup-dialog", JSImport.Default)
  @js.native
  class default () extends Dialog
  
  @JSImport("react-native-popup-dialog", "DialogButton")
  @js.native
  class DialogButton protected ()
    extends Component[DialogButtonProps, js.Any, js.Any] {
    def this(props: DialogButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DialogButtonProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-popup-dialog", "DialogContent")
  @js.native
  class DialogContent protected ()
    extends Component[DialogContentProps, js.Any, js.Any] {
    def this(props: DialogContentProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DialogContentProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-popup-dialog", "DialogFooter")
  @js.native
  class DialogFooter protected ()
    extends Component[DialogFooterProps, js.Any, js.Any] {
    def this(props: DialogFooterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DialogFooterProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-popup-dialog", "DialogTitle")
  @js.native
  class DialogTitle protected ()
    extends Component[DialogTitleProps, js.Any, js.Any] {
    def this(props: DialogTitleProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DialogTitleProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-popup-dialog", "FadeAnimation")
  @js.native
  class FadeAnimation () extends StObject {
    def this(params: AnimationDuration) = this()
    def this(toValue: Double) = this()
    
    def createAnimations(): js.Object = js.native
    
    def toValue(toValue: Double): Unit = js.native
  }
  
  @JSImport("react-native-popup-dialog", "Overlay")
  @js.native
  class Overlay protected ()
    extends Component[OverlayProps, js.Any, js.Any] {
    def this(props: OverlayProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OverlayProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-popup-dialog", "ScaleAnimation")
  @js.native
  class ScaleAnimation () extends StObject {
    def this(toValue: Double) = this()
    
    def createAnimations(): js.Object = js.native
    
    def toValue(toValue: Double): Unit = js.native
  }
  
  @JSImport("react-native-popup-dialog", "SlideAnimation")
  @js.native
  class SlideAnimation () extends StObject {
    def this(params: SlideFrom) = this()
    def this(toValue: Double) = this()
    
    def createAnimations(): js.Object = js.native
    
    def toValue(toValue: Double): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativePopupDialog.reactNativePopupDialogStrings.left
    - typings.reactNativePopupDialog.reactNativePopupDialogStrings.right
    - typings.reactNativePopupDialog.reactNativePopupDialogStrings.center
  */
  trait AlignTypes extends StObject
  object AlignTypes {
    
    @scala.inline
    def center: typings.reactNativePopupDialog.reactNativePopupDialogStrings.center = "center".asInstanceOf[typings.reactNativePopupDialog.reactNativePopupDialogStrings.center]
    
    @scala.inline
    def left: typings.reactNativePopupDialog.reactNativePopupDialogStrings.left = "left".asInstanceOf[typings.reactNativePopupDialog.reactNativePopupDialogStrings.left]
    
    @scala.inline
    def right: typings.reactNativePopupDialog.reactNativePopupDialogStrings.right = "right".asInstanceOf[typings.reactNativePopupDialog.reactNativePopupDialogStrings.right]
  }
  
  @js.native
  trait Dialog
    extends Component[DialogProps, js.Any, js.Any] {
    
    def dismiss(): Unit = js.native
    def dismiss(onDismissed: js.Function0[Unit]): Unit = js.native
    
    def show(): Unit = js.native
    def show(onShown: js.Function0[Unit]): Unit = js.native
  }
  
  @js.native
  trait DialogButtonProps extends StObject {
    
    var activeOpacity: js.UndefOr[Double] = js.native
    
    var align: js.UndefOr[AlignTypes] = js.native
    
    var bordered: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var text: String = js.native
    
    var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  }
  object DialogButtonProps {
    
    @scala.inline
    def apply(text: String): DialogButtonProps = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogButtonProps]
    }
    
    @scala.inline
    implicit class DialogButtonPropsMutableBuilder[Self <: DialogButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
      
      @scala.inline
      def setAlign(value: AlignTypes): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    }
  }
  
  @js.native
  trait DialogContentProps extends StObject {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object DialogContentProps {
    
    @scala.inline
    def apply(): DialogContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogContentProps]
    }
    
    @scala.inline
    implicit class DialogContentPropsMutableBuilder[Self <: DialogContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait DialogFooterProps extends StObject {
    
    var bordered: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object DialogFooterProps {
    
    @scala.inline
    def apply(): DialogFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogFooterProps]
    }
    
    @scala.inline
    implicit class DialogFooterPropsMutableBuilder[Self <: DialogFooterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait DialogProps extends StObject {
    
    var animationDuration: js.UndefOr[Double] = js.native
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var dialogAnimation: js.UndefOr[FadeAnimation | ScaleAnimation | SlideAnimation] = js.native
    
    var dialogStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var dialogTitle: js.UndefOr[js.Any] = js.native
    
    var footer: js.UndefOr[js.Any] = js.native
    
    var hasOverlay: js.UndefOr[Boolean] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onHardwareBackPress: js.UndefOr[js.Function0[Boolean]] = js.native
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onTouchOutside: js.UndefOr[js.Function0[Unit]] = js.native
    
    var overlayBackgroundColor: js.UndefOr[String] = js.native
    
    var overlayOpacity: js.UndefOr[Double] = js.native
    
    var overlayPointerEvents: js.UndefOr[OverlayPointerEventTypes] = js.native
    
    var rounded: js.UndefOr[Boolean] = js.native
    
    var useNativeDriver: js.UndefOr[Boolean] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object DialogProps {
    
    @scala.inline
    def apply(): DialogProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogProps]
    }
    
    @scala.inline
    implicit class DialogPropsMutableBuilder[Self <: DialogProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setDialogAnimation(value: FadeAnimation | ScaleAnimation | SlideAnimation): Self = StObject.set(x, "dialogAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogAnimationUndefined: Self = StObject.set(x, "dialogAnimation", js.undefined)
      
      @scala.inline
      def setDialogStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dialogStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogStyleNull: Self = StObject.set(x, "dialogStyle", null)
      
      @scala.inline
      def setDialogStyleUndefined: Self = StObject.set(x, "dialogStyle", js.undefined)
      
      @scala.inline
      def setDialogTitle(value: js.Any): Self = StObject.set(x, "dialogTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogTitleUndefined: Self = StObject.set(x, "dialogTitle", js.undefined)
      
      @scala.inline
      def setFooter(value: js.Any): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setHasOverlay(value: Boolean): Self = StObject.set(x, "hasOverlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasOverlayUndefined: Self = StObject.set(x, "hasOverlay", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setOnHardwareBackPress(value: () => Boolean): Self = StObject.set(x, "onHardwareBackPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnHardwareBackPressUndefined: Self = StObject.set(x, "onHardwareBackPress", js.undefined)
      
      @scala.inline
      def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setOnTouchOutside(value: () => Unit): Self = StObject.set(x, "onTouchOutside", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnTouchOutsideUndefined: Self = StObject.set(x, "onTouchOutside", js.undefined)
      
      @scala.inline
      def setOverlayBackgroundColor(value: String): Self = StObject.set(x, "overlayBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayBackgroundColorUndefined: Self = StObject.set(x, "overlayBackgroundColor", js.undefined)
      
      @scala.inline
      def setOverlayOpacity(value: Double): Self = StObject.set(x, "overlayOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayOpacityUndefined: Self = StObject.set(x, "overlayOpacity", js.undefined)
      
      @scala.inline
      def setOverlayPointerEvents(value: OverlayPointerEventTypes): Self = StObject.set(x, "overlayPointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayPointerEventsUndefined: Self = StObject.set(x, "overlayPointerEvents", js.undefined)
      
      @scala.inline
      def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
      
      @scala.inline
      def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait DialogTitleProps extends StObject {
    
    var align: js.UndefOr[AlignTypes] = js.native
    
    var hasTitleBar: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var title: String = js.native
  }
  object DialogTitleProps {
    
    @scala.inline
    def apply(title: String): DialogTitleProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogTitleProps]
    }
    
    @scala.inline
    implicit class DialogTitlePropsMutableBuilder[Self <: DialogTitleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: AlignTypes): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setHasTitleBar(value: Boolean): Self = StObject.set(x, "hasTitleBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasTitleBarUndefined: Self = StObject.set(x, "hasTitleBar", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativePopupDialog.reactNativePopupDialogStrings.auto
    - typings.reactNativePopupDialog.reactNativePopupDialogStrings.none
  */
  trait OverlayPointerEventTypes extends StObject
  object OverlayPointerEventTypes {
    
    @scala.inline
    def auto: typings.reactNativePopupDialog.reactNativePopupDialogStrings.auto = "auto".asInstanceOf[typings.reactNativePopupDialog.reactNativePopupDialogStrings.auto]
    
    @scala.inline
    def none: typings.reactNativePopupDialog.reactNativePopupDialogStrings.none = "none".asInstanceOf[typings.reactNativePopupDialog.reactNativePopupDialogStrings.none]
  }
  
  @js.native
  trait OverlayProps extends StObject {
    
    var animationDuration: js.UndefOr[Double] = js.native
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    def onPress(event: GestureResponderEvent): Unit = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var pointerEvents: js.UndefOr[String] = js.native
    
    var showOverlay: js.UndefOr[Boolean] = js.native
    
    var useNativeDriver: js.UndefOr[Boolean] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object OverlayProps {
    
    @scala.inline
    def apply(onPress: GestureResponderEvent => Unit): OverlayProps = {
      val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction1(onPress))
      __obj.asInstanceOf[OverlayProps]
    }
    
    @scala.inline
    implicit class OverlayPropsMutableBuilder[Self <: OverlayProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setOnPress(value: GestureResponderEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPointerEvents(value: String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      @scala.inline
      def setShowOverlay(value: Boolean): Self = StObject.set(x, "showOverlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOverlayUndefined: Self = StObject.set(x, "showOverlay", js.undefined)
      
      @scala.inline
      def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativePopupDialog.reactNativePopupDialogStrings.top
    - typings.reactNativePopupDialog.reactNativePopupDialogStrings.bottom
    - typings.reactNativePopupDialog.reactNativePopupDialogStrings.left
    - typings.reactNativePopupDialog.reactNativePopupDialogStrings.right
  */
  trait SlideFromTypes extends StObject
  object SlideFromTypes {
    
    @scala.inline
    def bottom: typings.reactNativePopupDialog.reactNativePopupDialogStrings.bottom = "bottom".asInstanceOf[typings.reactNativePopupDialog.reactNativePopupDialogStrings.bottom]
    
    @scala.inline
    def left: typings.reactNativePopupDialog.reactNativePopupDialogStrings.left = "left".asInstanceOf[typings.reactNativePopupDialog.reactNativePopupDialogStrings.left]
    
    @scala.inline
    def right: typings.reactNativePopupDialog.reactNativePopupDialogStrings.right = "right".asInstanceOf[typings.reactNativePopupDialog.reactNativePopupDialogStrings.right]
    
    @scala.inline
    def top: typings.reactNativePopupDialog.reactNativePopupDialogStrings.top = "top".asInstanceOf[typings.reactNativePopupDialog.reactNativePopupDialogStrings.top]
  }
}
