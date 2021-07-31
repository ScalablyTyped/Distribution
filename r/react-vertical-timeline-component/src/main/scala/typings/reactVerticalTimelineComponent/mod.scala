package typings.reactVerticalTimelineComponent

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactVerticalTimelineComponent.reactVerticalTimelineComponentStrings.`1-column`
import typings.reactVerticalTimelineComponent.reactVerticalTimelineComponentStrings.`2-columns`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-vertical-timeline-component", "VerticalTimeline")
  @js.native
  class VerticalTimeline protected ()
    extends Component[VerticalTimelineProps, js.Object, js.Any] {
    def this(props: VerticalTimelineProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: VerticalTimelineProps, context: js.Any) = this()
  }
  
  @JSImport("react-vertical-timeline-component", "VerticalTimelineElement")
  @js.native
  class VerticalTimelineElement protected ()
    extends Component[VerticalTimelineElementProps, js.Object, js.Any] {
    def this(props: VerticalTimelineElementProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: VerticalTimelineElementProps, context: js.Any) = this()
  }
  
  trait VerticalTimelineElementProps extends StObject {
    
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
    
    var intersectionObserverProps: js.UndefOr[js.Any] = js.undefined
    
    var onTimelineElementClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var position: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var textClassName: js.UndefOr[String] = js.undefined
  }
  object VerticalTimelineElementProps {
    
    @scala.inline
    def apply(): VerticalTimelineElementProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalTimelineElementProps]
    }
    
    @scala.inline
    implicit class VerticalTimelineElementPropsMutableBuilder[Self <: VerticalTimelineElementProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContentArrowStyle(value: CSSProperties): Self = StObject.set(x, "contentArrowStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentArrowStyleUndefined: Self = StObject.set(x, "contentArrowStyle", js.undefined)
      
      @scala.inline
      def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateClassName(value: String): Self = StObject.set(x, "dateClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateClassNameUndefined: Self = StObject.set(x, "dateClassName", js.undefined)
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClassNameUndefined: Self = StObject.set(x, "iconClassName", js.undefined)
      
      @scala.inline
      def setIconOnClick(value: () => Unit): Self = StObject.set(x, "iconOnClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIconOnClickUndefined: Self = StObject.set(x, "iconOnClick", js.undefined)
      
      @scala.inline
      def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIntersectionObserverProps(value: js.Any): Self = StObject.set(x, "intersectionObserverProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntersectionObserverPropsUndefined: Self = StObject.set(x, "intersectionObserverProps", js.undefined)
      
      @scala.inline
      def setOnTimelineElementClick(value: () => Unit): Self = StObject.set(x, "onTimelineElementClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnTimelineElementClickUndefined: Self = StObject.set(x, "onTimelineElementClick", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTextClassName(value: String): Self = StObject.set(x, "textClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextClassNameUndefined: Self = StObject.set(x, "textClassName", js.undefined)
    }
  }
  
  trait VerticalTimelineProps extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var layout: js.UndefOr[`1-column` | `2-columns`] = js.undefined
  }
  object VerticalTimelineProps {
    
    @scala.inline
    def apply(): VerticalTimelineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalTimelineProps]
    }
    
    @scala.inline
    implicit class VerticalTimelinePropsMutableBuilder[Self <: VerticalTimelineProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setLayout(value: `1-column` | `2-columns`): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    }
  }
}
