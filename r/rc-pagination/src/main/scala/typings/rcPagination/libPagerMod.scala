package typings.rcPagination

import org.scalablytyped.runtime.Shortcut
import typings.rcPagination.rcPaginationStrings.`jump-next`
import typings.rcPagination.rcPaginationStrings.`jump-prev`
import typings.rcPagination.rcPaginationStrings.next
import typings.rcPagination.rcPaginationStrings.page
import typings.rcPagination.rcPaginationStrings.prev
import typings.react.mod.FC
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactNode
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPagerMod extends Shortcut {
  
  @JSImport("rc-pagination/lib/Pager", JSImport.Default)
  @js.native
  val default: FC[Props] = js.native
  
  trait Props extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var itemRender: js.UndefOr[
        js.Function3[
          /* page */ Double, 
          /* type */ page | prev | next | `jump-prev` | `jump-next`, 
          /* element */ ReactNode, 
          ReactNode
        ]
      ] = js.undefined
    
    var last: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[Any] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* page */ Double, Unit]] = js.undefined
    
    var onKeyPress: js.UndefOr[
        js.Function3[
          /* e */ KeyboardEvent[HTMLLIElement], 
          /* onClick */ js.UndefOr[js.Function1[/* page */ Double, Unit]], 
          /* page */ Double, 
          Unit
        ]
      ] = js.undefined
    
    var page: Double
    
    var rootPrefixCls: String
    
    var showTitle: Boolean
  }
  object Props {
    
    inline def apply(page: Double, rootPrefixCls: String, showTitle: Boolean): Props = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], rootPrefixCls = rootPrefixCls.asInstanceOf[js.Any], showTitle = showTitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setItemRender(
        value: (/* page */ Double, /* type */ page | prev | next | `jump-prev` | `jump-next`, /* element */ ReactNode) => ReactNode
      ): Self = StObject.set(x, "itemRender", js.Any.fromFunction3(value))
      
      inline def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
      
      inline def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setOnClick(value: /* page */ Double => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnKeyPress(
        value: (/* e */ KeyboardEvent[HTMLLIElement], /* onClick */ js.UndefOr[js.Function1[/* page */ Double, Unit]], /* page */ Double) => Unit
      ): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction3(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setRootPrefixCls(value: String): Self = StObject.set(x, "rootPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[Props]
  
  /* This means you don't have to write `default`, but can instead just say `libPagerMod.foo` */
  override def _to: FC[Props] = default
}
