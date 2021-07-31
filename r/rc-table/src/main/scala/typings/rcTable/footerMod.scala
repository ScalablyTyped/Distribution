package typings.rcTable

import typings.rcTable.footerCellMod.SummaryCellProps
import typings.rcTable.rowMod.FooterRowProps
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object footerMod {
  
  @JSImport("rc-table/lib/Footer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasChildren: FooterProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object FooterComponents {
    
    @JSImport("rc-table/lib/Footer", "FooterComponents")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-table/lib/Footer", "FooterComponents.Cell")
    @js.native
    def Cell: js.Function1[/* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps, Element] = js.native
    @scala.inline
    def Cell_=(x: js.Function1[/* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cell")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-table/lib/Footer", "FooterComponents.Row")
    @js.native
    def Row: js.Function1[/* props */ FooterRowProps, Element] = js.native
    @scala.inline
    def Row_=(x: js.Function1[/* props */ FooterRowProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Row")(x.asInstanceOf[js.Any])
  }
  
  trait FooterProps extends StObject {
    
    var children: ReactNode
  }
  object FooterProps {
    
    @scala.inline
    def apply(): FooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FooterProps]
    }
    
    @scala.inline
    implicit class FooterPropsMutableBuilder[Self <: FooterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
