package typings.primereact

import typings.primereact.anon.Option
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownItemMod {
  
  @JSImport("primereact/components/dropdown/DropdownItem", "DropdownItem")
  @js.native
  class DropdownItem protected ()
    extends Component[DropdownItemProps, js.Any, js.Any] {
    def this(props: DropdownItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DropdownItemProps, context: js.Any) = this()
  }
  
  trait DropdownItemProps extends StObject {
    
    var onClick: js.UndefOr[js.Function1[/* e */ Option, Unit]] = js.undefined
    
    var option: js.UndefOr[js.Object] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var template: js.UndefOr[js.Function1[/* option */ js.Any, js.UndefOr[Element]]] = js.undefined
  }
  object DropdownItemProps {
    
    @scala.inline
    def apply(): DropdownItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownItemProps]
    }
    
    @scala.inline
    implicit class DropdownItemPropsMutableBuilder[Self <: DropdownItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: /* e */ Option => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOption(value: js.Object): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setTemplate(value: /* option */ js.Any => js.UndefOr[Element]): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
}
