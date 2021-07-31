package typings.reactAriaMenubutton

import typings.react.mod.Component
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLProps
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.reactAriaMenubutton.anon.FocusButton
import typings.reactAriaMenubutton.anon.FocusMenu
import typings.reactAriaMenubutton.anon.IsOpen
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-aria-menubutton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-aria-menubutton", "Button")
  @js.native
  val Button: ForwardRefExoticComponent[ButtonProps[HTMLElement]] = js.native
  
  @JSImport("react-aria-menubutton", "Menu")
  @js.native
  class Menu protected ()
    extends Component[MenuProps[HTMLElement], js.Object, js.Any] {
    def this(props: MenuProps[HTMLElement]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MenuProps[HTMLElement], context: js.Any) = this()
  }
  
  @JSImport("react-aria-menubutton", "MenuItem")
  @js.native
  class MenuItem protected ()
    extends Component[MenuItemProps[HTMLElement], js.Object, js.Any] {
    def this(props: MenuItemProps[HTMLElement]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MenuItemProps[HTMLElement], context: js.Any) = this()
  }
  
  @JSImport("react-aria-menubutton", "Wrapper")
  @js.native
  class Wrapper protected ()
    extends Component[WrapperProps[HTMLElement], js.Object, js.Any] {
    def this(props: WrapperProps[HTMLElement]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: WrapperProps[HTMLElement], context: js.Any) = this()
  }
  
  @scala.inline
  def closeMenu(wrapperId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeMenu")(wrapperId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def closeMenu(wrapperId: String, closeOptions: FocusButton): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("closeMenu")(wrapperId.asInstanceOf[js.Any], closeOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def openMenu(wrapperId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openMenu")(wrapperId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def openMenu(wrapperId: String, openOptions: FocusMenu): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openMenu")(wrapperId.asInstanceOf[js.Any], openOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ButtonProps[T /* <: HTMLElement */]
    extends StObject
       with HTMLProps[T] {
    
    /**
      * The HTML tag for this element. Default: 'div'.
      */
    var tag: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any
      ] = js.undefined
  }
  object ButtonProps {
    
    @scala.inline
    def apply[T /* <: HTMLElement */](): ButtonProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps[T]]
    }
    
    @scala.inline
    implicit class ButtonPropsMutableBuilder[Self <: ButtonProps[?], T /* <: HTMLElement */] (val x: Self & ButtonProps[T]) extends AnyVal {
      
      @scala.inline
      def setTag(value: /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  trait MenuItemProps[T /* <: HTMLElement */]
    extends StObject
       with HTMLProps[T] {
    
    /**
      * The HTML tag for this element. Default: 'div'.
      */
    var tag: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any
      ] = js.undefined
    
    /**
      * If `text` has a value, its first letter will be the letter a user can
      * type to navigate to that item.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /**
      * If value has a value, it will be passed to the onSelection handler
      * when the `MenuItem` is selected
      */
    @JSName("value")
    var value_MenuItemProps: js.UndefOr[js.Any] = js.undefined
  }
  object MenuItemProps {
    
    @scala.inline
    def apply[T /* <: HTMLElement */](): MenuItemProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemProps[T]]
    }
    
    @scala.inline
    implicit class MenuItemPropsMutableBuilder[Self <: MenuItemProps[?], T /* <: HTMLElement */] (val x: Self & MenuItemProps[T]) extends AnyVal {
      
      @scala.inline
      def setTag(value: /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait MenuProps[T /* <: HTMLElement */]
    extends StObject
       with HTMLProps[T] {
    
    @JSName("children")
    var children_MenuProps: Element | (js.Function1[/* hasIsOpen */ IsOpen, Element])
    
    /**
      * The HTML tag for this element. Default: 'div'.
      */
    var tag: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any
      ] = js.undefined
  }
  object MenuProps {
    
    @scala.inline
    def apply[T /* <: HTMLElement */](children: Element | (js.Function1[/* hasIsOpen */ IsOpen, Element])): MenuProps[T] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuProps[T]]
    }
    
    @scala.inline
    implicit class MenuPropsMutableBuilder[Self <: MenuProps[?], T /* <: HTMLElement */] (val x: Self & MenuProps[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: Element | (js.Function1[/* hasIsOpen */ IsOpen, Element])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* hasIsOpen */ IsOpen => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTag(value: /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  trait WrapperProps[T /* <: HTMLElement */]
    extends StObject
       with HTMLProps[T] {
    
    /**
      * By default, it does automatically close.
      * If false, the menu will not automatically close when it
      * blurs. Default: `true`.
      */
    var closeOnBlur: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, it does automatically close.
      * If false, the menu will not automatically close when a
      * selection is made. Default: `true`.
      */
    var closeOnSelection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A callback to run when the menu is opened or closed.
      */
    var onMenuToggle: js.UndefOr[js.Function1[/* obj */ WrapperState, js.Any]] = js.undefined
    
    /**
      * A callback to run when the user makes a selection
      * (i.e. clicks or presses Enter or Space on a `MenuItem`).
      * It will be passed the value of the selected `MenuItem` and
      * the React `SyntheticEvent`.
      */
    var onSelection: js.UndefOr[js.Function2[/* value */ js.Any, /* event */ SyntheticEvent[T, Event], js.Any]] = js.undefined
    
    var tag: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any
      ] = js.undefined
  }
  object WrapperProps {
    
    @scala.inline
    def apply[T /* <: HTMLElement */](): WrapperProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WrapperProps[T]]
    }
    
    @scala.inline
    implicit class WrapperPropsMutableBuilder[Self <: WrapperProps[?], T /* <: HTMLElement */] (val x: Self & WrapperProps[T]) extends AnyVal {
      
      @scala.inline
      def setCloseOnBlur(value: Boolean): Self = StObject.set(x, "closeOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnBlurUndefined: Self = StObject.set(x, "closeOnBlur", js.undefined)
      
      @scala.inline
      def setCloseOnSelection(value: Boolean): Self = StObject.set(x, "closeOnSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnSelectionUndefined: Self = StObject.set(x, "closeOnSelection", js.undefined)
      
      @scala.inline
      def setOnMenuToggle(value: /* obj */ WrapperState => js.Any): Self = StObject.set(x, "onMenuToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMenuToggleUndefined: Self = StObject.set(x, "onMenuToggle", js.undefined)
      
      @scala.inline
      def setOnSelection(value: (/* value */ js.Any, /* event */ SyntheticEvent[T, Event]) => js.Any): Self = StObject.set(x, "onSelection", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectionUndefined: Self = StObject.set(x, "onSelection", js.undefined)
      
      @scala.inline
      def setTag(value: /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  trait WrapperState extends StObject {
    
    var isOpen: Boolean
  }
  object WrapperState {
    
    @scala.inline
    def apply(isOpen: Boolean): WrapperState = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrapperState]
    }
    
    @scala.inline
    implicit class WrapperStateMutableBuilder[Self <: WrapperState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    }
  }
}
