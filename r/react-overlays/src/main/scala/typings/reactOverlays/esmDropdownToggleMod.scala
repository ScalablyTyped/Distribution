package typings.reactOverlays

import typings.propTypes.mod.Validator
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmDropdownToggleMod {
  
  @JSImport("react-overlays/esm/DropdownToggle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    /**
      * Also exported as `<Dropdown.Toggle>` from `Dropdown`.
      *
      * @displayName DropdownToggle
      * @memberOf Dropdown
      */
    inline def apply(param0: DropdownToggleProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-overlays/esm/DropdownToggle", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-overlays/esm/DropdownToggle", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    object propTypes {
      
      @JSImport("react-overlays/esm/DropdownToggle", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * A render prop that returns a Toggle element. The `props`
        * argument should spread through to **a component that can accept a ref**. Use
        * the `onToggle` argument to toggle the menu open or closed
        *
        * @type {Function ({
        *   show: boolean,
        *   toggle: (show: boolean) => void,
        *   props: {
        *     ref: (?HTMLElement) => void,
        *     aria-haspopup: true
        *     aria-expanded: boolean
        *   },
        * }) => React.Element}
        */
      @JSImport("react-overlays/esm/DropdownToggle", "default.propTypes.children")
      @js.native
      def children: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def children_=(x: Validator[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    }
  }
  
  inline def useDropdownToggle(): js.Tuple2[UseDropdownToggleProps, UseDropdownToggleMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownToggle")().asInstanceOf[js.Tuple2[UseDropdownToggleProps, UseDropdownToggleMetadata]]
  
  trait DropdownToggleProps extends StObject {
    
    def children(props: UseDropdownToggleProps, meta: UseDropdownToggleMetadata): ReactNode
  }
  object DropdownToggleProps {
    
    inline def apply(children: (UseDropdownToggleProps, UseDropdownToggleMetadata) => ReactNode): DropdownToggleProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children))
      __obj.asInstanceOf[DropdownToggleProps]
    }
    
    extension [Self <: DropdownToggleProps](x: Self) {
      
      inline def setChildren(value: (UseDropdownToggleProps, UseDropdownToggleMetadata) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
    }
  }
  
  trait UseDropdownToggleMetadata extends StObject {
    
    var show: Boolean
    
    var toggle: js.Function2[
        /* nextShow */ Boolean, 
        /* event */ js.UndefOr[(SyntheticEvent[typings.std.Element, Event]) | Event], 
        Unit
      ]
  }
  object UseDropdownToggleMetadata {
    
    inline def apply(
      show: Boolean,
      toggle: (/* nextShow */ Boolean, /* event */ js.UndefOr[(SyntheticEvent[typings.std.Element, Event]) | Event]) => Unit
    ): UseDropdownToggleMetadata = {
      val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any], toggle = js.Any.fromFunction2(toggle))
      __obj.asInstanceOf[UseDropdownToggleMetadata]
    }
    
    extension [Self <: UseDropdownToggleMetadata](x: Self) {
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setToggle(
        value: (/* nextShow */ Boolean, /* event */ js.UndefOr[(SyntheticEvent[typings.std.Element, Event]) | Event]) => Unit
      ): Self = StObject.set(x, "toggle", js.Any.fromFunction2(value))
    }
  }
  
  trait UseDropdownToggleProps extends StObject {
    
    var `aria-expanded`: Boolean
    
    var `aria-haspopup`: Boolean
    
    var onClick: MouseEventHandler[typings.std.Element]
    
    var ref: js.Function1[/* ref */ HTMLElement | Null, Unit]
  }
  object UseDropdownToggleProps {
    
    inline def apply(
      `aria-expanded`: Boolean,
      `aria-haspopup`: Boolean,
      onClick: MouseEvent[typings.std.Element, NativeMouseEvent] => Unit,
      ref: /* ref */ HTMLElement | Null => Unit
    ): UseDropdownToggleProps = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), ref = js.Any.fromFunction1(ref))
      __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
      __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseDropdownToggleProps]
    }
    
    extension [Self <: UseDropdownToggleProps](x: Self) {
      
      inline def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopup`(value: Boolean): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: MouseEvent[typings.std.Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setRef(value: /* ref */ HTMLElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    }
  }
}
