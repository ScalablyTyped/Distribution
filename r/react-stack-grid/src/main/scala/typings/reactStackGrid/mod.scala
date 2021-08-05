package typings.reactStackGrid

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactStackGrid.anon.Appear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  trait StackGridProps extends StObject {
    
    var appear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var appearDelay: js.UndefOr[Double] = js.undefined
    
    var appeared: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var columnWidth: Double | String
    
    var component: js.UndefOr[String] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[String] = js.undefined
    
    var enableSSR: js.UndefOr[Boolean] = js.undefined
    
    var enter: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var entered: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var gridRef: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var gutterHeight: js.UndefOr[Double] = js.undefined
    
    var gutterWidth: js.UndefOr[Double] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var itemComponent: js.UndefOr[String] = js.undefined
    
    var leaved: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var monitorImagesLoaded: js.UndefOr[Boolean] = js.undefined
    
    var onLayout: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var units: js.UndefOr[Units] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
    
    var vendorPrefix: js.UndefOr[Boolean] = js.undefined
  }
  object StackGridProps {
    
    inline def apply(columnWidth: Double | String): StackGridProps = {
      val __obj = js.Dynamic.literal(columnWidth = columnWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackGridProps]
    }
    
    extension [Self <: StackGridProps](x: Self) {
      
      inline def setAppear(value: () => Unit): Self = StObject.set(x, "appear", js.Any.fromFunction0(value))
      
      inline def setAppearDelay(value: Double): Self = StObject.set(x, "appearDelay", value.asInstanceOf[js.Any])
      
      inline def setAppearDelayUndefined: Self = StObject.set(x, "appearDelay", js.undefined)
      
      inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      inline def setAppeared(value: () => Unit): Self = StObject.set(x, "appeared", js.Any.fromFunction0(value))
      
      inline def setAppearedUndefined: Self = StObject.set(x, "appeared", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColumnWidth(value: Double | String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setEnableSSR(value: Boolean): Self = StObject.set(x, "enableSSR", value.asInstanceOf[js.Any])
      
      inline def setEnableSSRUndefined: Self = StObject.set(x, "enableSSR", js.undefined)
      
      inline def setEnter(value: () => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction0(value))
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setEntered(value: () => Unit): Self = StObject.set(x, "entered", js.Any.fromFunction0(value))
      
      inline def setEnteredUndefined: Self = StObject.set(x, "entered", js.undefined)
      
      inline def setGridRef(value: () => Unit): Self = StObject.set(x, "gridRef", js.Any.fromFunction0(value))
      
      inline def setGridRefUndefined: Self = StObject.set(x, "gridRef", js.undefined)
      
      inline def setGutterHeight(value: Double): Self = StObject.set(x, "gutterHeight", value.asInstanceOf[js.Any])
      
      inline def setGutterHeightUndefined: Self = StObject.set(x, "gutterHeight", js.undefined)
      
      inline def setGutterWidth(value: Double): Self = StObject.set(x, "gutterWidth", value.asInstanceOf[js.Any])
      
      inline def setGutterWidthUndefined: Self = StObject.set(x, "gutterWidth", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setItemComponent(value: String): Self = StObject.set(x, "itemComponent", value.asInstanceOf[js.Any])
      
      inline def setItemComponentUndefined: Self = StObject.set(x, "itemComponent", js.undefined)
      
      inline def setLeaved(value: () => Unit): Self = StObject.set(x, "leaved", js.Any.fromFunction0(value))
      
      inline def setLeavedUndefined: Self = StObject.set(x, "leaved", js.undefined)
      
      inline def setMonitorImagesLoaded(value: Boolean): Self = StObject.set(x, "monitorImagesLoaded", value.asInstanceOf[js.Any])
      
      inline def setMonitorImagesLoadedUndefined: Self = StObject.set(x, "monitorImagesLoaded", js.undefined)
      
      inline def setOnLayout(value: () => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction0(value))
      
      inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUnits(value: Units): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      inline def setVendorPrefix(value: Boolean): Self = StObject.set(x, "vendorPrefix", value.asInstanceOf[js.Any])
      
      inline def setVendorPrefixUndefined: Self = StObject.set(x, "vendorPrefix", js.undefined)
    }
  }
  
  trait Units extends StObject {
    
    var angle: String
    
    var length: String
  }
  object Units {
    
    inline def apply(angle: String, length: String): Units = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Units]
    }
    
    extension [Self <: Units](x: Self) {
      
      inline def setAngle(value: String): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait easingProps extends StObject {
    
    var backIn: String
    
    var backInOut: String
    
    var backOut: String
    
    var circIn: String
    
    var circInOut: String
    
    var circOut: String
    
    var cubicIn: String
    
    var cubicInOut: String
    
    var cubicOut: String
    
    var easeIn: String
    
    var easeInOut: String
    
    var easeOut: String
    
    var expoIn: String
    
    var expoInOut: String
    
    var expoOut: String
    
    var linear: String
    
    var quadIn: String
    
    var quadInOut: String
    
    var quadOut: String
    
    var quartIn: String
    
    var quartInOut: String
    
    var quartOut: String
    
    var quintIn: String
    
    var quintInOut: String
    
    var quintOut: String
    
    var sineIn: String
    
    var sineInOut: String
    
    var sineOut: String
  }
  object easingProps {
    
    inline def apply(
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
    
    extension [Self <: easingProps](x: Self) {
      
      inline def setBackIn(value: String): Self = StObject.set(x, "backIn", value.asInstanceOf[js.Any])
      
      inline def setBackInOut(value: String): Self = StObject.set(x, "backInOut", value.asInstanceOf[js.Any])
      
      inline def setBackOut(value: String): Self = StObject.set(x, "backOut", value.asInstanceOf[js.Any])
      
      inline def setCircIn(value: String): Self = StObject.set(x, "circIn", value.asInstanceOf[js.Any])
      
      inline def setCircInOut(value: String): Self = StObject.set(x, "circInOut", value.asInstanceOf[js.Any])
      
      inline def setCircOut(value: String): Self = StObject.set(x, "circOut", value.asInstanceOf[js.Any])
      
      inline def setCubicIn(value: String): Self = StObject.set(x, "cubicIn", value.asInstanceOf[js.Any])
      
      inline def setCubicInOut(value: String): Self = StObject.set(x, "cubicInOut", value.asInstanceOf[js.Any])
      
      inline def setCubicOut(value: String): Self = StObject.set(x, "cubicOut", value.asInstanceOf[js.Any])
      
      inline def setEaseIn(value: String): Self = StObject.set(x, "easeIn", value.asInstanceOf[js.Any])
      
      inline def setEaseInOut(value: String): Self = StObject.set(x, "easeInOut", value.asInstanceOf[js.Any])
      
      inline def setEaseOut(value: String): Self = StObject.set(x, "easeOut", value.asInstanceOf[js.Any])
      
      inline def setExpoIn(value: String): Self = StObject.set(x, "expoIn", value.asInstanceOf[js.Any])
      
      inline def setExpoInOut(value: String): Self = StObject.set(x, "expoInOut", value.asInstanceOf[js.Any])
      
      inline def setExpoOut(value: String): Self = StObject.set(x, "expoOut", value.asInstanceOf[js.Any])
      
      inline def setLinear(value: String): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
      
      inline def setQuadIn(value: String): Self = StObject.set(x, "quadIn", value.asInstanceOf[js.Any])
      
      inline def setQuadInOut(value: String): Self = StObject.set(x, "quadInOut", value.asInstanceOf[js.Any])
      
      inline def setQuadOut(value: String): Self = StObject.set(x, "quadOut", value.asInstanceOf[js.Any])
      
      inline def setQuartIn(value: String): Self = StObject.set(x, "quartIn", value.asInstanceOf[js.Any])
      
      inline def setQuartInOut(value: String): Self = StObject.set(x, "quartInOut", value.asInstanceOf[js.Any])
      
      inline def setQuartOut(value: String): Self = StObject.set(x, "quartOut", value.asInstanceOf[js.Any])
      
      inline def setQuintIn(value: String): Self = StObject.set(x, "quintIn", value.asInstanceOf[js.Any])
      
      inline def setQuintInOut(value: String): Self = StObject.set(x, "quintInOut", value.asInstanceOf[js.Any])
      
      inline def setQuintOut(value: String): Self = StObject.set(x, "quintOut", value.asInstanceOf[js.Any])
      
      inline def setSineIn(value: String): Self = StObject.set(x, "sineIn", value.asInstanceOf[js.Any])
      
      inline def setSineInOut(value: String): Self = StObject.set(x, "sineInOut", value.asInstanceOf[js.Any])
      
      inline def setSineOut(value: String): Self = StObject.set(x, "sineOut", value.asInstanceOf[js.Any])
    }
  }
  
  trait transitionsProps extends StObject {
    
    var fade: Appear
    
    var fadeDown: Appear
    
    var fadeUp: Appear
    
    var flip: Appear
    
    var helix: Appear
    
    var scaleDown: Appear
    
    var scaleUp: Appear
  }
  object transitionsProps {
    
    inline def apply(
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
    
    extension [Self <: transitionsProps](x: Self) {
      
      inline def setFade(value: Appear): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      inline def setFadeDown(value: Appear): Self = StObject.set(x, "fadeDown", value.asInstanceOf[js.Any])
      
      inline def setFadeUp(value: Appear): Self = StObject.set(x, "fadeUp", value.asInstanceOf[js.Any])
      
      inline def setFlip(value: Appear): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setHelix(value: Appear): Self = StObject.set(x, "helix", value.asInstanceOf[js.Any])
      
      inline def setScaleDown(value: Appear): Self = StObject.set(x, "scaleDown", value.asInstanceOf[js.Any])
      
      inline def setScaleUp(value: Appear): Self = StObject.set(x, "scaleUp", value.asInstanceOf[js.Any])
    }
  }
}
