package typings.reactBootstrapTable2Paginator

import typings.react.mod.ReactElement
import typings.reactBootstrapTable2Paginator.mod.PaginationChildProps
import typings.reactBootstrapTable2Paginator.mod.PaginationCtxOptions
import typings.reactBootstrapTableNext.mod.BootstrapTableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Children extends StObject {
    
    def children(childProps: PaginationProps): ReactElement | Null = js.native
    
    var pagination: js.UndefOr[PaginationCtxOptions] = js.native
  }
  object Children {
    
    @scala.inline
    def apply(children: PaginationProps => ReactElement | Null): Children = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: PaginationProps => ReactElement | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPagination(value: PaginationCtxOptions): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    }
  }
  
  @js.native
  trait PaginationProps extends StObject {
    
    var paginationProps: PaginationChildProps = js.native
    
    var paginationTableProps: BootstrapTableProps[_, Double] = js.native
  }
  object PaginationProps {
    
    @scala.inline
    def apply(paginationProps: PaginationChildProps, paginationTableProps: BootstrapTableProps[_, Double]): PaginationProps = {
      val __obj = js.Dynamic.literal(paginationProps = paginationProps.asInstanceOf[js.Any], paginationTableProps = paginationTableProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationProps]
    }
    
    @scala.inline
    implicit class PaginationPropsMutableBuilder[Self <: PaginationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPaginationProps(value: PaginationChildProps): Self = StObject.set(x, "paginationProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationTableProps(value: BootstrapTableProps[_, Double]): Self = StObject.set(x, "paginationTableProps", value.asInstanceOf[js.Any])
    }
  }
}
