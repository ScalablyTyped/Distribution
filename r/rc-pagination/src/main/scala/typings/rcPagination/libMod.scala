package typings.rcPagination

import typings.rcPagination.anon.Itemsperpage
import typings.rcPagination.anon.PartialPaginationState
import typings.rcPagination.libPaginationMod.PaginationProps
import typings.rcPagination.libPaginationMod.PaginationState
import typings.rcPagination.rcPaginationStrings.`jump-next`
import typings.rcPagination.rcPaginationStrings.`jump-prev`
import typings.rcPagination.rcPaginationStrings.next
import typings.rcPagination.rcPaginationStrings.page
import typings.rcPagination.rcPaginationStrings.prev
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("rc-pagination/lib", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.rcPagination.libPaginationMod.default {
    def this(props: PaginationProps) = this()
  }
  object default {
    
    @JSImport("rc-pagination/lib", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-pagination/lib", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-pagination/lib", "default.defaultProps.className")
      @js.native
      def className: String = js.native
      inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib", "default.defaultProps.defaultCurrent")
      @js.native
      def defaultCurrent: Double = js.native
      inline def defaultCurrent_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultCurrent")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib", "default.defaultProps.defaultPageSize")
      @js.native
      def defaultPageSize: Double = js.native
      inline def defaultPageSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultPageSize")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib", "default.defaultProps.hideOnSinglePage")
      @js.native
      def hideOnSinglePage: Boolean = js.native
      inline def hideOnSinglePage_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hideOnSinglePage")(x.asInstanceOf[js.Any])
      
      inline def itemRender(page: Double, `type`: page | prev | next | `jump-prev` | `jump-next`, element: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("itemRender")(page.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
      
      @JSImport("rc-pagination/lib", "default.defaultProps.locale")
      @js.native
      def locale: Itemsperpage = js.native
      inline def locale_=(x: Itemsperpage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib", "default.defaultProps.onChange")
      @js.native
      def onChange: js.Function0[Unit] = js.native
      inline def onChange_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib", "default.defaultProps.onShowSizeChange")
      @js.native
      def onShowSizeChange: js.Function0[Unit] = js.native
      inline def onShowSizeChange_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onShowSizeChange")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      inline def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib", "default.defaultProps.selectComponentClass")
      @js.native
      def selectComponentClass: Any = js.native
      inline def selectComponentClass_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectComponentClass")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib", "default.defaultProps.selectPrefixCls")
      @js.native
      def selectPrefixCls: String = js.native
      inline def selectPrefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectPrefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib", "default.defaultProps.showLessItems")
      @js.native
      def showLessItems: Boolean = js.native
      inline def showLessItems_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showLessItems")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib", "default.defaultProps.showPrevNextJumpers")
      @js.native
      def showPrevNextJumpers: Boolean = js.native
      inline def showPrevNextJumpers_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showPrevNextJumpers")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib", "default.defaultProps.showQuickJumper")
      @js.native
      def showQuickJumper: Boolean = js.native
      inline def showQuickJumper_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showQuickJumper")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib", "default.defaultProps.showTitle")
      @js.native
      def showTitle: Boolean = js.native
      inline def showTitle_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-pagination/lib", "default.defaultProps.total")
      @js.native
      def total: Double = js.native
      
      @JSImport("rc-pagination/lib", "default.defaultProps.totalBoundaryShowSizeChanger")
      @js.native
      def totalBoundaryShowSizeChanger: Double = js.native
      inline def totalBoundaryShowSizeChanger_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("totalBoundaryShowSizeChanger")(x.asInstanceOf[js.Any])
      
      inline def total_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("total")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    inline def getDerivedStateFromProps(props: PaginationProps, prevState: PaginationState): PartialPaginationState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[PartialPaginationState]
  }
}
