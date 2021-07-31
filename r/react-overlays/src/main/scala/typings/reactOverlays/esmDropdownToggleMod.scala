package typings.reactOverlays

import typings.propTypes.mod.Validator
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.reactOverlays.anon.UseDropdownToggleHelperspProps
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
    @scala.inline
    def apply(hasChildren: DropdownToggleProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-overlays/esm/DropdownToggle", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-overlays/esm/DropdownToggle", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
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
      def children: Validator[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
      @scala.inline
      def children_=(x: Validator[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    }
  }
  
  @scala.inline
  def useDropdownToggle(): js.Tuple2[UseDropdownToggleProps, UseDropdownToggleHelpers] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownToggle")().asInstanceOf[js.Tuple2[UseDropdownToggleProps, UseDropdownToggleHelpers]]
  
  trait DropdownToggleProps extends StObject {
    
    def children(args: UseDropdownToggleHelperspProps): ReactNode
  }
  object DropdownToggleProps {
    
    @scala.inline
    def apply(children: UseDropdownToggleHelperspProps => ReactNode): DropdownToggleProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[DropdownToggleProps]
    }
    
    @scala.inline
    implicit class DropdownTogglePropsMutableBuilder[Self <: DropdownToggleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: UseDropdownToggleHelperspProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait UseDropdownToggleHelpers extends StObject {
    
    var show: Boolean
    
    var toggle: js.Function2[
        /* nextShow */ Boolean, 
        /* event */ js.UndefOr[(SyntheticEvent[typings.std.Element, Event]) | Event], 
        Unit
      ]
  }
  object UseDropdownToggleHelpers {
    
    @scala.inline
    def apply(
      show: Boolean,
      toggle: (/* nextShow */ Boolean, /* event */ js.UndefOr[(SyntheticEvent[typings.std.Element, Event]) | Event]) => Unit
    ): UseDropdownToggleHelpers = {
      val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any], toggle = js.Any.fromFunction2(toggle))
      __obj.asInstanceOf[UseDropdownToggleHelpers]
    }
    
    @scala.inline
    implicit class UseDropdownToggleHelpersMutableBuilder[Self <: UseDropdownToggleHelpers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggle(
        value: (/* nextShow */ Boolean, /* event */ js.UndefOr[(SyntheticEvent[typings.std.Element, Event]) | Event]) => Unit
      ): Self = StObject.set(x, "toggle", js.Any.fromFunction2(value))
    }
  }
  
  trait UseDropdownToggleProps extends StObject {
    
    var `aria-expanded`: Boolean
    
    var `aria-haspopup`: Boolean
    
    var ref: js.Function1[/* ref */ HTMLElement | Null, Unit]
  }
  object UseDropdownToggleProps {
    
    @scala.inline
    def apply(`aria-expanded`: Boolean, `aria-haspopup`: Boolean, ref: /* ref */ HTMLElement | Null => Unit): UseDropdownToggleProps = {
      val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref))
      __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
      __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseDropdownToggleProps]
    }
    
    @scala.inline
    implicit class UseDropdownTogglePropsMutableBuilder[Self <: UseDropdownToggleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopup`(value: Boolean): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: /* ref */ HTMLElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    }
  }
}
