package typings.primereact

import typings.primereact.anon.TargetHTMLElement
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("primereact/components/tooltip/Tooltip", "Tooltip")
  @js.native
  class Tooltip protected ()
    extends Component[TooltipProps, js.Any, js.Any] {
    def this(props: TooltipProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TooltipProps, context: js.Any) = this()
  }
  
  trait TooltipProps extends StObject {
    
    var appendTo: js.UndefOr[js.Object] = js.undefined
    
    var at: js.UndefOr[String] = js.undefined
    
    var autoZIndex: js.UndefOr[Boolean] = js.undefined
    
    var baseZIndex: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var event: js.UndefOr[String] = js.undefined
    
    var hideEvent: js.UndefOr[String] = js.undefined
    
    var mouseTrack: js.UndefOr[Boolean] = js.undefined
    
    var mouseTrackLeft: js.UndefOr[Double] = js.undefined
    
    var mouseTrackTop: js.UndefOr[Double] = js.undefined
    
    var my: js.UndefOr[String] = js.undefined
    
    var onBeforeHide: js.UndefOr[js.Function1[/* e */ TargetHTMLElement, Unit]] = js.undefined
    
    var onBeforeShow: js.UndefOr[js.Function1[/* e */ TargetHTMLElement, Unit]] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* e */ TargetHTMLElement, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* e */ TargetHTMLElement, Unit]] = js.undefined
    
    var position: js.UndefOr[String] = js.undefined
    
    var showEvent: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var target: js.UndefOr[js.Any] = js.undefined
  }
  object TooltipProps {
    
    inline def apply(): TooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipProps]
    }
    
    extension [Self <: TooltipProps](x: Self) {
      
      inline def setAppendTo(value: js.Object): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setAt(value: String): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setAutoZIndex(value: Boolean): Self = StObject.set(x, "autoZIndex", value.asInstanceOf[js.Any])
      
      inline def setAutoZIndexUndefined: Self = StObject.set(x, "autoZIndex", js.undefined)
      
      inline def setBaseZIndex(value: Double): Self = StObject.set(x, "baseZIndex", value.asInstanceOf[js.Any])
      
      inline def setBaseZIndexUndefined: Self = StObject.set(x, "baseZIndex", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setHideEvent(value: String): Self = StObject.set(x, "hideEvent", value.asInstanceOf[js.Any])
      
      inline def setHideEventUndefined: Self = StObject.set(x, "hideEvent", js.undefined)
      
      inline def setMouseTrack(value: Boolean): Self = StObject.set(x, "mouseTrack", value.asInstanceOf[js.Any])
      
      inline def setMouseTrackLeft(value: Double): Self = StObject.set(x, "mouseTrackLeft", value.asInstanceOf[js.Any])
      
      inline def setMouseTrackLeftUndefined: Self = StObject.set(x, "mouseTrackLeft", js.undefined)
      
      inline def setMouseTrackTop(value: Double): Self = StObject.set(x, "mouseTrackTop", value.asInstanceOf[js.Any])
      
      inline def setMouseTrackTopUndefined: Self = StObject.set(x, "mouseTrackTop", js.undefined)
      
      inline def setMouseTrackUndefined: Self = StObject.set(x, "mouseTrack", js.undefined)
      
      inline def setMy(value: String): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      inline def setOnBeforeHide(value: /* e */ TargetHTMLElement => Unit): Self = StObject.set(x, "onBeforeHide", js.Any.fromFunction1(value))
      
      inline def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      inline def setOnBeforeShow(value: /* e */ TargetHTMLElement => Unit): Self = StObject.set(x, "onBeforeShow", js.Any.fromFunction1(value))
      
      inline def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      inline def setOnHide(value: /* e */ TargetHTMLElement => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: /* e */ TargetHTMLElement => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setShowEvent(value: String): Self = StObject.set(x, "showEvent", value.asInstanceOf[js.Any])
      
      inline def setShowEventUndefined: Self = StObject.set(x, "showEvent", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
