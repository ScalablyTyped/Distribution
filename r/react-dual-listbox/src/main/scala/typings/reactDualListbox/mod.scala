package typings.reactDualListbox

import typings.react.mod.Component
import typings.reactDualListbox.anon.kinavailableFilterHeadera
import typings.reactDualListbox.anon.kinmoveLeftmoveAllLeftmov
import typings.reactDualListbox.reactDualListboxStrings.middle
import typings.reactDualListbox.reactDualListboxStrings.top
import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dual-listbox", JSImport.Default)
  @js.native
  open class default[P, F /* <: Boolean */, V /* <: Boolean */] ()
    extends Component[DualListBoxProperties[P, F, V], js.Object, Any]
  
  trait CategoryOption[T]
    extends StObject
       with Option[T] {
    
    /**
      * Whether the category is disabled or not.
      *
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The category label.
      */
    var label: String
    
    /**
      * The category child options.
      */
    var options: js.Array[Option[T]]
    
    /**
      * Adds the HTML `title` attribute to the option.
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object CategoryOption {
    
    inline def apply[T](label: String, options: js.Array[Option[T]]): CategoryOption[T] = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[CategoryOption[T]]
    }
    
    extension [Self <: CategoryOption[?], T](x: Self & CategoryOption[T]) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Array[Option[T]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: Option[T]*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait CommonProperties[T] extends StObject {
    
    /**
      * Override the default alignment of action buttons.
      *
      * @default "middle"
      */
    var alignActions: js.UndefOr[top | middle] = js.undefined
    
    /**
      * If true, duplicate options will be allowed in the selected list box.
      *
      * @default false
      */
    var allowDuplicates: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A subset of the `options` array to optionally filter the available list
      * box.
      */
    var available: js.UndefOr[js.Array[T]] = js.undefined
    
    /**
      * A React function `ref` to the "available" list box.
      *
      * @default null
      */
    var availableRef: js.UndefOr[(js.Function1[/* availableInput */ HTMLSelectElement, Unit]) | Null] = js.undefined
    
    /**
      * An optional `className` to apply to the root node.
      *
      * @default null
      */
    var className: js.UndefOr[String | Null] = js.undefined
    
    /**
      * If true, both "available" and "selected" list boxes will be disabled.
      *
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A key-value pairing of action icons and their React nodes.
      */
    var icons: js.UndefOr[kinmoveLeftmoveAllLeftmov] = js.undefined
    
    /**
      * An HTML ID prefix for the various sub elements.
      *
      * @default null
      */
    var id: js.UndefOr[String | Null] = js.undefined
    
    /**
      * A key-value pairing of localized text.
      */
    var lang: js.UndefOr[kinavailableFilterHeadera] = js.undefined
    
    /**
      * A list of key codes that will trigger a toggle of the selected options.
      *
      * @default [13, 32]
      */
    var moveKeyCodes: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * A value for the `name` attribute on the hidden `<input />` element. This is potentially
      * useful for form submissions.
      *
      * @default null
      */
    var name: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Available options.
      */
    var options: js.Array[Option[T]]
    
    /**
      * This flag will preserve the selection order.  By default, `react-dual-listbox` orders
      * selected items according to the order of the `options` property.
      *
      * @default false
      */
    var preserveSelectOrder: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Selected options.
      */
    var selected: js.UndefOr[js.Array[T]] = js.undefined
    
    /**
      * A React function `ref` to the "selected" list box.
      */
    var selectedRef: js.UndefOr[(js.Function1[/* availableInput */ HTMLSelectElement, Unit]) | Null] = js.undefined
    
    /**
      * If true, labels above both the available and selected list boxes will appear. These labels
      * derive from `lang`.
      *
      * @default false
      */
    var showHeaderLabels: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, text will appear in place of the available/selected list boxes when no options are
      * present.
      *
      * @default false;
      */
    var showNoOptionsText: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, a set of up/down buttons will appear near the selected list box to allow the user
      * to re-arrange the items.
      *
      * @default false
      */
    var showOrderButtons: js.UndefOr[Boolean] = js.undefined
  }
  object CommonProperties {
    
    inline def apply[T](options: js.Array[Option[T]]): CommonProperties[T] = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonProperties[T]]
    }
    
    extension [Self <: CommonProperties[?], T](x: Self & CommonProperties[T]) {
      
      inline def setAlignActions(value: top | middle): Self = StObject.set(x, "alignActions", value.asInstanceOf[js.Any])
      
      inline def setAlignActionsUndefined: Self = StObject.set(x, "alignActions", js.undefined)
      
      inline def setAllowDuplicates(value: Boolean): Self = StObject.set(x, "allowDuplicates", value.asInstanceOf[js.Any])
      
      inline def setAllowDuplicatesUndefined: Self = StObject.set(x, "allowDuplicates", js.undefined)
      
      inline def setAvailable(value: js.Array[T]): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setAvailableRef(value: /* availableInput */ HTMLSelectElement => Unit): Self = StObject.set(x, "availableRef", js.Any.fromFunction1(value))
      
      inline def setAvailableRefNull: Self = StObject.set(x, "availableRef", null)
      
      inline def setAvailableRefUndefined: Self = StObject.set(x, "availableRef", js.undefined)
      
      inline def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
      
      inline def setAvailableVarargs(value: T*): Self = StObject.set(x, "available", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameNull: Self = StObject.set(x, "className", null)
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcons(value: kinmoveLeftmoveAllLeftmov): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLang(value: kinavailableFilterHeadera): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setMoveKeyCodes(value: js.Array[Double]): Self = StObject.set(x, "moveKeyCodes", value.asInstanceOf[js.Any])
      
      inline def setMoveKeyCodesUndefined: Self = StObject.set(x, "moveKeyCodes", js.undefined)
      
      inline def setMoveKeyCodesVarargs(value: Double*): Self = StObject.set(x, "moveKeyCodes", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOptions(value: js.Array[Option[T]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: Option[T]*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPreserveSelectOrder(value: Boolean): Self = StObject.set(x, "preserveSelectOrder", value.asInstanceOf[js.Any])
      
      inline def setPreserveSelectOrderUndefined: Self = StObject.set(x, "preserveSelectOrder", js.undefined)
      
      inline def setSelected(value: js.Array[T]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedRef(value: /* availableInput */ HTMLSelectElement => Unit): Self = StObject.set(x, "selectedRef", js.Any.fromFunction1(value))
      
      inline def setSelectedRefNull: Self = StObject.set(x, "selectedRef", null)
      
      inline def setSelectedRefUndefined: Self = StObject.set(x, "selectedRef", js.undefined)
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSelectedVarargs(value: T*): Self = StObject.set(x, "selected", js.Array(value*))
      
      inline def setShowHeaderLabels(value: Boolean): Self = StObject.set(x, "showHeaderLabels", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderLabelsUndefined: Self = StObject.set(x, "showHeaderLabels", js.undefined)
      
      inline def setShowNoOptionsText(value: Boolean): Self = StObject.set(x, "showNoOptionsText", value.asInstanceOf[js.Any])
      
      inline def setShowNoOptionsTextUndefined: Self = StObject.set(x, "showNoOptionsText", js.undefined)
      
      inline def setShowOrderButtons(value: Boolean): Self = StObject.set(x, "showOrderButtons", value.asInstanceOf[js.Any])
      
      inline def setShowOrderButtonsUndefined: Self = StObject.set(x, "showOrderButtons", js.undefined)
    }
  }
  
  type DualListBox[P, F /* <: Boolean */, V /* <: Boolean */] = Component[DualListBoxProperties[P, F, V], js.Object, Any]
  
  trait DualListBoxProperties[P, F /* <: Boolean */, V /* <: Boolean */]
    extends StObject
       with CommonProperties[P]
       with FilterProperties[P, F]
       with ValueProperties[P, V]
  object DualListBoxProperties {
    
    inline def apply[P, F /* <: Boolean */, V /* <: Boolean */](options: js.Array[Option[P]]): DualListBoxProperties[P, F, V] = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[DualListBoxProperties[P, F, V]]
    }
  }
  
  trait Filter[T] extends StObject {
    
    /**
      * Available options.
      */
    var available: js.Array[T]
    
    /**
      * Selected options.
      */
    var selected: js.Array[T]
  }
  object Filter {
    
    inline def apply[T](available: js.Array[T], selected: js.Array[T]): Filter[T] = {
      val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filter[T]]
    }
    
    extension [Self <: Filter[?], T](x: Self & Filter[T]) {
      
      inline def setAvailable(value: js.Array[T]): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setAvailableVarargs(value: T*): Self = StObject.set(x, "available", js.Array(value*))
      
      inline def setSelected(value: js.Array[T]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedVarargs(value: T*): Self = StObject.set(x, "selected", js.Array(value*))
    }
  }
  
  trait FilterProperties[T, F /* <: Boolean */] extends StObject {
    
    /**
      * Flag that determines whether filtering is enabled.
      *
      * @default false
      */
    var canFilter: js.UndefOr[F] = js.undefined
    
    /**
      * Control the filter search text.
      */
    var filter: js.UndefOr[Filter[T]] = js.undefined
    
    /**
      * Override the default filtering function.
      */
    var filterCallback: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: F extends true ? (option : react-dual-listbox.react-dual-listbox.Option<T>, filterInput : string): boolean : undefined */ js.Any
      ] = js.undefined
    
    /**
      * Override the default filter placeholder.
      */
    var filterPlaceholder: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: F extends true ? string : undefined */ js.Any
      ] = js.undefined
    
    /**
      * Handle filter change.
      */
    var onFilterChange: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: F extends true ? (filter : string): void : undefined */ js.Any
      ] = js.undefined
  }
  object FilterProperties {
    
    inline def apply[T, F /* <: Boolean */](): FilterProperties[T, F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterProperties[T, F]]
    }
    
    extension [Self <: FilterProperties[?, ?], T, F /* <: Boolean */](x: Self & (FilterProperties[T, F])) {
      
      inline def setCanFilter(value: F): Self = StObject.set(x, "canFilter", value.asInstanceOf[js.Any])
      
      inline def setCanFilterUndefined: Self = StObject.set(x, "canFilter", js.undefined)
      
      inline def setFilter(value: Filter[T]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterCallback(
        value: /* import warning: importer.ImportType#apply Failed type conversion: F extends true ? (option : react-dual-listbox.react-dual-listbox.Option<T>, filterInput : string): boolean : undefined */ js.Any
      ): Self = StObject.set(x, "filterCallback", value.asInstanceOf[js.Any])
      
      inline def setFilterCallbackUndefined: Self = StObject.set(x, "filterCallback", js.undefined)
      
      inline def setFilterPlaceholder(
        value: /* import warning: importer.ImportType#apply Failed type conversion: F extends true ? string : undefined */ js.Any
      ): Self = StObject.set(x, "filterPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setFilterPlaceholderUndefined: Self = StObject.set(x, "filterPlaceholder", js.undefined)
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setOnFilterChange(
        value: /* import warning: importer.ImportType#apply Failed type conversion: F extends true ? (filter : string): void : undefined */ js.Any
      ): Self = StObject.set(x, "onFilterChange", value.asInstanceOf[js.Any])
      
      inline def setOnFilterChangeUndefined: Self = StObject.set(x, "onFilterChange", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDualListbox.mod.ValueOption[T]
    - typings.reactDualListbox.mod.CategoryOption[T]
  */
  trait Option[T] extends StObject
  object Option {
    
    inline def CategoryOption[T](label: String, options: js.Array[Option[T]]): typings.reactDualListbox.mod.CategoryOption[T] = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDualListbox.mod.CategoryOption[T]]
    }
    
    inline def ValueOption[T](label: String, value: T): typings.reactDualListbox.mod.ValueOption[T] = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDualListbox.mod.ValueOption[T]]
    }
  }
  
  trait ValueOption[T]
    extends StObject
       with Option[T] {
    
    /**
      * Whether the option is disabled or not.
      *
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The option label.
      */
    var label: String
    
    /**
      * Adds the HTML `title` attribute to the option.
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * The option value.
      */
    var value: T
  }
  object ValueOption {
    
    inline def apply[T](label: String, value: T): ValueOption[T] = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueOption[T]]
    }
    
    extension [Self <: ValueOption[?], T](x: Self & ValueOption[T]) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueProperties[T, V /* <: Boolean */] extends StObject {
    
    /**
      * The handler called when options are moved to either side.
      */
    // onChange?: (selected: (T | Option<T>)[]) => void;
    var onChange: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: V extends true ? std.Array<T> : std.Array<react-dual-listbox.react-dual-listbox.Option<T>> */ /* selected */ js.Any, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * If true, the selected value passed in onChange is an array of string values.
      * Otherwise, it is an array of options.
      *
      * @default true
      */
    var simpleValue: js.UndefOr[V] = js.undefined
  }
  object ValueProperties {
    
    inline def apply[T, V /* <: Boolean */](): ValueProperties[T, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueProperties[T, V]]
    }
    
    extension [Self <: ValueProperties[?, ?], T, V /* <: Boolean */](x: Self & (ValueProperties[T, V])) {
      
      inline def setOnChange(
        value: /* import warning: importer.ImportType#apply Failed type conversion: V extends true ? std.Array<T> : std.Array<react-dual-listbox.react-dual-listbox.Option<T>> */ /* selected */ js.Any => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setSimpleValue(value: V): Self = StObject.set(x, "simpleValue", value.asInstanceOf[js.Any])
      
      inline def setSimpleValueUndefined: Self = StObject.set(x, "simpleValue", js.undefined)
    }
  }
}
