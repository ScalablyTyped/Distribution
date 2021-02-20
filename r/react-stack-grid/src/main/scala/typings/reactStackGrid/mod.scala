package typings.reactStackGrid

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactStackGrid.anon.Appear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-stack-grid", JSImport.Default)
  @js.native
  class default ()
    extends Component[StackGridProps, js.Any, js.Any]
  
  @JSImport("react-stack-grid", "easings")
  @js.native
  val easings: easingProps = js.native
  
  @JSImport("react-stack-grid", "transitions")
  @js.native
  val transitions: transitionsProps = js.native
  
  type StackGrid = Component[StackGridProps, js.Any, js.Any]
  
  @js.native
  trait StackGridProps extends StObject {
    
    var appear: js.UndefOr[js.Function0[Unit]] = js.native
    
    var appearDelay: js.UndefOr[Double] = js.native
    
    var appeared: js.UndefOr[js.Function0[Unit]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var columnWidth: Double | String = js.native
    
    var component: js.UndefOr[String] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var easing: js.UndefOr[String] = js.native
    
    var enableSSR: js.UndefOr[Boolean] = js.native
    
    var enter: js.UndefOr[js.Function0[Unit]] = js.native
    
    var entered: js.UndefOr[js.Function0[Unit]] = js.native
    
    var gridRef: js.UndefOr[js.Function0[Unit]] = js.native
    
    var gutterHeight: js.UndefOr[Double] = js.native
    
    var gutterWidth: js.UndefOr[Double] = js.native
    
    var horizontal: js.UndefOr[Boolean] = js.native
    
    var itemComponent: js.UndefOr[String] = js.native
    
    var leaved: js.UndefOr[js.Function0[Unit]] = js.native
    
    var monitorImagesLoaded: js.UndefOr[Boolean] = js.native
    
    var onLayout: js.UndefOr[js.Function0[Unit]] = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var units: js.UndefOr[Units] = js.native
    
    var userAgent: js.UndefOr[String] = js.native
    
    var vendorPrefix: js.UndefOr[Boolean] = js.native
  }
  object StackGridProps {
    
    @scala.inline
    def apply(columnWidth: Double | String): StackGridProps = {
      val __obj = js.Dynamic.literal(columnWidth = columnWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackGridProps]
    }
    
    @scala.inline
    implicit class StackGridPropsMutableBuilder[Self <: StackGridProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppear(value: () => Unit): Self = StObject.set(x, "appear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAppearDelay(value: Double): Self = StObject.set(x, "appearDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearDelayUndefined: Self = StObject.set(x, "appearDelay", js.undefined)
      
      @scala.inline
      def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      @scala.inline
      def setAppeared(value: () => Unit): Self = StObject.set(x, "appeared", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAppearedUndefined: Self = StObject.set(x, "appeared", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColumnWidth(value: Double | String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setEnableSSR(value: Boolean): Self = StObject.set(x, "enableSSR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSSRUndefined: Self = StObject.set(x, "enableSSR", js.undefined)
      
      @scala.inline
      def setEnter(value: () => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      @scala.inline
      def setEntered(value: () => Unit): Self = StObject.set(x, "entered", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnteredUndefined: Self = StObject.set(x, "entered", js.undefined)
      
      @scala.inline
      def setGridRef(value: () => Unit): Self = StObject.set(x, "gridRef", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGridRefUndefined: Self = StObject.set(x, "gridRef", js.undefined)
      
      @scala.inline
      def setGutterHeight(value: Double): Self = StObject.set(x, "gutterHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterHeightUndefined: Self = StObject.set(x, "gutterHeight", js.undefined)
      
      @scala.inline
      def setGutterWidth(value: Double): Self = StObject.set(x, "gutterWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterWidthUndefined: Self = StObject.set(x, "gutterWidth", js.undefined)
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setItemComponent(value: String): Self = StObject.set(x, "itemComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemComponentUndefined: Self = StObject.set(x, "itemComponent", js.undefined)
      
      @scala.inline
      def setLeaved(value: () => Unit): Self = StObject.set(x, "leaved", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLeavedUndefined: Self = StObject.set(x, "leaved", js.undefined)
      
      @scala.inline
      def setMonitorImagesLoaded(value: Boolean): Self = StObject.set(x, "monitorImagesLoaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitorImagesLoadedUndefined: Self = StObject.set(x, "monitorImagesLoaded", js.undefined)
      
      @scala.inline
      def setOnLayout(value: () => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUnits(value: Units): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      @scala.inline
      def setVendorPrefix(value: Boolean): Self = StObject.set(x, "vendorPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVendorPrefixUndefined: Self = StObject.set(x, "vendorPrefix", js.undefined)
    }
  }
  
  @js.native
  trait Units extends StObject {
    
    var angle: String = js.native
    
    var length: String = js.native
  }
  object Units {
    
    @scala.inline
    def apply(angle: String, length: String): Units = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Units]
    }
    
    @scala.inline
    implicit class UnitsMutableBuilder[Self <: Units] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: String): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait easingProps extends StObject {
    
    var backIn: String = js.native
    
    var backInOut: String = js.native
    
    var backOut: String = js.native
    
    var circIn: String = js.native
    
    var circInOut: String = js.native
    
    var circOut: String = js.native
    
    var cubicIn: String = js.native
    
    var cubicInOut: String = js.native
    
    var cubicOut: String = js.native
    
    var easeIn: String = js.native
    
    var easeInOut: String = js.native
    
    var easeOut: String = js.native
    
    var expoIn: String = js.native
    
    var expoInOut: String = js.native
    
    var expoOut: String = js.native
    
    var linear: String = js.native
    
    var quadIn: String = js.native
    
    var quadInOut: String = js.native
    
    var quadOut: String = js.native
    
    var quartIn: String = js.native
    
    var quartInOut: String = js.native
    
    var quartOut: String = js.native
    
    var quintIn: String = js.native
    
    var quintInOut: String = js.native
    
    var quintOut: String = js.native
    
    var sineIn: String = js.native
    
    var sineInOut: String = js.native
    
    var sineOut: String = js.native
  }
  object easingProps {
    
    @scala.inline
    def apply(
      backIn: String,
      backInOut: String,
      backOut: String,
      circIn: String,
      circInOut: String,
      circOut: String,
      cubicIn: String,
      cubicInOut: String,
      cubicOut: String,
      easeIn: String,
      easeInOut: String,
      easeOut: String,
      expoIn: String,
      expoInOut: String,
      expoOut: String,
      linear: String,
      quadIn: String,
      quadInOut: String,
      quadOut: String,
      quartIn: String,
      quartInOut: String,
      quartOut: String,
      quintIn: String,
      quintInOut: String,
      quintOut: String,
      sineIn: String,
      sineInOut: String,
      sineOut: String
    ): easingProps = {
      val __obj = js.Dynamic.literal(backIn = backIn.asInstanceOf[js.Any], backInOut = backInOut.asInstanceOf[js.Any], backOut = backOut.asInstanceOf[js.Any], circIn = circIn.asInstanceOf[js.Any], circInOut = circInOut.asInstanceOf[js.Any], circOut = circOut.asInstanceOf[js.Any], cubicIn = cubicIn.asInstanceOf[js.Any], cubicInOut = cubicInOut.asInstanceOf[js.Any], cubicOut = cubicOut.asInstanceOf[js.Any], easeIn = easeIn.asInstanceOf[js.Any], easeInOut = easeInOut.asInstanceOf[js.Any], easeOut = easeOut.asInstanceOf[js.Any], expoIn = expoIn.asInstanceOf[js.Any], expoInOut = expoInOut.asInstanceOf[js.Any], expoOut = expoOut.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], quadIn = quadIn.asInstanceOf[js.Any], quadInOut = quadInOut.asInstanceOf[js.Any], quadOut = quadOut.asInstanceOf[js.Any], quartIn = quartIn.asInstanceOf[js.Any], quartInOut = quartInOut.asInstanceOf[js.Any], quartOut = quartOut.asInstanceOf[js.Any], quintIn = quintIn.asInstanceOf[js.Any], quintInOut = quintInOut.asInstanceOf[js.Any], quintOut = quintOut.asInstanceOf[js.Any], sineIn = sineIn.asInstanceOf[js.Any], sineInOut = sineInOut.asInstanceOf[js.Any], sineOut = sineOut.asInstanceOf[js.Any])
      __obj.asInstanceOf[easingProps]
    }
    
    @scala.inline
    implicit class easingPropsMutableBuilder[Self <: easingProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackIn(value: String): Self = StObject.set(x, "backIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackInOut(value: String): Self = StObject.set(x, "backInOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackOut(value: String): Self = StObject.set(x, "backOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircIn(value: String): Self = StObject.set(x, "circIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircInOut(value: String): Self = StObject.set(x, "circInOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircOut(value: String): Self = StObject.set(x, "circOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCubicIn(value: String): Self = StObject.set(x, "cubicIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCubicInOut(value: String): Self = StObject.set(x, "cubicInOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCubicOut(value: String): Self = StObject.set(x, "cubicOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEaseIn(value: String): Self = StObject.set(x, "easeIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEaseInOut(value: String): Self = StObject.set(x, "easeInOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEaseOut(value: String): Self = StObject.set(x, "easeOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpoIn(value: String): Self = StObject.set(x, "expoIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpoInOut(value: String): Self = StObject.set(x, "expoInOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpoOut(value: String): Self = StObject.set(x, "expoOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinear(value: String): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuadIn(value: String): Self = StObject.set(x, "quadIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuadInOut(value: String): Self = StObject.set(x, "quadInOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuadOut(value: String): Self = StObject.set(x, "quadOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuartIn(value: String): Self = StObject.set(x, "quartIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuartInOut(value: String): Self = StObject.set(x, "quartInOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuartOut(value: String): Self = StObject.set(x, "quartOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuintIn(value: String): Self = StObject.set(x, "quintIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuintInOut(value: String): Self = StObject.set(x, "quintInOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuintOut(value: String): Self = StObject.set(x, "quintOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSineIn(value: String): Self = StObject.set(x, "sineIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSineInOut(value: String): Self = StObject.set(x, "sineInOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSineOut(value: String): Self = StObject.set(x, "sineOut", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait transitionsProps extends StObject {
    
    var fade: Appear = js.native
    
    var fadeDown: Appear = js.native
    
    var fadeUp: Appear = js.native
    
    var flip: Appear = js.native
    
    var helix: Appear = js.native
    
    var scaleDown: Appear = js.native
    
    var scaleUp: Appear = js.native
  }
  object transitionsProps {
    
    @scala.inline
    def apply(
      fade: Appear,
      fadeDown: Appear,
      fadeUp: Appear,
      flip: Appear,
      helix: Appear,
      scaleDown: Appear,
      scaleUp: Appear
    ): transitionsProps = {
      val __obj = js.Dynamic.literal(fade = fade.asInstanceOf[js.Any], fadeDown = fadeDown.asInstanceOf[js.Any], fadeUp = fadeUp.asInstanceOf[js.Any], flip = flip.asInstanceOf[js.Any], helix = helix.asInstanceOf[js.Any], scaleDown = scaleDown.asInstanceOf[js.Any], scaleUp = scaleUp.asInstanceOf[js.Any])
      __obj.asInstanceOf[transitionsProps]
    }
    
    @scala.inline
    implicit class transitionsPropsMutableBuilder[Self <: transitionsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFade(value: Appear): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeDown(value: Appear): Self = StObject.set(x, "fadeDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeUp(value: Appear): Self = StObject.set(x, "fadeUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlip(value: Appear): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelix(value: Appear): Self = StObject.set(x, "helix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleDown(value: Appear): Self = StObject.set(x, "scaleDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUp(value: Appear): Self = StObject.set(x, "scaleUp", value.asInstanceOf[js.Any])
    }
  }
}
