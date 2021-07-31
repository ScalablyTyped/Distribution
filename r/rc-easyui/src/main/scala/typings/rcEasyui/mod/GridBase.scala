package typings.rcEasyui.mod

import typings.rcEasyui.anon.IsMatch
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "GridBase")
@js.native
class GridBase protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  
  def addFilterRule(e: js.Any): Unit = js.native
  
  def addSort(e: js.Any): js.Any = js.native
  
  def allColumns(): js.Any = js.native
  
  def beginEdit(e: js.Any, args: js.Any*): Unit = js.native
  
  def cancelEdit(): Unit = js.native
  
  def changeColumns(): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MGridBase(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MGridBase(e: js.Any): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MGridBase(): Unit = js.native
  
  def endEdit(): js.Any = js.native
  
  def findColumn(e: js.Any): js.Any = js.native
  
  def footerRows(): js.Any = js.native
  
  def getColumnCount(e: js.Any): js.Any = js.native
  
  def getColumnIndex(e: js.Any): js.Any = js.native
  
  def getColumnLayout(e: js.Any): js.Any = js.native
  
  def handleBodyScroll(e: js.Any): Unit = js.native
  
  def initColumnSort(): Unit = js.native
  
  def initColumns(): js.Any = js.native
  
  def initFilterRules(): Unit = js.native
  
  def initHeaderHeight(): Unit = js.native
  
  def isEditing(e: js.Any, args: js.Any*): js.Any = js.native
  
  def leftFrozenWidth(): js.Any = js.native
  
  def moveColumn(e: js.Any, t: js.Any, n: js.Any): js.Any = js.native
  
  def onColumnAdd(e: js.Any): Unit = js.native
  
  def onColumnGroupAdd(e: js.Any): Unit = js.native
  
  def onColumnGroupRemove(e: js.Any): Unit = js.native
  
  def onColumnRemove(e: js.Any): Unit = js.native
  
  def renderColumns(): js.Any = js.native
  
  def renderLoading(): js.Any = js.native
  
  def renderPagination(e: js.Any): js.Any = js.native
  
  def renderSplitHelper(): js.Any = js.native
  
  def renderToolbar(): js.Any = js.native
  
  def renderView(e: js.Any): js.Any = js.native
  
  def resizeColumn(e: js.Any, t: js.Any): Unit = js.native
  
  def rightFrozenWidth(): js.Any = js.native
  
  def scrollTo(e: js.Any): Unit = js.native
  
  def scrollTop(e: js.Any): js.Any = js.native
  
  def viewComponent(): js.Any = js.native
}
object GridBase {
  
  object contextTypes {
    
    object locale {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.contextTypes.locale
      @JSImport("rc-easyui", "GridBase.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.contextTypes.t
      @JSImport("rc-easyui", "GridBase.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "GridBase.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.border")
    @js.native
    val border: Boolean = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.clickToEdit")
    @js.native
    val clickToEdit: Boolean = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.columnMoving")
    @js.native
    val columnMoving: Boolean = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.columnResizing")
    @js.native
    val columnResizing: Boolean = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.data")
    @js.native
    val data: js.Array[js.Any] = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.dblclickToEdit")
    @js.native
    val dblclickToEdit: Boolean = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.defaultLoadMsg")
    @js.native
    val defaultLoadMsg: String = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.filterBtnPosition")
    @js.native
    val filterBtnPosition: String = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.filterDelay")
    @js.native
    val filterDelay: Double = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.filterMatchingType")
    @js.native
    val filterMatchingType: String = js.native
    
    object filterOperators {
      
      @JSImport("rc-easyui", "GridBase.defaultProps.filterOperators")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-easyui", "GridBase.defaultProps.filterOperators.beginwith")
      @js.native
      def beginwith: IsMatch = js.native
      @scala.inline
      def beginwith_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beginwith")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "GridBase.defaultProps.filterOperators.contains")
      @js.native
      def contains: IsMatch = js.native
      @scala.inline
      def contains_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contains")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "GridBase.defaultProps.filterOperators.endwith")
      @js.native
      def endwith: IsMatch = js.native
      @scala.inline
      def endwith_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endwith")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "GridBase.defaultProps.filterOperators.equal")
      @js.native
      def equal: IsMatch = js.native
      @scala.inline
      def equal_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("equal")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "GridBase.defaultProps.filterOperators.greater")
      @js.native
      def greater: IsMatch = js.native
      @scala.inline
      def greater_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("greater")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "GridBase.defaultProps.filterOperators.greaterorequal")
      @js.native
      def greaterorequal: IsMatch = js.native
      @scala.inline
      def greaterorequal_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("greaterorequal")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "GridBase.defaultProps.filterOperators.less")
      @js.native
      def less: IsMatch = js.native
      @scala.inline
      def less_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("less")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "GridBase.defaultProps.filterOperators.lessorequal")
      @js.native
      def lessorequal: IsMatch = js.native
      @scala.inline
      def lessorequal_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lessorequal")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "GridBase.defaultProps.filterOperators.nofilter")
      @js.native
      def nofilter: IsMatch = js.native
      @scala.inline
      def nofilter_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nofilter")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "GridBase.defaultProps.filterOperators.notequal")
      @js.native
      def notequal: IsMatch = js.native
      @scala.inline
      def notequal_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notequal")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("rc-easyui", "GridBase.defaultProps.filterPosition")
    @js.native
    val filterPosition: String = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.filterRules")
    @js.native
    val filterRules: js.Array[js.Any] = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.filterable")
    @js.native
    val filterable: Boolean = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.footerData")
    @js.native
    val footerData: js.Array[js.Any] = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.frozenAlign")
    @js.native
    val frozenAlign: String = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.frozenWidth")
    @js.native
    val frozenWidth: String = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.lazy")
    @js.native
    val `lazy`: Boolean = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.loading")
    @js.native
    val loading: Boolean = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.multiSort")
    @js.native
    val multiSort: Boolean = js.native
    
