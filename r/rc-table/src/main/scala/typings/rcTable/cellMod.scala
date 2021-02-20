package typings.rcTable

import org.scalablytyped.runtime.Shortcut
import typings.rcTable.interfaceMod.AlignType
import typings.rcTable.interfaceMod.CellEllipsisType
import typings.rcTable.interfaceMod.CustomizeComponent
import typings.rcTable.interfaceMod.DataIndex
import typings.rcTable.interfaceMod.DefaultRecordType
import typings.rcTable.interfaceMod.RenderedCell
import typings.rcTable.rcTableBooleans.`false`
import typings.rcTable.rcTableStrings.body
import typings.rcTable.rcTableStrings.footer
import typings.rcTable.rcTableStrings.header
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.MemoExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellMod extends Shortcut {
  
  @JSImport("rc-table/lib/Cell", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[ForwardRefExoticComponent[CellProps[_] with RefAttributes[_]]] = js.native
  
  @js.native
  trait CellProps[RecordType /* <: DefaultRecordType */] extends StObject {
    
    var additionalProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.native
    
    var align: js.UndefOr[AlignType] = js.native
    
    /** @private Used for `expandable` with nest tree */
    var appendNode: js.UndefOr[ReactNode] = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var colSpan: js.UndefOr[Double] = js.native
    
    var component: js.UndefOr[CustomizeComponent] = js.native
    
    var dataIndex: js.UndefOr[DataIndex] = js.native
    
    var ellipsis: js.UndefOr[CellEllipsisType] = js.native
    
    var firstFixLeft: js.UndefOr[Boolean] = js.native
    
    var firstFixRight: js.UndefOr[Boolean] = js.native
    
    var fixLeft: js.UndefOr[Double | `false`] = js.native
    
    var fixRight: js.UndefOr[Double | `false`] = js.native
    
    /** `record` index. Not `column` index. */
    var index: js.UndefOr[Double] = js.native
    
    var isSticky: js.UndefOr[Boolean] = js.native
    
    var lastFixLeft: js.UndefOr[Boolean] = js.native
    
    var lastFixRight: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var record: js.UndefOr[RecordType] = js.native
    
    var render: js.UndefOr[
        js.Function3[
          /* value */ js.Any, 
          /* record */ RecordType, 
          /* index */ Double, 
          ReactNode | RenderedCell[RecordType]
        ]
      ] = js.native
    
    var rowSpan: js.UndefOr[Double] = js.native
    
    var rowType: js.UndefOr[header | body | footer] = js.native
    
    var shouldCellUpdate: js.UndefOr[js.Function2[/* record */ RecordType, /* prevRecord */ RecordType, Boolean]] = js.native
  }
  object CellProps {
    
    @scala.inline
    def apply[RecordType /* <: DefaultRecordType */](): CellProps[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellProps[RecordType]]
    }
    
    @scala.inline
    implicit class CellPropsMutableBuilder[Self <: CellProps[_], RecordType /* <: DefaultRecordType */] (val x: Self with CellProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setAdditionalProps(value: HTMLAttributes[HTMLElement]): Self = StObject.set(x, "additionalProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalPropsUndefined: Self = StObject.set(x, "additionalProps", js.undefined)
      
      @scala.inline
      def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAppendNode(value: ReactNode): Self = StObject.set(x, "appendNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendNodeUndefined: Self = StObject.set(x, "appendNode", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      @scala.inline
      def setComponent(value: CustomizeComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setDataIndex(value: DataIndex): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataIndexUndefined: Self = StObject.set(x, "dataIndex", js.undefined)
      
      @scala.inline
      def setDataIndexVarargs(value: (String | Double)*): Self = StObject.set(x, "dataIndex", js.Array(value :_*))
      
      @scala.inline
      def setEllipsis(value: CellEllipsisType): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      @scala.inline
      def setFirstFixLeft(value: Boolean): Self = StObject.set(x, "firstFixLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstFixLeftUndefined: Self = StObject.set(x, "firstFixLeft", js.undefined)
      
      @scala.inline
      def setFirstFixRight(value: Boolean): Self = StObject.set(x, "firstFixRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstFixRightUndefined: Self = StObject.set(x, "firstFixRight", js.undefined)
      
      @scala.inline
      def setFixLeft(value: Double | `false`): Self = StObject.set(x, "fixLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixLeftUndefined: Self = StObject.set(x, "fixLeft", js.undefined)
      
      @scala.inline
      def setFixRight(value: Double | `false`): Self = StObject.set(x, "fixRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixRightUndefined: Self = StObject.set(x, "fixRight", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStickyUndefined: Self = StObject.set(x, "isSticky", js.undefined)
      
      @scala.inline
      def setLastFixLeft(value: Boolean): Self = StObject.set(x, "lastFixLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastFixLeftUndefined: Self = StObject.set(x, "lastFixLeft", js.undefined)
      
      @scala.inline
      def setLastFixRight(value: Boolean): Self = StObject.set(x, "lastFixRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastFixRightUndefined: Self = StObject.set(x, "lastFixRight", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRecord(value: RecordType): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
      
      @scala.inline
      def setRender(
        value: (/* value */ js.Any, /* record */ RecordType, /* index */ Double) => ReactNode | RenderedCell[RecordType]
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      @scala.inline
      def setRowType(value: header | body | footer): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowTypeUndefined: Self = StObject.set(x, "rowType", js.undefined)
      
      @scala.inline
      def setShouldCellUpdate(value: (/* record */ RecordType, /* prevRecord */ RecordType) => Boolean): Self = StObject.set(x, "shouldCellUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShouldCellUpdateUndefined: Self = StObject.set(x, "shouldCellUpdate", js.undefined)
    }
  }
  
  type _To = MemoExoticComponent[ForwardRefExoticComponent[CellProps[_] with RefAttributes[_]]]
  
  /* This means you don't have to write `default`, but can instead just say `cellMod.foo` */
  override def _to: MemoExoticComponent[ForwardRefExoticComponent[CellProps[_] with RefAttributes[_]]] = default
}
