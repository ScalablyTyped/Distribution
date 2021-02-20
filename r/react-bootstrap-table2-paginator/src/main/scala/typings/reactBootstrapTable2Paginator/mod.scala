package typings.reactBootstrapTable2Paginator

import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.reactBootstrapTable2Paginator.anon.Children
import typings.reactBootstrapTable2Paginator.reactBootstrapTable2PaginatorStrings.dropdown
import typings.reactBootstrapTable2Paginator.reactBootstrapTable2PaginatorStrings.dropup
import typings.reactBootstrapTableNext.mod.PaginationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * declaration for table pagination sub module and factory
    */
  @JSImport("react-bootstrap-table2-paginator", JSImport.Default)
  @js.native
  def default(options: PaginationOptions): PaginationCtxOptions = js.native
  
  @JSImport("react-bootstrap-table2-paginator", "PaginationListStandalone")
  @js.native
  val PaginationListStandalone: FC[PaginationChildProps] = js.native
  
  @JSImport("react-bootstrap-table2-paginator", "PaginationProvider")
  @js.native
  def PaginationProvider(props: Children): ReactElement | Null = js.native
  
  @JSImport("react-bootstrap-table2-paginator", "PaginationTotalStandalone")
  @js.native
  val PaginationTotalStandalone: FC[PaginationChildProps] = js.native
  
  @JSImport("react-bootstrap-table2-paginator", "SizePerPageDropdownStandalone")
  @js.native
  val SizePerPageDropdownStandalone: FC[SizePerPageDropdownStandaloneProps] = js.native
  
  @js.native
  trait PaginationChildProps extends PaginationOptions {
    
    var bootstrap4: js.UndefOr[Boolean] = js.native
    
    var tableId: js.UndefOr[String] = js.native
  }
  object PaginationChildProps {
    
    @scala.inline
    def apply(): PaginationChildProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationChildProps]
    }
    
    @scala.inline
    implicit class PaginationChildPropsMutableBuilder[Self <: PaginationChildProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBootstrap4(value: Boolean): Self = StObject.set(x, "bootstrap4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBootstrap4Undefined: Self = StObject.set(x, "bootstrap4", js.undefined)
      
      @scala.inline
      def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
    }
  }
  
  @js.native
  trait PaginationCtxOptions extends StObject {
    
    var options: js.UndefOr[PaginationOptions] = js.native
  }
  object PaginationCtxOptions {
    
    @scala.inline
    def apply(): PaginationCtxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationCtxOptions]
    }
    
    @scala.inline
    implicit class PaginationCtxOptionsMutableBuilder[Self <: PaginationCtxOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: PaginationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  @js.native
  trait SizePerPageDropdownStandaloneProps extends PaginationChildProps {
    
    var btnContextual: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var variation: js.UndefOr[dropdown | dropup] = js.native
  }
  object SizePerPageDropdownStandaloneProps {
    
    @scala.inline
    def apply(): SizePerPageDropdownStandaloneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizePerPageDropdownStandaloneProps]
    }
    
    @scala.inline
    implicit class SizePerPageDropdownStandalonePropsMutableBuilder[Self <: SizePerPageDropdownStandaloneProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBtnContextual(value: Boolean): Self = StObject.set(x, "btnContextual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBtnContextualUndefined: Self = StObject.set(x, "btnContextual", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setVariation(value: dropdown | dropup): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariationUndefined: Self = StObject.set(x, "variation", js.undefined)
    }
  }
}
