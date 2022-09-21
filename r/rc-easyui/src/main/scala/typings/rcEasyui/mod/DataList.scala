package typings.rcEasyui.mod

import typings.rcEasyui.anon.IsMatch
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "DataList")
@js.native
open class DataList protected ()
  extends Component[Any, js.Object, Any] {
  def this(args: Any*) = this()
  
  def container(): Any = js.native
  
  def getItemClass(e: Any): Any = js.native
  
  def getRowIndex(e: Any): Any = js.native
  
  def handleMouseEnter(e: Any): Any = js.native
  
  def handleMouseLeave(): Unit = js.native
  
  def handleRowClick(e: Any): Any = js.native
  
  def handleScroll(e: Any): Unit = js.native
  
  def highlightFirstRow(): Unit = js.native
  
  def innerClasses(): Any = js.native
  
  def innerStyle(): Any = js.native
  
  def navRow(e: Any): Unit = js.native
  
  def renderList(): Any = js.native
  
  def renderLoading(): Any = js.native
  
  def renderPagination(e: Any): Any = js.native
  
  def renderVirtualList(): Any = js.native
  
  def scrollToSelectedRow(): Unit = js.native
  
  def scrollTop(e: Any): Any = js.native
  
  def setData(e: Any): Unit = js.native
  
  def virtualItemStyle(): Any = js.native
}
object DataList {
  
  object contextTypes {
    
