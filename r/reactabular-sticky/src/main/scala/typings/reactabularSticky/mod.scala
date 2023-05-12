package typings.reactabularSticky

import typings.react.mod.Component
import typings.reactabularSticky.anon.PartialUIEvent
import typings.reactabularTable.mod.BodyProps
import typings.reactabularTable.mod.HeaderProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reactabular-sticky", "Body")
  @js.native
  open class Body protected ()
    extends Component[StickyBodyProps & BodyProps, js.Object, Any] {
    def this(props: StickyBodyProps & BodyProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: StickyBodyProps & BodyProps, context: Any) = this()
    
    var ref: HTMLElement = js.native
  }
  
  @JSImport("reactabular-sticky", "Header")
  @js.native
  open class Header protected ()
    extends Component[StickyHeaderProps & HeaderProps, js.Object, Any] {
    def this(props: StickyHeaderProps & HeaderProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: StickyHeaderProps & HeaderProps, context: Any) = this()
    
    var container: HTMLElement = js.native
    
    var ref: HTMLElement = js.native
  }
  
  trait StickyBodyProps extends StObject {
    
    var onScroll: js.UndefOr[js.Function1[/* e */ PartialUIEvent, Unit]] = js.undefined
    
    var tableHeader: HTMLElement | Null
  }
  object StickyBodyProps {
    
    inline def apply(): StickyBodyProps = {
      val __obj = js.Dynamic.literal(tableHeader = null)
      __obj.asInstanceOf[StickyBodyProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StickyBodyProps] (val x: Self) extends AnyVal {
      
      inline def setOnScroll(value: /* e */ PartialUIEvent => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setTableHeader(value: HTMLElement): Self = StObject.set(x, "tableHeader", value.asInstanceOf[js.Any])
      
      inline def setTableHeaderNull: Self = StObject.set(x, "tableHeader", null)
    }
  }
  
  trait StickyHeaderProps extends StObject {
    
    var onScroll: js.UndefOr[js.Function1[/* e */ PartialUIEvent, Unit]] = js.undefined
    
    var tableBody: HTMLElement | Null
  }
  object StickyHeaderProps {
    
    inline def apply(): StickyHeaderProps = {
      val __obj = js.Dynamic.literal(tableBody = null)
      __obj.asInstanceOf[StickyHeaderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StickyHeaderProps] (val x: Self) extends AnyVal {
      
      inline def setOnScroll(value: /* e */ PartialUIEvent => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setTableBody(value: HTMLElement): Self = StObject.set(x, "tableBody", value.asInstanceOf[js.Any])
      
      inline def setTableBodyNull: Self = StObject.set(x, "tableBody", null)
    }
  }
}
