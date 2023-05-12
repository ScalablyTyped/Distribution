package typings.reactShowMoreText

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-show-more-text", JSImport.Default)
  @js.native
  open class default protected () extends ReactShowMoreText {
    def this(props: ReactShowMoreTextProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ReactShowMoreTextProps, context: Any) = this()
  }
  
  @JSImport("react-show-more-text", "ReactShowMoreText")
  @js.native
  open class ReactShowMoreText protected ()
    extends Component[ReactShowMoreTextProps, js.Object, Any] {
    def this(props: ReactShowMoreTextProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ReactShowMoreTextProps, context: Any) = this()
  }
  
  trait ReactShowMoreTextProps extends StObject {
    
    var anchorClass: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var keepNewLines: js.UndefOr[Boolean] = js.undefined
    
    var less: js.UndefOr[ReactNode] = js.undefined
    
    var lines: js.UndefOr[Double] = js.undefined
    
    var more: js.UndefOr[ReactNode] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* expanded */ Boolean, Unit]] = js.undefined
    
    var truncatedEndingComponent: js.UndefOr[ReactNode] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ReactShowMoreTextProps {
    
    inline def apply(): ReactShowMoreTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactShowMoreTextProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactShowMoreTextProps] (val x: Self) extends AnyVal {
      
      inline def setAnchorClass(value: String): Self = StObject.set(x, "anchorClass", value.asInstanceOf[js.Any])
      
      inline def setAnchorClassUndefined: Self = StObject.set(x, "anchorClass", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setKeepNewLines(value: Boolean): Self = StObject.set(x, "keepNewLines", value.asInstanceOf[js.Any])
      
      inline def setKeepNewLinesUndefined: Self = StObject.set(x, "keepNewLines", js.undefined)
      
      inline def setLess(value: ReactNode): Self = StObject.set(x, "less", value.asInstanceOf[js.Any])
      
      inline def setLessUndefined: Self = StObject.set(x, "less", js.undefined)
      
      inline def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      inline def setMore(value: ReactNode): Self = StObject.set(x, "more", value.asInstanceOf[js.Any])
      
      inline def setMoreUndefined: Self = StObject.set(x, "more", js.undefined)
      
      inline def setOnClick(value: /* expanded */ Boolean => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setTruncatedEndingComponent(value: ReactNode): Self = StObject.set(x, "truncatedEndingComponent", value.asInstanceOf[js.Any])
      
      inline def setTruncatedEndingComponentUndefined: Self = StObject.set(x, "truncatedEndingComponent", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
