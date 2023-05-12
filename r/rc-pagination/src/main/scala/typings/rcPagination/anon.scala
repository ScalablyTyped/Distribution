package typings.rcPagination

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait GoInputText extends StObject {
    
    var goInputText: String
  }
  object GoInputText {
    
    inline def apply(goInputText: String): GoInputText = {
      val __obj = js.Dynamic.literal(goInputText = goInputText.asInstanceOf[js.Any])
      __obj.asInstanceOf[GoInputText]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GoInputText] (val x: Self) extends AnyVal {
      
      inline def setGoInputText(value: String): Self = StObject.set(x, "goInputText", value.asInstanceOf[js.Any])
    }
  }
  
  trait Itemsperpage extends StObject {
    
    var items_per_page: String
    
    var jump_to: String
    
    var jump_to_confirm: String
    
    var next_3: String
    
    var next_5: String
    
    var next_page: String
    
    var page: String
    
    var page_size: String
    
    var prev_3: String
    
    var prev_5: String
    
    var prev_page: String
  }
  object Itemsperpage {
    
    inline def apply(
      items_per_page: String,
      jump_to: String,
      jump_to_confirm: String,
      next_3: String,
      next_5: String,
      next_page: String,
      page: String,
      page_size: String,
      prev_3: String,
      prev_5: String,
      prev_page: String
    ): Itemsperpage = {
      val __obj = js.Dynamic.literal(items_per_page = items_per_page.asInstanceOf[js.Any], jump_to = jump_to.asInstanceOf[js.Any], jump_to_confirm = jump_to_confirm.asInstanceOf[js.Any], next_3 = next_3.asInstanceOf[js.Any], next_5 = next_5.asInstanceOf[js.Any], next_page = next_page.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], prev_3 = prev_3.asInstanceOf[js.Any], prev_5 = prev_5.asInstanceOf[js.Any], prev_page = prev_page.asInstanceOf[js.Any])
      __obj.asInstanceOf[Itemsperpage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Itemsperpage] (val x: Self) extends AnyVal {
      
      inline def setItems_per_page(value: String): Self = StObject.set(x, "items_per_page", value.asInstanceOf[js.Any])
      
      inline def setJump_to(value: String): Self = StObject.set(x, "jump_to", value.asInstanceOf[js.Any])
      
      inline def setJump_to_confirm(value: String): Self = StObject.set(x, "jump_to_confirm", value.asInstanceOf[js.Any])
      
      inline def setNext_3(value: String): Self = StObject.set(x, "next_3", value.asInstanceOf[js.Any])
      
      inline def setNext_5(value: String): Self = StObject.set(x, "next_5", value.asInstanceOf[js.Any])
      
      inline def setNext_page(value: String): Self = StObject.set(x, "next_page", value.asInstanceOf[js.Any])
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: String): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrev_3(value: String): Self = StObject.set(x, "prev_3", value.asInstanceOf[js.Any])
      
      inline def setPrev_5(value: String): Self = StObject.set(x, "prev_5", value.asInstanceOf[js.Any])
      
      inline def setPrev_page(value: String): Self = StObject.set(x, "prev_page", value.asInstanceOf[js.Any])
    }
  }
  
  trait Option extends StObject {
    
    var Option: js.UndefOr[ComponentType[Any]] = js.undefined
  }
  object Option {
    
    inline def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      inline def setOption(value: ComponentType[Any]): Self = StObject.set(x, "Option", value.asInstanceOf[js.Any])
      
      inline def setOptionUndefined: Self = StObject.set(x, "Option", js.undefined)
    }
  }
  
  /* Inlined std.Partial<rc-pagination.rc-pagination/lib/Pagination.PaginationState> */
  trait PartialPaginationState extends StObject {
    
    var current: js.UndefOr[Double] = js.undefined
    
    var currentInputValue: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object PartialPaginationState {
    
    inline def apply(): PartialPaginationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPaginationState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialPaginationState] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentInputValue(value: Double): Self = StObject.set(x, "currentInputValue", value.asInstanceOf[js.Any])
      
      inline def setCurrentInputValueUndefined: Self = StObject.set(x, "currentInputValue", js.undefined)
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
}
