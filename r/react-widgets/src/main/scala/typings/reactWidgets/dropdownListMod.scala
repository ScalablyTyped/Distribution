package typings.reactWidgets

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.react.mod.ReactType
import typings.reactWidgets.commonPropsMod.AutoFocus
import typings.reactWidgets.commonPropsMod.ReactWidgetsCommonDropdownProps
import typings.reactWidgets.reactWidgetsBooleans.`false`
import typings.reactWidgets.reactWidgetsStrings.contains
import typings.reactWidgets.reactWidgetsStrings.endsWith
import typings.reactWidgets.reactWidgetsStrings.onFilter
import typings.reactWidgets.reactWidgetsStrings.startsWith
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownListMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-widgets/lib/DropdownList", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends Component[DropdownListProps, ComponentState, js.Any] {
    def this(props: DropdownListProps) = this()
    def this(props: DropdownListProps, context: js.Any) = this()
  }
  @JSImport("react-widgets/lib/DropdownList", JSImport.Namespace)
  @js.native
  val ^ : DropdownListClass = js.native
  
  type DropdownListClass = ComponentClass[DropdownListProps, ComponentState]
  
  @js.native
  trait DropdownListMessages extends StObject {
    
    /**
      * Text to display for the create option
      * @default: "Create option {text}"
      */
    var createOption: js.UndefOr[String | (js.Function1[/* props */ DropdownListProps, String])] = js.native
    
    /**
      * Text to display when the the current filter does not return any results.
      * @default: "The filter returned no results"
      */
    var emptyFilter: js.UndefOr[String | (js.Function1[/* props */ DropdownListProps, String])] = js.native
    
    /**
      * Text to display when the data prop array is empty.
      * @default: "There are no items in this list"
      */
    var emptyList: js.UndefOr[String | (js.Function1[/* props */ DropdownListProps, String])] = js.native
    
    /**
      * The placeholder text for the filter input.
      */
    var filterPlaceholder: js.UndefOr[String | (js.Function1[/* props */ DropdownListProps, String])] = js.native
    
    /**
      * Dropdown button text for screen readers.
      * @default: "Open Dropdown"
      */
    var open: js.UndefOr[String | (js.Function1[/* props */ DropdownListProps, String])] = js.native
  }
  object DropdownListMessages {
    
    @scala.inline
    def apply(): DropdownListMessages = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownListMessages]
    }
    
    @scala.inline
    implicit class DropdownListMessagesMutableBuilder[Self <: DropdownListMessages] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateOption(value: String | (js.Function1[/* props */ DropdownListProps, String])): Self = StObject.set(x, "createOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateOptionFunction1(value: /* props */ DropdownListProps => String): Self = StObject.set(x, "createOption", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateOptionUndefined: Self = StObject.set(x, "createOption", js.undefined)
      
      @scala.inline
      def setEmptyFilter(value: String | (js.Function1[/* props */ DropdownListProps, String])): Self = StObject.set(x, "emptyFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyFilterFunction1(value: /* props */ DropdownListProps => String): Self = StObject.set(x, "emptyFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmptyFilterUndefined: Self = StObject.set(x, "emptyFilter", js.undefined)
      
      @scala.inline
      def setEmptyList(value: String | (js.Function1[/* props */ DropdownListProps, String])): Self = StObject.set(x, "emptyList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyListFunction1(value: /* props */ DropdownListProps => String): Self = StObject.set(x, "emptyList", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmptyListUndefined: Self = StObject.set(x, "emptyList", js.undefined)
      
      @scala.inline
      def setFilterPlaceholder(value: String | (js.Function1[/* props */ DropdownListProps, String])): Self = StObject.set(x, "filterPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterPlaceholderFunction1(value: /* props */ DropdownListProps => String): Self = StObject.set(x, "filterPlaceholder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterPlaceholderUndefined: Self = StObject.set(x, "filterPlaceholder", js.undefined)
      
      @scala.inline
      def setOpen(value: String | (js.Function1[/* props */ DropdownListProps, String])): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenFunction1(value: /* props */ DropdownListProps => String): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    }
  }
  
  @js.native
  trait DropdownListProps
    extends ReactWidgetsCommonDropdownProps
       with AutoFocus {
    
    /**
      * Allow to create a new option on the data list.
      */
    var allowCreate: js.UndefOr[Boolean | onFilter] = js.native
    
    /**
      * Mark whether the widget is in a busy or loading state. If true the widget will display a
      * spinner gif, useful when loading data via an ajax call.
      * @default false
      */
    var busy: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional ReactNode to override the spinner gif element when the busy property
      * is set to true.
      */
    var busySpinner: js.UndefOr[ReactNode] = js.native
    
    /**
      * Use in conjunction with the filter prop. Filter the list without regard for case. This
      * only applies to non function values for filter
      * @default false
      */
    var caseSensitive: js.UndefOr[Boolean] = js.native
    
    /**
      * Adds a css class to the input container element.
      */
    var containerClassName: js.UndefOr[String] = js.native
    
    /**
      * Provide an array of possible values for the DropdownList. If an array of objects is
      * provided you should use the valueField and textField props, to specify which object
      * properties comprise the value field (such as an id) and the field used to label the item.
      */
    var data: js.UndefOr[js.Array[_]] = js.native
    
    /**
      * The defaultOpen prop can be used to set an
      * initialization value for uncontrolled widgets.
      */
    var defaultOpen: js.UndefOr[Boolean] = js.native
    
    /**
      * Default value.
      */
    var defaultValue: js.UndefOr[js.Any] = js.native
    
    /**
      * Delay
      * @default 250
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * The speed, in milliseconds, of the dropdown animation.
      * @default 250
      */
    var duration: js.UndefOr[Double] = js.native
    
    /**
      * Specify a filtering method used to reduce the items in the dropdown as you type.
      * There are a few built-in filtering methods that can be specified by passing the String name.
      * To handle custom filtering techniques provide a function that returns true or false
      * for each passed in item (analogous to the array.filter builtin)
      */
    var filter: js.UndefOr[
        `false` | startsWith | endsWith | contains | (js.Function2[/* dataItem */ js.Any, /* str */ String, Boolean])
      ] = js.native
    
    /**
      * Determines how to group the DropdownList. Providing a string will group the data array by
      * that property. You can also provide a function which should return the group value.
      */
    var groupBy: js.UndefOr[String | (js.Function1[/* dataItem */ js.Any, _])] = js.native
    
    /**
      * This component is used to render each option group, when groupBy is specified. By default
      * the groupBy value will be used.
      */
    var groupComponent: js.UndefOr[ReactType[_]] = js.native
    
    /**
      * This component is used to render each possible item in the DropdownList. The default
      * component renders the text of the selected item (specified by textfield)
      */
    var itemComponent: js.UndefOr[ReactType[_] | String] = js.native
    
    var listComponent: js.UndefOr[ReactType[_] | String] = js.native
    
    /**
      * An object of props that is passed directly to the underlying List component.
      */
    var listProps: js.UndefOr[js.Object] = js.native
    
    /**
      * Object hash containing display text and/or text for screen readers. Use the messages
      * object to localize widget text and increase accessibility.
      */
    var messages: js.UndefOr[DropdownListMessages] = js.native
    
    /**
      * Use in conjunction with the filter prop. Start filtering the list only after the value
      * has reached a minimum length.
      * @default 1
      */
    var minLength: js.UndefOr[Double] = js.native
    
    /**
      * Whether or not the SelectList allows multiple selection or not.
      * when false the SelectList will render as a list of radio buttons, and checkboxes when true.
      */
    var multiple: js.UndefOr[Boolean] = js.native
    
    /**
      * The HTML name attribute used to group checkboxes and radio buttons together.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Change event Handler that is called when the value is changed.
      */
    var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
    
    /**
      * Create event Handler that is called when a new option is added to the data list.
      */
    var onCreate: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
    
    /**
      * The native onKeyDown event, called preventDefault will prevent any custom behavior, included keyboard shortcuts.
      */
    var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
    
    /**
      * The native onKeyPress event, called preventDefault will stop any custom behavior.
      */
    var onKeyPress: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
    
    /**
      * Called when the value of the filter input changes either from typing or a pasted value.
      * onSearch should be used when the searchTerm prop is set.
      */
    var onSearch: js.UndefOr[js.Function1[/* searchTerm */ String, Unit]] = js.native
    
    /**
      * This handler fires when an item has been selected from the list. It fires before the
      * onChange handler, and fires regardless of whether the value has actually changed.
      */
    var onSelect: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
    
    /**
      * Called when the DropdownList is about to open or close. onToggle should be used when the
      * open prop is set otherwise the widget open buttons won't work.
      */
    var onToggle: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.native
    
    /**
      * Whether or not the DropdownList is open. When unset (undefined) the DropdownList will
      * handle the opening and closing internally.
      */
    var open: js.UndefOr[Boolean] = js.native
    
    /**
      * Text to display when the value is empty.
      */
    var placeholder: js.UndefOr[String] = js.native
    
    /**
      * The string value of the current search being typed into the DropdownList. When unset
      * (undefined) the DropdownList will handle the filtering internally. The defaultSearchTerm
      * prop can be used to set an initialization value for uncontrolled widgets. searchTerm is
      * only relevant when the filter prop is set.
      */
    var searchTerm: js.UndefOr[String] = js.native
    
    /**
      * Specify which data item field to display in the DropdownList and selected item.
      * ThetextFieldprop may also also used as to find an item in the list as you type. Providing
      * an accessor function allows for computed text values
      */
    var textField: js.UndefOr[String | (js.Function1[/* dataItem */ js.Any, String])] = js.native
    
    /**
      * The current value of the DropdownList. This can be an object (such as a member of the
      * data array) or a primitive value, hinted to by the valueField. The widget value does not
      * need to be in the data array; widgets can have values that are not in their list.
      */
    var value: js.UndefOr[js.Any] = js.native
    
    /**
      * This component is used to render the selected value of the DropdownList. The default
      * component renders the text of the selected item (specified by textfield)
      */
    var valueComponent: js.UndefOr[ReactType[_]] = js.native
    
    /**
      * A dataItem field name for uniquely identifying items in the data list. A valueField is
      * required when the value prop is not itself a dataItem. A valueField is useful when
      * specifying the selected item, by its id instead of using the model as the value.
      * When a valueField is not provided, the DropdownList will use strict equality checks (===)
      * to locate the value in the data list.
      */
    var valueField: js.UndefOr[String] = js.native
  }
  object DropdownListProps {
    
    @scala.inline
    def apply(): DropdownListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownListProps]
    }
    
    @scala.inline
    implicit class DropdownListPropsMutableBuilder[Self <: DropdownListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowCreate(value: Boolean | onFilter): Self = StObject.set(x, "allowCreate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowCreateUndefined: Self = StObject.set(x, "allowCreate", js.undefined)
      
      @scala.inline
      def setBusy(value: Boolean): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusySpinner(value: ReactNode): Self = StObject.set(x, "busySpinner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusySpinnerUndefined: Self = StObject.set(x, "busySpinner", js.undefined)
      
      @scala.inline
      def setBusyUndefined: Self = StObject.set(x, "busy", js.undefined)
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setFilter(
        value: `false` | startsWith | endsWith | contains | (js.Function2[/* dataItem */ js.Any, /* str */ String, Boolean])
      ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterFunction2(value: (/* dataItem */ js.Any, /* str */ String) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setGroupBy(value: String | (js.Function1[/* dataItem */ js.Any, _])): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupByFunction1(value: /* dataItem */ js.Any => _): Self = StObject.set(x, "groupBy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      @scala.inline
      def setGroupComponent(value: ReactType[_]): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
      
      @scala.inline
      def setItemComponent(value: ReactType[_] | String): Self = StObject.set(x, "itemComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemComponentUndefined: Self = StObject.set(x, "itemComponent", js.undefined)
      
      @scala.inline
      def setListComponent(value: ReactType[_] | String): Self = StObject.set(x, "listComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListComponentUndefined: Self = StObject.set(x, "listComponent", js.undefined)
      
      @scala.inline
      def setListProps(value: js.Object): Self = StObject.set(x, "listProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListPropsUndefined: Self = StObject.set(x, "listProps", js.undefined)
      
      @scala.inline
      def setMessages(value: DropdownListMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnCreate(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onCreate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCreateUndefined: Self = StObject.set(x, "onCreate", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* event */ KeyboardEvent => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: /* event */ KeyboardEvent => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnSearch(value: /* searchTerm */ String => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnToggle(value: /* isOpen */ Boolean => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setSearchTerm(value: String): Self = StObject.set(x, "searchTerm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchTermUndefined: Self = StObject.set(x, "searchTerm", js.undefined)
      
      @scala.inline
      def setTextField(value: String | (js.Function1[/* dataItem */ js.Any, String])): Self = StObject.set(x, "textField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextFieldFunction1(value: /* dataItem */ js.Any => String): Self = StObject.set(x, "textField", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTextFieldUndefined: Self = StObject.set(x, "textField", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueComponent(value: ReactType[_]): Self = StObject.set(x, "valueComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueComponentUndefined: Self = StObject.set(x, "valueComponent", js.undefined)
      
      @scala.inline
      def setValueField(value: String): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = DropdownListClass
  
  /* This means you don't have to write `^`, but can instead just say `dropdownListMod.foo` */
  override def _to: DropdownListClass = ^
}
