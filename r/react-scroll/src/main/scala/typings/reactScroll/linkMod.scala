package typings.reactScroll

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod {
  
  @JSImport("react-scroll/modules/components/Link", JSImport.Default)
  @js.native
  class default ()
    extends Component[LinkProps, js.Object, js.Any]
  
  type Link = Component[LinkProps, js.Object, js.Any]
  
  type LinkProps = ReactScrollLinkProps with HTMLProps[HTMLButtonElement]
  
  @js.native
  trait ReactScrollLinkProps extends StObject {
    
    var absolute: js.UndefOr[Boolean] = js.native
    
    var activeClass: js.UndefOr[String] = js.native
    
    var containerId: js.UndefOr[String] = js.native
    
    var delay: js.UndefOr[Double] = js.native
    
    var duration: js.UndefOr[Double | String | (js.Function1[/* distance */ Double, Double])] = js.native
    
    var hashSpy: js.UndefOr[Boolean] = js.native
    
    var ignoreCancelEvents: js.UndefOr[Boolean] = js.native
    
    var isDynamic: js.UndefOr[Boolean] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onSetActive: js.UndefOr[js.Function1[/* to */ String, Unit]] = js.native
    
    var onSetInactive: js.UndefOr[js.Function0[Unit]] = js.native
    
    var saveHashHistory: js.UndefOr[Boolean] = js.native
    
    var smooth: js.UndefOr[Boolean | String] = js.native
    
    var spy: js.UndefOr[Boolean] = js.native
    
    var to: String = js.native
  }
  object ReactScrollLinkProps {
    
    @scala.inline
    def apply(to: String): ReactScrollLinkProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactScrollLinkProps]
    }
    
    @scala.inline
    implicit class ReactScrollLinkPropsMutableBuilder[Self <: ReactScrollLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      @scala.inline
      def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
      
      @scala.inline
      def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDuration(value: Double | String | (js.Function1[/* distance */ Double, Double])): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationFunction1(value: /* distance */ Double => Double): Self = StObject.set(x, "duration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setHashSpy(value: Boolean): Self = StObject.set(x, "hashSpy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashSpyUndefined: Self = StObject.set(x, "hashSpy", js.undefined)
      
      @scala.inline
      def setIgnoreCancelEvents(value: Boolean): Self = StObject.set(x, "ignoreCancelEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreCancelEventsUndefined: Self = StObject.set(x, "ignoreCancelEvents", js.undefined)
      
      @scala.inline
      def setIsDynamic(value: Boolean): Self = StObject.set(x, "isDynamic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDynamicUndefined: Self = StObject.set(x, "isDynamic", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnSetActive(value: /* to */ String => Unit): Self = StObject.set(x, "onSetActive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSetActiveUndefined: Self = StObject.set(x, "onSetActive", js.undefined)
      
      @scala.inline
      def setOnSetInactive(value: () => Unit): Self = StObject.set(x, "onSetInactive", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSetInactiveUndefined: Self = StObject.set(x, "onSetInactive", js.undefined)
      
      @scala.inline
      def setSaveHashHistory(value: Boolean): Self = StObject.set(x, "saveHashHistory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveHashHistoryUndefined: Self = StObject.set(x, "saveHashHistory", js.undefined)
      
      @scala.inline
      def setSmooth(value: Boolean | String): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
      
      @scala.inline
      def setSpy(value: Boolean): Self = StObject.set(x, "spy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpyUndefined: Self = StObject.set(x, "spy", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
