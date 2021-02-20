package typings.primereact

import typings.primereact.anon.Value
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listBoxHeaderMod {
  
  @JSImport("primereact/components/listbox/ListBoxHeader", "ListBoxHeader")
  @js.native
  class ListBoxHeader protected ()
    extends Component[ListBoxHeaderProps, js.Any, js.Any] {
    def this(props: ListBoxHeaderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ListBoxHeaderProps, context: js.Any) = this()
  }
  
  @js.native
  trait ListBoxHeaderProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var filter: js.UndefOr[String] = js.native
    
    var onFilter: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  }
  object ListBoxHeaderProps {
    
    @scala.inline
    def apply(): ListBoxHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListBoxHeaderProps]
    }
    
    @scala.inline
    implicit class ListBoxHeaderPropsMutableBuilder[Self <: ListBoxHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setOnFilter(value: /* e */ Value => Unit): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
    }
  }
}
