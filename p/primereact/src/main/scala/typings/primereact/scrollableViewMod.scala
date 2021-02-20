package typings.primereact

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollableViewMod {
  
  @JSImport("primereact/components/datatable/ScrollableView", "ScrollableView")
  @js.native
  class ScrollableView protected ()
    extends Component[ScrollableViewProps, js.Any, js.Any] {
    def this(props: ScrollableViewProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollableViewProps, context: js.Any) = this()
  }
  
  @js.native
  trait ScrollableViewProps extends StObject {
    
    var body: js.UndefOr[js.Any] = js.native
    
    var footer: js.UndefOr[js.Any] = js.native
    
    var frozen: js.UndefOr[Boolean] = js.native
    
    var frozenBody: js.UndefOr[js.Any] = js.native
    
    var frozenWidth: js.UndefOr[String] = js.native
    
    var header: js.UndefOr[js.Any] = js.native
    
    var onVirtualScroll: js.UndefOr[js.Function1[/* page */ Double, Unit]] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var totalRcords: js.UndefOr[Double] = js.native
    
    var unfrozenWidth: js.UndefOr[String] = js.native
    
    var virtualScroll: js.UndefOr[Boolean] = js.native
  }
  object ScrollableViewProps {
    
    @scala.inline
    def apply(): ScrollableViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollableViewProps]
    }
    
    @scala.inline
    implicit class ScrollableViewPropsMutableBuilder[Self <: ScrollableViewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setFooter(value: js.Any): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setFrozen(value: Boolean): Self = StObject.set(x, "frozen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrozenBody(value: js.Any): Self = StObject.set(x, "frozenBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrozenBodyUndefined: Self = StObject.set(x, "frozenBody", js.undefined)
      
      @scala.inline
      def setFrozenUndefined: Self = StObject.set(x, "frozen", js.undefined)
      
      @scala.inline
      def setFrozenWidth(value: String): Self = StObject.set(x, "frozenWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrozenWidthUndefined: Self = StObject.set(x, "frozenWidth", js.undefined)
      
      @scala.inline
      def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setOnVirtualScroll(value: /* page */ Double => Unit): Self = StObject.set(x, "onVirtualScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVirtualScrollUndefined: Self = StObject.set(x, "onVirtualScroll", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setTotalRcords(value: Double): Self = StObject.set(x, "totalRcords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalRcordsUndefined: Self = StObject.set(x, "totalRcords", js.undefined)
      
      @scala.inline
      def setUnfrozenWidth(value: String): Self = StObject.set(x, "unfrozenWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnfrozenWidthUndefined: Self = StObject.set(x, "unfrozenWidth", js.undefined)
      
      @scala.inline
      def setVirtualScroll(value: Boolean): Self = StObject.set(x, "virtualScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualScrollUndefined: Self = StObject.set(x, "virtualScroll", js.undefined)
    }
  }
}
