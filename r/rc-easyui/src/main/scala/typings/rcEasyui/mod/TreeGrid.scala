package typings.rcEasyui.mod

import typings.rcEasyui.anon.IsMatch
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "TreeGrid")
@js.native
open class TreeGrid protected ()
  extends Component[Any, js.Object, Any] {
  def this(args: Any*) = this()
  
  def checkRow(e: Any): Unit = js.native
  
  def collapseRow(e: Any): Unit = js.native
  
  def doFilter(e: Any): Unit = js.native
  
  def expandRow(e: Any): Unit = js.native
  
  def getCheckedRows(args: Any*): Any = js.native
  
  def sortData(): Any = js.native
  
  def uncheckAllRows(): Unit = js.native
  
  def uncheckRow(e: Any): Unit = js.native
  
  def viewComponent(): Any = js.native
}
object TreeGrid {
  
  object contextTypes {
    
    object locale {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.contextTypes.locale
      @JSImport("rc-easyui", "TreeGrid.contextTypes.locale.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object t {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.contextTypes.t
      @JSImport("rc-easyui", "TreeGrid.contextTypes.t.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
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
    val data: js.Array[Any] = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.dblclickToEdit")
    @js.native
    val dblclickToEdit: Boolean = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.defaultLoadMsg")
    @js.native
    val defaultLoadMsg: String = js.native
    
    inline def filter(e: Any, t: Any, n: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Any]
    
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
      inline def beginwith_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beginwith")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "TreeGrid.defaultProps.filterOperators.contains")
      @js.native
      def contains: IsMatch = js.native
      inline def contains_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contains")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "TreeGrid.defaultProps.filterOperators.endwith")
      @js.native
      def endwith: IsMatch = js.native
      inline def endwith_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endwith")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "TreeGrid.defaultProps.filterOperators.equal")
      @js.native
      def equal: IsMatch = js.native
      inline def equal_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("equal")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "TreeGrid.defaultProps.filterOperators.greater")
      @js.native
      def greater: IsMatch = js.native
      inline def greater_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("greater")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "TreeGrid.defaultProps.filterOperators.greaterorequal")
      @js.native
      def greaterorequal: IsMatch = js.native
      inline def greaterorequal_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("greaterorequal")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "TreeGrid.defaultProps.filterOperators.less")
      @js.native
      def less: IsMatch = js.native
      inline def less_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("less")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "TreeGrid.defaultProps.filterOperators.lessorequal")
      @js.native
      def lessorequal: IsMatch = js.native
      inline def lessorequal_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lessorequal")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "TreeGrid.defaultProps.filterOperators.nofilter")
      @js.native
      def nofilter: IsMatch = js.native
      inline def nofilter_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nofilter")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "TreeGrid.defaultProps.filterOperators.notequal")
      @js.native
      def notequal: IsMatch = js.native
      inline def notequal_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notequal")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.filterPosition")
    @js.native
    val filterPosition: String = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.filterRules")
    @js.native
    val filterRules: js.Array[Any] = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.filterable")
    @js.native
    val filterable: Boolean = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.footerData")
    @js.native
    val footerData: js.Array[Any] = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.frozenAlign")
    @js.native
    val frozenAlign: String = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.frozenWidth")
    @js.native
    val frozenWidth: String = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.lazy")
    @js.native
    val `lazy`: Boolean = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.loading")
    @js.native
    val loading: Boolean = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.multiSort")
    @js.native
    val multiSort: Boolean = js.native
    
    inline def onCellClick(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCellClick")().asInstanceOf[Unit]
    
    inline def onCellContextMenu(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCellContextMenu")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onCellDblClick(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCellDblClick")().asInstanceOf[Unit]
    
    inline def onCellSelect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCellSelect")().asInstanceOf[Unit]
    
    inline def onCellUnselect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCellUnselect")().asInstanceOf[Unit]
    
    inline def onCheckChange(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCheckChange")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onColumnMove(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onColumnMove")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onColumnResize(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onColumnResize")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onEditBegin(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onEditBegin")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onEditCancel(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onEditCancel")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onEditEnd(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onEditEnd")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onEditValidate(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onEditValidate")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onFilterChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFilterChange")().asInstanceOf[Unit]
    
    inline def onPageChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPageChange")().asInstanceOf[Unit]
    
    inline def onRowCheck(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowCheck")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onRowClick(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowClick")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onRowCollapse(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowCollapse")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onRowContextMenu(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowContextMenu")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onRowDblClick(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowDblClick")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onRowExpand(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowExpand")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onRowSelect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowSelect")().asInstanceOf[Unit]
    
    inline def onRowUncheck(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowUncheck")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onRowUnselect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowUnselect")().asInstanceOf[Unit]
    
    inline def onSelectionChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSelectionChange")().asInstanceOf[Unit]
    
    inline def onSortChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSortChange")().asInstanceOf[Unit]
    
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
    val sorts: js.Array[Any] = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.striped")
    @js.native
    val striped: Boolean = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.total")
    @js.native
    val total: Double = js.native
    
    @JSImport("rc-easyui", "TreeGrid.defaultProps.virtualScroll")
    @js.native
    val virtualScroll: Boolean = js.native
  }
  
  object propTypes {
    
    object animate {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.animate")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.animate
      @JSImport("rc-easyui", "TreeGrid.propTypes.animate.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object border {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.border")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.border
      @JSImport("rc-easyui", "TreeGrid.propTypes.border.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object cascadeCheck {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.cascadeCheck")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.cascadeCheck
      @JSImport("rc-easyui", "TreeGrid.propTypes.cascadeCheck.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object checkbox {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.checkbox")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.checkbox
      @JSImport("rc-easyui", "TreeGrid.propTypes.checkbox.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object clickToEdit {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.clickToEdit")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.clickToEdit
      @JSImport("rc-easyui", "TreeGrid.propTypes.clickToEdit.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object columnMoving {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.columnMoving")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.columnMoving
      @JSImport("rc-easyui", "TreeGrid.propTypes.columnMoving.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object data {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.data")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.data
      @JSImport("rc-easyui", "TreeGrid.propTypes.data.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object dblclickToEdit {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.dblclickToEdit")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.dblclickToEdit
      @JSImport("rc-easyui", "TreeGrid.propTypes.dblclickToEdit.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object editMode {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.editMode")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.editMode
      @JSImport("rc-easyui", "TreeGrid.propTypes.editMode.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object filter {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.filter")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.filter
      @JSImport("rc-easyui", "TreeGrid.propTypes.filter.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object filterBtnPosition {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterBtnPosition")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.filterBtnPosition
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterBtnPosition.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object filterDelay {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterDelay")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.filterDelay
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterDelay.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object filterIncludingChild {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterIncludingChild")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.filterIncludingChild
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterIncludingChild.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object filterMatchingType {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterMatchingType")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.filterMatchingType
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterMatchingType.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object filterOperators {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterOperators")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.filterOperators
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterOperators.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object filterPosition {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterPosition")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.filterPosition
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterPosition.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object filterRules {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterRules")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.filterRules
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterRules.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object filterable {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterable")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.filterable
      @JSImport("rc-easyui", "TreeGrid.propTypes.filterable.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object footerData {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.footerData")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.footerData
      @JSImport("rc-easyui", "TreeGrid.propTypes.footerData.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object frozenAlign {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.frozenAlign")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.frozenAlign
      @JSImport("rc-easyui", "TreeGrid.propTypes.frozenAlign.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object frozenWidth {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.frozenWidth")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.frozenWidth
      @JSImport("rc-easyui", "TreeGrid.propTypes.frozenWidth.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object idField {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.idField")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.idField
      @JSImport("rc-easyui", "TreeGrid.propTypes.idField.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object `lazy` {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.lazy")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.lazy
      @JSImport("rc-easyui", "TreeGrid.propTypes.lazy.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object loadMsg {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.loadMsg")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.loadMsg
      @JSImport("rc-easyui", "TreeGrid.propTypes.loadMsg.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object loading {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.loading")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.loading
      @JSImport("rc-easyui", "TreeGrid.propTypes.loading.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object multiSort {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.multiSort")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.multiSort
      @JSImport("rc-easyui", "TreeGrid.propTypes.multiSort.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object pageNumber {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.pageNumber")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.pageNumber
      @JSImport("rc-easyui", "TreeGrid.propTypes.pageNumber.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object pageOptions {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.pageOptions")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.pageOptions
      @JSImport("rc-easyui", "TreeGrid.propTypes.pageOptions.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object pagePosition {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.pagePosition")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.pagePosition
      @JSImport("rc-easyui", "TreeGrid.propTypes.pagePosition.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object pageSize {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.pageSize")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.pageSize
      @JSImport("rc-easyui", "TreeGrid.propTypes.pageSize.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object pagination {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.pagination")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.pagination
      @JSImport("rc-easyui", "TreeGrid.propTypes.pagination.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object rowCss {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.rowCss")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.rowCss
      @JSImport("rc-easyui", "TreeGrid.propTypes.rowCss.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object rowHeight {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.rowHeight")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.rowHeight
      @JSImport("rc-easyui", "TreeGrid.propTypes.rowHeight.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object selection {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.selection")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.selection
      @JSImport("rc-easyui", "TreeGrid.propTypes.selection.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object selectionMode {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.selectionMode")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.selectionMode
      @JSImport("rc-easyui", "TreeGrid.propTypes.selectionMode.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object showFooter {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.showFooter")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.showFooter
      @JSImport("rc-easyui", "TreeGrid.propTypes.showFooter.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object showHeader {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.showHeader")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.showHeader
      @JSImport("rc-easyui", "TreeGrid.propTypes.showHeader.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object sorts {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.sorts")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.sorts
      @JSImport("rc-easyui", "TreeGrid.propTypes.sorts.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object striped {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.striped")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.striped
      @JSImport("rc-easyui", "TreeGrid.propTypes.striped.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object total {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.total")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.total
      @JSImport("rc-easyui", "TreeGrid.propTypes.total.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object treeField {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.treeField")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.treeField
      @JSImport("rc-easyui", "TreeGrid.propTypes.treeField.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object virtualScroll {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "TreeGrid.propTypes.virtualScroll")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.TreeGrid.propTypes.virtualScroll
      @JSImport("rc-easyui", "TreeGrid.propTypes.virtualScroll.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
}
