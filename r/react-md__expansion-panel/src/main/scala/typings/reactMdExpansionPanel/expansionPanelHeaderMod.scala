package typings.reactMdExpansionPanel

import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expansionPanelHeaderMod {
  
  @JSImport("@react-md/expansion-panel/types/ExpansionPanelHeader", "ExpansionPanelHeader")
  @js.native
  val ExpansionPanelHeader: ForwardRefExoticComponent[ExpansionPanelHeaderProps with RefAttributes[HTMLButtonElement]] = js.native
  
  @js.native
  trait ExpansionPanelHeaderProps extends ButtonHTMLAttributes[HTMLButtonElement] {
    
    /**
      * The children to display within the header.
      *
      * Reminder: Since this is a `<button>`, only `inline` elements should be
      * rendered within (so use `<span>` instead of `<div>` for children).
      */
    @JSName("children")
    var children_ExpansionPanelHeaderProps: ReactNode = js.native
    
    /**
      * Boolean if the icon rotation transition should be disabled.
      */
    var disableTransition: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the panel is currently expanded. This is just used to rotate the
      * icon as needed.
      */
    var expanded: Boolean = js.native
    
    /**
      * The icon to use for the expander icon.
      */
    var icon: js.UndefOr[ReactNode] = js.native
    
    /**
      * The id for the header. This is required for a11y.
      */
    @JSName("id")
    var id_ExpansionPanelHeaderProps: String = js.native
    
    /**
      * The click handler that should attempt to toggle the expansion state of the
      * panel.
      */
    @JSName("onClick")
    var onClick_ExpansionPanelHeaderProps: MouseEventHandler[HTMLButtonElement] = js.native
  }
  object ExpansionPanelHeaderProps {
    
    @scala.inline
    def apply(expanded: Boolean, id: String, onClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): ExpansionPanelHeaderProps = {
      val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
      __obj.asInstanceOf[ExpansionPanelHeaderProps]
    }
    
    @scala.inline
    implicit class ExpansionPanelHeaderPropsMutableBuilder[Self <: ExpansionPanelHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisableTransition(value: Boolean): Self = StObject.set(x, "disableTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableTransitionUndefined: Self = StObject.set(x, "disableTransition", js.undefined)
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    }
  }
}
