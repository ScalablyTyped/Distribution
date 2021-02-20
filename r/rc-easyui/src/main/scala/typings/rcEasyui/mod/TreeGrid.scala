package typings.rcEasyui.mod

import typings.rcEasyui.anon.IsMatch
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "TreeGrid")
@js.native
class TreeGrid protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(args: js.Any*) = this()
  
  def checkRow(e: js.Any): Unit = js.native
  
  def collapseRow(e: js.Any): Unit = js.native
  
  def doFilter(e: js.Any): Unit = js.native
  
  def expandRow(e: js.Any): Unit = js.native
  
  def getCheckedRows(args: js.Any*): js.Any = js.native
  
  def sortData(): js.Any = js.native
  
  def uncheckAllRows(): Unit = js.native
  
  def uncheckRow(e: js.Any): Unit = js.native
  
  def viewComponent(): js.Any = js.native
}
object TreeGrid {
  
  object contextTypes {
    
    object locale {
      
      @JSImport("rc-easyui", "TreeGrid.contextTypes.locale")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.contextTypes.locale
      @JSImport("rc-easyui", "TreeGrid.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      @JSImport("rc-easyui", "TreeGrid.contextTypes.t")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.contextTypes.t
      @JSImport("rc-easyui", "TreeGrid.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.animate")
    @js.native
    val animate: Boolean = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.border")
    @js.native
    val border: Boolean = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.cascadeCheck")
    @js.native
    val cascadeCheck: Boolean = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.checkbox")
    @js.native
    val checkbox: Boolean = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.clickToEdit")
    @js.native
    val clickToEdit: Boolean = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.columnMoving")
    @js.native
    val columnMoving: Boolean = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.columnResizing")
    @js.native
    val columnResizing: Boolean = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.data")
    @js.native
    val data: js.Array[js.Any] = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.dblclickToEdit")
    @js.native
    val dblclickToEdit: Boolean = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.defaultLoadMsg")
    @js.native
    val defaultLoadMsg: String = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.filter")
    @js.native
    def filter(e: js.Any, t: js.Any, n: js.Any): js.Any = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.filterBtnPosition")
    @js.native
    val filterBtnPosition: String = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.filterDelay")
    @js.native
    val filterDelay: Double = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.filterIncludingChild")
    @js.native
    val filterIncludingChild: Boolean = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.filterMatchingType")
    @js.native
    val filterMatchingType: String = js.native
    
    object filterOperators {
      
      @JSImport("rc-easyui", "TreeGrid.defaultProps.filterOperators")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-easyui", "TreeGrid.defaultProps.filterOperators.beginwith")
      @js.native
      def beginwith: IsMatch = js.native
      @scala.inline
      def beginwith_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beginwith")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "TreeGrid.defaultProps.filterOperators.contains")
      @js.native
      def contains: IsMatch = js.native
      @scala.inline
      def contains_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contains")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "TreeGrid.defaultProps.filterOperators.endwith")
      @js.native
      def endwith: IsMatch = js.native
      @scala.inline
      def endwith_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endwith")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "TreeGrid.defaultProps.filterOperators.equal")
      @js.native
      def equal: IsMatch = js.native
      @scala.inline
      def equal_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("equal")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "TreeGrid.defaultProps.filterOperators.greater")
      @js.native
      def greater: IsMatch = js.native
      @scala.inline
      def greater_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("greater")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "TreeGrid.defaultProps.filterOperators.greaterorequal")
      @js.native
      def greaterorequal: IsMatch = js.native
      @scala.inline
      def greaterorequal_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("greaterorequal")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "TreeGrid.defaultProps.filterOperators.less")
      @js.native
      def less: IsMatch = js.native
      @scala.inline
      def less_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("less")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "TreeGrid.defaultProps.filterOperators.lessorequal")
      @js.native
      def lessorequal: IsMatch = js.native
      @scala.inline
      def lessorequal_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lessorequal")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "TreeGrid.defaultProps.filterOperators.nofilter")
      @js.native
      def nofilter: IsMatch = js.native
      @scala.inline
      def nofilter_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nofilter")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "TreeGrid.defaultProps.filterOperators.notequal")
      @js.native
      def notequal: IsMatch = js.native
      @scala.inline
      def notequal_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notequal")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.filterPosition")
    @js.native
    val filterPosition: String = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.filterRules")
    @js.native
    val filterRules: js.Array[js.Any] = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.filterable")
    @js.native
    val filterable: Boolean = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.footerData")
    @js.native
    val footerData: js.Array[js.Any] = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.frozenAlign")
    @js.native
    val frozenAlign: String = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.frozenWidth")
    @js.native
    val frozenWidth: String = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.loading")
    @js.native
    val loading: Boolean = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.multiSort")
    @js.native
    val multiSort: Boolean = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onCellClick")
    @js.native
    def onCellClick(): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onCellContextMenu")
    @js.native
    def onCellContextMenu(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onCellDblClick")
    @js.native
    def onCellDblClick(): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onCellSelect")
    @js.native
    def onCellSelect(): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onCellUnselect")
    @js.native
    def onCellUnselect(): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onCheckChange")
    @js.native
    def onCheckChange(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onColumnMove")
    @js.native
    def onColumnMove(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onColumnResize")
    @js.native
    def onColumnResize(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onEditBegin")
    @js.native
    def onEditBegin(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onEditCancel")
    @js.native
    def onEditCancel(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onEditEnd")
    @js.native
    def onEditEnd(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onEditValidate")
    @js.native
    def onEditValidate(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onFilterChange")
    @js.native
    def onFilterChange(): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onPageChange")
    @js.native
    def onPageChange(): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onRowCheck")
    @js.native
    def onRowCheck(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onRowClick")
    @js.native
    def onRowClick(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onRowCollapse")
    @js.native
    def onRowCollapse(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onRowContextMenu")
    @js.native
    def onRowContextMenu(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onRowDblClick")
    @js.native
    def onRowDblClick(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onRowExpand")
    @js.native
    def onRowExpand(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onRowSelect")
    @js.native
    def onRowSelect(): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onRowUncheck")
    @js.native
    def onRowUncheck(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onRowUnselect")
    @js.native
    def onRowUnselect(): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onSelectionChange")
    @js.native
    def onSelectionChange(): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.onSortChange")
    @js.native
    def onSortChange(): Unit = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.pageNumber")
    @js.native
    val pageNumber: Double = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.pagePosition")
    @js.native
    val pagePosition: String = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.pageSize")
    @js.native
    val pageSize: Double = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.pagination")
    @js.native
    val pagination: Boolean = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.rowHeight")
    @js.native
    val rowHeight: Double = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.selectionMode")
    @js.native
    val selectionMode: String = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.showFooter")
    @js.native
    val showFooter: Boolean = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.showHeader")
    @js.native
    val showHeader: Boolean = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.sorts")
    @js.native
    val sorts: js.Array[js.Any] = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.striped")
    @js.native
    val striped: Boolean = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.total")
    @js.native
    val total: Double = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.virtualScroll")
    @js.native
    val virtualScroll: Boolean = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.lazy")
    @js.native
    val `lazy`: Boolean = js.native
  }
  
  object propTypes {
    
    object animate {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.animate")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.animate
      @JSImport("rc-easyui", "TreeGrid.propTypes.animate.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object border {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.border")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.border
      @JSImport("rc-easyui", "TreeGrid.propTypes.border.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object cascadeCheck {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.cascadeCheck")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.cascadeCheck
      @JSImport("rc-easyui", "TreeGrid.propTypes.cascadeCheck.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object checkbox {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.checkbox")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.checkbox
      @JSImport("rc-easyui", "TreeGrid.propTypes.checkbox.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object clickToEdit {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.clickToEdit")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.clickToEdit
      @JSImport("rc-easyui", "TreeGrid.propTypes.clickToEdit.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object columnMoving {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.columnMoving")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.columnMoving
      @JSImport("rc-easyui", "TreeGrid.propTypes.columnMoving.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object data {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.data")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.data
      @JSImport("rc-easyui", "TreeGrid.propTypes.data.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object dblclickToEdit {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.dblclickToEdit")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.dblclickToEdit
      @JSImport("rc-easyui", "TreeGrid.propTypes.dblclickToEdit.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object editMode {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.editMode")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.editMode
      @JSImport("rc-easyui", "TreeGrid.propTypes.editMode.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filter {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.filter")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.filter
      @JSImport("rc-easyui", "TreeGrid.propTypes.filter.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterBtnPosition {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterBtnPosition")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.filterBtnPosition
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterBtnPosition.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterDelay {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterDelay")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.filterDelay
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterDelay.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterIncludingChild {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterIncludingChild")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.filterIncludingChild
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterIncludingChild.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterMatchingType {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterMatchingType")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.filterMatchingType
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterMatchingType.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterOperators {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterOperators")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.filterOperators
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterOperators.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterPosition {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterPosition")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.filterPosition
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterPosition.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterRules {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterRules")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.filterRules
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterRules.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterable {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterable")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.filterable
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterable.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object footerData {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.footerData")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.footerData
      @JSImport("rc-easyui", "TreeGrid.propTypes.footerData.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object frozenAlign {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.frozenAlign")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.frozenAlign
      @JSImport("rc-easyui", "TreeGrid.propTypes.frozenAlign.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object frozenWidth {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.frozenWidth")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.frozenWidth
      @JSImport("rc-easyui", "TreeGrid.propTypes.frozenWidth.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object idField {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.idField")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.idField
      @JSImport("rc-easyui", "TreeGrid.propTypes.idField.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object loadMsg {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.loadMsg")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.loadMsg
      @JSImport("rc-easyui", "TreeGrid.propTypes.loadMsg.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object loading {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.loading")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.loading
      @JSImport("rc-easyui", "TreeGrid.propTypes.loading.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object multiSort {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.multiSort")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.multiSort
      @JSImport("rc-easyui", "TreeGrid.propTypes.multiSort.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pageNumber {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.pageNumber")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.pageNumber
      @JSImport("rc-easyui", "TreeGrid.propTypes.pageNumber.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pageOptions {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.pageOptions")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.pageOptions
      @JSImport("rc-easyui", "TreeGrid.propTypes.pageOptions.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pagePosition {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.pagePosition")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.pagePosition
      @JSImport("rc-easyui", "TreeGrid.propTypes.pagePosition.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pageSize {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.pageSize")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.pageSize
      @JSImport("rc-easyui", "TreeGrid.propTypes.pageSize.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pagination {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.pagination")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.pagination
      @JSImport("rc-easyui", "TreeGrid.propTypes.pagination.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object rowCss {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.rowCss")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.rowCss
      @JSImport("rc-easyui", "TreeGrid.propTypes.rowCss.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object rowHeight {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.rowHeight")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.rowHeight
      @JSImport("rc-easyui", "TreeGrid.propTypes.rowHeight.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object selection {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.selection")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.selection
      @JSImport("rc-easyui", "TreeGrid.propTypes.selection.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object selectionMode {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.selectionMode")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.selectionMode
      @JSImport("rc-easyui", "TreeGrid.propTypes.selectionMode.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object showFooter {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.showFooter")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.showFooter
      @JSImport("rc-easyui", "TreeGrid.propTypes.showFooter.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object showHeader {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.showHeader")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.showHeader
      @JSImport("rc-easyui", "TreeGrid.propTypes.showHeader.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object sorts {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.sorts")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.sorts
      @JSImport("rc-easyui", "TreeGrid.propTypes.sorts.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object striped {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.striped")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.striped
      @JSImport("rc-easyui", "TreeGrid.propTypes.striped.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object total {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.total")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.total
      @JSImport("rc-easyui", "TreeGrid.propTypes.total.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object treeField {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.treeField")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.treeField
      @JSImport("rc-easyui", "TreeGrid.propTypes.treeField.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object virtualScroll {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.virtualScroll")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.virtualScroll
      @JSImport("rc-easyui", "TreeGrid.propTypes.virtualScroll.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object `lazy` {
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.lazy")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.lazy
      @JSImport("rc-easyui", "TreeGrid.propTypes.lazy.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
