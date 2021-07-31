package typings.rcEasyui.mod

import typings.rcEasyui.anon.IsMatch
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "DataGrid")
@js.native
class DataGrid protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  
  def collapseGroup(e: js.Any): Unit = js.native
  
  def collapseRow(e: js.Any): js.Any = js.native
  
  def expandGroup(e: js.Any): Unit = js.native
  
  def expandRow(e: js.Any): Unit = js.native
  
  def frozenRows(): js.Any = js.native
  
  def getAbsoluteIndex(e: js.Any): js.Any = js.native
  
  def getExpandedIndex(e: js.Any): js.Any = js.native
  
  def getGroup(e: js.Any, t: js.Any): js.Any = js.native
  
  def handleBodyScroll(e: js.Any): Unit = js.native
  
  def isGroupRow(e: js.Any): js.Any = js.native
  
  def isGrouped(e: js.Any): js.Any = js.native
  
  def isRowExpanded(e: js.Any): js.Any = js.native
  
  def makeGroup(e: js.Any): js.Any = js.native
  
  def makeGroupedRows(): js.Any = js.native
  
  def setGroupData(): Unit = js.native
  
  def sortData(): js.Any = js.native
  
  def toggleGroup(e: js.Any): Unit = js.native
  
  def toggleRow(e: js.Any): Unit = js.native
  
  def updateFrozenView(e: js.Any, t: js.Any): Unit = js.native
  
  def viewComponent(): js.Any = js.native
}
object DataGrid {
  
  object contextTypes {
    
    object locale {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.contextTypes.locale
      @JSImport("rc-easyui", "DataGrid.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.contextTypes.t
      @JSImport("rc-easyui", "DataGrid.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "DataGrid.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.border")
    @js.native
    val border: Boolean = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.clickToEdit")
    @js.native
    val clickToEdit: Boolean = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.columnMoving")
    @js.native
    val columnMoving: Boolean = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.columnResizing")
    @js.native
    val columnResizing: Boolean = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.data")
    @js.native
    val data: js.Array[js.Any] = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.dblclickToEdit")
    @js.native
    val dblclickToEdit: Boolean = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.defaultLoadMsg")
    @js.native
    val defaultLoadMsg: String = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.expanderWidth")
    @js.native
    val expanderWidth: Double = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.filterBtnPosition")
    @js.native
    val filterBtnPosition: String = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.filterDelay")
    @js.native
    val filterDelay: Double = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.filterMatchingType")
    @js.native
    val filterMatchingType: String = js.native
    
    object filterOperators {
      
      @JSImport("rc-easyui", "DataGrid.defaultProps.filterOperators")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-easyui", "DataGrid.defaultProps.filterOperators.beginwith")
      @js.native
      def beginwith: IsMatch = js.native
      @scala.inline
      def beginwith_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beginwith")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "DataGrid.defaultProps.filterOperators.contains")
      @js.native
      def contains: IsMatch = js.native
      @scala.inline
      def contains_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contains")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "DataGrid.defaultProps.filterOperators.endwith")
      @js.native
      def endwith: IsMatch = js.native
      @scala.inline
      def endwith_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endwith")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "DataGrid.defaultProps.filterOperators.equal")
      @js.native
      def equal: IsMatch = js.native
      @scala.inline
      def equal_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("equal")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "DataGrid.defaultProps.filterOperators.greater")
      @js.native
      def greater: IsMatch = js.native
      @scala.inline
      def greater_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("greater")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "DataGrid.defaultProps.filterOperators.greaterorequal")
      @js.native
      def greaterorequal: IsMatch = js.native
      @scala.inline
      def greaterorequal_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("greaterorequal")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "DataGrid.defaultProps.filterOperators.less")
      @js.native
      def less: IsMatch = js.native
      @scala.inline
      def less_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("less")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "DataGrid.defaultProps.filterOperators.lessorequal")
      @js.native
      def lessorequal: IsMatch = js.native
      @scala.inline
      def lessorequal_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lessorequal")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "DataGrid.defaultProps.filterOperators.nofilter")
      @js.native
      def nofilter: IsMatch = js.native
      @scala.inline
      def nofilter_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nofilter")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "DataGrid.defaultProps.filterOperators.notequal")
      @js.native
      def notequal: IsMatch = js.native
      @scala.inline
      def notequal_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notequal")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.filterPosition")
    @js.native
    val filterPosition: String = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.filterRules")
    @js.native
    val filterRules: js.Array[js.Any] = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.filterable")
    @js.native
    val filterable: Boolean = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.footerData")
    @js.native
    val footerData: js.Array[js.Any] = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.frozenAlign")
    @js.native
    val frozenAlign: String = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.frozenWidth")
    @js.native
    val frozenWidth: String = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.lazy")
    @js.native
    val `lazy`: Boolean = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.loading")
    @js.native
    val loading: Boolean = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.multiSort")
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
    def onGroupCollapse(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onGroupCollapse")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onGroupExpand(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onGroupExpand")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onPageChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPageChange")().asInstanceOf[Unit]
    
