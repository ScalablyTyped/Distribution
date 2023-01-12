package typings.reactPaginate

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.reactPaginate.anon.Event
import typings.reactPaginate.anon.Selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-paginate", JSImport.Default)
  @js.native
  open class default protected () extends Component[ReactPaginateProps, ComponentState, Any] {
    def this(props: ReactPaginateProps) = this()
    def this(props: ReactPaginateProps, context: Any) = this()
  }
  @JSImport("react-paginate", JSImport.Default)
  @js.native
  val default: ComponentClass[ReactPaginateProps, ComponentState] = js.native
  
  trait ReactPaginateProps extends StObject {
    
    /**
      * The classname for the active page.
      */
    var activeClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The classname for the active link.
      */
    var activeLinkClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The method is called to generate the `aria-label` attribute value on each page link
      */
    var ariaLabelBuilder: js.UndefOr[js.Function2[/* pageIndex */ Double, /* selectedPage */ Double, Unit]] = js.undefined
    
    /**
      * The classname on tag `li` of the ellipsis element.
      */
    var breakClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Label for ellipsis.
      */
    var breakLabel: js.UndefOr[String | ReactNode] = js.undefined
    
    /**
      * The classname on tag `a` of the ellipsis element.
      */
    var breakLinkClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Same as `containerClassName`.
      * For use with [styled-components](https://styled-components.com/) & other CSS-in-JS.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * The classname of the pagination container.
      */
    var containerClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Disable onPageChange callback with initial page.
      * Default: false
      */
    var disableInitialCallback: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The classname for disabled `previous` and `next` buttons.
      */
    var disabledClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The classname on tag `a` for disabled `previous` and `next` buttons.
      */
    var disabledLinkClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The event to listen onto before changing the selected page. Default is: `onClick`.
      */
    var eventListener: js.UndefOr[String] = js.undefined
    
    /**
      * Extra context to add to the aria-label HTML attribute.
      */
    var extraAriaContext: js.UndefOr[String] = js.undefined
    
    /**
      * To override selected page with parent prop.
      *
      * Use this if you want to [control](https://reactjs.org/docs/forms.html#controlled-components) the page from your app state.
      */
    var forcePage: js.UndefOr[Double] = js.undefined
    
    /**
      * By default the `hrefBuilder` add `href` only to active controls.
      * Set this prop to `true` so `href` are generated on all controls
      * ([see](https://github.com/AdeleD/react-paginate/issues/242))
      * Default to `false`
      */
    var hrefAllControls: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The method is called to generate the href attribute value on tag a of each page element.
      */
    var hrefBuilder: js.UndefOr[
        js.Function3[/* pageIndex */ Double, /* pageCount */ Double, /* selectedPage */ Double, Unit]
      ] = js.undefined
    
    /**
      * The initial page selected.
      */
    var initialPage: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of pages to display for margins.
      * Default to 3.
      */
    var marginPagesDisplayed: js.UndefOr[Double] = js.undefined
    
    /**
      * Aria label for the `next` button.
      */
    var nextAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * The classname on tag `li` of the `next` button.
      */
    var nextClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Label for the `next` button.
      */
    var nextLabel: js.UndefOr[String | ReactNode] = js.undefined
    
    /**
      * The classname on tag `a` of the `next` button.
      */
    var nextLinkClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The `rel` property on the `a` tag just after the selected page.
      * Default value `next`.  Set to `null` to disable.
      */
    var nextPageRel: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The `rel` property on the `a` tag for the next page control.
      * Default value `next`. Set to `null` to disable.
      */
    var nextRel: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The method to call when an active page is clicked. Exposes the active page object as an argument.
      */
    var onClick: js.UndefOr[js.Function1[/* clickEvent */ Event, Boolean | Double | Unit]] = js.undefined
    
    /**
      * The method to call when an active page is clicked. Exposes the active page object as an argument.
      */
    var onPageActive: js.UndefOr[js.Function1[/* selectedItem */ Selected, Unit]] = js.undefined
    
    /**
      * The method to call when a page is clicked. Exposes the current page object as an argument.
      */
    var onPageChange: js.UndefOr[js.Function1[/* selectedItem */ Selected, Unit]] = js.undefined
    
    /**
      * The classname on tag `li` of each page element.
      */
    var pageClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The total number of pages.
      */
    var pageCount: Double
    
    /**
      * Function to set the text on page links. Defaults to `(page) => page`
      */
    var pageLabelBuilder: js.UndefOr[js.Function1[/* page */ Double, String | ReactNode]] = js.undefined
    
    /**
      * The classname on tag `a` of each page element.
      */
    var pageLinkClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The range of pages displayed.
      * Default to 2.
      */
    var pageRangeDisplayed: js.UndefOr[Double] = js.undefined
    
    /**
      * The `rel` property on the `a` tag just before the selected page.
      * Default value `prev`.  Set to `null` to disable.
      */
    var prevPageRel: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The `rel` property on the `a` tag for the prev page control.
      * Default value `prev`. Set to `null` to disable.
      */
    var prevRel: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Aria label for the `previous` button.
      */
    var previousAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * The classname on tag `li` of the `previous` button.
      */
    var previousClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Label for the `previous` button.
      */
    var previousLabel: js.UndefOr[String | ReactNode] = js.undefined
    
    /**
      * The classname on tag `a` of the `previous` button.
      */
    var previousLinkClassName: js.UndefOr[String] = js.undefined
    
    /**
      * A render function called when `pageCount` is zero. Let the Previous / Next buttons displayed by default (`undefined`).
      * Display nothing when `null` is provided.
      */
    var renderOnZeroPageCount: js.UndefOr[js.Function1[/* props */ this.type, Unit | Null]] = js.undefined
    
    /**
      * The `rel` propery on the `a` tag for the selected page.
      * Default value `canonical`. Set to `null` to disable.
      */
    var selectedPageRel: js.UndefOr[String | Null] = js.undefined
  }
  object ReactPaginateProps {
    
    inline def apply(pageCount: Double): ReactPaginateProps = {
      val __obj = js.Dynamic.literal(pageCount = pageCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactPaginateProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactPaginateProps] (val x: Self) extends AnyVal {
      
      inline def setActiveClassName(value: String): Self = StObject.set(x, "activeClassName", value.asInstanceOf[js.Any])
      
      inline def setActiveClassNameUndefined: Self = StObject.set(x, "activeClassName", js.undefined)
      
      inline def setActiveLinkClassName(value: String): Self = StObject.set(x, "activeLinkClassName", value.asInstanceOf[js.Any])
      
      inline def setActiveLinkClassNameUndefined: Self = StObject.set(x, "activeLinkClassName", js.undefined)
      
      inline def setAriaLabelBuilder(value: (/* pageIndex */ Double, /* selectedPage */ Double) => Unit): Self = StObject.set(x, "ariaLabelBuilder", js.Any.fromFunction2(value))
      
      inline def setAriaLabelBuilderUndefined: Self = StObject.set(x, "ariaLabelBuilder", js.undefined)
      
      inline def setBreakClassName(value: String): Self = StObject.set(x, "breakClassName", value.asInstanceOf[js.Any])
      
      inline def setBreakClassNameUndefined: Self = StObject.set(x, "breakClassName", js.undefined)
      
      inline def setBreakLabel(value: String | ReactNode): Self = StObject.set(x, "breakLabel", value.asInstanceOf[js.Any])
      
      inline def setBreakLabelUndefined: Self = StObject.set(x, "breakLabel", js.undefined)
      
      inline def setBreakLinkClassName(value: String): Self = StObject.set(x, "breakLinkClassName", value.asInstanceOf[js.Any])
      
      inline def setBreakLinkClassNameUndefined: Self = StObject.set(x, "breakLinkClassName", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      inline def setDisableInitialCallback(value: Boolean): Self = StObject.set(x, "disableInitialCallback", value.asInstanceOf[js.Any])
      
      inline def setDisableInitialCallbackUndefined: Self = StObject.set(x, "disableInitialCallback", js.undefined)
      
      inline def setDisabledClassName(value: String): Self = StObject.set(x, "disabledClassName", value.asInstanceOf[js.Any])
      
      inline def setDisabledClassNameUndefined: Self = StObject.set(x, "disabledClassName", js.undefined)
      
      inline def setDisabledLinkClassName(value: String): Self = StObject.set(x, "disabledLinkClassName", value.asInstanceOf[js.Any])
      
      inline def setDisabledLinkClassNameUndefined: Self = StObject.set(x, "disabledLinkClassName", js.undefined)
      
      inline def setEventListener(value: String): Self = StObject.set(x, "eventListener", value.asInstanceOf[js.Any])
      
      inline def setEventListenerUndefined: Self = StObject.set(x, "eventListener", js.undefined)
      
      inline def setExtraAriaContext(value: String): Self = StObject.set(x, "extraAriaContext", value.asInstanceOf[js.Any])
      
      inline def setExtraAriaContextUndefined: Self = StObject.set(x, "extraAriaContext", js.undefined)
      
      inline def setForcePage(value: Double): Self = StObject.set(x, "forcePage", value.asInstanceOf[js.Any])
      
      inline def setForcePageUndefined: Self = StObject.set(x, "forcePage", js.undefined)
      
      inline def setHrefAllControls(value: Boolean): Self = StObject.set(x, "hrefAllControls", value.asInstanceOf[js.Any])
      
      inline def setHrefAllControlsUndefined: Self = StObject.set(x, "hrefAllControls", js.undefined)
      
      inline def setHrefBuilder(value: (/* pageIndex */ Double, /* pageCount */ Double, /* selectedPage */ Double) => Unit): Self = StObject.set(x, "hrefBuilder", js.Any.fromFunction3(value))
      
      inline def setHrefBuilderUndefined: Self = StObject.set(x, "hrefBuilder", js.undefined)
      
      inline def setInitialPage(value: Double): Self = StObject.set(x, "initialPage", value.asInstanceOf[js.Any])
      
      inline def setInitialPageUndefined: Self = StObject.set(x, "initialPage", js.undefined)
      
      inline def setMarginPagesDisplayed(value: Double): Self = StObject.set(x, "marginPagesDisplayed", value.asInstanceOf[js.Any])
      
      inline def setMarginPagesDisplayedUndefined: Self = StObject.set(x, "marginPagesDisplayed", js.undefined)
      
      inline def setNextAriaLabel(value: String): Self = StObject.set(x, "nextAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNextAriaLabelUndefined: Self = StObject.set(x, "nextAriaLabel", js.undefined)
      
      inline def setNextClassName(value: String): Self = StObject.set(x, "nextClassName", value.asInstanceOf[js.Any])
      
      inline def setNextClassNameUndefined: Self = StObject.set(x, "nextClassName", js.undefined)
      
      inline def setNextLabel(value: String | ReactNode): Self = StObject.set(x, "nextLabel", value.asInstanceOf[js.Any])
      
      inline def setNextLabelUndefined: Self = StObject.set(x, "nextLabel", js.undefined)
      
      inline def setNextLinkClassName(value: String): Self = StObject.set(x, "nextLinkClassName", value.asInstanceOf[js.Any])
      
      inline def setNextLinkClassNameUndefined: Self = StObject.set(x, "nextLinkClassName", js.undefined)
      
      inline def setNextPageRel(value: String): Self = StObject.set(x, "nextPageRel", value.asInstanceOf[js.Any])
      
      inline def setNextPageRelNull: Self = StObject.set(x, "nextPageRel", null)
      
      inline def setNextPageRelUndefined: Self = StObject.set(x, "nextPageRel", js.undefined)
      
      inline def setNextRel(value: String): Self = StObject.set(x, "nextRel", value.asInstanceOf[js.Any])
      
      inline def setNextRelNull: Self = StObject.set(x, "nextRel", null)
      
      inline def setNextRelUndefined: Self = StObject.set(x, "nextRel", js.undefined)
      
      inline def setOnClick(value: /* clickEvent */ Event => Boolean | Double | Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnPageActive(value: /* selectedItem */ Selected => Unit): Self = StObject.set(x, "onPageActive", js.Any.fromFunction1(value))
      
      inline def setOnPageActiveUndefined: Self = StObject.set(x, "onPageActive", js.undefined)
      
      inline def setOnPageChange(value: /* selectedItem */ Selected => Unit): Self = StObject.set(x, "onPageChange", js.Any.fromFunction1(value))
      
      inline def setOnPageChangeUndefined: Self = StObject.set(x, "onPageChange", js.undefined)
      
      inline def setPageClassName(value: String): Self = StObject.set(x, "pageClassName", value.asInstanceOf[js.Any])
      
      inline def setPageClassNameUndefined: Self = StObject.set(x, "pageClassName", js.undefined)
      
      inline def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
      
      inline def setPageLabelBuilder(value: /* page */ Double => String | ReactNode): Self = StObject.set(x, "pageLabelBuilder", js.Any.fromFunction1(value))
      
      inline def setPageLabelBuilderUndefined: Self = StObject.set(x, "pageLabelBuilder", js.undefined)
      
      inline def setPageLinkClassName(value: String): Self = StObject.set(x, "pageLinkClassName", value.asInstanceOf[js.Any])
      
      inline def setPageLinkClassNameUndefined: Self = StObject.set(x, "pageLinkClassName", js.undefined)
      
      inline def setPageRangeDisplayed(value: Double): Self = StObject.set(x, "pageRangeDisplayed", value.asInstanceOf[js.Any])
      
      inline def setPageRangeDisplayedUndefined: Self = StObject.set(x, "pageRangeDisplayed", js.undefined)
      
      inline def setPrevPageRel(value: String): Self = StObject.set(x, "prevPageRel", value.asInstanceOf[js.Any])
      
      inline def setPrevPageRelNull: Self = StObject.set(x, "prevPageRel", null)
      
      inline def setPrevPageRelUndefined: Self = StObject.set(x, "prevPageRel", js.undefined)
      
      inline def setPrevRel(value: String): Self = StObject.set(x, "prevRel", value.asInstanceOf[js.Any])
      
      inline def setPrevRelNull: Self = StObject.set(x, "prevRel", null)
      
      inline def setPrevRelUndefined: Self = StObject.set(x, "prevRel", js.undefined)
      
      inline def setPreviousAriaLabel(value: String): Self = StObject.set(x, "previousAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setPreviousAriaLabelUndefined: Self = StObject.set(x, "previousAriaLabel", js.undefined)
      
      inline def setPreviousClassName(value: String): Self = StObject.set(x, "previousClassName", value.asInstanceOf[js.Any])
      
      inline def setPreviousClassNameUndefined: Self = StObject.set(x, "previousClassName", js.undefined)
      
      inline def setPreviousLabel(value: String | ReactNode): Self = StObject.set(x, "previousLabel", value.asInstanceOf[js.Any])
      
      inline def setPreviousLabelUndefined: Self = StObject.set(x, "previousLabel", js.undefined)
      
      inline def setPreviousLinkClassName(value: String): Self = StObject.set(x, "previousLinkClassName", value.asInstanceOf[js.Any])
      
      inline def setPreviousLinkClassNameUndefined: Self = StObject.set(x, "previousLinkClassName", js.undefined)
      
      inline def setRenderOnZeroPageCount(value: ReactPaginateProps => Unit | Null): Self = StObject.set(x, "renderOnZeroPageCount", js.Any.fromFunction1(value))
      
      inline def setRenderOnZeroPageCountUndefined: Self = StObject.set(x, "renderOnZeroPageCount", js.undefined)
      
      inline def setSelectedPageRel(value: String): Self = StObject.set(x, "selectedPageRel", value.asInstanceOf[js.Any])
      
      inline def setSelectedPageRelNull: Self = StObject.set(x, "selectedPageRel", null)
      
      inline def setSelectedPageRelUndefined: Self = StObject.set(x, "selectedPageRel", js.undefined)
    }
  }
  
  type _To = ComponentClass[ReactPaginateProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ComponentClass[ReactPaginateProps, ComponentState] = default
}
