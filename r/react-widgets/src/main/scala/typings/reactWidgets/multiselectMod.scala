package typings.reactWidgets

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactType
import typings.reactWidgets.anon.Action
import typings.reactWidgets.anon.LastSearchTerm
import typings.reactWidgets.anon.OriginalEvent
import typings.reactWidgets.commonPropsMod.AutoFocus
import typings.reactWidgets.commonPropsMod.ReactWidgetsCommonDropdownProps
import typings.reactWidgets.reactWidgetsBooleans.`false`
import typings.reactWidgets.reactWidgetsStrings.contains
import typings.reactWidgets.reactWidgetsStrings.endsWith
import typings.reactWidgets.reactWidgetsStrings.onFilter
import typings.reactWidgets.reactWidgetsStrings.startsWith
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiselectMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-widgets/lib/Multiselect", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends Component[MultiselectProps, ComponentState, js.Any] {
    def this(props: MultiselectProps) = this()
    def this(props: MultiselectProps, context: js.Any) = this()
  }
  @JSImport("react-widgets/lib/Multiselect", JSImport.Namespace)
  @js.native
  val ^ : js.Object & MultiselectClass = js.native
  
  type MultiselectClass = ComponentClass[MultiselectProps, ComponentState]
  
  trait MultiselectMessages extends StObject {
    
    /**
      * The text label for creating new tags.
      * @default "(create new tag)"
      */
    var createNew: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.undefined
    
    var createOption: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.undefined
    
    /**
      * Text to display when the the current filter does not return any results.
      * @default "The filter returned no results"
      */
    var emptyFilter: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.undefined
    
    /**
      * Text to display when the data prop array is empty.
      * @default "There are no items in this list"
      */
    var emptyList: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.undefined
    
    var noneSelected: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.undefined
    
    var open: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.undefined
    
    var removeLabel: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.undefined
    
    var selectedItems: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.undefined
    
    var tagsLabel: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.undefined
  }
  object MultiselectMessages {
    
    inline def apply(): MultiselectMessages = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiselectMessages]
    }
    
    extension [Self <: MultiselectMessages](x: Self) {
      
      inline def setCreateNew(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = StObject.set(x, "createNew", value.asInstanceOf[js.Any])
      
      inline def setCreateNewFunction1(value: /* props */ MultiselectProps => String): Self = StObject.set(x, "createNew", js.Any.fromFunction1(value))
      
      inline def setCreateNewUndefined: Self = StObject.set(x, "createNew", js.undefined)
      
      inline def setCreateOption(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = StObject.set(x, "createOption", value.asInstanceOf[js.Any])
      
      inline def setCreateOptionFunction1(value: /* props */ MultiselectProps => String): Self = StObject.set(x, "createOption", js.Any.fromFunction1(value))
      
      inline def setCreateOptionUndefined: Self = StObject.set(x, "createOption", js.undefined)
      
      inline def setEmptyFilter(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = StObject.set(x, "emptyFilter", value.asInstanceOf[js.Any])
      
      inline def setEmptyFilterFunction1(value: /* props */ MultiselectProps => String): Self = StObject.set(x, "emptyFilter", js.Any.fromFunction1(value))
      
      inline def setEmptyFilterUndefined: Self = StObject.set(x, "emptyFilter", js.undefined)
      
      inline def setEmptyList(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = StObject.set(x, "emptyList", value.asInstanceOf[js.Any])
      
      inline def setEmptyListFunction1(value: /* props */ MultiselectProps => String): Self = StObject.set(x, "emptyList", js.Any.fromFunction1(value))
      
      inline def setEmptyListUndefined: Self = StObject.set(x, "emptyList", js.undefined)
      
      inline def setNoneSelected(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = StObject.set(x, "noneSelected", value.asInstanceOf[js.Any])
      
      inline def setNoneSelectedFunction1(value: /* props */ MultiselectProps => String): Self = StObject.set(x, "noneSelected", js.Any.fromFunction1(value))
      
      inline def setNoneSelectedUndefined: Self = StObject.set(x, "noneSelected", js.undefined)
      
      inline def setOpen(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenFunction1(value: /* props */ MultiselectProps => String): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setRemoveLabel(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = StObject.set(x, "removeLabel", value.asInstanceOf[js.Any])
      
      inline def setRemoveLabelFunction1(value: /* props */ MultiselectProps => String): Self = StObject.set(x, "removeLabel", js.Any.fromFunction1(value))
      
      inline def setRemoveLabelUndefined: Self = StObject.set(x, "removeLabel", js.undefined)
      
      inline def setSelectedItems(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsFunction1(value: /* props */ MultiselectProps => String): Self = StObject.set(x, "selectedItems", js.Any.fromFunction1(value))
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setTagsLabel(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = StObject.set(x, "tagsLabel", value.asInstanceOf[js.Any])
      
      inline def setTagsLabelFunction1(value: /* props */ MultiselectProps => String): Self = StObject.set(x, "tagsLabel", js.Any.fromFunction1(value))
      
      inline def setTagsLabelUndefined: Self = StObject.set(x, "tagsLabel", js.undefined)
    }
  }
  
  trait MultiselectProps
    extends StObject
       with ReactWidgetsCommonDropdownProps
       with AutoFocus {
    
    /**
      * Enables the list option creation UI. onFilter will only the UI when actively filtering for a list item.
      * @default 'onFilter'
      */
    var allowCreate: js.UndefOr[Boolean | onFilter] = js.undefined
    
    /**
      * mark whether the widget is in a busy or loading state. If true the widget will display a
      * spinner gif, useful when loading data via an ajax call.
      * @default false
      */
    var busy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use in conjunction with the filter prop. Filter the list without regard for case. This
      * only applies to non function values for filter.
      * @default false
      */
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Adds a css class to the input container element.
      */
    var containerClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Provide an array of possible values for the Multiselect. If an array of objects is
      * provided you should use the valueField and textField props, to specify which object
      * properties comprise the value field (such as an id) and the field used to label the item.
      */
    var data: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /**
      * Default Value.
      */
    var defaultValue: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /**
      * The speed, in milliseconds, of the dropdown animation.
      * @default 250
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Specify a filtering method used to reduce the items in the dropdown as you type. There
      * are a few built-in filtering methods that can be specified by passing the String name.
      * You can explicitly opt out of filtering by setting filter to false. To handle custom
      * filtering techniques provide a function that returns true or false for each passed in
      * item (analogous to the array.filter builtin)
      * @default startsWith
      */
    var filter: js.UndefOr[
        `false` | startsWith | endsWith | contains | (js.Function2[/* dataItem */ js.Any, /* searchTerm */ String, Boolean])
      ] = js.undefined
    
    /**
      * Determines how to group the Multiselect values. Providing a string will group the data
      * array by that property. You can also provide a 'function' which should return the group
      * value.
      */
    var groupBy: js.UndefOr[String | (js.Function1[/* dataItem */ js.Any, js.Any])] = js.undefined
    
    /**
      * This component is used to render each option group, when groupBy is specified. By default
      * the groupBy value will be used.
      */
    var groupComponent: js.UndefOr[ReactType[js.Any]] = js.undefined
    
    /**
      * An object of props that is passed directly to the underlying input component.
      */
    var inputProps: js.UndefOr[js.Object] = js.undefined
    
    /**
      * This component is used to render each possible item in the list. The default component
      * renders the text of the selected item (specified by textfield).
      */
    var itemComponent: js.UndefOr[ReactType[js.Any]] = js.undefined
    
    /**
      * @default List
      */
    var listComponent: js.UndefOr[ReactType[js.Any] | String] = js.undefined
    
    /**
      * An object of props that is passed directly to the underlying List component.
      */
    var listProps: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Object hash containing display text and/or text for screen readers. Use the messages
      * object to localize widget text and increase accessibility.
      */
    var messages: js.UndefOr[MultiselectMessages] = js.undefined
    
    /**
      * Use in conjunction with the filter prop. Start filtering the list only after the value
      * has reached a minimum length.
      * @default 1
      */
    var minLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Change event Handler that is called when the value is changed. The handler is called with
      * an array of values.
      */
    var onChange: js.UndefOr[js.Function2[/* dataItems */ js.Array[js.Any], /* metadata */ Action, Unit]] = js.undefined
    
    /**
      * This handler fires when the user chooses to create a new tag, not in the data list. It is
      * up to the widget parent to implement creation logic, a common implementation is shown
      * below, where the new tag is selected and added to the data list.
      */
    var onCreate: js.UndefOr[js.Function1[/* searchTerm */ String, Unit]] = js.undefined
    
    /**
      * Called when the value of the text box changes either from typing or a pasted value.
      * onSearch should be used when the searchTerm prop is set.
      */
    var onSearch: js.UndefOr[js.Function2[/* searchTerm */ String, /* metadata */ LastSearchTerm, Unit]] = js.undefined
    
    /**
      * This handler fires when an item has been selected from the list. It fires before the
      * onChange handler, and fires regardless of whether the value has actually changed
      */
    var onSelect: js.UndefOr[js.Function2[/* value */ js.Any, /* metadata */ OriginalEvent, Unit]] = js.undefined
    
    /**
      * Called when the Multiselect is about to open or close. onToggle should be used when the
      * open prop is set otherwise the widget will never open or close.
      */
    var onToggle: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.undefined
    
    /**
      * Whether or not the Multiselect is open. When unset (undefined) the Multiselect will
      * handle the opening and closing internally. The defaultOpen prop can be used to set an
      * initialization value for uncontrolled widgets.
      */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The same as an input placeholder, only works in browsers that support the placeholder
      * attribute for inputs
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * A Transition component from react-transition-group v2.
      * The provided component will be used instead of the default SlideDownTransition for fully customizable animations.
      * The transition component is also injected with a dropUp prop indicating the direction it should open.
      */
    var popupTransition: js.UndefOr[ReactType[js.Any] | String] = js.undefined
    
    /**
      * The string value of the current search being typed into the Multiselect. When unset
      * (undefined) the Multiselect will handle the filtering internally. The defaultSearchTerm
      * prop can be used to set an initialization value for uncontrolled widgets.
      */
    var searchTerm: js.UndefOr[String] = js.undefined
    
    /**
      * This component is used to render each selected item. The default component renders the
      * text of the selected item (specified by textfield).
      */
    var tagComponent: js.UndefOr[ReactType[js.Any] | String] = js.undefined
    
    /**
      * Specify which data item field to display in the Multiselect and selected item. The
      * textField prop may also also used as to find an item in the list as you type. Providing
      * an accessor function allows for computed text values.
      */
    var textField: js.UndefOr[String | (js.Function1[/* dataItem */ js.Any, String])] = js.undefined
    
    /**
      * The current values of the Multiselect. The value should can null, or an array of
      * valueField values, or an array of objects (such as a few items in the data array)
      */
    var value: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /**
      * A dataItem field name for uniquely identifying items in the data list. A valueField is
      * required when the value prop is not itself a dataItem. A valueField is useful when
      * specifying the selected item, by its id instead of using the model as the value.
      * When a valueField is not provided, the Multiselect will use strict equality checks (===)
      * to locate the value in the data list.
      */
    var valueField: js.UndefOr[String] = js.undefined
  }
  object MultiselectProps {
    
    inline def apply(): MultiselectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiselectProps]
    }
    
    extension [Self <: MultiselectProps](x: Self) {
      
      inline def setAllowCreate(value: Boolean | onFilter): Self = StObject.set(x, "allowCreate", value.asInstanceOf[js.Any])
      
      inline def setAllowCreateUndefined: Self = StObject.set(x, "allowCreate", js.undefined)
      
      inline def setBusy(value: Boolean): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
      
      inline def setBusyUndefined: Self = StObject.set(x, "busy", js.undefined)
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      inline def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setDefaultValue(value: js.Array[js.Any]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: js.Any*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setFilter(
        value: `false` | startsWith | endsWith | contains | (js.Function2[/* dataItem */ js.Any, /* searchTerm */ String, Boolean])
      ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction2(value: (/* dataItem */ js.Any, /* searchTerm */ String) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setGroupBy(value: String | (js.Function1[/* dataItem */ js.Any, js.Any])): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      inline def setGroupByFunction1(value: /* dataItem */ js.Any => js.Any): Self = StObject.set(x, "groupBy", js.Any.fromFunction1(value))
      
      inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      inline def setGroupComponent(value: ReactType[js.Any]): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
      
      inline def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
      
      inline def setInputProps(value: js.Object): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setItemComponent(value: ReactType[js.Any]): Self = StObject.set(x, "itemComponent", value.asInstanceOf[js.Any])
      
      inline def setItemComponentUndefined: Self = StObject.set(x, "itemComponent", js.undefined)
      
      inline def setListComponent(value: ReactType[js.Any] | String): Self = StObject.set(x, "listComponent", value.asInstanceOf[js.Any])
      
      inline def setListComponentUndefined: Self = StObject.set(x, "listComponent", js.undefined)
      
      inline def setListProps(value: js.Object): Self = StObject.set(x, "listProps", value.asInstanceOf[js.Any])
      
      inline def setListPropsUndefined: Self = StObject.set(x, "listProps", js.undefined)
      
      inline def setMessages(value: MultiselectMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setOnChange(value: (/* dataItems */ js.Array[js.Any], /* metadata */ Action) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnCreate(value: /* searchTerm */ String => Unit): Self = StObject.set(x, "onCreate", js.Any.fromFunction1(value))
      
      inline def setOnCreateUndefined: Self = StObject.set(x, "onCreate", js.undefined)
      
      inline def setOnSearch(value: (/* searchTerm */ String, /* metadata */ LastSearchTerm) => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction2(value))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      inline def setOnSelect(value: (/* value */ js.Any, /* metadata */ OriginalEvent) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnToggle(value: /* isOpen */ Boolean => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPopupTransition(value: ReactType[js.Any] | String): Self = StObject.set(x, "popupTransition", value.asInstanceOf[js.Any])
      
      inline def setPopupTransitionUndefined: Self = StObject.set(x, "popupTransition", js.undefined)
      
      inline def setSearchTerm(value: String): Self = StObject.set(x, "searchTerm", value.asInstanceOf[js.Any])
      
      inline def setSearchTermUndefined: Self = StObject.set(x, "searchTerm", js.undefined)
      
      inline def setTagComponent(value: ReactType[js.Any] | String): Self = StObject.set(x, "tagComponent", value.asInstanceOf[js.Any])
      
      inline def setTagComponentUndefined: Self = StObject.set(x, "tagComponent", js.undefined)
      
      inline def setTextField(value: String | (js.Function1[/* dataItem */ js.Any, String])): Self = StObject.set(x, "textField", value.asInstanceOf[js.Any])
      
      inline def setTextFieldFunction1(value: /* dataItem */ js.Any => String): Self = StObject.set(x, "textField", js.Any.fromFunction1(value))
      
      inline def setTextFieldUndefined: Self = StObject.set(x, "textField", js.undefined)
      
      inline def setValue(value: js.Array[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueField(value: String): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
      
      inline def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  type _To = js.Object & MultiselectClass
  
  /* This means you don't have to write `^`, but can instead just say `multiselectMod.foo` */
  override def _to: js.Object & MultiselectClass = ^
}