    object locale {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.contextTypes.locale
      @JSImport("rc-easyui", "DataList.contextTypes.locale.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object t {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.contextTypes.t
      @JSImport("rc-easyui", "DataList.contextTypes.t.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "DataList.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-easyui", "DataList.defaultProps.border")
    @js.native
    val border: Boolean = js.native
    
    @JSImport("rc-easyui", "DataList.defaultProps.data")
    @js.native
    val data: js.Array[Any] = js.native
    
    @JSImport("rc-easyui", "DataList.defaultProps.defaultLoadMsg")
    @js.native
    val defaultLoadMsg: String = js.native
    
    @JSImport("rc-easyui", "DataList.defaultProps.filterBtnPosition")
    @js.native
    val filterBtnPosition: String = js.native
    
    @JSImport("rc-easyui", "DataList.defaultProps.filterDelay")
    @js.native
    val filterDelay: Double = js.native
    
    @JSImport("rc-easyui", "DataList.defaultProps.filterMatchingType")
    @js.native
    val filterMatchingType: String = js.native
    
    object filterOperators {
      
      @JSImport("rc-easyui", "DataList.defaultProps.filterOperators")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-easyui", "DataList.defaultProps.filterOperators.beginwith")
      @js.native
      def beginwith: IsMatch = js.native
      inline def beginwith_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beginwith")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "DataList.defaultProps.filterOperators.contains")
      @js.native
      def contains: IsMatch = js.native
      inline def contains_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contains")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "DataList.defaultProps.filterOperators.endwith")
      @js.native
      def endwith: IsMatch = js.native
      inline def endwith_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endwith")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "DataList.defaultProps.filterOperators.equal")
      @js.native
      def equal: IsMatch = js.native
      inline def equal_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("equal")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "DataList.defaultProps.filterOperators.greater")
      @js.native
      def greater: IsMatch = js.native
      inline def greater_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("greater")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "DataList.defaultProps.filterOperators.greaterorequal")
      @js.native
      def greaterorequal: IsMatch = js.native
      inline def greaterorequal_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("greaterorequal")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "DataList.defaultProps.filterOperators.less")
      @js.native
      def less: IsMatch = js.native
      inline def less_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("less")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "DataList.defaultProps.filterOperators.lessorequal")
      @js.native
      def lessorequal: IsMatch = js.native
      inline def lessorequal_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lessorequal")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "DataList.defaultProps.filterOperators.nofilter")
      @js.native
      def nofilter: IsMatch = js.native
      inline def nofilter_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nofilter")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "DataList.defaultProps.filterOperators.notequal")
      @js.native
      def notequal: IsMatch = js.native
      inline def notequal_=(x: IsMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notequal")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("rc-easyui", "DataList.defaultProps.filterPosition")
    @js.native
    val filterPosition: String = js.native
    
    @JSImport("rc-easyui", "DataList.defaultProps.filterRules")
    @js.native
    val filterRules: js.Array[Any] = js.native
    
    @JSImport("rc-easyui", "DataList.defaultProps.filterable")
    @js.native
    val filterable: Boolean = js.native
    
    @JSImport("rc-easyui", "DataList.defaultProps.hoverCls")
    @js.native
    val hoverCls: String = js.native
    
    @JSImport("rc-easyui", "DataList.defaultProps.lazy")
    @js.native
    val `lazy`: Boolean = js.native
    
    @JSImport("rc-easyui", "DataList.defaultProps.loading")
    @js.native
    val loading: Boolean = js.native
    
    inline def onCellClick(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCellClick")().asInstanceOf[Unit]
    
    inline def onCellDblClick(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCellDblClick")().asInstanceOf[Unit]
    
    inline def onCellSelect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCellSelect")().asInstanceOf[Unit]
    
    inline def onCellUnselect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCellUnselect")().asInstanceOf[Unit]
    
    inline def onFilterChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFilterChange")().asInstanceOf[Unit]
    
    inline def onListScroll(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onListScroll")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onPageChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPageChange")().asInstanceOf[Unit]
    
    inline def onRowClick(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowClick")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onRowDblClick(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowDblClick")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onRowSelect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowSelect")().asInstanceOf[Unit]
    
    inline def onRowUnselect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRowUnselect")().asInstanceOf[Unit]
    
    inline def onSelectionChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSelectionChange")().asInstanceOf[Unit]
    
    @JSImport("rc-easyui", "DataList.defaultProps.pageNumber")
    @js.native
    val pageNumber: Double = js.native
    
    @JSImport("rc-easyui", "DataList.defaultProps.pagePosition")
    @js.native
    val pagePosition: String = js.native
    
    @JSImport("rc-easyui", "DataList.defaultProps.pageSize")
    @js.native
    val pageSize: Double = js.native
    
    @JSImport("rc-easyui", "DataList.defaultProps.pagination")
    @js.native
    val pagination: Boolean = js.native
    
    @JSImport("rc-easyui", "DataList.defaultProps.rowHeight")
    @js.native
    val rowHeight: Double = js.native
    
    @JSImport("rc-easyui", "DataList.defaultProps.selectedCls")
    @js.native
    val selectedCls: String = js.native
    
    @JSImport("rc-easyui", "DataList.defaultProps.total")
    @js.native
    val total: Double = js.native
    
    @JSImport("rc-easyui", "DataList.defaultProps.virtualScroll")
    @js.native
    val virtualScroll: Boolean = js.native
  }
  
  object propTypes {
    
    object border {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.border")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.border
      @JSImport("rc-easyui", "DataList.propTypes.border.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object data {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.data")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.data
      @JSImport("rc-easyui", "DataList.propTypes.data.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object filterBtnPosition {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.filterBtnPosition")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.filterBtnPosition
      @JSImport("rc-easyui", "DataList.propTypes.filterBtnPosition.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object filterDelay {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.filterDelay")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.filterDelay
      @JSImport("rc-easyui", "DataList.propTypes.filterDelay.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object filterMatchingType {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.filterMatchingType")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.filterMatchingType
      @JSImport("rc-easyui", "DataList.propTypes.filterMatchingType.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object filterOperators {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.filterOperators")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.filterOperators
      @JSImport("rc-easyui", "DataList.propTypes.filterOperators.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object filterPosition {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.filterPosition")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.filterPosition
      @JSImport("rc-easyui", "DataList.propTypes.filterPosition.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object filterRules {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.filterRules")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.filterRules
      @JSImport("rc-easyui", "DataList.propTypes.filterRules.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object filterable {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.filterable")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.filterable
      @JSImport("rc-easyui", "DataList.propTypes.filterable.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object hoverCls {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.hoverCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.hoverCls
      @JSImport("rc-easyui", "DataList.propTypes.hoverCls.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object idField {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.idField")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.idField
      @JSImport("rc-easyui", "DataList.propTypes.idField.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object itemCls {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.itemCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.itemCls
      @JSImport("rc-easyui", "DataList.propTypes.itemCls.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object itemStyle {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.itemStyle")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.itemStyle
      @JSImport("rc-easyui", "DataList.propTypes.itemStyle.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object `lazy` {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.lazy")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.lazy
      @JSImport("rc-easyui", "DataList.propTypes.lazy.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object loadMsg {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.loadMsg")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.loadMsg
      @JSImport("rc-easyui", "DataList.propTypes.loadMsg.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object loading {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.loading")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.loading
      @JSImport("rc-easyui", "DataList.propTypes.loading.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object onListScroll {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.onListScroll")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.onListScroll
      @JSImport("rc-easyui", "DataList.propTypes.onListScroll.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object pageNumber {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.pageNumber")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.pageNumber
      @JSImport("rc-easyui", "DataList.propTypes.pageNumber.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object pageOptions {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.pageOptions")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.pageOptions
      @JSImport("rc-easyui", "DataList.propTypes.pageOptions.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object pagePosition {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.pagePosition")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.pagePosition
      @JSImport("rc-easyui", "DataList.propTypes.pagePosition.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object pageSize {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.pageSize")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.pageSize
      @JSImport("rc-easyui", "DataList.propTypes.pageSize.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object pagination {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.pagination")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.pagination
      @JSImport("rc-easyui", "DataList.propTypes.pagination.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object renderItem {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.renderItem")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.renderItem
      @JSImport("rc-easyui", "DataList.propTypes.renderItem.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object rowHeight {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.rowHeight")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.rowHeight
      @JSImport("rc-easyui", "DataList.propTypes.rowHeight.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object scrollPosition {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.scrollPosition")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.scrollPosition
      @JSImport("rc-easyui", "DataList.propTypes.scrollPosition.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object selectedCls {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.selectedCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.selectedCls
      @JSImport("rc-easyui", "DataList.propTypes.selectedCls.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object selection {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.selection")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.selection
      @JSImport("rc-easyui", "DataList.propTypes.selection.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object selectionMode {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.selectionMode")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.selectionMode
      @JSImport("rc-easyui", "DataList.propTypes.selectionMode.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object total {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.total")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.total
      @JSImport("rc-easyui", "DataList.propTypes.total.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object virtualScroll {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "DataList.propTypes.virtualScroll")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.DataList.propTypes.virtualScroll
      @JSImport("rc-easyui", "DataList.propTypes.virtualScroll.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
}