    @scala.inline
    def onRowClick(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowClick")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onRowCollapse(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowCollapse")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onRowContextMenu(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowContextMenu")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onRowDblClick(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowDblClick")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onRowExpand(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowExpand")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onRowSelect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowSelect")().asInstanceOf[Unit]
    
    @scala.inline
    def onRowUnselect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowUnselect")().asInstanceOf[Unit]
    
    @scala.inline
    def onSelectionChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSelectionChange")().asInstanceOf[Unit]
    
    @scala.inline
    def onSortChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSortChange")().asInstanceOf[Unit]
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.pageNumber")
    @js.native
    val pageNumber: Double = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.pagePosition")
    @js.native
    val pagePosition: String = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.pageSize")
    @js.native
    val pageSize: Double = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.pagination")
    @js.native
    val pagination: Boolean = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.rowHeight")
    @js.native
    val rowHeight: Double = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.showFooter")
    @js.native
    val showFooter: Boolean = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.showHeader")
    @js.native
    val showHeader: Boolean = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.sorts")
    @js.native
    val sorts: js.Array[js.Any] = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.striped")
    @js.native
    val striped: Boolean = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.total")
    @js.native
    val total: Double = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.virtualScroll")
    @js.native
    val virtualScroll: Boolean = js.native
  }
  
  object propTypes {
    
    object border {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.border")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.border
      @JSImport("rc-easyui", "DataGrid.propTypes.border.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object clickToEdit {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.clickToEdit")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.clickToEdit
      @JSImport("rc-easyui", "DataGrid.propTypes.clickToEdit.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object columnMoving {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.columnMoving")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.columnMoving
      @JSImport("rc-easyui", "DataGrid.propTypes.columnMoving.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object data {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.data")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.data
      @JSImport("rc-easyui", "DataGrid.propTypes.data.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object dblclickToEdit {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.dblclickToEdit")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.dblclickToEdit
      @JSImport("rc-easyui", "DataGrid.propTypes.dblclickToEdit.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object editMode {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.editMode")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.editMode
      @JSImport("rc-easyui", "DataGrid.propTypes.editMode.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object expanderWidth {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.expanderWidth")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.expanderWidth
      @JSImport("rc-easyui", "DataGrid.propTypes.expanderWidth.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterBtnPosition {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.filterBtnPosition")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.filterBtnPosition
      @JSImport("rc-easyui", "DataGrid.propTypes.filterBtnPosition.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterDelay {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.filterDelay")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.filterDelay
      @JSImport("rc-easyui", "DataGrid.propTypes.filterDelay.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterMatchingType {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.filterMatchingType")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.filterMatchingType
      @JSImport("rc-easyui", "DataGrid.propTypes.filterMatchingType.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterOperators {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.filterOperators")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.filterOperators
      @JSImport("rc-easyui", "DataGrid.propTypes.filterOperators.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterPosition {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.filterPosition")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.filterPosition
      @JSImport("rc-easyui", "DataGrid.propTypes.filterPosition.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterRules {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.filterRules")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.filterRules
      @JSImport("rc-easyui", "DataGrid.propTypes.filterRules.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterable {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.filterable")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.filterable
      @JSImport("rc-easyui", "DataGrid.propTypes.filterable.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object footerData {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.footerData")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.footerData
      @JSImport("rc-easyui", "DataGrid.propTypes.footerData.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object frozenAlign {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.frozenAlign")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.frozenAlign
      @JSImport("rc-easyui", "DataGrid.propTypes.frozenAlign.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object frozenWidth {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.frozenWidth")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.frozenWidth
      @JSImport("rc-easyui", "DataGrid.propTypes.frozenWidth.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object groupField {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.groupField")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.groupField
      @JSImport("rc-easyui", "DataGrid.propTypes.groupField.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object idField {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.idField")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.idField
      @JSImport("rc-easyui", "DataGrid.propTypes.idField.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object `lazy` {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.lazy")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.lazy
      @JSImport("rc-easyui", "DataGrid.propTypes.lazy.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object loadMsg {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.loadMsg")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.loadMsg
      @JSImport("rc-easyui", "DataGrid.propTypes.loadMsg.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object loading {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.loading")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.loading
      @JSImport("rc-easyui", "DataGrid.propTypes.loading.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object multiSort {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.multiSort")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.multiSort
      @JSImport("rc-easyui", "DataGrid.propTypes.multiSort.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pageNumber {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.pageNumber")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.pageNumber
      @JSImport("rc-easyui", "DataGrid.propTypes.pageNumber.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pageOptions {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.pageOptions")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.pageOptions
      @JSImport("rc-easyui", "DataGrid.propTypes.pageOptions.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pagePosition {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.pagePosition")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.pagePosition
      @JSImport("rc-easyui", "DataGrid.propTypes.pagePosition.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pageSize {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.pageSize")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.pageSize
      @JSImport("rc-easyui", "DataGrid.propTypes.pageSize.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pagination {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.pagination")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.pagination
      @JSImport("rc-easyui", "DataGrid.propTypes.pagination.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object renderDetail {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.renderDetail")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.renderDetail
      @JSImport("rc-easyui", "DataGrid.propTypes.renderDetail.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object renderGroup {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.renderGroup")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.renderGroup
      @JSImport("rc-easyui", "DataGrid.propTypes.renderGroup.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object rowCss {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.rowCss")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.rowCss
      @JSImport("rc-easyui", "DataGrid.propTypes.rowCss.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object rowHeight {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.rowHeight")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.rowHeight
      @JSImport("rc-easyui", "DataGrid.propTypes.rowHeight.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object selection {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.selection")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.selection
      @JSImport("rc-easyui", "DataGrid.propTypes.selection.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object selectionMode {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.selectionMode")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.selectionMode
      @JSImport("rc-easyui", "DataGrid.propTypes.selectionMode.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object showFooter {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.showFooter")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.showFooter
      @JSImport("rc-easyui", "DataGrid.propTypes.showFooter.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object showHeader {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.showHeader")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.showHeader
      @JSImport("rc-easyui", "DataGrid.propTypes.showHeader.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object sorts {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.sorts")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.sorts
      @JSImport("rc-easyui", "DataGrid.propTypes.sorts.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object striped {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.striped")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.striped
      @JSImport("rc-easyui", "DataGrid.propTypes.striped.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object total {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.total")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.total
      @JSImport("rc-easyui", "DataGrid.propTypes.total.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object virtualScroll {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataGrid.propTypes.virtualScroll")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.virtualScroll
      @JSImport("rc-easyui", "DataGrid.propTypes.virtualScroll.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
