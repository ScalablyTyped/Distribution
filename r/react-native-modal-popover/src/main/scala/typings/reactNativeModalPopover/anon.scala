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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ArrowSize extends StObject {
    
    var arrowSize: Requireable[InferProps[X]]
    
    var arrowStyle: Requireable[js.Any]
    
    var backgroundStyle: Requireable[js.Any]
    
    var contentStyle: Requireable[js.Any]
    
    var displayArea: Requireable[InferProps[Height]]
    
    var duration: Requireable[Double]
    
    var easing: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]
    
    var fromRect: Requireable[InferProps[Height]]
    
    var onClose: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]
    
    var onDismiss: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]
    
    var placement: Requireable[String]
    
    var popoverStyle: Requireable[js.Any]
    
    var visible: Requireable[Boolean]
  }
  object ArrowSize {
    
    @scala.inline
    def apply(
      arrowSize: Requireable[InferProps[X]],
      arrowStyle: Requireable[js.Any],
      backgroundStyle: Requireable[js.Any],
      contentStyle: Requireable[js.Any],
      displayArea: Requireable[InferProps[Height]],
      duration: Requireable[Double],
      easing: Requireable[js.Function1[/* repeated */ js.Any, js.Any]],
      fromRect: Requireable[InferProps[Height]],
      onClose: Requireable[js.Function1[/* repeated */ js.Any, js.Any]],
      onDismiss: Requireable[js.Function1[/* repeated */ js.Any, js.Any]],
      placement: Requireable[String],
      popoverStyle: Requireable[js.Any],
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
      def setArrowStyle(value: Requireable[js.Any]): Self = StObject.set(x, "arrowStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundStyle(value: Requireable[js.Any]): Self = StObject.set(x, "backgroundStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStyle(value: Requireable[js.Any]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayArea(value: Requireable[InferProps[Height]]): Self = StObject.set(x, "displayArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Requireable[Double]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasing(value: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromRect(value: Requireable[InferProps[Height]]): Self = StObject.set(x, "fromRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClose(value: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDismiss(value: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Self = StObject.set(x, "onDismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacement(value: Requireable[String]): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverStyle(value: Requireable[js.Any]): Self = StObject.set(x, "popoverStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: Requireable[Boolean]): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait Children extends StObject {
    
    var children: Validator[js.Function1[/* repeated */ js.Any, js.Any]]
  }
  object Children {
    
    @scala.inline
    def apply(children: Validator[js.Function1[/* repeated */ js.Any, js.Any]]): Children = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: Validator[js.Function1[/* repeated */ js.Any, js.Any]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: Requireable[Double]
    
    var width: Requireable[Double]
    
    var x: Requireable[Double]
    
    var y: Requireable[Double]
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
  
  trait OnPopoverDisplayed extends StObject {
    
    var onPopoverDisplayed: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]
  }
  object OnPopoverDisplayed {
    
    @scala.inline
    def apply(onPopoverDisplayed: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): OnPopoverDisplayed = {
      val __obj = js.Dynamic.literal(onPopoverDisplayed = onPopoverDisplayed.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnPopoverDisplayed]
    }
    
    @scala.inline
    implicit class OnPopoverDisplayedMutableBuilder[Self <: OnPopoverDisplayed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnPopoverDisplayed(value: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Self = StObject.set(x, "onPopoverDisplayed", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<react-native-modal-popover.react-native-modal-popover/lib/Popover.PopoverProps> */
  trait PartialPopoverProps extends StObject {
    
    var arrowSize: js.UndefOr[Size] = js.undefined
    
    var arrowStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var backgroundStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var displayArea: js.UndefOr[Rect] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[js.Function1[/* show */ Boolean, js.Function1[/* value */ Double, Double]]] = js.undefined
    
    var fromRect: js.UndefOr[Rect] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var placement: js.UndefOr[Placement | auto] = js.undefined
    
    var popoverStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var supportedOrientations: js.UndefOr[js.Array[Orientation]] = js.undefined
    
    var useNativeDriver: js.UndefOr[Boolean] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
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
  
  trait X extends StObject {
    
    var x: Requireable[Double]
    
    var y: Requireable[Double]
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
