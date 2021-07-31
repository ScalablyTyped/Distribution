package typings.rcTable

import typings.rcTable.interfaceMod.AlignType
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object footerCellMod {
  
  @JSImport("rc-table/lib/Footer/Cell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasClassNameIndexChildrenColSpanRowSpanAlign: SummaryCellProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasClassNameIndexChildrenColSpanRowSpanAlign.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait SummaryCellProps extends StObject {
    
    var align: js.UndefOr[AlignType] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var colSpan: js.UndefOr[Double] = js.undefined
    
    var index: Double
    
    var rowSpan: js.UndefOr[Double] = js.undefined
  }
  object SummaryCellProps {
    
    @scala.inline
    def apply(index: Double): SummaryCellProps = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[SummaryCellProps]
    }
    
    @scala.inline
    implicit class SummaryCellPropsMutableBuilder[Self <: SummaryCellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
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
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    }
  }
}
