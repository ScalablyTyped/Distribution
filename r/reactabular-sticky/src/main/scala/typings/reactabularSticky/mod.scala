package typings.reactabularSticky

import typings.react.mod.Component
import typings.reactabularSticky.anon.PartialUIEvent
import typings.reactabularTable.mod.BodyProps
import typings.reactabularTable.mod.HeaderProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reactabular-sticky", "Body")
  @js.native
  class Body protected ()
    extends Component[StickyBodyProps with BodyProps, js.Object, js.Any] {
    def this(props: StickyBodyProps with BodyProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StickyBodyProps with BodyProps, context: js.Any) = this()
    
    var ref: HTMLElement = js.native
  }
  
  @JSImport("reactabular-sticky", "Header")
  @js.native
  class Header protected ()
    extends Component[StickyHeaderProps with HeaderProps, js.Object, js.Any] {
    def this(props: StickyHeaderProps with HeaderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StickyHeaderProps with HeaderProps, context: js.Any) = this()
    
    var container: HTMLElement = js.native
    
    var ref: HTMLElement = js.native
  }
  
  @js.native
  trait StickyBodyProps extends StObject {
    
    var onScroll: js.UndefOr[js.Function1[/* e */ PartialUIEvent, Unit]] = js.native
    
    var tableHeader: HTMLElement | Null = js.native
  }
  object StickyBodyProps {
    
    @scala.inline
    def apply(): StickyBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StickyBodyProps]
    }
    
    @scala.inline
    implicit class StickyBodyPropsMutableBuilder[Self <: StickyBodyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnScroll(value: /* e */ PartialUIEvent => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setTableHeader(value: HTMLElement): Self = StObject.set(x, "tableHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeaderNull: Self = StObject.set(x, "tableHeader", null)
    }
  }
  
  @js.native
  trait StickyHeaderProps extends StObject {
    
    var onScroll: js.UndefOr[js.Function1[/* e */ PartialUIEvent, Unit]] = js.native
    
    var tableBody: HTMLElement | Null = js.native
  }
  object StickyHeaderProps {
    
    @scala.inline
    def apply(): StickyHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StickyHeaderProps]
    }
    
    @scala.inline
    implicit class StickyHeaderPropsMutableBuilder[Self <: StickyHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnScroll(value: /* e */ PartialUIEvent => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setTableBody(value: HTMLElement): Self = StObject.set(x, "tableBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableBodyNull: Self = StObject.set(x, "tableBody", null)
    }
  }
}
