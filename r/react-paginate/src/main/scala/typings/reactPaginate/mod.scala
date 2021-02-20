package typings.reactPaginate

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.reactPaginate.anon.Selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-paginate", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[ReactPaginateProps, ComponentState, js.Any] {
    def this(props: ReactPaginateProps) = this()
    def this(props: ReactPaginateProps, context: js.Any) = this()
  }
  @JSImport("react-paginate", JSImport.Default)
  @js.native
  val default: ComponentClass[ReactPaginateProps, ComponentState] = js.native
  
  @js.native
  trait ReactPaginateProps extends StObject {
    
    /**
      * The classname for the active page.
      */
    var activeClassName: js.UndefOr[String] = js.native
    
    /**
      * The classname for the active link.
      */
    var activeLinkClassName: js.UndefOr[String] = js.native
    
    /**
      * The classname on tag `li` of the ellipsis element.
      */
    var breakClassName: js.UndefOr[String] = js.native
    
    /**
      * Label for ellipsis.
      */
    var breakLabel: js.UndefOr[String | ReactNode] = js.native
    
    /**
      * The classname on tag `a` of the ellipsis element.
      */
    var breakLinkClassName: js.UndefOr[String] = js.native
    
    /**
      * The classname of the pagination container.
      */
    var containerClassName: js.UndefOr[String] = js.native
    
    /**
      * Disable onPageChange callback with initial page. Default: false
      */
    var disableInitialCallback: js.UndefOr[Boolean] = js.native
    
    /**
      * The classname for disabled `previous` and `next` buttons.
      */
    var disabledClassName: js.UndefOr[String] = js.native
    
    /**
      * Extra context to add to the aria-label HTML attribute.
      */
    var extraAriaContext: js.UndefOr[String] = js.native
    
    /**
      * To override selected page with parent prop.
      */
    var forcePage: js.UndefOr[Double] = js.native
    
    /**
      * The method is called to generate the href attribute value on tag a of each page element.
      */
    var hrefBuilder: js.UndefOr[js.Function1[/* pageIndex */ Double, Unit]] = js.native
    
    /**
      * The initial page selected.
      */
    var initialPage: js.UndefOr[Double] = js.native
    
    /**
      * The number of pages to display for margins.
      */
    var marginPagesDisplayed: Double = js.native
    
    /**
      * The classname on tag `li` of the `next` button.
      */
    var nextClassName: js.UndefOr[String] = js.native
    
    /**
      * Label for the `next` button.
      */
    var nextLabel: js.UndefOr[ReactNode] = js.native
    
    /**
      * The classname on tag `a` of the `next` button.
      */
    var nextLinkClassName: js.UndefOr[String] = js.native
    
    /**
      * The method to call when a page is clicked. Exposes the current page object as an argument.
      */
    var onPageChange: js.UndefOr[js.Function1[/* selectedItem */ Selected, Unit]] = js.native
    
    /**
      * The classname on tag `li` of each page element.
      */
    var pageClassName: js.UndefOr[String] = js.native
    
    /**
      * The total number of pages.
      */
    var pageCount: Double = js.native
    
    /**
      * The classname on tag `a` of each page element.
      */
    var pageLinkClassName: js.UndefOr[String] = js.native
    
    /**
      * The range of pages displayed.
      */
    var pageRangeDisplayed: Double = js.native
    
    /**
      * The classname on tag `li` of the `previous` button.
      */
    var previousClassName: js.UndefOr[String] = js.native
    
    /**
      * Label for the `previous` button.
      */
    var previousLabel: js.UndefOr[ReactNode] = js.native
    
    /**
      * The classname on tag `a` of the `previous` button.
      */
    var previousLinkClassName: js.UndefOr[String] = js.native
  }
  object ReactPaginateProps {
    
    @scala.inline
    def apply(marginPagesDisplayed: Double, pageCount: Double, pageRangeDisplayed: Double): ReactPaginateProps = {
      val __obj = js.Dynamic.literal(marginPagesDisplayed = marginPagesDisplayed.asInstanceOf[js.Any], pageCount = pageCount.asInstanceOf[js.Any], pageRangeDisplayed = pageRangeDisplayed.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactPaginateProps]
    }
    
    @scala.inline
    implicit class ReactPaginatePropsMutableBuilder[Self <: ReactPaginateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveClassName(value: String): Self = StObject.set(x, "activeClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveClassNameUndefined: Self = StObject.set(x, "activeClassName", js.undefined)
      
      @scala.inline
      def setActiveLinkClassName(value: String): Self = StObject.set(x, "activeLinkClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveLinkClassNameUndefined: Self = StObject.set(x, "activeLinkClassName", js.undefined)
      
      @scala.inline
      def setBreakClassName(value: String): Self = StObject.set(x, "breakClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakClassNameUndefined: Self = StObject.set(x, "breakClassName", js.undefined)
      
      @scala.inline
      def setBreakLabel(value: String | ReactNode): Self = StObject.set(x, "breakLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakLabelUndefined: Self = StObject.set(x, "breakLabel", js.undefined)
      
      @scala.inline
      def setBreakLinkClassName(value: String): Self = StObject.set(x, "breakLinkClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakLinkClassNameUndefined: Self = StObject.set(x, "breakLinkClassName", js.undefined)
      
      @scala.inline
      def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      @scala.inline
      def setDisableInitialCallback(value: Boolean): Self = StObject.set(x, "disableInitialCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableInitialCallbackUndefined: Self = StObject.set(x, "disableInitialCallback", js.undefined)
      
      @scala.inline
      def setDisabledClassName(value: String): Self = StObject.set(x, "disabledClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledClassNameUndefined: Self = StObject.set(x, "disabledClassName", js.undefined)
      
      @scala.inline
      def setExtraAriaContext(value: String): Self = StObject.set(x, "extraAriaContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraAriaContextUndefined: Self = StObject.set(x, "extraAriaContext", js.undefined)
      
      @scala.inline
      def setForcePage(value: Double): Self = StObject.set(x, "forcePage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForcePageUndefined: Self = StObject.set(x, "forcePage", js.undefined)
      
      @scala.inline
      def setHrefBuilder(value: /* pageIndex */ Double => Unit): Self = StObject.set(x, "hrefBuilder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHrefBuilderUndefined: Self = StObject.set(x, "hrefBuilder", js.undefined)
      
      @scala.inline
      def setInitialPage(value: Double): Self = StObject.set(x, "initialPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialPageUndefined: Self = StObject.set(x, "initialPage", js.undefined)
      
      @scala.inline
      def setMarginPagesDisplayed(value: Double): Self = StObject.set(x, "marginPagesDisplayed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextClassName(value: String): Self = StObject.set(x, "nextClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextClassNameUndefined: Self = StObject.set(x, "nextClassName", js.undefined)
      
      @scala.inline
      def setNextLabel(value: ReactNode): Self = StObject.set(x, "nextLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextLabelUndefined: Self = StObject.set(x, "nextLabel", js.undefined)
      
      @scala.inline
      def setNextLinkClassName(value: String): Self = StObject.set(x, "nextLinkClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextLinkClassNameUndefined: Self = StObject.set(x, "nextLinkClassName", js.undefined)
      
      @scala.inline
      def setOnPageChange(value: /* selectedItem */ Selected => Unit): Self = StObject.set(x, "onPageChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageChangeUndefined: Self = StObject.set(x, "onPageChange", js.undefined)
      
      @scala.inline
      def setPageClassName(value: String): Self = StObject.set(x, "pageClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageClassNameUndefined: Self = StObject.set(x, "pageClassName", js.undefined)
      
      @scala.inline
      def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageLinkClassName(value: String): Self = StObject.set(x, "pageLinkClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageLinkClassNameUndefined: Self = StObject.set(x, "pageLinkClassName", js.undefined)
      
      @scala.inline
      def setPageRangeDisplayed(value: Double): Self = StObject.set(x, "pageRangeDisplayed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousClassName(value: String): Self = StObject.set(x, "previousClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousClassNameUndefined: Self = StObject.set(x, "previousClassName", js.undefined)
      
      @scala.inline
      def setPreviousLabel(value: ReactNode): Self = StObject.set(x, "previousLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousLabelUndefined: Self = StObject.set(x, "previousLabel", js.undefined)
      
      @scala.inline
      def setPreviousLinkClassName(value: String): Self = StObject.set(x, "previousLinkClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousLinkClassNameUndefined: Self = StObject.set(x, "previousLinkClassName", js.undefined)
    }
  }
  
  type _To = ComponentClass[ReactPaginateProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ComponentClass[ReactPaginateProps, ComponentState] = default
}
