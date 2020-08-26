package typings.reactWidgets.comboboxMod

import typings.react.mod.ReactNode
import typings.react.mod.ReactType
import typings.reactWidgets.commonPropsMod.AutoFocus
import typings.reactWidgets.commonPropsMod.ReactWidgetsCommonDropdownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComboboxProps
  extends ReactWidgetsCommonDropdownProps
     with AutoFocus {
  /**
    * Mark whether the widget is in a busy or loading state. If true the widget will display a
    * spinner gif, useful when loading data via an ajax call.
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
    */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /**
    * An array of possible values for the Combobox. If an array of objects is provided you
    * should use the valueField and textField props, to specify which object properties
    * comprise the value field (such as an id) and the field used to label the item.
    */
  var data: js.UndefOr[js.Array[_]] = js.native
  /**
    * Default value.
    */
  var defaultValue: js.UndefOr[js.Any] = js.native
  /**
    * Delay
    * @default 500
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * The speed, in milliseconds, of the dropdown animation.
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Specify a filtering method used to reduce the items in the dropdown as you type. It can
    * be used in conjunction with the suggest prop or instead of it. There are a few built-in
    * filtering methods that can be specified by passing the String name. You can explicitly
    * opt out of filtering by setting filter to false To handle custom filtering techniques
    * provide a function that returns true or false for each passed in item (analogous to the
    * array.filter builtin) Acceptable values for filter are: false "startsWith" "endsWith"
    * "contains" function(String item)
    */
  var filter: js.UndefOr[
    Boolean | String | (js.Function2[/* dataItem */ js.Any, /* searchItem */ js.Any, Boolean])
  ] = js.native
  /**
    * Determines how to group the Combobox. Providing a string will group the data array by
    * that property. You can also provide a function which should return the group value.
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
    * This component is used to render each possible item in the Combobox. The default
    * component renders the text of the selected item (specified by textfield)
    */
  var itemComponent: js.UndefOr[ReactType[_]] = js.native
  var listComponent: js.UndefOr[ReactType[_] | String] = js.native
  /**
    * An object of props that is passed directly to the underlying List component.
    */
  var listProps: js.UndefOr[js.Object] = js.native
  /**
    * Object hash containing display text and/or text for screen readers. Use the messages
    * object to localize widget text and increase accessibility.
    */
  var messages: js.UndefOr[ComboboxMessages] = js.native
  /**
    * Use in conjunction with the filter prop. Start filtering the list only after the value
    * has reached a minimum length.
    */
  var minLength: js.UndefOr[Double] = js.native
  /**
    * The HTML name attribute, passed directly to the input element.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Called when the value is changed. If the value is one of the data members that item will
    * be returned. In the case of a value not being found in the data array the string value of
    * the Combobox will be returned.
    */
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  /**
    * This handler fires when an item has been selected from the list. It fires before the
    * onChange handler, and fires regardless of whether the value has actually changed.
    */
  var onSelect: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  /**
    * Called fires when the Combobox is about to open or close. onToggle should be used when
    * the open prop is set otherwise the widget will never open or close.
    */
  var onToggle: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.native
  /**
    * Whether or not the Combobox is open. When unset (undefined) the Combobox will handle the
    * opening and closing internally. The defaultOpen prop can be used to set an initialization
    * value for uncontrolled widgets.
    */
  var open: js.UndefOr[Boolean] = js.native
  /**
    * The same as an input placeholder, only works in browsers that support the placeholder
    * attribute for inputs
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * A Transition component from react-transition-group v2. The provided component will be used
    * instead of the default SlideDownTransition for fully customizable animations.
    * The transition component is also injected with a dropUp prop indicating the direction it should open.
    */
  var popupTransition: js.UndefOr[ReactType[_] | String] = js.native
  /**
    * When true the Combobox will suggest, or fill in, values as you type. The suggestions are
    * always "startsWith", meaning it will search from the start of the textField property
    */
  var suggest: js.UndefOr[Boolean] = js.native
  /**
    * Specify which data item field to display in the Combobox and selected item. The
    * textField` prop may also also used as to find an item in the list as you type. Providing
    * an accessor function allows for computed text values
    */
  var textField: js.UndefOr[String | (js.Function1[/* dataItem */ js.Any, String])] = js.native
  /**
    * The current value of the Combobox. This can be an object (such as a member of the data
    * array) or a primitive value, hinted to by the valueField. The widget value does not need
    * to be in the data, widgets can have values that are not in their list.
    */
  var value: js.UndefOr[js.Any] = js.native
  /**
    * A dataItem field name for uniquely identifying items in the data list. A valueField is
    * required when the value prop is not itself a dataItem. A valueField is useful when
    * specifying the selected item, by its id instead of using the model as the value. When a
    * valueField is not provided, the Combobox will use strict equality checks (===) to locate
    * the value in the data list.
    */
  var valueField: js.UndefOr[String] = js.native
}

object ComboboxProps {
  @scala.inline
  def apply(): ComboboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComboboxProps]
  }
  @scala.inline
  implicit class ComboboxPropsOps[Self <: ComboboxProps] (val x: Self) extends AnyVal {
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
    def setBusy(value: Boolean): Self = this.set("busy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusy: Self = this.set("busy", js.undefined)
    @scala.inline
    def setBusySpinner(value: ReactNode): Self = this.set("busySpinner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusySpinner: Self = this.set("busySpinner", js.undefined)
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setFilterFunction2(value: (/* dataItem */ js.Any, /* searchItem */ js.Any) => Boolean): Self = this.set("filter", js.Any.fromFunction2(value))
    @scala.inline
    def setFilter(value: Boolean | String | (js.Function2[/* dataItem */ js.Any, /* searchItem */ js.Any, Boolean])): Self = this.set("filter", value.asInstanceOf[js.Any])
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
    def setMessages(value: ComboboxMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ js.Any => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnSelect(value: /* value */ js.Any => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
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
    def setSuggest(value: Boolean): Self = this.set("suggest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggest: Self = this.set("suggest", js.undefined)
    @scala.inline
    def setTextFieldFunction1(value: /* dataItem */ js.Any => String): Self = this.set("textField", js.Any.fromFunction1(value))
    @scala.inline
    def setTextField(value: String | (js.Function1[/* dataItem */ js.Any, String])): Self = this.set("textField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextField: Self = this.set("textField", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueField(value: String): Self = this.set("valueField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueField: Self = this.set("valueField", js.undefined)
  }
  
}

