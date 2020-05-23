package typings.rcEasyui.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

@JSImport("rc-easyui", "Pagination")
@js.native
object Pagination extends js.Object {
  @js.native
  object contextTypes extends js.Object {
    @js.native
    object locale extends js.Object {
      // Circular reference from rc_easyui.Pagination.contextTypes.locale
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object t extends js.Object {
      // Circular reference from rc_easyui.Pagination.contextTypes.t
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
  @js.native
  object defaultProps extends js.Object {
    val defaultAfterPageText: String = js.native
    val defaultBeforePageText: String = js.native
    val defaultDisplayMsg: String = js.native
    val layout: js.Array[String] = js.native
    val links: Double = js.native
    val loading: Boolean = js.native
    val pageList: js.Array[Double] = js.native
    val pageNumber: Double = js.native
    val pageSize: Double = js.native
    val showPageInfo: Boolean = js.native
    val showPageList: Boolean = js.native
    val showPageRefresh: Boolean = js.native
    val total: Double = js.native
    def onPageChange(): Unit = js.native
  }
  
  @js.native
  object propTypes extends js.Object {
    @js.native
    object afterPageText extends js.Object {
      // Circular reference from rc_easyui.Pagination.propTypes.afterPageText
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object beforePageText extends js.Object {
      // Circular reference from rc_easyui.Pagination.propTypes.beforePageText
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object displayMsg extends js.Object {
      // Circular reference from rc_easyui.Pagination.propTypes.displayMsg
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object layout extends js.Object {
      // Circular reference from rc_easyui.Pagination.propTypes.layout
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object links extends js.Object {
      // Circular reference from rc_easyui.Pagination.propTypes.links
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object loading extends js.Object {
      // Circular reference from rc_easyui.Pagination.propTypes.loading
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object onPageChange extends js.Object {
      // Circular reference from rc_easyui.Pagination.propTypes.onPageChange
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object pageList extends js.Object {
      // Circular reference from rc_easyui.Pagination.propTypes.pageList
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object pageNumber extends js.Object {
      // Circular reference from rc_easyui.Pagination.propTypes.pageNumber
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object pageSize extends js.Object {
      // Circular reference from rc_easyui.Pagination.propTypes.pageSize
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object renderExt extends js.Object {
      // Circular reference from rc_easyui.Pagination.propTypes.renderExt
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object showPageInfo extends js.Object {
      // Circular reference from rc_easyui.Pagination.propTypes.showPageInfo
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object showPageList extends js.Object {
      // Circular reference from rc_easyui.Pagination.propTypes.showPageList
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object showPageRefresh extends js.Object {
      // Circular reference from rc_easyui.Pagination.propTypes.showPageRefresh
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object total extends js.Object {
      // Circular reference from rc_easyui.Pagination.propTypes.total
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
}

