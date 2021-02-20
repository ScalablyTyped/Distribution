package typings.primereact

import typings.primereact.anon.OptionOriginalEvent
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listBoxItemMod {
  
  @JSImport("primereact/components/listbox/ListBoxItem", "ListBoxItem")
  @js.native
  class ListBoxItem protected ()
    extends Component[ListBoxItemProps, js.Any, js.Any] {
    def this(props: ListBoxItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ListBoxItemProps, context: js.Any) = this()
  }
  
  @js.native
  trait ListBoxItemProps extends StObject {
    
    var onClick: js.UndefOr[js.Function1[/* e */ OptionOriginalEvent, Unit]] = js.native
    
    var onTouchEnd: js.UndefOr[js.Function1[/* e */ OptionOriginalEvent, Unit]] = js.native
    
    var option: js.UndefOr[js.Any] = js.native
    
    var selected: js.UndefOr[Boolean] = js.native
    
    var template: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.native
  }
  object ListBoxItemProps {
    
    @scala.inline
    def apply(): ListBoxItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListBoxItemProps]
    }
    
    @scala.inline
    implicit class ListBoxItemPropsMutableBuilder[Self <: ListBoxItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: /* e */ OptionOriginalEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: /* e */ OptionOriginalEvent => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOption(value: js.Any): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setTemplate(value: /* item */ js.Any => js.UndefOr[Element]): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
}
