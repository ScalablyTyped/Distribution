package typings.reactWidgets.multiselectMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiselectProps
  extends ReactWidgetsCommonDropdownProps
     with AutoFocus {
  /**
    * Enables the list option creation UI. onFilter will only the UI when actively filtering for a list item.
    * @default 'onFilter'
    */
  var allowCreate: js.UndefOr[Boolean | onFilter] = js.native
  /**
    * mark whether the widget is in a busy or loading state. If true the widget will display a
    * spinner gif, useful when loading data via an ajax call.
    * @default false
    */
  var busy: js.UndefOr[Boolean] = js.native
  /**
    * Use in conjunction with the filter prop. Filter the list without regard for case. This
    * only applies to non function values for filter.
    * @default false
    */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /**
    * Adds a css class to the input container element.
    */
  var containerClassName: js.UndefOr[String] = js.native
  /**
    * Provide an array of possible values for the Multiselect. If an array of objects is
    * provided you should use the valueField and textField props, to specify which object
    * properties comprise the value field (such as an id) and the field used to label the item.
    */
  var data: js.UndefOr[js.Array[_]] = js.native
  /**
    * Default Value.
    */
  var defaultValue: js.UndefOr[js.Array[_]] = js.native
  /**
    * The speed, in milliseconds, of the dropdown animation.
    * @default 250
    */
  var duration: js.UndefOr[Double] = js.native
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
  ] = js.native
  /**
    * Determines how to group the Multiselect values. Providing a string will group the data
    * array by that property. You can also provide a 'function' which should return the group
    * value.
    */
  var groupBy: js.UndefOr[String | (js.Function1[/* dataItem */ js.Any, _])] = js.native
  /**
    * This component is used to render each option group, when groupBy is specified. By default
    * the groupBy value will be used.
    */
  var groupComponent: js.UndefOr[ReactType[_]] = js.native
  /**
    * An object of props that is passed directly to the underlying input component.
    */
  var inputProps: js.UndefOr[js.Object] = js.native
  /**
    * This component is used to render each possible item in the list. The default component
    * renders the text of the selected item (specified by textfield).
    */
  var itemComponent: js.UndefOr[ReactType[_]] = js.native
  /**
    * @default List
    */
  var listComponent: js.UndefOr[ReactType[_] | String] = js.native
  /**
    * An object of props that is passed directly to the underlying List component.
    */
  var listProps: js.UndefOr[js.Object] = js.native
  /**
    * Object hash containing display text and/or text for screen readers. Use the messages
    * object to localize widget text and increase accessibility.
    */
  var messages: js.UndefOr[MultiselectMessages] = js.native
  /**
    * Use in conjunction with the filter prop. Start filtering the list only after the value
    * has reached a minimum length.
    * @default 1
    */
  var minLength: js.UndefOr[Double] = js.native
  /**
    * Change event Handler that is called when the value is changed. The handler is called with
    * an array of values.
    */
  var onChange: js.UndefOr[js.Function2[/* dataItems */ js.Array[_], /* metadata */ Action, Unit]] = js.native
  /**
    * This handler fires when the user chooses to create a new tag, not in the data list. It is
    * up to the widget parent to implement creation logic, a common implementation is shown
    * below, where the new tag is selected and added to the data list.
    */
  var onCreate: js.UndefOr[js.Function1[/* searchTerm */ String, Unit]] = js.native
  /**
    * Called when the value of the text box changes either from typing or a pasted value.
    * onSearch should be used when the searchTerm prop is set.
    */
  var onSearch: js.UndefOr[js.Function2[/* searchTerm */ String, /* metadata */ LastSearchTerm, Unit]] = js.native
  /**
    * This handler fires when an item has been selected from the list. It fires before the
    * onChange handler, and fires regardless of whether the value has actually changed
    */
  var onSelect: js.UndefOr[js.Function2[/* value */ js.Any, /* metadata */ OriginalEvent, Unit]] = js.native
  /**
    * Called when the Multiselect is about to open or close. onToggle should be used when the
    * open prop is set otherwise the widget will never open or close.
    */
  var onToggle: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.native
  /**
    * Whether or not the Multiselect is open. When unset (undefined) the Multiselect will
    * handle the opening and closing internally. The defaultOpen prop can be used to set an
    * initialization value for uncontrolled widgets.
    */
  var open: js.UndefOr[Boolean] = js.native
  /**
    * The same as an input placeholder, only works in browsers that support the placeholder
    * attribute for inputs
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * A Transition component from react-transition-group v2.
    * The provided component will be used instead of the default SlideDownTransition for fully customizable animations.
    * The transition component is also injected with a dropUp prop indicating the direction it should open.
    */
  var popupTransition: js.UndefOr[ReactType[_] | String] = js.native
  /**
    * The string value of the current search being typed into the Multiselect. When unset
    * (undefined) the Multiselect will handle the filtering internally. The defaultSearchTerm
    * prop can be used to set an initialization value for uncontrolled widgets.
    */
  var searchTerm: js.UndefOr[String] = js.native
  /**
    * This component is used to render each selected item. The default component renders the
    * text of the selected item (specified by textfield).
    */
  var tagComponent: js.UndefOr[ReactType[_] | String] = js.native
  /**
    * Specify which data item field to display in the Multiselect and selected item. The
    * textField prop may also also used as to find an item in the list as you type. Providing
    * an accessor function allows for computed text values.
    */
  var textField: js.UndefOr[String | (js.Function1[/* dataItem */ js.Any, String])] = js.native
  /**
    * The current values of the Multiselect. The value should can null, or an array of
    * valueField values, or an array of objects (such as a few items in the data array)
    */
  var value: js.UndefOr[js.Array[_]] = js.native
  /**
    * A dataItem field name for uniquely identifying items in the data list. A valueField is
    * required when the value prop is not itself a dataItem. A valueField is useful when
    * specifying the selected item, by its id instead of using the model as the value.
    * When a valueField is not provided, the Multiselect will use strict equality checks (===)
    * to locate the value in the data list.
    */
  var valueField: js.UndefOr[String] = js.native
}

