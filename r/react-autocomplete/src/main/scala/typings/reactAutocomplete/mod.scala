package typings.reactAutocomplete

import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactNode
import typings.reactAutocomplete.anon.FnCall
import typings.reactAutocomplete.anon.FnCallStartEndDirection
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-autocomplete", JSImport.Namespace)
  @js.native
  open class ^ () extends Autocomplete
  
  @js.native
  trait Autocomplete extends Component[Props, State, Any] {
    
    /**
      * Autocomplete exposes a subset of `HTMLInputElement` properties to the parent component.
      * They can be accessed through Autocomplete's `ref` prop.
      */
    var blur: js.Function0[Unit] = js.native
    
    var checkValidity: js.Function0[Boolean] = js.native
    
    var click: js.Function0[Unit] = js.native
    
    var focus: FnCall = js.native
    
    var select: js.Function0[Unit] = js.native
    
    var setCustomValidity: js.Function1[/* error */ String, Unit] = js.native
    
    var setSelectionRange: FnCallStartEndDirection = js.native
  }
  
  @js.native
  trait Props extends StObject {
    
    /**
      * Whether or not to automatically highlight the top match in the dropdown
      * menu.
      */
    var autoHighlight: js.UndefOr[Boolean] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    /**
      * Arguments: `item: Any`
      *
      * Used to read the display value from each entry in `items`.
      */
    def getItemValue(item: Any): String = js.native
    
    /**
      * Props passed to `props.renderInput`. By default these props will be
      * applied to the `<input />` element rendered by `Autocomplete`, unless you
      * have specified a custom value for `props.renderInput`. Any properties
      * supported by `HTMLInputElement` can be specified, apart from the
      * following which are set by `Autocomplete`: value, autoComplete, role,
      * aria-autocomplete. `inputProps` is commonly used for (but not limited to)
      * placeholder, event handlers (onFocus, onBlur, etc.), autoFocus, etc..
      */
    var inputProps: js.UndefOr[HTMLProps[HTMLInputElement]] = js.native
    
    /**
      * Arguments: `item: Any`
      *
      * Invoked when attempting to select an item. The return value is used to
      * determine whether the item should be selectable or not.
      * By default all items are selectable.
      */
    var isItemSelectable: js.UndefOr[js.Function1[/* item */ Any, Boolean]] = js.native
    
    /**
      * The items to display in the dropdown menu
      */
    var items: js.Array[Any] = js.native
    
    /**
      * Styles that are applied to the dropdown menu in the default `renderMenu`
      * implementation. If you override `renderMenu` and you want to use
      * `menuStyle` you must manually apply them (`this.props.menuStyle`).
      */
    var menuStyle: js.UndefOr[CSSProperties] = js.native
    
    /**
      * Arguments: `event: Event, value: String`
      *
      * Invoked every time the user changes the input's value.
      */
    var onChange: js.UndefOr[js.Function2[/* e */ ChangeEvent[HTMLInputElement], /* value */ String, Unit]] = js.native
    
    /**
      * Arguments: `isOpen: Boolean`
      *
      * Invoked every time the dropdown menu's visibility changes (i.e. every
      * time it is displayed/hidden).
      */
    var onMenuVisibilityChange: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.native
    
    /**
      * Arguments: `value: String, item: Any`
      *
      * Invoked when the user selects an item from the dropdown menu.
      */
    var onSelect: js.UndefOr[js.Function2[/* value */ String, /* item */ Any, Unit]] = js.native
    
    /**
      * Used to override the internal logic which displays/hides the dropdown
      * menu. This is useful if you want to force a certain state based on your
      * UX/business logic. Use it together with `onMenuVisibilityChange` for
      * fine-grained control over the dropdown menu dynamics.
      */
    var open: js.UndefOr[Boolean] = js.native
    
    /**
      * Arguments: `props: Object`
      *
      * Invoked to generate the input element. The `props` argument is the result
      * of merging `props.inputProps` with a selection of props that are required
      * both for functionality and accessibility. At the very least you need to
      * apply `props.ref` and all `props.on<event>` event handlers. Failing to do
      * this will cause `Autocomplete` to behave unexpectedly.
      */
    var renderInput: js.UndefOr[js.Function1[/* props */ HTMLProps[HTMLInputElement], ReactNode]] = js.native
    
    /**
      * Arguments: `item: Any, isHighlighted: Boolean, styles: Object`
      *
      * Invoked for each entry in `items` that also passes `shouldItemRender` to
      * generate the render tree for each item in the dropdown menu. `styles` is
      * an optional set of styles that can be applied to improve the look/feel
      * of the items in the dropdown menu.
      */
    def renderItem(item: Any, isHighlighted: Boolean): ReactNode = js.native
    def renderItem(item: Any, isHighlighted: Boolean, styles: CSSProperties): ReactNode = js.native
    
    /**
      * Arguments: `items: Array<Any>, value: String, styles: Object`
      *
      * Invoked to generate the render tree for the dropdown menu. Ensure the
      * returned tree includes every entry in `items` or else the highlight order
      * and keyboard navigation logic will break. `styles` will contain
      * { top, left, minWidth } which are the coordinates of the top-left corner
      * and the width of the dropdown menu.
      */
    var renderMenu: js.UndefOr[
        js.Function3[
          /* items */ js.Array[ReactNode], 
          /* value */ String, 
          /* styles */ CSSProperties, 
          ReactNode
        ]
      ] = js.native
    
    /**
      * Whether or not to automatically select the highlighted item when the
      * `<input>` loses focus.
      */
    var selectOnBlur: js.UndefOr[Boolean] = js.native
    
    /**
      * Arguments: `item: Any, value: String`
      *
      * Invoked for each entry in `items` and its return value is used to
      * determine whether or not it should be displayed in the dropdown menu.
      * By default all items are always rendered.
      */
    var shouldItemRender: js.UndefOr[js.Function2[/* item */ Any, /* value */ String, Boolean]] = js.native
    
    /**
      * Arguments: `itemA: Any, itemB: Any, value: String`
      *
      * The function which is used to sort `items` before display.
      */
    var sortItems: js.UndefOr[js.Function3[/* a */ Any, /* b */ Any, /* value */ String, Double]] = js.native
    
    /**
      * The value to display in the input field
      */
    var value: Any = js.native
    
    /**
      * Props that are applied to the element which wraps the `<input />` and
      * dropdown menu elements rendered by `Autocomplete`.
      */
    var wrapperProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.native
    
    /**
      * This is a shorthand for `wrapperProps={{ style: <your styles> }}`.
      * Note that `wrapperStyle` is applied before `wrapperProps`, so the latter
      * will win if it contains a `style` entry.
      */
    var wrapperStyle: js.UndefOr[CSSProperties] = js.native
  }
  
  trait State extends StObject {
    
    /**
      * Index of the highlighted item, `null` if none currently is.
      */
    var highlightedIndex: Double | Null
    
    /**
      * True when the menu is visible. Provided to `onMenuVisibilityChange`.
      */
    var isOpen: Boolean
    
    /**
      * These three `menu___` values are used in CSS to layout the menu.
      */
    var menuLeft: js.UndefOr[Double] = js.undefined
    
    var menuTop: js.UndefOr[Double] = js.undefined
    
    var menuWidth: js.UndefOr[Double] = js.undefined
  }
  object State {
    
    inline def apply(isOpen: Boolean): State = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], highlightedIndex = null)
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setHighlightedIndex(value: Double): Self = StObject.set(x, "highlightedIndex", value.asInstanceOf[js.Any])
      
      inline def setHighlightedIndexNull: Self = StObject.set(x, "highlightedIndex", null)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setMenuLeft(value: Double): Self = StObject.set(x, "menuLeft", value.asInstanceOf[js.Any])
      
      inline def setMenuLeftUndefined: Self = StObject.set(x, "menuLeft", js.undefined)
      
      inline def setMenuTop(value: Double): Self = StObject.set(x, "menuTop", value.asInstanceOf[js.Any])
      
      inline def setMenuTopUndefined: Self = StObject.set(x, "menuTop", js.undefined)
      
      inline def setMenuWidth(value: Double): Self = StObject.set(x, "menuWidth", value.asInstanceOf[js.Any])
      
      inline def setMenuWidthUndefined: Self = StObject.set(x, "menuWidth", js.undefined)
    }
  }
}
