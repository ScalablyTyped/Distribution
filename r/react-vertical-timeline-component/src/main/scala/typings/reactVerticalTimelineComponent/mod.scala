package typings.reactVerticalTimelineComponent

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactVerticalTimelineComponent.reactVerticalTimelineComponentStrings.`1-column-left`
import typings.reactVerticalTimelineComponent.reactVerticalTimelineComponentStrings.`1-column-right`
import typings.reactVerticalTimelineComponent.reactVerticalTimelineComponentStrings.`1-column`
import typings.reactVerticalTimelineComponent.reactVerticalTimelineComponentStrings.`2-columns`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-vertical-timeline-component", "VerticalTimeline")
  @js.native
  open class VerticalTimeline protected ()
    extends Component[VerticalTimelineProps, js.Object, Any] {
    def this(props: VerticalTimelineProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: VerticalTimelineProps, context: Any) = this()
  }
  
  @JSImport("react-vertical-timeline-component", "VerticalTimelineElement")
  @js.native
  open class VerticalTimelineElement protected ()
    extends Component[VerticalTimelineElementProps, js.Object, Any] {
    def this(props: VerticalTimelineElementProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: VerticalTimelineElementProps, context: Any) = this()
  }
  
  trait VerticalTimelineElementProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var contentArrowStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var contentStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var date: js.UndefOr[String] = js.undefined
    
    var dateClassName: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var iconClassName: js.UndefOr[String] = js.undefined
    
    var iconOnClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var iconStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var intersectionObserverProps: js.UndefOr[Any] = js.undefined
    
    var onTimelineElementClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var position: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var textClassName: js.UndefOr[String] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object VerticalTimelineElementProps {
    
    inline def apply(): VerticalTimelineElementProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalTimelineElementProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VerticalTimelineElementProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentArrowStyle(value: CSSProperties): Self = StObject.set(x, "contentArrowStyle", value.asInstanceOf[js.Any])
      
      inline def setContentArrowStyleUndefined: Self = StObject.set(x, "contentArrowStyle", js.undefined)
      
      inline def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateClassName(value: String): Self = StObject.set(x, "dateClassName", value.asInstanceOf[js.Any])
      
      inline def setDateClassNameUndefined: Self = StObject.set(x, "dateClassName", js.undefined)
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
      
      inline def setIconClassNameUndefined: Self = StObject.set(x, "iconClassName", js.undefined)
      
      inline def setIconOnClick(value: () => Unit): Self = StObject.set(x, "iconOnClick", js.Any.fromFunction0(value))
      
      inline def setIconOnClickUndefined: Self = StObject.set(x, "iconOnClick", js.undefined)
      
      inline def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIntersectionObserverProps(value: Any): Self = StObject.set(x, "intersectionObserverProps", value.asInstanceOf[js.Any])
      
      inline def setIntersectionObserverPropsUndefined: Self = StObject.set(x, "intersectionObserverProps", js.undefined)
      
      inline def setOnTimelineElementClick(value: () => Unit): Self = StObject.set(x, "onTimelineElementClick", js.Any.fromFunction0(value))
      
      inline def setOnTimelineElementClickUndefined: Self = StObject.set(x, "onTimelineElementClick", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextClassName(value: String): Self = StObject.set(x, "textClassName", value.asInstanceOf[js.Any])
      
      inline def setTextClassNameUndefined: Self = StObject.set(x, "textClassName", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait VerticalTimelineProps extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var layout: js.UndefOr[`1-column` | `1-column-left` | `1-column-right` | `2-columns`] = js.undefined
    
    var lineColor: js.UndefOr[String] = js.undefined
  }
  object VerticalTimelineProps {
    
    inline def apply(): VerticalTimelineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalTimelineProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VerticalTimelineProps] (val x: Self) extends AnyVal {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setLayout(value: `1-column` | `1-column-left` | `1-column-right` | `2-columns`): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
      
      inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    }
  }
}
