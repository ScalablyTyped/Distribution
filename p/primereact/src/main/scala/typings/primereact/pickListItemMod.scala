package typings.primereact

import typings.primereact.anon.Value
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickListItemMod {
  
  @JSImport("primereact/components/picklist/PickListItem", "PickListItem")
  @js.native
  class PickListItem protected ()
    extends Component[PickListItemProps, js.Any, js.Any] {
    def this(props: PickListItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PickListItemProps, context: js.Any) = this()
  }
  
  trait PickListItemProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var template: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.undefined
    
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object PickListItemProps {
    
    @scala.inline
    def apply(): PickListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickListItemProps]
    }
    
    @scala.inline
    implicit class PickListItemPropsMutableBuilder[Self <: PickListItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ Value => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setTemplate(value: /* item */ js.Any => js.UndefOr[Element]): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
