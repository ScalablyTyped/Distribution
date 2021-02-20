package typings.reactNativeModalPopover

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeModalPopover.popoverGeometryMod.Placement
import typings.reactNativeModalPopover.popoverGeometryMod.Rect
import typings.reactNativeModalPopover.popoverGeometryMod.Size
import typings.reactNativeModalPopover.popoverMod.Orientation
import typings.reactNativeModalPopover.reactNativeModalPopoverStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ArrowSize extends StObject {
    
    var arrowSize: Requireable[InferProps[X]] = js.native
    
    var arrowStyle: Requireable[_] = js.native
    
    var backgroundStyle: Requireable[_] = js.native
    
    var contentStyle: Requireable[_] = js.native
    
    var displayArea: Requireable[InferProps[Height]] = js.native
    
    var duration: Requireable[Double] = js.native
    
    var easing: Requireable[js.Function1[/* repeated */ _, _]] = js.native
    
    var fromRect: Requireable[InferProps[Height]] = js.native
    
    var onClose: Requireable[js.Function1[/* repeated */ _, _]] = js.native
    
    var onDismiss: Requireable[js.Function1[/* repeated */ _, _]] = js.native
    
    var placement: Requireable[String] = js.native
    
    var popoverStyle: Requireable[_] = js.native
    
    var visible: Requireable[Boolean] = js.native
  }
  object ArrowSize {
    
    @scala.inline
    def apply(
      arrowSize: Requireable[InferProps[X]],
      arrowStyle: Requireable[_],
      backgroundStyle: Requireable[_],
      contentStyle: Requireable[_],
      displayArea: Requireable[InferProps[Height]],
      duration: Requireable[Double],
      easing: Requireable[js.Function1[/* repeated */ _, _]],
      fromRect: Requireable[InferProps[Height]],
      onClose: Requireable[js.Function1[/* repeated */ _, _]],
      onDismiss: Requireable[js.Function1[/* repeated */ _, _]],
      placement: Requireable[String],
      popoverStyle: Requireable[_],
      visible: Requireable[Boolean]
    ): ArrowSize = {
      val __obj = js.Dynamic.literal(arrowSize = arrowSize.asInstanceOf[js.Any], arrowStyle = arrowStyle.asInstanceOf[js.Any], backgroundStyle = backgroundStyle.asInstanceOf[js.Any], contentStyle = contentStyle.asInstanceOf[js.Any], displayArea = displayArea.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], fromRect = fromRect.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any], onDismiss = onDismiss.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], popoverStyle = popoverStyle.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrowSize]
    }
    
    @scala.inline
    implicit class ArrowSizeMutableBuilder[Self <: ArrowSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowSize(value: Requireable[InferProps[X]]): Self = StObject.set(x, "arrowSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowStyle(value: Requireable[_]): Self = StObject.set(x, "arrowStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundStyle(value: Requireable[_]): Self = StObject.set(x, "backgroundStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStyle(value: Requireable[_]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayArea(value: Requireable[InferProps[Height]]): Self = StObject.set(x, "displayArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Requireable[Double]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasing(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromRect(value: Requireable[InferProps[Height]]): Self = StObject.set(x, "fromRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClose(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDismiss(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = StObject.set(x, "onDismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacement(value: Requireable[String]): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverStyle(value: Requireable[_]): Self = StObject.set(x, "popoverStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: Requireable[Boolean]): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Children extends StObject {
    
    var children: Validator[js.Function1[/* repeated */ _, _]] = js.native
  }
  object Children {
    
    @scala.inline
    def apply(children: Validator[js.Function1[/* repeated */ _, _]]): Children = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: Validator[js.Function1[/* repeated */ _, _]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Height extends StObject {
    
    var height: Requireable[Double] = js.native
    
    var width: Requireable[Double] = js.native
    
    var x: Requireable[Double] = js.native
    
    var y: Requireable[Double] = js.native
  }
  object Height {
    
    @scala.inline
    def apply(
      height: Requireable[Double],
      width: Requireable[Double],
      x: Requireable[Double],
      y: Requireable[Double]
    ): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Requireable[Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Requireable[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Requireable[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Requireable[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnPopoverDisplayed extends StObject {
    
    var onPopoverDisplayed: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  }
  object OnPopoverDisplayed {
    
    @scala.inline
    def apply(onPopoverDisplayed: Requireable[js.Function1[/* repeated */ _, _]]): OnPopoverDisplayed = {
      val __obj = js.Dynamic.literal(onPopoverDisplayed = onPopoverDisplayed.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnPopoverDisplayed]
    }
    
    @scala.inline
    implicit class OnPopoverDisplayedMutableBuilder[Self <: OnPopoverDisplayed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnPopoverDisplayed(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = StObject.set(x, "onPopoverDisplayed", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<react-native-modal-popover.react-native-modal-popover/lib/Popover.PopoverProps> */
  @js.native
  trait PartialPopoverProps extends StObject {
    
    var arrowSize: js.UndefOr[Size] = js.native
    
    var arrowStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var backgroundStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var displayArea: js.UndefOr[Rect] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var easing: js.UndefOr[js.Function1[/* show */ Boolean, js.Function1[/* value */ Double, Double]]] = js.native
    
    var fromRect: js.UndefOr[Rect] = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
    
    var placement: js.UndefOr[Placement | auto] = js.native
    
    var popoverStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var supportedOrientations: js.UndefOr[js.Array[Orientation]] = js.native
    
    var useNativeDriver: js.UndefOr[Boolean] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object PartialPopoverProps {
    
    @scala.inline
    def apply(): PartialPopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPopoverProps]
    }
    
    @scala.inline
    implicit class PartialPopoverPropsMutableBuilder[Self <: PartialPopoverProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowSize(value: Size): Self = StObject.set(x, "arrowSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowSizeUndefined: Self = StObject.set(x, "arrowSize", js.undefined)
      
      @scala.inline
      def setArrowStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "arrowStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowStyleNull: Self = StObject.set(x, "arrowStyle", null)
      
      @scala.inline
      def setArrowStyleUndefined: Self = StObject.set(x, "arrowStyle", js.undefined)
      
      @scala.inline
      def setBackgroundStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "backgroundStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundStyleNull: Self = StObject.set(x, "backgroundStyle", null)
      
      @scala.inline
      def setBackgroundStyleUndefined: Self = StObject.set(x, "backgroundStyle", js.undefined)
      
      @scala.inline
      def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
      
      @scala.inline
      def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      @scala.inline
      def setDisplayArea(value: Rect): Self = StObject.set(x, "displayArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayAreaUndefined: Self = StObject.set(x, "displayArea", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: /* show */ Boolean => js.Function1[/* value */ Double, Double]): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setFromRect(value: Rect): Self = StObject.set(x, "fromRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromRectUndefined: Self = StObject.set(x, "fromRect", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement | auto): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPopoverStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "popoverStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverStyleNull: Self = StObject.set(x, "popoverStyle", null)
      
      @scala.inline
      def setPopoverStyleUndefined: Self = StObject.set(x, "popoverStyle", js.undefined)
      
      @scala.inline
      def setSupportedOrientations(value: js.Array[Orientation]): Self = StObject.set(x, "supportedOrientations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedOrientationsUndefined: Self = StObject.set(x, "supportedOrientations", js.undefined)
      
      @scala.inline
      def setSupportedOrientationsVarargs(value: Orientation*): Self = StObject.set(x, "supportedOrientations", js.Array(value :_*))
      
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
  
  @js.native
  trait X extends StObject {
    
    var x: Requireable[Double] = js.native
    
    var y: Requireable[Double] = js.native
  }
  object X {
    
    @scala.inline
    def apply(x: Requireable[Double], y: Requireable[Double]): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Requireable[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Requireable[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
