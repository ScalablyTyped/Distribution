package typings.reactWidgets.comboboxMod

import typings.react.mod.ReactNode
import typings.react.mod.ReactType
import typings.reactWidgets.commonPropsMod.AutoFocus
import typings.reactWidgets.commonPropsMod.ReactWidgetsCommonDropdownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboboxProps
  extends ReactWidgetsCommonDropdownProps
     with AutoFocus {
  /**
    * Mark whether the widget is in a busy or loading state. If true the widget will display a
    * spinner gif, useful when loading data via an ajax call.
    */
  var busy: js.UndefOr[Boolean] = js.undefined
  /**
    * An optional ReactNode to override the spinner gif element when the busy property
    * is set to true.
    */
  var busySpinner: js.UndefOr[ReactNode] = js.undefined
  /**
    * Use in conjunction with the filter prop. Filter the list without regard for case. This
    * only applies to non function values for filter
    */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of possible values for the Combobox. If an array of objects is provided you
    * should use the valueField and textField props, to specify which object properties
    * comprise the value field (such as an id) and the field used to label the item.
    */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Default value.
    */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  /**
    * Delay
    * @default 500
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * The speed, in milliseconds, of the dropdown animation.
    */
  var duration: js.UndefOr[Double] = js.undefined
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
  ] = js.undefined
  /**
    * Determines how to group the Combobox. Providing a string will group the data array by
    * that property. You can also provide a function which should return the group value.
    */
  var groupBy: js.UndefOr[String | (js.Function1[/* dataItem */ js.Any, _])] = js.undefined
  /**
    * This component is used to render each option group, when groupBy is specified. By default
    * the groupBy value will be used.
    */
  var groupComponent: js.UndefOr[ReactType[_]] = js.undefined
  /**
    * An object of props that is passed directly to the underlying input component.
    */
  var inputProps: js.UndefOr[js.Object] = js.undefined
  /**
    * This component is used to render each possible item in the Combobox. The default
    * component renders the text of the selected item (specified by textfield)
    */
  var itemComponent: js.UndefOr[ReactType[_]] = js.undefined
  var listComponent: js.UndefOr[ReactType[_] | String] = js.undefined
  /**
    * An object of props that is passed directly to the underlying List component.
    */
  var listProps: js.UndefOr[js.Object] = js.undefined
  /**
    * Object hash containing display text and/or text for screen readers. Use the messages
    * object to localize widget text and increase accessibility.
    */
  var messages: js.UndefOr[ComboboxMessages] = js.undefined
  /**
    * Use in conjunction with the filter prop. Start filtering the list only after the value
    * has reached a minimum length.
    */
  var minLength: js.UndefOr[Double] = js.undefined
  /**
    * The HTML name attribute, passed directly to the input element.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Called when the value is changed. If the value is one of the data members that item will
    * be returned. In the case of a value not being found in the data array the string value of
    * the Combobox will be returned.
    */
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  /**
    * This handler fires when an item has been selected from the list. It fires before the
    * onChange handler, and fires regardless of whether the value has actually changed.
    */
  var onSelect: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  /**
    * Called fires when the Combobox is about to open or close. onToggle should be used when
    * the open prop is set otherwise the widget will never open or close.
    */
  var onToggle: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.undefined
  /**
    * Whether or not the Combobox is open. When unset (undefined) the Combobox will handle the
    * opening and closing internally. The defaultOpen prop can be used to set an initialization
    * value for uncontrolled widgets.
    */
  var open: js.UndefOr[Boolean] = js.undefined
  /**
    * The same as an input placeholder, only works in browsers that support the placeholder
    * attribute for inputs
    */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
    * A Transition component from react-transition-group v2. The provided component will be used
    * instead of the default SlideDownTransition for fully customizable animations.
    * The transition component is also injected with a dropUp prop indicating the direction it should open.
    */
  var popupTransition: js.UndefOr[ReactType[_] | String] = js.undefined
  /**
    * When true the Combobox will suggest, or fill in, values as you type. The suggestions are
    * always "startsWith", meaning it will search from the start of the textField property
    */
  var suggest: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify which data item field to display in the Combobox and selected item. The
    * textField` prop may also also used as to find an item in the list as you type. Providing
    * an accessor function allows for computed text values
    */
  var textField: js.UndefOr[String | (js.Function1[/* dataItem */ js.Any, String])] = js.undefined
  /**
    * The current value of the Combobox. This can be an object (such as a member of the data
    * array) or a primitive value, hinted to by the valueField. The widget value does not need
    * to be in the data, widgets can have values that are not in their list.
    */
  var value: js.UndefOr[js.Any] = js.undefined
  /**
    * A dataItem field name for uniquely identifying items in the data list. A valueField is
    * required when the value prop is not itself a dataItem. A valueField is useful when
    * specifying the selected item, by its id instead of using the model as the value. When a
    * valueField is not provided, the Combobox will use strict equality checks (===) to locate
    * the value in the data list.
    */
  var valueField: js.UndefOr[String] = js.undefined
}

object ComboboxProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    busy: js.UndefOr[Boolean] = js.undefined,
    busySpinner: ReactNode = null,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    data: js.Array[_] = null,
    defaultValue: js.Any = null,
    delay: Int | Double = null,
    disabled: Boolean | js.Array[_] = null,
    dropUp: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    filter: Boolean | String | (js.Function2[/* dataItem */ js.Any, /* searchItem */ js.Any, Boolean]) = null,
    groupBy: String | (js.Function1[/* dataItem */ js.Any, _]) = null,
    groupComponent: ReactType[_] = null,
    id: String = null,
    inputProps: js.Object = null,
    isRtl: js.UndefOr[Boolean] = js.undefined,
    itemComponent: ReactType[_] = null,
    listComponent: ReactType[_] | String = null,
    listProps: js.Object = null,
    messages: ComboboxMessages = null,
    minLength: Int | Double = null,
    name: String = null,
    onChange: /* value */ js.Any => Unit = null,
    onSelect: /* value */ js.Any => Unit = null,
    onToggle: /* isOpen */ Boolean => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    popupTransition: ReactType[_] | String = null,
    readOnly: Boolean | js.Array[_] = null,
    suggest: js.UndefOr[Boolean] = js.undefined,
    textField: String | (js.Function1[/* dataItem */ js.Any, String]) = null,
    value: js.Any = null,
    valueField: String = null
  ): ComboboxProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(busy)) __obj.updateDynamic("busy")(busy.asInstanceOf[js.Any])
    if (busySpinner != null) __obj.updateDynamic("busySpinner")(busySpinner.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dropUp)) __obj.updateDynamic("dropUp")(dropUp.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (!js.isUndefined(isRtl)) __obj.updateDynamic("isRtl")(isRtl.asInstanceOf[js.Any])
    if (itemComponent != null) __obj.updateDynamic("itemComponent")(itemComponent.asInstanceOf[js.Any])
    if (listComponent != null) __obj.updateDynamic("listComponent")(listComponent.asInstanceOf[js.Any])
    if (listProps != null) __obj.updateDynamic("listProps")(listProps.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popupTransition != null) __obj.updateDynamic("popupTransition")(popupTransition.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(suggest)) __obj.updateDynamic("suggest")(suggest.asInstanceOf[js.Any])
    if (textField != null) __obj.updateDynamic("textField")(textField.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComboboxProps]
  }
}

