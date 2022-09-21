package typings.reachCombobox

import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("@reach/combobox/dist/declarations/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@reach/combobox/dist/declarations/src", "Combobox")
  @js.native
  val Combobox: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', ComboboxProps> */ Any = js.native
  
  @JSImport("@reach/combobox/dist/declarations/src", "ComboboxButton")
  @js.native
  val ComboboxButton: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'button', ComboboxButtonProps> */ Any = js.native
  
  @JSImport("@reach/combobox/dist/declarations/src", "ComboboxInput")
  @js.native
  val ComboboxInput: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'input', ComboboxInputProps> */ Any = js.native
  
  @JSImport("@reach/combobox/dist/declarations/src", "ComboboxList")
  @js.native
  val ComboboxList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'ul', ComboboxListProps> */ Any = js.native
  
  @JSImport("@reach/combobox/dist/declarations/src", "ComboboxOption")
  @js.native
  val ComboboxOption: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'li', ComboboxOptionProps> */ Any = js.native
  
  object ComboboxOptionText {
    
    inline def apply(): Element = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Element]
    
    @JSImport("@reach/combobox/dist/declarations/src", "ComboboxOptionText")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@reach/combobox/dist/declarations/src", "ComboboxOptionText.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@reach/combobox/dist/declarations/src", "ComboboxPopover")
  @js.native
  val ComboboxPopover: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', ComboboxPopoverProps & Partial<Omit<PopoverProps, 'unstable_skipInitialRender'>>> */ Any = js.native
  
  inline def escapeRegexp(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRegexp")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * We want the same events when the input or the popup have focus (HOW COOL ARE
    * HOOKS BTW?) This is probably the hairiest piece but it's not bad.
    */
  inline def unstableUseKeyDown(): js.Function1[/* event */ KeyboardEvent[typings.std.Element], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useKeyDown")().asInstanceOf[js.Function1[/* event */ KeyboardEvent[typings.std.Element], Unit]]
  
  inline def useComboboxContext(): ComboboxContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useComboboxContext")().asInstanceOf[ComboboxContextValue]
  
  inline def useComboboxOptionContext(): ComboboxOptionContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useComboboxOptionContext")().asInstanceOf[ComboboxOptionContextValue]
  
  trait ComboboxButtonProps extends StObject
  
  trait ComboboxContextValue extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var isExpanded: Boolean
    
    var navigationValue: ComboboxValue | Null
    
    var state: State
  }
  object ComboboxContextValue {
    
    inline def apply(isExpanded: Boolean, state: State): ComboboxContextValue = {
      val __obj = js.Dynamic.literal(isExpanded = isExpanded.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], navigationValue = null)
      __obj.asInstanceOf[ComboboxContextValue]
    }
    
    extension [Self <: ComboboxContextValue](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setNavigationValue(value: ComboboxValue): Self = StObject.set(x, "navigationValue", value.asInstanceOf[js.Any])
      
      inline def setNavigationValueNull: Self = StObject.set(x, "navigationValue", null)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComboboxInputProps extends StObject {
    
    /**
      * Determines if the value in the input changes or not as the user navigates
      * with the keyboard. If true, the value changes, if false the value doesn't
      * change.
      *
      * Set this to false when you don't really need the value from the input but
      * want to populate some other state (like the recipient selector in Gmail).
      * But if your input is more like a normal `<input type="text"/>`, then leave
      * the `true` default.
      *
      * @see Docs https://reach.tech/combobox#comboboxinput-autocomplete
      */
    var autocomplete: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, when the user clicks inside the text box the current value will
      * be selected. Use this if the user is likely to delete all the text anyway
      * (like the URL bar in browsers).
      *
      * However, if the user is likely to want to tweak the value, leave this
      * false, like a google search--the user is likely wanting to edit their
      * search, not replace it completely.
      *
      * @see Docs https://reach.tech/combobox#comboboxinput-selectonclick
      */
    var selectOnClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @see Docs https://reach.tech/combobox#comboboxinput-value
      */
    var value: js.UndefOr[ComboboxValue] = js.undefined
  }
  object ComboboxInputProps {
    
    inline def apply(): ComboboxInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComboboxInputProps]
    }
    
    extension [Self <: ComboboxInputProps](x: Self) {
      
      inline def setAutocomplete(value: Boolean): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      inline def setSelectOnClick(value: Boolean): Self = StObject.set(x, "selectOnClick", value.asInstanceOf[js.Any])
      
      inline def setSelectOnClickUndefined: Self = StObject.set(x, "selectOnClick", js.undefined)
      
      inline def setValue(value: ComboboxValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ComboboxListProps extends StObject {
    
    /**
      * Defaults to false. When true and the list is opened, if an option's value
      * matches the value in the input, it will automatically be highlighted and
      * be the starting point for any keyboard navigation of the list.
      *
      * This allows you to treat a Combobox more like a `<select>` than an
      * `<input/>`, but be mindful that the user is still able to put any
      * arbitrary value into the input, so if the only valid values for the input
      * are from the list, your app will need to do that validation on blur or
      * submit of the form.
      *
      * @see Docs https://reach.tech/combobox#comboboxlist-persistselection
      */
    var persistSelection: js.UndefOr[Boolean] = js.undefined
  }
  object ComboboxListProps {
    
    inline def apply(): ComboboxListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComboboxListProps]
    }
    
    extension [Self <: ComboboxListProps](x: Self) {
      
      inline def setPersistSelection(value: Boolean): Self = StObject.set(x, "persistSelection", value.asInstanceOf[js.Any])
      
      inline def setPersistSelectionUndefined: Self = StObject.set(x, "persistSelection", js.undefined)
    }
  }
  
  trait ComboboxOptionContextValue extends StObject {
    
    var index: Double
    
    var value: ComboboxValue
  }
  object ComboboxOptionContextValue {
    
    inline def apply(index: Double, value: ComboboxValue): ComboboxOptionContextValue = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComboboxOptionContextValue]
    }
    
    extension [Self <: ComboboxOptionContextValue](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setValue(value: ComboboxValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComboboxOptionProps extends StObject {
    
    /**
      * Optional. If omitted, the `value` will be used as the children like as:
      * `<ComboboxOption value="Seattle, Tacoma, Washington" />`. But if you need
      * to control a bit more, you can put whatever children you want, but make
      * sure to render a `ComboboxOptionText` as well, so the value is still
      * displayed with the text highlighting on the matched portions.
      *
      * @example
      *   <ComboboxOption value="Apple" />
      *     🍎 <ComboboxOptionText />
      *   </ComboboxOption>
      *
      * @see Docs https://reach.tech/combobox#comboboxoption-children
      */
    var children: js.UndefOr[ReactNode | (js.Function1[/* props */ ComboboxOptionContextValue, ReactNode])] = js.undefined
    
    /**
      * TODO: Document this!
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /**
      * The value to match against when suggesting.
      *
      * @see Docs https://reach.tech/combobox#comboboxoption-value
      */
    var value: String
  }
  object ComboboxOptionProps {
    
    inline def apply(value: String): ComboboxOptionProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComboboxOptionProps]
    }
    
    extension [Self <: ComboboxOptionProps](x: Self) {
      
      inline def setChildren(value: ReactNode | (js.Function1[/* props */ ComboboxOptionContextValue, ReactNode])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ ComboboxOptionContextValue => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComboboxPopoverProps extends StObject {
    
    /**
      * If you pass `<ComboboxPopover portal={false} />` the popover will not
      * render inside of a portal, but in the same order as the React tree. This
      * is mostly useful for styling the entire component together, like the pink
      * focus outline in the example earlier in this page.
      *
      * @see Docs https://reach.tech/combobox#comboboxpopover-portal
      */
    var portal: js.UndefOr[Boolean] = js.undefined
  }
  object ComboboxPopoverProps {
    
    inline def apply(): ComboboxPopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComboboxPopoverProps]
    }
    
    extension [Self <: ComboboxPopoverProps](x: Self) {
      
      inline def setPortal(value: Boolean): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
      
      inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
    }
  }
  
  trait ComboboxProps extends StObject {
    
    /**
      * Defines a string value that labels the current element.
      * @see Docs https://reach.tech/combobox#accessibility
      */
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /**
      * Identifies the element (or elements) that labels the current element.
      * @see Docs https://reach.tech/combobox#accessibility
      */
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    /**
      * @see Docs https://reach.tech/combobox#combobox-children
      */
    var children: ReactNode | (js.Function1[/* props */ ComboboxContextValue, ReactNode])
    
    /**
      * Called with the selection value when the user makes a selection from the
      * list.
      *
      * @see Docs https://reach.tech/combobox#combobox-onselect
      */
    var onSelect: js.UndefOr[js.Function1[/* value */ ComboboxValue, Unit]] = js.undefined
    
    /**
      * If true, the popover opens when focus is on the text box.
      *
      * @see Docs https://reach.tech/combobox#combobox-openonfocus
      */
    var openOnFocus: js.UndefOr[Boolean] = js.undefined
  }
  object ComboboxProps {
    
    inline def apply(): ComboboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComboboxProps]
    }
    
    extension [Self <: ComboboxProps](x: Self) {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setChildren(value: ReactNode | (js.Function1[/* props */ ComboboxContextValue, ReactNode])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ ComboboxContextValue => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnSelect(value: /* value */ ComboboxValue => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOpenOnFocus(value: Boolean): Self = StObject.set(x, "openOnFocus", value.asInstanceOf[js.Any])
      
      inline def setOpenOnFocusUndefined: Self = StObject.set(x, "openOnFocus", js.undefined)
    }
  }
  
  type ComboboxValue = String
  
  /* Rewritten from type alias, can be one of: 
    - typings.reachCombobox.reachComboboxStrings.IDLE
    - typings.reachCombobox.reachComboboxStrings.SUGGESTING
    - typings.reachCombobox.reachComboboxStrings.NAVIGATING
    - typings.reachCombobox.reachComboboxStrings.INTERACTING
  */
  trait State extends StObject
  object State {
    
    inline def IDLE: typings.reachCombobox.reachComboboxStrings.IDLE = "IDLE".asInstanceOf[typings.reachCombobox.reachComboboxStrings.IDLE]
    
    inline def INTERACTING: typings.reachCombobox.reachComboboxStrings.INTERACTING = "INTERACTING".asInstanceOf[typings.reachCombobox.reachComboboxStrings.INTERACTING]
    
    inline def NAVIGATING: typings.reachCombobox.reachComboboxStrings.NAVIGATING = "NAVIGATING".asInstanceOf[typings.reachCombobox.reachComboboxStrings.NAVIGATING]
    
    inline def SUGGESTING: typings.reachCombobox.reachComboboxStrings.SUGGESTING = "SUGGESTING".asInstanceOf[typings.reachCombobox.reachComboboxStrings.SUGGESTING]
  }
}
