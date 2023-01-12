package typings.reactBootstrapTable2Paginator

import typings.react.mod.ReactElement
import typings.reactBootstrapTable2Paginator.mod.PaginationChildProps
import typings.reactBootstrapTable2Paginator.mod.PaginationCtxOptions
import typings.reactBootstrapTableNext.mod.BootstrapTableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    def children(childProps: PaginationProps): ReactElement | Null
    
    var pagination: js.UndefOr[PaginationCtxOptions] = js.undefined
  }
  object Children {
    
    inline def apply(children: PaginationProps => ReactElement | Null): Children = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: PaginationProps => ReactElement | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setPagination(value: PaginationCtxOptions): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    }
  }
  
  trait PaginationProps extends StObject {
    
    var paginationProps: PaginationChildProps
    
    var paginationTableProps: BootstrapTableProps[Any, Double]
  }
  object PaginationProps {
    
    inline def apply(paginationProps: PaginationChildProps, paginationTableProps: BootstrapTableProps[Any, Double]): PaginationProps = {
      val __obj = js.Dynamic.literal(paginationProps = paginationProps.asInstanceOf[js.Any], paginationTableProps = paginationTableProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaginationProps] (val x: Self) extends AnyVal {
      
      inline def setPaginationProps(value: PaginationChildProps): Self = StObject.set(x, "paginationProps", value.asInstanceOf[js.Any])
      
      inline def setPaginationTableProps(value: BootstrapTableProps[Any, Double]): Self = StObject.set(x, "paginationTableProps", value.asInstanceOf[js.Any])
    }
  }
}
