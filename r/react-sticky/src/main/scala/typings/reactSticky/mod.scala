package typings.reactSticky

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-sticky", "Sticky")
  @js.native
  class Sticky protected ()
    extends Component[StickyProps, ComponentState, js.Any] {
    def this(props: StickyProps) = this()
    def this(props: StickyProps, context: js.Any) = this()
  }
  @JSImport("react-sticky", "Sticky")
  @js.native
  val Sticky: ComponentClass[StickyProps, ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-sticky", "StickyContainer")
  @js.native
  class StickyContainer protected ()
    extends Component[HTMLAttributes[HTMLDivElement], ComponentState, js.Any] {
    def this(props: HTMLAttributes[HTMLDivElement]) = this()
    def this(props: HTMLAttributes[HTMLDivElement], context: js.Any) = this()
  }
  @JSImport("react-sticky", "StickyContainer")
  @js.native
  val StickyContainer: ComponentClass[HTMLAttributes[HTMLDivElement], ComponentState] = js.native
  
  @js.native
  trait StickyChildArgs extends StObject {
    
    var calculatedHeight: Double = js.native
    
    var distanceFromBottom: Double = js.native
    
    var distanceFromTop: Double = js.native
    
    var isSticky: Boolean = js.native
    
    var style: CSSProperties = js.native
    
    var wasSticky: Boolean = js.native
  }
  object StickyChildArgs {
    
    @scala.inline
    def apply(
      calculatedHeight: Double,
      distanceFromBottom: Double,
      distanceFromTop: Double,
      isSticky: Boolean,
      style: CSSProperties,
      wasSticky: Boolean
    ): StickyChildArgs = {
      val __obj = js.Dynamic.literal(calculatedHeight = calculatedHeight.asInstanceOf[js.Any], distanceFromBottom = distanceFromBottom.asInstanceOf[js.Any], distanceFromTop = distanceFromTop.asInstanceOf[js.Any], isSticky = isSticky.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], wasSticky = wasSticky.asInstanceOf[js.Any])
      __obj.asInstanceOf[StickyChildArgs]
    }
    
    @scala.inline
    implicit class StickyChildArgsMutableBuilder[Self <: StickyChildArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalculatedHeight(value: Double): Self = StObject.set(x, "calculatedHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceFromBottom(value: Double): Self = StObject.set(x, "distanceFromBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceFromTop(value: Double): Self = StObject.set(x, "distanceFromTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWasSticky(value: Boolean): Self = StObject.set(x, "wasSticky", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StickyProps extends StObject {
    
    var bottomOffset: js.UndefOr[Double] = js.native
    
    def children(args: StickyChildArgs): ReactElement = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disableCompensation: js.UndefOr[Boolean] = js.native
    
    var disableHardwareAcceleration: js.UndefOr[Boolean] = js.native
    
    var isActive: js.UndefOr[Boolean] = js.native
    
    var onStickyStateChange: js.UndefOr[js.Function1[/* isSticky */ Boolean, Unit]] = js.native
    
    var relative: js.UndefOr[Boolean] = js.native
    
    var stickyClassName: js.UndefOr[String] = js.native
    
    var stickyStyle: js.UndefOr[js.Any] = js.native
    
    var style: js.UndefOr[js.Any] = js.native
    
    var topOffset: js.UndefOr[Double] = js.native
  }
  object StickyProps {
    
    @scala.inline
    def apply(children: StickyChildArgs => ReactElement): StickyProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[StickyProps]
    }
    
    @scala.inline
    implicit class StickyPropsMutableBuilder[Self <: StickyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottomOffset(value: Double): Self = StObject.set(x, "bottomOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomOffsetUndefined: Self = StObject.set(x, "bottomOffset", js.undefined)
      
      @scala.inline
      def setChildren(value: StickyChildArgs => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisableCompensation(value: Boolean): Self = StObject.set(x, "disableCompensation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCompensationUndefined: Self = StObject.set(x, "disableCompensation", js.undefined)
      
      @scala.inline
      def setDisableHardwareAcceleration(value: Boolean): Self = StObject.set(x, "disableHardwareAcceleration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableHardwareAccelerationUndefined: Self = StObject.set(x, "disableHardwareAcceleration", js.undefined)
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      @scala.inline
      def setOnStickyStateChange(value: /* isSticky */ Boolean => Unit): Self = StObject.set(x, "onStickyStateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStickyStateChangeUndefined: Self = StObject.set(x, "onStickyStateChange", js.undefined)
      
      @scala.inline
      def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      @scala.inline
      def setStickyClassName(value: String): Self = StObject.set(x, "stickyClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyClassNameUndefined: Self = StObject.set(x, "stickyClassName", js.undefined)
      
      @scala.inline
      def setStickyStyle(value: js.Any): Self = StObject.set(x, "stickyStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyStyleUndefined: Self = StObject.set(x, "stickyStyle", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTopOffset(value: Double): Self = StObject.set(x, "topOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopOffsetUndefined: Self = StObject.set(x, "topOffset", js.undefined)
    }
  }
}