    @scala.inline
    def onCellClick(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCellClick")().asInstanceOf[Unit]
    
    @scala.inline
    def onCellContextMenu(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCellContextMenu")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onCellDblClick(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCellDblClick")().asInstanceOf[Unit]
    
    @scala.inline
    def onCellSelect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCellSelect")().asInstanceOf[Unit]
    
    @scala.inline
    def onCellUnselect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCellUnselect")().asInstanceOf[Unit]
    
    @scala.inline
    def onColumnMove(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onColumnMove")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onColumnResize(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onColumnResize")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onEditBegin(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onEditBegin")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onEditCancel(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onEditCancel")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onEditEnd(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onEditEnd")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onEditValidate(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onEditValidate")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onFilterChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFilterChange")().asInstanceOf[Unit]
    
    @scala.inline
    def onPageChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPageChange")().asInstanceOf[Unit]
    
    @scala.inline
    def onRowClick(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowClick")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onRowContextMenu(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowContextMenu")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onRowDblClick(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowDblClick")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onRowSelect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowSelect")().asInstanceOf[Unit]
    
    @scala.inline
    def onRowUnselect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowUnselect")().asInstanceOf[Unit]
    
    @scala.inline
    def onSelectionChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSelectionChange")().asInstanceOf[Unit]
    
    @scala.inline
    def onSortChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSortChange")().asInstanceOf[Unit]
    
    @JSImport("rc-easyui", "GridBase.defaultProps.pageNumber")
    @js.native
    val pageNumber: Double = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.pagePosition")
    @js.native
    val pagePosition: String = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.pageSize")
    @js.native
    val pageSize: Double = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.pagination")
    @js.native
    val pagination: Boolean = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.rowHeight")
    @js.native
    val rowHeight: Double = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.showFooter")
    @js.native
    val showFooter: Boolean = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.showHeader")
    @js.native
    val showHeader: Boolean = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.sorts")
    @js.native
    val sorts: js.Array[js.Any] = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.striped")
    @js.native
    val striped: Boolean = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.total")
    @js.native
    val total: Double = js.native
    
    @JSImport("rc-easyui", "GridBase.defaultProps.virtualScroll")
    @js.native
    val virtualScroll: Boolean = js.native
  }
  
  object propTypes {
    
