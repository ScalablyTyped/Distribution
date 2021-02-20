package typings.rcEasyui.mod

import typings.rcEasyui.anon.IsMatch
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
      
      @JSImport("rc-easyui", "DataGrid.contextTypes.locale")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.contextTypes.locale
      @JSImport("rc-easyui", "DataGrid.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      @JSImport("rc-easyui", "DataGrid.contextTypes.t")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.contextTypes.t
      @JSImport("rc-easyui", "DataGrid.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  object defaultProps {
    
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
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.loading")
    @js.native
    val loading: Boolean = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.multiSort")
    @js.native
    val multiSort: Boolean = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onCellClick")
    @js.native
    def onCellClick(): Unit = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onCellContextMenu")
    @js.native
    def onCellContextMenu(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onCellDblClick")
    @js.native
    def onCellDblClick(): Unit = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onCellSelect")
    @js.native
    def onCellSelect(): Unit = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onCellUnselect")
    @js.native
    def onCellUnselect(): Unit = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onColumnMove")
    @js.native
    def onColumnMove(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onColumnResize")
    @js.native
    def onColumnResize(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onEditBegin")
    @js.native
    def onEditBegin(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onEditCancel")
    @js.native
    def onEditCancel(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onEditEnd")
    @js.native
    def onEditEnd(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onEditValidate")
    @js.native
    def onEditValidate(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onFilterChange")
    @js.native
    def onFilterChange(): Unit = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onGroupCollapse")
    @js.native
    def onGroupCollapse(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onGroupExpand")
    @js.native
    def onGroupExpand(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onPageChange")
    @js.native
    def onPageChange(): Unit = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onRowClick")
    @js.native
    def onRowClick(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onRowCollapse")
    @js.native
    def onRowCollapse(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onRowContextMenu")
    @js.native
    def onRowContextMenu(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onRowDblClick")
    @js.native
    def onRowDblClick(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onRowExpand")
    @js.native
    def onRowExpand(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onRowSelect")
    @js.native
    def onRowSelect(): Unit = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onRowUnselect")
    @js.native
    def onRowUnselect(): Unit = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onSelectionChange")
    @js.native
    def onSelectionChange(): Unit = js.native
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.onSortChange")
    @js.native
    def onSortChange(): Unit = js.native
    
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
    
    @JSImport("rc-easyui", "DataGrid.defaultProps.lazy")
    @js.native
    val `lazy`: Boolean = js.native
  }
  
  object propTypes {
    
    object border {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.border")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.border
      @JSImport("rc-easyui", "DataGrid.propTypes.border.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object clickToEdit {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.clickToEdit")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.clickToEdit
      @JSImport("rc-easyui", "DataGrid.propTypes.clickToEdit.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object columnMoving {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.columnMoving")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.columnMoving
      @JSImport("rc-easyui", "DataGrid.propTypes.columnMoving.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object data {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.data")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.data
      @JSImport("rc-easyui", "DataGrid.propTypes.data.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object dblclickToEdit {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.dblclickToEdit")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.dblclickToEdit
      @JSImport("rc-easyui", "DataGrid.propTypes.dblclickToEdit.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object editMode {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.editMode")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.editMode
      @JSImport("rc-easyui", "DataGrid.propTypes.editMode.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object expanderWidth {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.expanderWidth")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.expanderWidth
      @JSImport("rc-easyui", "DataGrid.propTypes.expanderWidth.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterBtnPosition {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.filterBtnPosition")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.filterBtnPosition
      @JSImport("rc-easyui", "DataGrid.propTypes.filterBtnPosition.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterDelay {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.filterDelay")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.filterDelay
      @JSImport("rc-easyui", "DataGrid.propTypes.filterDelay.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterMatchingType {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.filterMatchingType")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.filterMatchingType
      @JSImport("rc-easyui", "DataGrid.propTypes.filterMatchingType.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterOperators {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.filterOperators")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.filterOperators
      @JSImport("rc-easyui", "DataGrid.propTypes.filterOperators.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterPosition {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.filterPosition")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.filterPosition
      @JSImport("rc-easyui", "DataGrid.propTypes.filterPosition.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterRules {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.filterRules")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.filterRules
      @JSImport("rc-easyui", "DataGrid.propTypes.filterRules.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterable {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.filterable")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.filterable
      @JSImport("rc-easyui", "DataGrid.propTypes.filterable.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object footerData {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.footerData")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.footerData
      @JSImport("rc-easyui", "DataGrid.propTypes.footerData.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object frozenAlign {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.frozenAlign")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.frozenAlign
      @JSImport("rc-easyui", "DataGrid.propTypes.frozenAlign.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object frozenWidth {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.frozenWidth")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.frozenWidth
      @JSImport("rc-easyui", "DataGrid.propTypes.frozenWidth.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object groupField {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.groupField")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.groupField
      @JSImport("rc-easyui", "DataGrid.propTypes.groupField.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object idField {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.idField")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.idField
      @JSImport("rc-easyui", "DataGrid.propTypes.idField.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object loadMsg {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.loadMsg")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.loadMsg
      @JSImport("rc-easyui", "DataGrid.propTypes.loadMsg.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object loading {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.loading")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.loading
      @JSImport("rc-easyui", "DataGrid.propTypes.loading.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object multiSort {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.multiSort")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.multiSort
      @JSImport("rc-easyui", "DataGrid.propTypes.multiSort.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pageNumber {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.pageNumber")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.pageNumber
      @JSImport("rc-easyui", "DataGrid.propTypes.pageNumber.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pageOptions {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.pageOptions")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.pageOptions
      @JSImport("rc-easyui", "DataGrid.propTypes.pageOptions.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pagePosition {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.pagePosition")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.pagePosition
      @JSImport("rc-easyui", "DataGrid.propTypes.pagePosition.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pageSize {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.pageSize")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.pageSize
      @JSImport("rc-easyui", "DataGrid.propTypes.pageSize.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pagination {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.pagination")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.pagination
      @JSImport("rc-easyui", "DataGrid.propTypes.pagination.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object renderDetail {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.renderDetail")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.renderDetail
      @JSImport("rc-easyui", "DataGrid.propTypes.renderDetail.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object renderGroup {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.renderGroup")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.renderGroup
      @JSImport("rc-easyui", "DataGrid.propTypes.renderGroup.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object rowCss {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.rowCss")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.rowCss
      @JSImport("rc-easyui", "DataGrid.propTypes.rowCss.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object rowHeight {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.rowHeight")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.rowHeight
      @JSImport("rc-easyui", "DataGrid.propTypes.rowHeight.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object selection {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.selection")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.selection
      @JSImport("rc-easyui", "DataGrid.propTypes.selection.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object selectionMode {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.selectionMode")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.selectionMode
      @JSImport("rc-easyui", "DataGrid.propTypes.selectionMode.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object showFooter {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.showFooter")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.showFooter
      @JSImport("rc-easyui", "DataGrid.propTypes.showFooter.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object showHeader {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.showHeader")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.showHeader
      @JSImport("rc-easyui", "DataGrid.propTypes.showHeader.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object sorts {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.sorts")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.sorts
      @JSImport("rc-easyui", "DataGrid.propTypes.sorts.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object striped {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.striped")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.striped
      @JSImport("rc-easyui", "DataGrid.propTypes.striped.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object total {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.total")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.total
      @JSImport("rc-easyui", "DataGrid.propTypes.total.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object virtualScroll {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.virtualScroll")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.virtualScroll
      @JSImport("rc-easyui", "DataGrid.propTypes.virtualScroll.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object `lazy` {
      
      @JSImport("rc-easyui", "DataGrid.propTypes.lazy")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DataGrid.propTypes.lazy
      @JSImport("rc-easyui", "DataGrid.propTypes.lazy.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
