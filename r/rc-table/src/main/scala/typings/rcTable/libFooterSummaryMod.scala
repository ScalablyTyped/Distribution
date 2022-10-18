package typings.rcTable

import typings.rcTable.libFooterCellMod.SummaryCellProps
import typings.rcTable.libFooterRowMod.FooterRowProps
import typings.rcTable.rcTableStrings.bottom
import typings.rcTable.rcTableStrings.top
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFooterSummaryMod {
  
  object default {
    
    /**
      * Syntactic sugar. Do not support HOC.
      */
    inline def apply(hasChildren: SummaryProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("rc-table/lib/Footer/Summary", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof imported_Cell.default` */
    inline def Cell(hasClassNameIndexChildrenColSpanRowSpanAlign: SummaryCellProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Cell")(hasClassNameIndexChildrenColSpanRowSpanAlign.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    /* was `typeof imported_Row.default` */
    inline def Row(hasChildrenProps: FooterRowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Row")(hasChildrenProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  }
  
  trait SummaryProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var fixed: js.UndefOr[Boolean | top | bottom] = js.undefined
  }
  object SummaryProps {
    
    inline def apply(): SummaryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SummaryProps]
    }
    
    extension [Self <: SummaryProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFixed(value: Boolean | top | bottom): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    }
  }
}
