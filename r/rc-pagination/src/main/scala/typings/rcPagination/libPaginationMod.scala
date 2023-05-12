package typings.rcPagination

import typings.rcPagination.anon.Itemsperpage
import typings.rcPagination.anon.PartialPaginationState
import typings.rcPagination.rcPaginationStrings.`jump-next`
import typings.rcPagination.rcPaginationStrings.`jump-prev`
import typings.rcPagination.rcPaginationStrings.next
import typings.rcPagination.rcPaginationStrings.page
import typings.rcPagination.rcPaginationStrings.prev
import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactFragment
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.Element
import typings.std.HTMLInputElement
import typings.std.HTMLLIElement
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaginationMod {
  
  @JSImport("rc-pagination/lib/Pagination", JSImport.Default)
  @js.native
  open class default protected () extends Pagination {
    def this(props: PaginationProps) = this()
  }
  object default {
    
    @JSImport("rc-pagination/lib/Pagination", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-pagination/lib/Pagination", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-pagination/lib/Pagination", "default.defaultProps.className")
      @js.native
      def className: String = js.native
      inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib/Pagination", "default.defaultProps.defaultCurrent")
      @js.native
      def defaultCurrent: Double = js.native
      inline def defaultCurrent_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultCurrent")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib/Pagination", "default.defaultProps.defaultPageSize")
      @js.native
      def defaultPageSize: Double = js.native
      inline def defaultPageSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultPageSize")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib/Pagination", "default.defaultProps.hideOnSinglePage")
      @js.native
      def hideOnSinglePage: Boolean = js.native
      inline def hideOnSinglePage_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hideOnSinglePage")(x.asInstanceOf[js.Any])
      
      inline def itemRender(page: Double, `type`: page | prev | next | `jump-prev` | `jump-next`, element: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("itemRender")(page.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
      
      @JSImport("rc-pagination/lib/Pagination", "default.defaultProps.locale")
      @js.native
      def locale: Itemsperpage = js.native
      inline def locale_=(x: Itemsperpage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib/Pagination", "default.defaultProps.onChange")
      @js.native
      def onChange: js.Function0[Unit] = js.native
      inline def onChange_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib/Pagination", "default.defaultProps.onShowSizeChange")
      @js.native
      def onShowSizeChange: js.Function0[Unit] = js.native
      inline def onShowSizeChange_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onShowSizeChange")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib/Pagination", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      inline def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib/Pagination", "default.defaultProps.selectComponentClass")
      @js.native
      def selectComponentClass: Any = js.native
      inline def selectComponentClass_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectComponentClass")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib/Pagination", "default.defaultProps.selectPrefixCls")
      @js.native
      def selectPrefixCls: String = js.native
      inline def selectPrefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectPrefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib/Pagination", "default.defaultProps.showLessItems")
      @js.native
      def showLessItems: Boolean = js.native
      inline def showLessItems_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showLessItems")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib/Pagination", "default.defaultProps.showPrevNextJumpers")
      @js.native
      def showPrevNextJumpers: Boolean = js.native
      inline def showPrevNextJumpers_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showPrevNextJumpers")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib/Pagination", "default.defaultProps.showQuickJumper")
      @js.native
      def showQuickJumper: Boolean = js.native
      inline def showQuickJumper_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showQuickJumper")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib/Pagination", "default.defaultProps.showTitle")
      @js.native
      def showTitle: Boolean = js.native
      inline def showTitle_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib/Pagination", "default.defaultProps.total")
      @js.native
      def total: Double = js.native
      
      @JSImport("rc-pagination/lib/Pagination", "default.defaultProps.totalBoundaryShowSizeChanger")
      @js.native
      def totalBoundaryShowSizeChanger: Double = js.native
      inline def totalBoundaryShowSizeChanger_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("totalBoundaryShowSizeChanger")(x.asInstanceOf[js.Any])
      
      inline def total_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("total")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    inline def getDerivedStateFromProps(props: PaginationProps, prevState: PaginationState): PartialPaginationState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[PartialPaginationState]
  }
  
  @js.native
  trait Pagination extends Component[PaginationProps, PaginationState, Any] {
    
    def changePageSize(size: Double): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPagination(_underscore: PaginationProps, prevState: PaginationState): Unit = js.native
    
    def getItemIcon(icon: ComponentType[PaginationProps], label: String): ReactNode = js.native
    def getItemIcon(icon: ReactNode, label: String): ReactNode = js.native
    
    def getJumpNextPage(): Double = js.native
    
    def getJumpPrevPage(): Double = js.native
    
    def getShowSizeChanger(): Boolean = js.native
    
    def getValidValue(e: Any): Double = js.native
    
    def handleBlur(e: FocusEvent[HTMLInputElement, Element]): Unit = js.native
    
    def handleChange(page: Double): Double = js.native
    
    def handleGoTO(e: Any): Unit = js.native
    
    def handleKeyDown(e: KeyboardEvent[HTMLInputElement]): Unit = js.native
    
    def handleKeyUp(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    def handleKeyUp(e: KeyboardEvent[HTMLInputElement]): Unit = js.native
    
    def hasNext(): Boolean = js.native
    
    def hasPrev(): Boolean = js.native
    
    def isValid(page: Double): Boolean = js.native
    
    def jumpNext(): Unit = js.native
    
    def jumpPrev(): Unit = js.native
    
    def next(): Unit = js.native
    
    var paginationNode: RefObject[HTMLUListElement] = js.native
    
    def prev(): Unit = js.native
    
    def renderNext(nextPage: Double): String | Double | Boolean | ReactFragment | ReactElement = js.native
    
    def renderPrev(prevPage: Double): String | Double | Boolean | ReactFragment | ReactElement = js.native
    
    def runIfEnter(event: Any, callback: Any, restParams: Any*): Unit = js.native
    
    def runIfEnterJumpNext(e: KeyboardEvent[HTMLLIElement]): Unit = js.native
    
    def runIfEnterJumpPrev(e: KeyboardEvent[HTMLLIElement]): Unit = js.native
    
    def runIfEnterNext(e: KeyboardEvent[HTMLLIElement]): Unit = js.native
    
    def runIfEnterPrev(e: KeyboardEvent[HTMLLIElement]): Unit = js.native
    
    def shouldDisplayQuickJumper(): Boolean | js.Object = js.native
  }
  
  trait PaginationData extends StObject {
    
    var className: String
    
    var current: Double
    
    var defaultCurrent: Double
    
    var defaultPageSize: Double
    
    var disabled: Boolean
    
    var hideOnSinglePage: Boolean
    
    var jumpNextIcon: ComponentType[js.Object] | ReactNode
    
    var jumpPrevIcon: ComponentType[js.Object] | ReactNode
    
    var locale: PaginationLocale
    
    var nextIcon: ComponentType[js.Object] | ReactNode
    
    var pageSize: Double
    
    var pageSizeOptions: js.Array[Double | String]
    
    var prefixCls: String
    
    var prevIcon: ComponentType[js.Object] | ReactNode
    
    var selectComponentClass: ComponentType[js.Object]
    
    var selectPrefixCls: String
    
    var showLessItems: Boolean
    
    var showPrevNextJumpers: Boolean
    
    var showQuickJumper: Boolean | js.Object
    
    var showSizeChanger: Boolean
    
    var showTitle: Boolean
    
    var simple: Boolean
    
    var style: CSSProperties
    
    var total: Double
    
    var totalBoundaryShowSizeChanger: js.UndefOr[Double] = js.undefined
  }
  object PaginationData {
    
    inline def apply(
      className: String,
      current: Double,
      defaultCurrent: Double,
      defaultPageSize: Double,
      disabled: Boolean,
      hideOnSinglePage: Boolean,
      locale: PaginationLocale,
      pageSize: Double,
      pageSizeOptions: js.Array[Double | String],
      prefixCls: String,
      selectComponentClass: ComponentType[js.Object],
      selectPrefixCls: String,
      showLessItems: Boolean,
      showPrevNextJumpers: Boolean,
      showQuickJumper: Boolean | js.Object,
      showSizeChanger: Boolean,
      showTitle: Boolean,
      simple: Boolean,
      style: CSSProperties,
      total: Double
    ): PaginationData = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], defaultCurrent = defaultCurrent.asInstanceOf[js.Any], defaultPageSize = defaultPageSize.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hideOnSinglePage = hideOnSinglePage.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], pageSizeOptions = pageSizeOptions.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectComponentClass = selectComponentClass.asInstanceOf[js.Any], selectPrefixCls = selectPrefixCls.asInstanceOf[js.Any], showLessItems = showLessItems.asInstanceOf[js.Any], showPrevNextJumpers = showPrevNextJumpers.asInstanceOf[js.Any], showQuickJumper = showQuickJumper.asInstanceOf[js.Any], showSizeChanger = showSizeChanger.asInstanceOf[js.Any], showTitle = showTitle.asInstanceOf[js.Any], simple = simple.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaginationData] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setDefaultCurrent(value: Double): Self = StObject.set(x, "defaultCurrent", value.asInstanceOf[js.Any])
      
      inline def setDefaultPageSize(value: Double): Self = StObject.set(x, "defaultPageSize", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setHideOnSinglePage(value: Boolean): Self = StObject.set(x, "hideOnSinglePage", value.asInstanceOf[js.Any])
      
      inline def setJumpNextIcon(value: ComponentType[js.Object] | ReactNode): Self = StObject.set(x, "jumpNextIcon", value.asInstanceOf[js.Any])
      
      inline def setJumpNextIconUndefined: Self = StObject.set(x, "jumpNextIcon", js.undefined)
      
      inline def setJumpPrevIcon(value: ComponentType[js.Object] | ReactNode): Self = StObject.set(x, "jumpPrevIcon", value.asInstanceOf[js.Any])
      
      inline def setJumpPrevIconUndefined: Self = StObject.set(x, "jumpPrevIcon", js.undefined)
      
      inline def setLocale(value: PaginationLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setNextIcon(value: ComponentType[js.Object] | ReactNode): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      inline def setNextIconUndefined: Self = StObject.set(x, "nextIcon", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeOptions(value: js.Array[Double | String]): Self = StObject.set(x, "pageSizeOptions", value.asInstanceOf[js.Any])
      
      inline def setPageSizeOptionsVarargs(value: (Double | String)*): Self = StObject.set(x, "pageSizeOptions", js.Array(value*))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrevIcon(value: ComponentType[js.Object] | ReactNode): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      inline def setPrevIconUndefined: Self = StObject.set(x, "prevIcon", js.undefined)
      
      inline def setSelectComponentClass(value: ComponentType[js.Object]): Self = StObject.set(x, "selectComponentClass", value.asInstanceOf[js.Any])
      
      inline def setSelectPrefixCls(value: String): Self = StObject.set(x, "selectPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setShowLessItems(value: Boolean): Self = StObject.set(x, "showLessItems", value.asInstanceOf[js.Any])
      
      inline def setShowPrevNextJumpers(value: Boolean): Self = StObject.set(x, "showPrevNextJumpers", value.asInstanceOf[js.Any])
      
      inline def setShowQuickJumper(value: Boolean | js.Object): Self = StObject.set(x, "showQuickJumper", value.asInstanceOf[js.Any])
      
      inline def setShowSizeChanger(value: Boolean): Self = StObject.set(x, "showSizeChanger", value.asInstanceOf[js.Any])
      
      inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
      
      inline def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalBoundaryShowSizeChanger(value: Double): Self = StObject.set(x, "totalBoundaryShowSizeChanger", value.asInstanceOf[js.Any])
      
      inline def setTotalBoundaryShowSizeChangerUndefined: Self = StObject.set(x, "totalBoundaryShowSizeChanger", js.undefined)
    }
  }
  
  trait PaginationLocale extends StObject {
    
    var items_per_page: js.UndefOr[String] = js.undefined
    
    var jump_to: js.UndefOr[String] = js.undefined
    
    var jump_to_confirm: js.UndefOr[String] = js.undefined
    
    var next_3: js.UndefOr[String] = js.undefined
    
    var next_5: js.UndefOr[String] = js.undefined
    
    var next_page: js.UndefOr[String] = js.undefined
    
    var page: js.UndefOr[String] = js.undefined
    
    var prev_3: js.UndefOr[String] = js.undefined
    
    var prev_5: js.UndefOr[String] = js.undefined
    
    var prev_page: js.UndefOr[String] = js.undefined
  }
  object PaginationLocale {
    
    inline def apply(): PaginationLocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationLocale]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaginationLocale] (val x: Self) extends AnyVal {
      
      inline def setItems_per_page(value: String): Self = StObject.set(x, "items_per_page", value.asInstanceOf[js.Any])
      
      inline def setItems_per_pageUndefined: Self = StObject.set(x, "items_per_page", js.undefined)
      
      inline def setJump_to(value: String): Self = StObject.set(x, "jump_to", value.asInstanceOf[js.Any])
      
      inline def setJump_toUndefined: Self = StObject.set(x, "jump_to", js.undefined)
      
      inline def setJump_to_confirm(value: String): Self = StObject.set(x, "jump_to_confirm", value.asInstanceOf[js.Any])
      
      inline def setJump_to_confirmUndefined: Self = StObject.set(x, "jump_to_confirm", js.undefined)
      
      inline def setNext_3(value: String): Self = StObject.set(x, "next_3", value.asInstanceOf[js.Any])
      
      inline def setNext_3Undefined: Self = StObject.set(x, "next_3", js.undefined)
      
      inline def setNext_5(value: String): Self = StObject.set(x, "next_5", value.asInstanceOf[js.Any])
      
      inline def setNext_5Undefined: Self = StObject.set(x, "next_5", js.undefined)
      
      inline def setNext_page(value: String): Self = StObject.set(x, "next_page", value.asInstanceOf[js.Any])
      
      inline def setNext_pageUndefined: Self = StObject.set(x, "next_page", js.undefined)
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setPrev_3(value: String): Self = StObject.set(x, "prev_3", value.asInstanceOf[js.Any])
      
      inline def setPrev_3Undefined: Self = StObject.set(x, "prev_3", js.undefined)
      
      inline def setPrev_5(value: String): Self = StObject.set(x, "prev_5", value.asInstanceOf[js.Any])
      
      inline def setPrev_5Undefined: Self = StObject.set(x, "prev_5", js.undefined)
      
      inline def setPrev_page(value: String): Self = StObject.set(x, "prev_page", value.asInstanceOf[js.Any])
      
      inline def setPrev_pageUndefined: Self = StObject.set(x, "prev_page", js.undefined)
    }
  }
  
  /* Inlined parent std.Partial<rc-pagination.rc-pagination/lib/Pagination.PaginationData> */
  trait PaginationProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var current: js.UndefOr[Double] = js.undefined
    
    var defaultCurrent: js.UndefOr[Double] = js.undefined
    
    var defaultPageSize: js.UndefOr[Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var hideOnSinglePage: js.UndefOr[Boolean] = js.undefined
    
    var itemRender: js.UndefOr[
        js.Function3[
          /* page */ Double, 
          /* type */ page | prev | next | `jump-prev` | `jump-next`, 
          /* element */ ReactNode, 
          ReactNode
        ]
      ] = js.undefined
    
    var jumpNextIcon: js.UndefOr[ComponentType[js.Object] | ReactNode] = js.undefined
    
    var jumpPrevIcon: js.UndefOr[ComponentType[js.Object] | ReactNode] = js.undefined
    
    var locale: js.UndefOr[PaginationLocale] = js.undefined
    
    var nextIcon: js.UndefOr[ComponentType[js.Object] | ReactNode] = js.undefined
    
    var onChange: js.UndefOr[js.Function2[/* page */ Double, /* pageSize */ Double, Unit]] = js.undefined
    
    var onShowSizeChange: js.UndefOr[js.Function2[/* current */ Double, /* size */ Double, Unit]] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageSizeOptions: js.UndefOr[js.Array[Double | String]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var prevIcon: js.UndefOr[ComponentType[js.Object] | ReactNode] = js.undefined
    
    var selectComponentClass: js.UndefOr[ComponentType[js.Object]] = js.undefined
    
    var selectPrefixCls: js.UndefOr[String] = js.undefined
    
    var showLessItems: js.UndefOr[Boolean] = js.undefined
    
    var showPrevNextJumpers: js.UndefOr[Boolean] = js.undefined
    
    var showQuickJumper: js.UndefOr[Boolean | js.Object] = js.undefined
    
    var showSizeChanger: js.UndefOr[Boolean] = js.undefined
    
    var showTitle: js.UndefOr[Boolean] = js.undefined
    
    var showTotal: js.UndefOr[
        js.Function2[/* total */ Double, /* range */ js.Tuple2[Double, Double], ReactNode]
      ] = js.undefined
    
    var simple: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var total: js.UndefOr[Double] = js.undefined
    
    var totalBoundaryShowSizeChanger: js.UndefOr[Double] = js.undefined
  }
  object PaginationProps {
    
    inline def apply(): PaginationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaginationProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setDefaultCurrent(value: Double): Self = StObject.set(x, "defaultCurrent", value.asInstanceOf[js.Any])
      
      inline def setDefaultCurrentUndefined: Self = StObject.set(x, "defaultCurrent", js.undefined)
      
      inline def setDefaultPageSize(value: Double): Self = StObject.set(x, "defaultPageSize", value.asInstanceOf[js.Any])
      
      inline def setDefaultPageSizeUndefined: Self = StObject.set(x, "defaultPageSize", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHideOnSinglePage(value: Boolean): Self = StObject.set(x, "hideOnSinglePage", value.asInstanceOf[js.Any])
      
      inline def setHideOnSinglePageUndefined: Self = StObject.set(x, "hideOnSinglePage", js.undefined)
      
      inline def setItemRender(
        value: (/* page */ Double, /* type */ page | prev | next | `jump-prev` | `jump-next`, /* element */ ReactNode) => ReactNode
      ): Self = StObject.set(x, "itemRender", js.Any.fromFunction3(value))
      
      inline def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
      
      inline def setJumpNextIcon(value: ComponentType[js.Object] | ReactNode): Self = StObject.set(x, "jumpNextIcon", value.asInstanceOf[js.Any])
      
      inline def setJumpNextIconUndefined: Self = StObject.set(x, "jumpNextIcon", js.undefined)
      
      inline def setJumpPrevIcon(value: ComponentType[js.Object] | ReactNode): Self = StObject.set(x, "jumpPrevIcon", value.asInstanceOf[js.Any])
      
      inline def setJumpPrevIconUndefined: Self = StObject.set(x, "jumpPrevIcon", js.undefined)
      
      inline def setLocale(value: PaginationLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setNextIcon(value: ComponentType[js.Object] | ReactNode): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      inline def setNextIconUndefined: Self = StObject.set(x, "nextIcon", js.undefined)
      
      inline def setOnChange(value: (/* page */ Double, /* pageSize */ Double) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnShowSizeChange(value: (/* current */ Double, /* size */ Double) => Unit): Self = StObject.set(x, "onShowSizeChange", js.Any.fromFunction2(value))
      
      inline def setOnShowSizeChangeUndefined: Self = StObject.set(x, "onShowSizeChange", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeOptions(value: js.Array[Double | String]): Self = StObject.set(x, "pageSizeOptions", value.asInstanceOf[js.Any])
      
      inline def setPageSizeOptionsUndefined: Self = StObject.set(x, "pageSizeOptions", js.undefined)
      
      inline def setPageSizeOptionsVarargs(value: (Double | String)*): Self = StObject.set(x, "pageSizeOptions", js.Array(value*))
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setPrevIcon(value: ComponentType[js.Object] | ReactNode): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      inline def setPrevIconUndefined: Self = StObject.set(x, "prevIcon", js.undefined)
      
      inline def setSelectComponentClass(value: ComponentType[js.Object]): Self = StObject.set(x, "selectComponentClass", value.asInstanceOf[js.Any])
      
      inline def setSelectComponentClassUndefined: Self = StObject.set(x, "selectComponentClass", js.undefined)
      
      inline def setSelectPrefixCls(value: String): Self = StObject.set(x, "selectPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setSelectPrefixClsUndefined: Self = StObject.set(x, "selectPrefixCls", js.undefined)
      
      inline def setShowLessItems(value: Boolean): Self = StObject.set(x, "showLessItems", value.asInstanceOf[js.Any])
      
      inline def setShowLessItemsUndefined: Self = StObject.set(x, "showLessItems", js.undefined)
      
      inline def setShowPrevNextJumpers(value: Boolean): Self = StObject.set(x, "showPrevNextJumpers", value.asInstanceOf[js.Any])
      
      inline def setShowPrevNextJumpersUndefined: Self = StObject.set(x, "showPrevNextJumpers", js.undefined)
      
      inline def setShowQuickJumper(value: Boolean | js.Object): Self = StObject.set(x, "showQuickJumper", value.asInstanceOf[js.Any])
      
      inline def setShowQuickJumperUndefined: Self = StObject.set(x, "showQuickJumper", js.undefined)
      
      inline def setShowSizeChanger(value: Boolean): Self = StObject.set(x, "showSizeChanger", value.asInstanceOf[js.Any])
      
      inline def setShowSizeChangerUndefined: Self = StObject.set(x, "showSizeChanger", js.undefined)
      
      inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
      
      inline def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
      
      inline def setShowTotal(value: (/* total */ Double, /* range */ js.Tuple2[Double, Double]) => ReactNode): Self = StObject.set(x, "showTotal", js.Any.fromFunction2(value))
      
      inline def setShowTotalUndefined: Self = StObject.set(x, "showTotal", js.undefined)
      
      inline def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
      
      inline def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalBoundaryShowSizeChanger(value: Double): Self = StObject.set(x, "totalBoundaryShowSizeChanger", value.asInstanceOf[js.Any])
      
      inline def setTotalBoundaryShowSizeChangerUndefined: Self = StObject.set(x, "totalBoundaryShowSizeChanger", js.undefined)
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
  
  trait PaginationState extends StObject {
    
    var current: Double
    
    var currentInputValue: Double
    
    var pageSize: Double
  }
  object PaginationState {
    
    inline def apply(current: Double, currentInputValue: Double, pageSize: Double): PaginationState = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], currentInputValue = currentInputValue.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaginationState] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentInputValue(value: Double): Self = StObject.set(x, "currentInputValue", value.asInstanceOf[js.Any])
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    }
  }
}
