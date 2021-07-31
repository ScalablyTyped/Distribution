package typings.reactMdExpansionPanel

import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefAttributes
import typings.reactMdCard.cardMod.CardProps
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expansionPanelMod {
  
  @JSImport("@react-md/expansion-panel/types/ExpansionPanel", "ExpansionPanel")
  @js.native
  val ExpansionPanel: ForwardRefExoticComponent[ExpansionPanelProps & RefAttributes[HTMLDivElement]] = js.native
  
  /* Inlined std.Pick<@react-md/card.@react-md/card.CardContentProps, 'disablePadding' | 'disableSecondaryColor' | 'disableParagraphMargin'> */
  trait ConfigurableCardContentProps extends StObject {
    
    var disablePadding: js.UndefOr[Boolean] = js.undefined
    
    var disableParagraphMargin: js.UndefOr[Boolean] = js.undefined
    
    var disableSecondaryColor: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigurableCardContentProps {
    
    @scala.inline
    def apply(): ConfigurableCardContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurableCardContentProps]
    }
    
    @scala.inline
    implicit class ConfigurableCardContentPropsMutableBuilder[Self <: ConfigurableCardContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisablePadding(value: Boolean): Self = StObject.set(x, "disablePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePaddingUndefined: Self = StObject.set(x, "disablePadding", js.undefined)
      
      @scala.inline
      def setDisableParagraphMargin(value: Boolean): Self = StObject.set(x, "disableParagraphMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableParagraphMarginUndefined: Self = StObject.set(x, "disableParagraphMargin", js.undefined)
      
      @scala.inline
      def setDisableSecondaryColor(value: Boolean): Self = StObject.set(x, "disableSecondaryColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSecondaryColorUndefined: Self = StObject.set(x, "disableSecondaryColor", js.undefined)
    }
  }
  
  trait ExpansionPanelProps
    extends StObject
       with CardProps
       with ConfigurableCardContentProps {
    
    /**
      * An optional className to provide the content of the panel.
      */
    var contentClassName: js.UndefOr[String] = js.undefined
    
    /**
      * An optional style to provide to the content of the panel.
      */
    var contentStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * An optional header element to display instead of the default
      * implementation.
      */
    var customHeader: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Boolean if the collapse transition should be disabled for the content
      * within the panel. It is recommended to disable this transition if there is
      * a lot of content within the panel since animating max-height isn't super
      * great since it causes DOM repaints during the entire transition.
      */
    var disableTransition: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if clicking on the header should no longer toggle the expansion
      * state. This will automatically be provided from the `usePanels` hook for
      * when a panel cannot be closed to do preventing all panels from being closed
      * at a time.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the panel is currently expanded.
      */
    var expanded: Boolean
    
    /**
      * An optional expander icon to use within the default header implementation.
      * This defaults to the `"expander"` icon.
      */
    var expanderIcon: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The children to display within the default header element.
      */
    var header: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * An optional className to provide to the default header implementation. If
      * the `header` prop is provided, this will do nothing.
      */
    var headerClassName: js.UndefOr[String] = js.undefined
    
    /**
      * An optional ref to pass to the default header implementation. This will be
      * provided automatically if you are using the `usePanels` hook to allow
      * keyboard movement with the arrow keys and home/end keys. If you provide
      * your own `header`, you'll need to pass the `headerRef` to your custom
      * implementation to the focusable element for the keyboard focus behavior to
      * work.
      */
    var headerRef: js.UndefOr[Ref[HTMLButtonElement]] = js.undefined
    
    /**
      * An optional style object to provide to the default header implementation. If
      * the `header` prop is provided, this will do nothing.
      */
    var headerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * An id for the panel that is required for a11y.
      */
    @JSName("id")
    var id_ExpansionPanelProps: String
    
    /**
      * Boolean if margin top should be applied to this header to add some
      * additional spacing between this panel and the previous panel. This will
      * automatically be provided for panels when using the `usePanels` hook.
      */
    var marginTop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that should attempt to change the expansion state of the panel.
      */
    var onExpandClick: MouseEventHandler[HTMLButtonElement]
    
    /**
      * Boolean if the content should be persistent within the DOM instead of
      * unmounting once no longer expanded. This is only really helpful if you want
      * to maintain state while the panel is hidden since the children will unmount
      * when not expanded.
      */
    var persistent: js.UndefOr[Boolean] = js.undefined
  }
  object ExpansionPanelProps {
    
    @scala.inline
    def apply(
      expanded: Boolean,
      id: String,
      onExpandClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit
    ): ExpansionPanelProps = {
      val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onExpandClick = js.Any.fromFunction1(onExpandClick))
      __obj.asInstanceOf[ExpansionPanelProps]
    }
    
    @scala.inline
    implicit class ExpansionPanelPropsMutableBuilder[Self <: ExpansionPanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      @scala.inline
      def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      @scala.inline
      def setCustomHeader(value: ReactNode): Self = StObject.set(x, "customHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeaderUndefined: Self = StObject.set(x, "customHeader", js.undefined)
      
      @scala.inline
      def setDisableTransition(value: Boolean): Self = StObject.set(x, "disableTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableTransitionUndefined: Self = StObject.set(x, "disableTransition", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanderIcon(value: ReactNode): Self = StObject.set(x, "expanderIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanderIconUndefined: Self = StObject.set(x, "expanderIcon", js.undefined)
      
      @scala.inline
      def setHeader(value: ReactNode): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
      
      @scala.inline
      def setHeaderRef(value: Ref[HTMLButtonElement]): Self = StObject.set(x, "headerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderRefFunction1(value: /* instance */ HTMLButtonElement | Null => Unit): Self = StObject.set(x, "headerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderRefNull: Self = StObject.set(x, "headerRef", null)
      
      @scala.inline
      def setHeaderRefUndefined: Self = StObject.set(x, "headerRef", js.undefined)
      
      @scala.inline
      def setHeaderStyle(value: CSSProperties): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginTop(value: Boolean): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      @scala.inline
      def setOnExpandClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onExpandClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    }
  }
}
