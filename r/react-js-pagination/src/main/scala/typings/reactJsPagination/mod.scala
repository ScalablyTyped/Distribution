package typings.reactJsPagination

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ClassicComponent
import typings.react.mod.ClassicComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-js-pagination", JSImport.Default)
  @js.native
  open class default protected () extends ClassicComponent[ReactJsPaginationProps, ComponentState] {
    def this(props: ReactJsPaginationProps) = this()
    def this(props: ReactJsPaginationProps, context: Any) = this()
  }
  @JSImport("react-js-pagination", JSImport.Default)
  @js.native
  val default: ClassicComponentClass[ReactJsPaginationProps] = js.native
  
  trait ReactJsPaginationProps extends StObject {
    
    var activeClass: js.UndefOr[String] = js.undefined
    
    var activeLinkClass: js.UndefOr[String] = js.undefined
    
    var activePage: Double
    
    var disabledClass: js.UndefOr[String] = js.undefined
    
    var firstPageText: js.UndefOr[String | ReactElement] = js.undefined
    
    var getPageUrl: js.UndefOr[js.Function1[/* pageNumber */ Double, String]] = js.undefined
    
    var hideDisabled: js.UndefOr[Boolean] = js.undefined
    
    var hideFirstLastPages: js.UndefOr[Boolean] = js.undefined
    
    var hideNavigation: js.UndefOr[Boolean] = js.undefined
    
    var innerClass: js.UndefOr[String] = js.undefined
    
    var itemClass: js.UndefOr[String] = js.undefined
    
    var itemClassFirst: js.UndefOr[String] = js.undefined
    
    var itemClassLast: js.UndefOr[String] = js.undefined
    
    var itemClassNext: js.UndefOr[String] = js.undefined
    
    var itemClassPrev: js.UndefOr[String] = js.undefined
    
    var itemsCountPerPage: js.UndefOr[Double] = js.undefined
    
    var lastPageText: js.UndefOr[String | ReactElement] = js.undefined
    
    var linkClass: js.UndefOr[String] = js.undefined
    
    var linkClassFirst: js.UndefOr[String] = js.undefined
    
    var linkClassLast: js.UndefOr[String] = js.undefined
    
    var linkClassNext: js.UndefOr[String] = js.undefined
    
    var linkClassPrev: js.UndefOr[String] = js.undefined
    
    var nextPageText: js.UndefOr[String | ReactElement] = js.undefined
    
    def onChange(pageNumber: Double): Unit
    
    var pageRangeDisplayed: js.UndefOr[Double] = js.undefined
    
    var prevPageText: js.UndefOr[String | ReactElement] = js.undefined
    
    var totalItemsCount: Double
  }
  object ReactJsPaginationProps {
    
    inline def apply(activePage: Double, onChange: Double => Unit, totalItemsCount: Double): ReactJsPaginationProps = {
      val __obj = js.Dynamic.literal(activePage = activePage.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), totalItemsCount = totalItemsCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactJsPaginationProps]
    }
    
    extension [Self <: ReactJsPaginationProps](x: Self) {
      
      inline def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
      
      inline def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
      
      inline def setActiveLinkClass(value: String): Self = StObject.set(x, "activeLinkClass", value.asInstanceOf[js.Any])
      
      inline def setActiveLinkClassUndefined: Self = StObject.set(x, "activeLinkClass", js.undefined)
      
      inline def setActivePage(value: Double): Self = StObject.set(x, "activePage", value.asInstanceOf[js.Any])
      
      inline def setDisabledClass(value: String): Self = StObject.set(x, "disabledClass", value.asInstanceOf[js.Any])
      
      inline def setDisabledClassUndefined: Self = StObject.set(x, "disabledClass", js.undefined)
      
      inline def setFirstPageText(value: String | ReactElement): Self = StObject.set(x, "firstPageText", value.asInstanceOf[js.Any])
      
      inline def setFirstPageTextUndefined: Self = StObject.set(x, "firstPageText", js.undefined)
      
      inline def setGetPageUrl(value: /* pageNumber */ Double => String): Self = StObject.set(x, "getPageUrl", js.Any.fromFunction1(value))
      
      inline def setGetPageUrlUndefined: Self = StObject.set(x, "getPageUrl", js.undefined)
      
      inline def setHideDisabled(value: Boolean): Self = StObject.set(x, "hideDisabled", value.asInstanceOf[js.Any])
      
      inline def setHideDisabledUndefined: Self = StObject.set(x, "hideDisabled", js.undefined)
      
      inline def setHideFirstLastPages(value: Boolean): Self = StObject.set(x, "hideFirstLastPages", value.asInstanceOf[js.Any])
      
      inline def setHideFirstLastPagesUndefined: Self = StObject.set(x, "hideFirstLastPages", js.undefined)
      
      inline def setHideNavigation(value: Boolean): Self = StObject.set(x, "hideNavigation", value.asInstanceOf[js.Any])
      
      inline def setHideNavigationUndefined: Self = StObject.set(x, "hideNavigation", js.undefined)
      
      inline def setInnerClass(value: String): Self = StObject.set(x, "innerClass", value.asInstanceOf[js.Any])
      
      inline def setInnerClassUndefined: Self = StObject.set(x, "innerClass", js.undefined)
      
      inline def setItemClass(value: String): Self = StObject.set(x, "itemClass", value.asInstanceOf[js.Any])
      
      inline def setItemClassFirst(value: String): Self = StObject.set(x, "itemClassFirst", value.asInstanceOf[js.Any])
      
      inline def setItemClassFirstUndefined: Self = StObject.set(x, "itemClassFirst", js.undefined)
      
      inline def setItemClassLast(value: String): Self = StObject.set(x, "itemClassLast", value.asInstanceOf[js.Any])
      
      inline def setItemClassLastUndefined: Self = StObject.set(x, "itemClassLast", js.undefined)
      
      inline def setItemClassNext(value: String): Self = StObject.set(x, "itemClassNext", value.asInstanceOf[js.Any])
      
      inline def setItemClassNextUndefined: Self = StObject.set(x, "itemClassNext", js.undefined)
      
      inline def setItemClassPrev(value: String): Self = StObject.set(x, "itemClassPrev", value.asInstanceOf[js.Any])
      
      inline def setItemClassPrevUndefined: Self = StObject.set(x, "itemClassPrev", js.undefined)
      
      inline def setItemClassUndefined: Self = StObject.set(x, "itemClass", js.undefined)
      
      inline def setItemsCountPerPage(value: Double): Self = StObject.set(x, "itemsCountPerPage", value.asInstanceOf[js.Any])
      
      inline def setItemsCountPerPageUndefined: Self = StObject.set(x, "itemsCountPerPage", js.undefined)
      
      inline def setLastPageText(value: String | ReactElement): Self = StObject.set(x, "lastPageText", value.asInstanceOf[js.Any])
      
      inline def setLastPageTextUndefined: Self = StObject.set(x, "lastPageText", js.undefined)
      
      inline def setLinkClass(value: String): Self = StObject.set(x, "linkClass", value.asInstanceOf[js.Any])
      
      inline def setLinkClassFirst(value: String): Self = StObject.set(x, "linkClassFirst", value.asInstanceOf[js.Any])
      
      inline def setLinkClassFirstUndefined: Self = StObject.set(x, "linkClassFirst", js.undefined)
      
      inline def setLinkClassLast(value: String): Self = StObject.set(x, "linkClassLast", value.asInstanceOf[js.Any])
      
      inline def setLinkClassLastUndefined: Self = StObject.set(x, "linkClassLast", js.undefined)
      
      inline def setLinkClassNext(value: String): Self = StObject.set(x, "linkClassNext", value.asInstanceOf[js.Any])
      
      inline def setLinkClassNextUndefined: Self = StObject.set(x, "linkClassNext", js.undefined)
      
      inline def setLinkClassPrev(value: String): Self = StObject.set(x, "linkClassPrev", value.asInstanceOf[js.Any])
      
      inline def setLinkClassPrevUndefined: Self = StObject.set(x, "linkClassPrev", js.undefined)
      
      inline def setLinkClassUndefined: Self = StObject.set(x, "linkClass", js.undefined)
      
      inline def setNextPageText(value: String | ReactElement): Self = StObject.set(x, "nextPageText", value.asInstanceOf[js.Any])
      
      inline def setNextPageTextUndefined: Self = StObject.set(x, "nextPageText", js.undefined)
      
      inline def setOnChange(value: Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setPageRangeDisplayed(value: Double): Self = StObject.set(x, "pageRangeDisplayed", value.asInstanceOf[js.Any])
      
      inline def setPageRangeDisplayedUndefined: Self = StObject.set(x, "pageRangeDisplayed", js.undefined)
      
      inline def setPrevPageText(value: String | ReactElement): Self = StObject.set(x, "prevPageText", value.asInstanceOf[js.Any])
      
      inline def setPrevPageTextUndefined: Self = StObject.set(x, "prevPageText", js.undefined)
      
      inline def setTotalItemsCount(value: Double): Self = StObject.set(x, "totalItemsCount", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ClassicComponentClass[ReactJsPaginationProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ClassicComponentClass[ReactJsPaginationProps] = default
}
