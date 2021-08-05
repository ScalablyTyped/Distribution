package typings.primereact

import typings.primereact.anon.OptionOriginalEvent
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  trait ListBoxItemProps extends StObject {
    
    var onClick: js.UndefOr[js.Function1[/* e */ OptionOriginalEvent, Unit]] = js.undefined
    
    var onTouchEnd: js.UndefOr[js.Function1[/* e */ OptionOriginalEvent, Unit]] = js.undefined
    
    var option: js.UndefOr[js.Any] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var template: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.undefined
  }
  object ListBoxItemProps {
    
    inline def apply(): ListBoxItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListBoxItemProps]
    }
    
    extension [Self <: ListBoxItemProps](x: Self) {
      
      inline def setOnClick(value: /* e */ OptionOriginalEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnTouchEnd(value: /* e */ OptionOriginalEvent => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOption(value: js.Any): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setTemplate(value: /* item */ js.Any => js.UndefOr[Element]): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
}
