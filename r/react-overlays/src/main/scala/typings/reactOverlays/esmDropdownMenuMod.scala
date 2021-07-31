package typings.reactOverlays

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactOverlays.anon.Arialabelledby
import typings.reactOverlays.anon.OmitUsePopperOptionsenabl
import typings.reactOverlays.anon.Popper
import typings.reactOverlays.anon.Ref
import typings.reactOverlays.esmUsePopperMod.Offset
import typings.reactOverlays.esmUsePopperMod.OffsetValue
import typings.reactOverlays.esmUseRootCloseMod.MouseEvents
import typings.std.Event
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmDropdownMenuMod {
  
  @JSImport("react-overlays/esm/DropdownMenu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    /**
      * Also exported as `<Dropdown.Menu>` from `Dropdown`.
      *
      * @displayName DropdownMenu
      * @memberOf Dropdown
      */
    @scala.inline
    def apply(hasChildrenOptions: DropdownMenuProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildrenOptions.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-overlays/esm/DropdownMenu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("react-overlays/esm/DropdownMenu", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-overlays/esm/DropdownMenu", "default.defaultProps.usePopper")
      @js.native
      def usePopper: Boolean = js.native
      @scala.inline
      def usePopper_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("usePopper")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("react-overlays/esm/DropdownMenu", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    object propTypes {
      
      @JSImport("react-overlays/esm/DropdownMenu", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Aligns the dropdown menu to the 'end' of it's placement position.
        * Generally this is provided by the parent `Dropdown` component,
        * but may also be specified as a prop directly.
        */
      @JSImport("react-overlays/esm/DropdownMenu", "default.propTypes.alignEnd")
      @js.native
      def alignEnd: Requireable[Boolean] = js.native
      @scala.inline
      def alignEnd_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignEnd")(x.asInstanceOf[js.Any])
      
      /**
        * A render prop that returns a Menu element. The `props`
        * argument should spread through to **a component that can accept a ref**.
        *
        * @type {Function ({
        *   show: boolean,
        *   alignEnd: boolean,
        *   close: (?SyntheticEvent) => void,
        *   placement: Placement,
        *   update: () => void,
        *   forceUpdate: () => void,
        *   props: {
        *     ref: (?HTMLElement) => void,
        *     style: { [string]: string | number },
        *     aria-labelledby: ?string
        *   },
        *   arrowProps: {
        *     ref: (?HTMLElement) => void,
        *     style: { [string]: string | number },
        *   },
        * }) => React.Element}
        */
      @JSImport("react-overlays/esm/DropdownMenu", "default.propTypes.children")
      @js.native
      def children: Validator[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
      @scala.inline
      def children_=(x: Validator[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /**
        * Enables the Popper.js `flip` modifier, allowing the Dropdown to
        * automatically adjust it's placement in case of overlap with the viewport or toggle.
        * Refer to the [flip docs](https://popper.js.org/popper-documentation.html#modifiers..flip.enabled) for more info
        */
      @JSImport("react-overlays/esm/DropdownMenu", "default.propTypes.flip")
      @js.native
      def flip: Requireable[Boolean] = js.native
      @scala.inline
      def flip_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flip")(x.asInstanceOf[js.Any])
      
      /**
        * A set of popper options and props passed directly to react-popper's Popper component.
        */
      @JSImport("react-overlays/esm/DropdownMenu", "default.propTypes.popperConfig")
      @js.native
      def popperConfig: Requireable[js.Object] = js.native
      @scala.inline
      def popperConfig_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperConfig")(x.asInstanceOf[js.Any])
      
      /**
        * Override the default event used by RootCloseWrapper.
        */
      @JSImport("react-overlays/esm/DropdownMenu", "default.propTypes.rootCloseEvent")
      @js.native
      def rootCloseEvent: Requireable[String] = js.native
      @scala.inline
      def rootCloseEvent_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rootCloseEvent")(x.asInstanceOf[js.Any])
      
      /**
        * Controls the visible state of the menu, generally this is
        * provided by the parent `Dropdown` component,
        * but may also be specified as a prop directly.
        */
      @JSImport("react-overlays/esm/DropdownMenu", "default.propTypes.show")
      @js.native
      def show: Requireable[Boolean] = js.native
      @scala.inline
      def show_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("show")(x.asInstanceOf[js.Any])
      
      @JSImport("react-overlays/esm/DropdownMenu", "default.propTypes.usePopper")
      @js.native
      def usePopper: Requireable[Boolean] = js.native
      @scala.inline
      def usePopper_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("usePopper")(x.asInstanceOf[js.Any])
    }
  }
  
  @scala.inline
  def useDropdownMenu(): UseDropdownMenuValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownMenu")().asInstanceOf[UseDropdownMenuValue]
  @scala.inline
  def useDropdownMenu(options: UseDropdownMenuOptions): UseDropdownMenuValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownMenu")(options.asInstanceOf[js.Any]).asInstanceOf[UseDropdownMenuValue]
  
  trait DropdownMenuProps
    extends StObject
       with UseDropdownMenuOptions {
    
    def children(args: UseDropdownMenuValue): ReactNode
  }
  object DropdownMenuProps {
    
    @scala.inline
    def apply(children: UseDropdownMenuValue => ReactNode): DropdownMenuProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[DropdownMenuProps]
    }
    
    @scala.inline
    implicit class DropdownMenuPropsMutableBuilder[Self <: DropdownMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: UseDropdownMenuValue => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait UseDropdownMenuOptions extends StObject {
    
    var alignEnd: js.UndefOr[Boolean] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[Offset] = js.undefined
    
    var popperConfig: js.UndefOr[OmitUsePopperOptionsenabl] = js.undefined
    
    var rootCloseEvent: js.UndefOr[MouseEvents] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var usePopper: js.UndefOr[Boolean] = js.undefined
  }
  object UseDropdownMenuOptions {
    
    @scala.inline
    def apply(): UseDropdownMenuOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseDropdownMenuOptions]
    }
    
    @scala.inline
    implicit class UseDropdownMenuOptionsMutableBuilder[Self <: UseDropdownMenuOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignEnd(value: Boolean): Self = StObject.set(x, "alignEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignEndUndefined: Self = StObject.set(x, "alignEnd", js.undefined)
      
      @scala.inline
      def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      @scala.inline
      def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetFunction1(value: /* details */ Popper => OffsetValue): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPopperConfig(value: OmitUsePopperOptionsenabl): Self = StObject.set(x, "popperConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopperConfigUndefined: Self = StObject.set(x, "popperConfig", js.undefined)
      
      @scala.inline
      def setRootCloseEvent(value: MouseEvents): Self = StObject.set(x, "rootCloseEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootCloseEventUndefined: Self = StObject.set(x, "rootCloseEvent", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setUsePopper(value: Boolean): Self = StObject.set(x, "usePopper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePopperUndefined: Self = StObject.set(x, "usePopper", js.undefined)
    }
  }
  
  trait UseDropdownMenuValue extends StObject {
    
    var alignEnd: js.UndefOr[Boolean] = js.undefined
    
    var arrowProps: (Record[String, js.Any]) & Ref
    
    def close(e: Event): Unit
    
    def forceUpdate(): Unit
    
    var hasShown: Boolean
    
    var props: (Record[String, js.Any]) & Arialabelledby
    
    var show: Boolean
    
    def update(): Unit
  }
  object UseDropdownMenuValue {
    
    @scala.inline
    def apply(
      arrowProps: (Record[String, js.Any]) & Ref,
      close: Event => Unit,
      forceUpdate: () => Unit,
      hasShown: Boolean,
      props: (Record[String, js.Any]) & Arialabelledby,
      show: Boolean,
      update: () => Unit
    ): UseDropdownMenuValue = {
      val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], close = js.Any.fromFunction1(close), forceUpdate = js.Any.fromFunction0(forceUpdate), hasShown = hasShown.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[UseDropdownMenuValue]
    }
    
    @scala.inline
    implicit class UseDropdownMenuValueMutableBuilder[Self <: UseDropdownMenuValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignEnd(value: Boolean): Self = StObject.set(x, "alignEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignEndUndefined: Self = StObject.set(x, "alignEnd", js.undefined)
      
      @scala.inline
      def setArrowProps(value: (Record[String, js.Any]) & Ref): Self = StObject.set(x, "arrowProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClose(value: Event => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForceUpdate(value: () => Unit): Self = StObject.set(x, "forceUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasShown(value: Boolean): Self = StObject.set(x, "hasShown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: (Record[String, js.Any]) & Arialabelledby): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
}