    object border {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.border")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.border
      @JSImport("rc-easyui", "GridBase.propTypes.border.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object clickToEdit {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.clickToEdit")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.clickToEdit
      @JSImport("rc-easyui", "GridBase.propTypes.clickToEdit.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object columnMoving {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.columnMoving")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.columnMoving
      @JSImport("rc-easyui", "GridBase.propTypes.columnMoving.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object data {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.data")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.data
      @JSImport("rc-easyui", "GridBase.propTypes.data.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object dblclickToEdit {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.dblclickToEdit")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.dblclickToEdit
      @JSImport("rc-easyui", "GridBase.propTypes.dblclickToEdit.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object editMode {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.editMode")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.editMode
      @JSImport("rc-easyui", "GridBase.propTypes.editMode.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterBtnPosition {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.filterBtnPosition")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.filterBtnPosition
      @JSImport("rc-easyui", "GridBase.propTypes.filterBtnPosition.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterDelay {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.filterDelay")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.filterDelay
      @JSImport("rc-easyui", "GridBase.propTypes.filterDelay.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterMatchingType {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.filterMatchingType")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.filterMatchingType
      @JSImport("rc-easyui", "GridBase.propTypes.filterMatchingType.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterOperators {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.filterOperators")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.filterOperators
      @JSImport("rc-easyui", "GridBase.propTypes.filterOperators.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterPosition {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.filterPosition")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.filterPosition
      @JSImport("rc-easyui", "GridBase.propTypes.filterPosition.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterRules {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.filterRules")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.filterRules
      @JSImport("rc-easyui", "GridBase.propTypes.filterRules.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterable {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.filterable")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.filterable
      @JSImport("rc-easyui", "GridBase.propTypes.filterable.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object footerData {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.footerData")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.footerData
      @JSImport("rc-easyui", "GridBase.propTypes.footerData.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object frozenAlign {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.frozenAlign")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.frozenAlign
      @JSImport("rc-easyui", "GridBase.propTypes.frozenAlign.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object frozenWidth {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.frozenWidth")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.frozenWidth
      @JSImport("rc-easyui", "GridBase.propTypes.frozenWidth.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object idField {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.idField")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.idField
      @JSImport("rc-easyui", "GridBase.propTypes.idField.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object `lazy` {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.lazy")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.lazy
      @JSImport("rc-easyui", "GridBase.propTypes.lazy.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object loadMsg {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.loadMsg")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.loadMsg
      @JSImport("rc-easyui", "GridBase.propTypes.loadMsg.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object loading {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.loading")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.loading
      @JSImport("rc-easyui", "GridBase.propTypes.loading.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object multiSort {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.multiSort")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.multiSort
      @JSImport("rc-easyui", "GridBase.propTypes.multiSort.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pageNumber {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.pageNumber")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.pageNumber
      @JSImport("rc-easyui", "GridBase.propTypes.pageNumber.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pageOptions {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.pageOptions")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.pageOptions
      @JSImport("rc-easyui", "GridBase.propTypes.pageOptions.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pagePosition {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.pagePosition")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.pagePosition
      @JSImport("rc-easyui", "GridBase.propTypes.pagePosition.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pageSize {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.pageSize")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.pageSize
      @JSImport("rc-easyui", "GridBase.propTypes.pageSize.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pagination {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.pagination")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.pagination
      @JSImport("rc-easyui", "GridBase.propTypes.pagination.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object rowCss {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.rowCss")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.rowCss
      @JSImport("rc-easyui", "GridBase.propTypes.rowCss.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object rowHeight {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.rowHeight")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.rowHeight
      @JSImport("rc-easyui", "GridBase.propTypes.rowHeight.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object selection {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.selection")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.selection
      @JSImport("rc-easyui", "GridBase.propTypes.selection.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object selectionMode {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.selectionMode")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.selectionMode
      @JSImport("rc-easyui", "GridBase.propTypes.selectionMode.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object showFooter {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.showFooter")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.showFooter
      @JSImport("rc-easyui", "GridBase.propTypes.showFooter.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object showHeader {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.showHeader")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.showHeader
      @JSImport("rc-easyui", "GridBase.propTypes.showHeader.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object sorts {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.sorts")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.sorts
      @JSImport("rc-easyui", "GridBase.propTypes.sorts.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object striped {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.striped")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.striped
      @JSImport("rc-easyui", "GridBase.propTypes.striped.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object total {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.total")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.total
      @JSImport("rc-easyui", "GridBase.propTypes.total.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object virtualScroll {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridBase.propTypes.virtualScroll")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridBase.propTypes.virtualScroll
      @JSImport("rc-easyui", "GridBase.propTypes.virtualScroll.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
