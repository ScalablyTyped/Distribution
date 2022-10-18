package typings.reactOverlays

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.reactOverlays.anon.Arialabelledby
import typings.reactOverlays.anon.OmitUsePopperOptionsenabl
import typings.reactOverlays.anon.Placement
import typings.reactOverlays.anon.Ref
import typings.reactOverlays.cjsUsePopperMod.Offset
import typings.reactOverlays.cjsUsePopperMod.OffsetValue
import typings.reactOverlays.cjsUsePopperMod.UsePopperState
import typings.reactOverlays.cjsUseRootCloseMod.MouseEvents
import typings.std.Event
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsDropdownMenuMod {
  
  @JSImport("react-overlays/cjs/DropdownMenu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    /**
      * Also exported as `<Dropdown.Menu>` from `Dropdown`.
      *
      * @displayName DropdownMenu
      * @memberOf Dropdown
      */
    inline def apply(hasChildrenOptions: DropdownMenuProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildrenOptions.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-overlays/cjs/DropdownMenu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("react-overlays/cjs/DropdownMenu", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-overlays/cjs/DropdownMenu", "default.defaultProps.usePopper")
      @js.native
      def usePopper: Boolean = js.native
      inline def usePopper_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("usePopper")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("react-overlays/cjs/DropdownMenu", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    object propTypes {
      
      @JSImport("react-overlays/cjs/DropdownMenu", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Aligns the dropdown menu to the 'end' of it's placement position.
        * Generally this is provided by the parent `Dropdown` component,
        * but may also be specified as a prop directly.
        */
      @JSImport("react-overlays/cjs/DropdownMenu", "default.propTypes.alignEnd")
      @js.native
      def alignEnd: Requireable[Boolean] = js.native
      inline def alignEnd_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignEnd")(x.asInstanceOf[js.Any])
      
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
      @JSImport("react-overlays/cjs/DropdownMenu", "default.propTypes.children")
      @js.native
      def children: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def children_=(x: Validator[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /**
        * Enables the Popper.js `flip` modifier, allowing the Dropdown to
        * automatically adjust it's placement in case of overlap with the viewport or toggle.
        * Refer to the [flip docs](https://popper.js.org/popper-documentation.html#modifiers..flip.enabled) for more info
        */
      @JSImport("react-overlays/cjs/DropdownMenu", "default.propTypes.flip")
      @js.native
      def flip: Requireable[Boolean] = js.native
      inline def flip_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flip")(x.asInstanceOf[js.Any])
      
      /**
        * A set of popper options and props passed directly to react-popper's Popper component.
        */
      @JSImport("react-overlays/cjs/DropdownMenu", "default.propTypes.popperConfig")
      @js.native
      def popperConfig: Requireable[js.Object] = js.native
      inline def popperConfig_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperConfig")(x.asInstanceOf[js.Any])
      
      /**
        * Override the default event used by RootCloseWrapper.
        */
      @JSImport("react-overlays/cjs/DropdownMenu", "default.propTypes.rootCloseEvent")
      @js.native
      def rootCloseEvent: Requireable[String] = js.native
      inline def rootCloseEvent_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rootCloseEvent")(x.asInstanceOf[js.Any])
      
      /**
        * Controls the visible state of the menu, generally this is
        * provided by the parent `Dropdown` component,
        * but may also be specified as a prop directly.
        */
      @JSImport("react-overlays/cjs/DropdownMenu", "default.propTypes.show")
      @js.native
      def show: Requireable[Boolean] = js.native
      inline def show_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("show")(x.asInstanceOf[js.Any])
      
      @JSImport("react-overlays/cjs/DropdownMenu", "default.propTypes.usePopper")
      @js.native
      def usePopper: Requireable[Boolean] = js.native
      inline def usePopper_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("usePopper")(x.asInstanceOf[js.Any])
    }
  }
  
  inline def useDropdownMenu(): js.Tuple2[UserDropdownMenuProps, UseDropdownMenuMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownMenu")().asInstanceOf[js.Tuple2[UserDropdownMenuProps, UseDropdownMenuMetadata]]
  inline def useDropdownMenu(options: UseDropdownMenuOptions): js.Tuple2[UserDropdownMenuProps, UseDropdownMenuMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownMenu")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[UserDropdownMenuProps, UseDropdownMenuMetadata]]
  
  trait DropdownMenuProps
    extends StObject
       with UseDropdownMenuOptions {
    
    def children(props: UserDropdownMenuProps, meta: UseDropdownMenuMetadata): ReactNode
  }
  object DropdownMenuProps {
    
    inline def apply(children: (UserDropdownMenuProps, UseDropdownMenuMetadata) => ReactNode): DropdownMenuProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children))
      __obj.asInstanceOf[DropdownMenuProps]
    }
    
    extension [Self <: DropdownMenuProps](x: Self) {
      
      inline def setChildren(value: (UserDropdownMenuProps, UseDropdownMenuMetadata) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
    }
  }
  
  trait UseDropdownMenuMetadata extends StObject {
    
    var alignEnd: js.UndefOr[Boolean] = js.undefined
    
    var arrowProps: Partial[UserDropdownMenuArrowProps]
    
    var hasShown: Boolean
    
    var popper: UsePopperState | Null
    
    var show: Boolean
    
    var toggle: js.UndefOr[
        js.Function2[
          /* nextShow */ Boolean, 
          /* event */ js.UndefOr[(SyntheticEvent[typings.std.Element, Event]) | Event], 
          Unit
        ]
      ] = js.undefined
  }
  object UseDropdownMenuMetadata {
    
    inline def apply(arrowProps: Partial[UserDropdownMenuArrowProps], hasShown: Boolean, show: Boolean): UseDropdownMenuMetadata = {
      val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], hasShown = hasShown.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], popper = null)
      __obj.asInstanceOf[UseDropdownMenuMetadata]
    }
    
    extension [Self <: UseDropdownMenuMetadata](x: Self) {
      
      inline def setAlignEnd(value: Boolean): Self = StObject.set(x, "alignEnd", value.asInstanceOf[js.Any])
      
      inline def setAlignEndUndefined: Self = StObject.set(x, "alignEnd", js.undefined)
      
      inline def setArrowProps(value: Partial[UserDropdownMenuArrowProps]): Self = StObject.set(x, "arrowProps", value.asInstanceOf[js.Any])
      
      inline def setHasShown(value: Boolean): Self = StObject.set(x, "hasShown", value.asInstanceOf[js.Any])
      
      inline def setPopper(value: UsePopperState): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
      
      inline def setPopperNull: Self = StObject.set(x, "popper", null)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setToggle(
        value: (/* nextShow */ Boolean, /* event */ js.UndefOr[(SyntheticEvent[typings.std.Element, Event]) | Event]) => Unit
      ): Self = StObject.set(x, "toggle", js.Any.fromFunction2(value))
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
  
  trait UseDropdownMenuOptions extends StObject {
    
    var alignEnd: js.UndefOr[Boolean] = js.undefined
    
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[Offset] = js.undefined
    
    var popperConfig: js.UndefOr[OmitUsePopperOptionsenabl] = js.undefined
    
    var rootCloseEvent: js.UndefOr[MouseEvents] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var usePopper: js.UndefOr[Boolean] = js.undefined
  }
  object UseDropdownMenuOptions {
    
    inline def apply(): UseDropdownMenuOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseDropdownMenuOptions]
    }
    
    extension [Self <: UseDropdownMenuOptions](x: Self) {
      
      inline def setAlignEnd(value: Boolean): Self = StObject.set(x, "alignEnd", value.asInstanceOf[js.Any])
      
      inline def setAlignEndUndefined: Self = StObject.set(x, "alignEnd", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetFunction1(value: /* details */ Placement => OffsetValue): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPopperConfig(value: OmitUsePopperOptionsenabl): Self = StObject.set(x, "popperConfig", value.asInstanceOf[js.Any])
      
      inline def setPopperConfigUndefined: Self = StObject.set(x, "popperConfig", js.undefined)
      
      inline def setRootCloseEvent(value: MouseEvents): Self = StObject.set(x, "rootCloseEvent", value.asInstanceOf[js.Any])
      
      inline def setRootCloseEventUndefined: Self = StObject.set(x, "rootCloseEvent", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setUsePopper(value: Boolean): Self = StObject.set(x, "usePopper", value.asInstanceOf[js.Any])
      
      inline def setUsePopperUndefined: Self = StObject.set(x, "usePopper", js.undefined)
    }
  }
  
  type UserDropdownMenuArrowProps = (Record[String, Any]) & Ref
  
  type UserDropdownMenuProps = (Record[String, Any]) & Arialabelledby
}
