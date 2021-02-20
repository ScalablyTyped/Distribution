package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "Pagination")
@js.native
class Pagination protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  
  def adjustPage(): Unit = js.native
  
  def afterPageText(): js.Any = js.native
  
  def beforePageText(): js.Any = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MPagination(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MPagination(e: js.Any): Unit = js.native
  
  def handleButtonClick(e: js.Any): Unit = js.native
  
  def handleLinkChange(e: js.Any): Unit = js.native
  
  def handleListChange(e: js.Any): Unit = js.native
  
  def handlePageInput(e: js.Any): Unit = js.native
  
  def isButton(e: js.Any): js.Any = js.native
  
  def pageCount(): js.Any = js.native
  
  def pageInfo(): js.Any = js.native
  
  def refreshPage(): Unit = js.native
  
  def renderLayout(e: js.Any, t: js.Any): js.Any = js.native
  
  def selectPage(e: js.Any): Unit = js.native
}
object Pagination {
  
  object contextTypes {
    
    object locale {
      
      @JSImport("rc-easyui", "Pagination.contextTypes.locale")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Pagination.contextTypes.locale
      @JSImport("rc-easyui", "Pagination.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      @JSImport("rc-easyui", "Pagination.contextTypes.t")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Pagination.contextTypes.t
      @JSImport("rc-easyui", "Pagination.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "Pagination.defaultProps.defaultAfterPageText")
    @js.native
    val defaultAfterPageText: String = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.defaultBeforePageText")
    @js.native
    val defaultBeforePageText: String = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.defaultDisplayMsg")
    @js.native
    val defaultDisplayMsg: String = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.layout")
    @js.native
    val layout: js.Array[String] = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.links")
    @js.native
    val links: Double = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.loading")
    @js.native
    val loading: Boolean = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.onPageChange")
    @js.native
    def onPageChange(): Unit = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.pageList")
    @js.native
    val pageList: js.Array[Double] = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.pageNumber")
    @js.native
    val pageNumber: Double = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.pageSize")
    @js.native
    val pageSize: Double = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.showPageInfo")
    @js.native
    val showPageInfo: Boolean = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.showPageList")
    @js.native
    val showPageList: Boolean = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.showPageRefresh")
    @js.native
    val showPageRefresh: Boolean = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.total")
    @js.native
    val total: Double = js.native
  }
  
  object propTypes {
    
    object afterPageText {
      
      @JSImport("rc-easyui", "Pagination.propTypes.afterPageText")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.afterPageText
      @JSImport("rc-easyui", "Pagination.propTypes.afterPageText.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object beforePageText {
      
      @JSImport("rc-easyui", "Pagination.propTypes.beforePageText")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.beforePageText
      @JSImport("rc-easyui", "Pagination.propTypes.beforePageText.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object displayMsg {
      
      @JSImport("rc-easyui", "Pagination.propTypes.displayMsg")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.displayMsg
      @JSImport("rc-easyui", "Pagination.propTypes.displayMsg.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object layout {
      
      @JSImport("rc-easyui", "Pagination.propTypes.layout")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.layout
      @JSImport("rc-easyui", "Pagination.propTypes.layout.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object links {
      
      @JSImport("rc-easyui", "Pagination.propTypes.links")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.links
      @JSImport("rc-easyui", "Pagination.propTypes.links.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object loading {
      
      @JSImport("rc-easyui", "Pagination.propTypes.loading")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.loading
      @JSImport("rc-easyui", "Pagination.propTypes.loading.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object onPageChange {
      
      @JSImport("rc-easyui", "Pagination.propTypes.onPageChange")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.onPageChange
      @JSImport("rc-easyui", "Pagination.propTypes.onPageChange.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pageList {
      
      @JSImport("rc-easyui", "Pagination.propTypes.pageList")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.pageList
      @JSImport("rc-easyui", "Pagination.propTypes.pageList.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pageNumber {
      
      @JSImport("rc-easyui", "Pagination.propTypes.pageNumber")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.pageNumber
      @JSImport("rc-easyui", "Pagination.propTypes.pageNumber.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pageSize {
      
      @JSImport("rc-easyui", "Pagination.propTypes.pageSize")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.pageSize
      @JSImport("rc-easyui", "Pagination.propTypes.pageSize.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object renderExt {
      
      @JSImport("rc-easyui", "Pagination.propTypes.renderExt")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.renderExt
      @JSImport("rc-easyui", "Pagination.propTypes.renderExt.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object showPageInfo {
      
      @JSImport("rc-easyui", "Pagination.propTypes.showPageInfo")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.showPageInfo
      @JSImport("rc-easyui", "Pagination.propTypes.showPageInfo.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object showPageList {
      
      @JSImport("rc-easyui", "Pagination.propTypes.showPageList")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.showPageList
      @JSImport("rc-easyui", "Pagination.propTypes.showPageList.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object showPageRefresh {
      
      @JSImport("rc-easyui", "Pagination.propTypes.showPageRefresh")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.showPageRefresh
      @JSImport("rc-easyui", "Pagination.propTypes.showPageRefresh.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object total {
      
      @JSImport("rc-easyui", "Pagination.propTypes.total")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.total
      @JSImport("rc-easyui", "Pagination.propTypes.total.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