object MultiselectProps {
  @scala.inline
  def apply(): MultiselectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiselectProps]
  }
  @scala.inline
  implicit class MultiselectPropsOps[Self <: MultiselectProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowCreate(value: Boolean | onFilter): Self = this.set("allowCreate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowCreate: Self = this.set("allowCreate", js.undefined)
    @scala.inline
    def setBusy(value: Boolean): Self = this.set("busy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusy: Self = this.set("busy", js.undefined)
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    @scala.inline
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDefaultValueVarargs(value: js.Any*): Self = this.set("defaultValue", js.Array(value :_*))
    @scala.inline
    def setDefaultValue(value: js.Array[_]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setFilterFunction2(value: (/* dataItem */ js.Any, /* searchTerm */ String) => Boolean): Self = this.set("filter", js.Any.fromFunction2(value))
    @scala.inline
    def setFilter(
      value: `false` | startsWith | endsWith | contains | (js.Function2[/* dataItem */ js.Any, /* searchTerm */ String, Boolean])
    ): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setGroupByFunction1(value: /* dataItem */ js.Any => _): Self = this.set("groupBy", js.Any.fromFunction1(value))
    @scala.inline
    def setGroupBy(value: String | (js.Function1[/* dataItem */ js.Any, _])): Self = this.set("groupBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupBy: Self = this.set("groupBy", js.undefined)
    @scala.inline
    def setGroupComponent(value: ReactType[_]): Self = this.set("groupComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupComponent: Self = this.set("groupComponent", js.undefined)
    @scala.inline
    def setInputProps(value: js.Object): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    @scala.inline
    def setItemComponent(value: ReactType[_]): Self = this.set("itemComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemComponent: Self = this.set("itemComponent", js.undefined)
    @scala.inline
    def setListComponent(value: ReactType[_] | String): Self = this.set("listComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListComponent: Self = this.set("listComponent", js.undefined)
    @scala.inline
    def setListProps(value: js.Object): Self = this.set("listProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListProps: Self = this.set("listProps", js.undefined)
    @scala.inline
    def setMessages(value: MultiselectMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setOnChange(value: (/* dataItems */ js.Array[_], /* metadata */ Action) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnCreate(value: /* searchTerm */ String => Unit): Self = this.set("onCreate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCreate: Self = this.set("onCreate", js.undefined)
    @scala.inline
    def setOnSearch(value: (/* searchTerm */ String, /* metadata */ LastSearchTerm) => Unit): Self = this.set("onSearch", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSearch: Self = this.set("onSearch", js.undefined)
    @scala.inline
    def setOnSelect(value: (/* value */ js.Any, /* metadata */ OriginalEvent) => Unit): Self = this.set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnToggle(value: /* isOpen */ Boolean => Unit): Self = this.set("onToggle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnToggle: Self = this.set("onToggle", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPopupTransition(value: ReactType[_] | String): Self = this.set("popupTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupTransition: Self = this.set("popupTransition", js.undefined)
    @scala.inline
    def setSearchTerm(value: String): Self = this.set("searchTerm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchTerm: Self = this.set("searchTerm", js.undefined)
    @scala.inline
    def setTagComponent(value: ReactType[_] | String): Self = this.set("tagComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagComponent: Self = this.set("tagComponent", js.undefined)
    @scala.inline
    def setTextFieldFunction1(value: /* dataItem */ js.Any => String): Self = this.set("textField", js.Any.fromFunction1(value))
    @scala.inline
    def setTextField(value: String | (js.Function1[/* dataItem */ js.Any, String])): Self = this.set("textField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextField: Self = this.set("textField", js.undefined)
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[_]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueField(value: String): Self = this.set("valueField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueField: Self = this.set("valueField", js.undefined)
  }
  
}

