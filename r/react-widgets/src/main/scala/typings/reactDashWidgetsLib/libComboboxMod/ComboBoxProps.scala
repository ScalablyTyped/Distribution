package typings
package reactDashWidgetsLib.libComboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboBoxProps
  extends reactDashWidgetsLib.libCommonPropsMod.ReactWidgetsCommonDropdownProps[ComboBoxClass]
     with reactDashWidgetsLib.libCommonPropsMod.AutoFocus {
  /**
    * Mark whether the widget is in a busy or loading state. If true the widget will display a
    * spinner gif, useful when loading data via an ajax call.
    */
  var busy: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An optional ReactNode to override the spinner gif element when the busy property
    * is set to true.
    */
  var busySpinner: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Use in conjunction with the filter prop. Filter the list without regard for case. This
    * only applies to non function values for filter
    */
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
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
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * The speed, in milliseconds, of the dropdown animation.
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
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
    scala.Boolean | java.lang.String | (js.Function2[/* dataItem */ js.Any, /* searchItem */ js.Any, scala.Boolean])
  ] = js.undefined
  /**
    * Determines how to group the Combobox. Providing a string will group the data array by
    * that property. You can also provide a function which should return the group value.
    */
  var groupBy: js.UndefOr[java.lang.String | (js.Function1[/* dataItem */ js.Any, _])] = js.undefined
  /**
    * This component is used to render each option group, when groupBy is specified. By default
    * the groupBy value will be used.
    */
  var groupComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  /**
    * An object of props that is passed directly to the underlying input component.
    */
  var inputProps: js.UndefOr[js.Object] = js.undefined
  /**
    * This component is used to render each possible item in the Combobox. The default
    * component renders the text of the selected item (specified by textfield)
    */
  var itemComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var listComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_] | java.lang.String] = js.undefined
  /**
    * An object of props that is passed directly to the underlying List component.
    */
  var listProps: js.UndefOr[js.Object] = js.undefined
  /**
    * Object hash containing display text and/or text for screen readers. Use the messages
    * object to localize widget text and increase accessibility.
    */
  var messages: js.UndefOr[ComboBoxMessages] = js.undefined
  /**
    * Use in conjunction with the filter prop. Start filtering the list only after the value
    * has reached a minimum length.
    */
  var minLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * The HTML name attribute, passed directly to the input element.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Called when the value is changed. If the value is one of the data members that item will
    * be returned. In the case of a value not being found in the data array the string value of
    * the Combobox will be returned.
    */
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, scala.Unit]] = js.undefined
  /**
    * This handler fires when an item has been selected from the list. It fires before the
    * onChange handler, and fires regardless of whether the value has actually changed.
    */
  var onSelect: js.UndefOr[js.Function1[/* value */ js.Any, scala.Unit]] = js.undefined
  /**
    * Called fires when the Combobox is about to open or close. onToggle should be used when
    * the open prop is set otherwise the widget will never open or close.
    */
  var onToggle: js.UndefOr[js.Function1[/* isOpen */ scala.Boolean, scala.Unit]] = js.undefined
  /**
    * Whether or not the Combobox is open. When unset (undefined) the Combobox will handle the
    * opening and closing internally. The defaultOpen prop can be used to set an initialization
    * value for uncontrolled widgets.
    */
  var open: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The same as an input placeholder, only works in browsers that support the placeholder
    * attribute for inputs
    */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A Transition component from react-transition-group v2. The provided component will be used
    * instead of the default SlideDownTransition for fully customizable animations.
    * The transition component is also injected with a dropUp prop indicating the direction it should open.
    */
  var popupTransition: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_] | java.lang.String] = js.undefined
  /**
    * When true the Combobox will suggest, or fill in, values as you type. The suggestions are
    * always "startsWith", meaning it will search from the start of the textField property
    */
  var suggest: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify which data item field to display in the Combobox and selected item. The
    * textField` prop may also also used as to find an item in the list as you type. Providing
    * an accessor function allows for computed text values
    */
  var textField: js.UndefOr[java.lang.String | (js.Function1[/* dataItem */ js.Any, java.lang.String])] = js.undefined
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
  var valueField: js.UndefOr[java.lang.String] = js.undefined
}

object ComboBoxProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    busy: js.UndefOr[scala.Boolean] = js.undefined,
    busySpinner: reactLib.reactMod.ReactNs.ReactNode = null,
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    data: js.Array[_] = null,
    defaultValue: js.Any = null,
    delay: scala.Int | scala.Double = null,
    disabled: scala.Boolean | js.Array[_] = null,
    dropUp: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    filter: scala.Boolean | java.lang.String | (js.Function2[/* dataItem */ js.Any, /* searchItem */ js.Any, scala.Boolean]) = null,
    groupBy: java.lang.String | (js.Function1[/* dataItem */ js.Any, _]) = null,
    groupComponent: reactLib.reactMod.ReactNs.ReactType[_] = null,
    id: java.lang.String = null,
    inputProps: js.Object = null,
    isRtl: js.UndefOr[scala.Boolean] = js.undefined,
    itemComponent: reactLib.reactMod.ReactNs.ReactType[_] = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    listComponent: reactLib.reactMod.ReactNs.ReactType[_] | java.lang.String = null,
    listProps: js.Object = null,
    messages: ComboBoxMessages = null,
    minLength: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    onChange: /* value */ js.Any => scala.Unit = null,
    onSelect: /* value */ js.Any => scala.Unit = null,
    onToggle: /* isOpen */ scala.Boolean => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    placeholder: java.lang.String = null,
    popupTransition: reactLib.reactMod.ReactNs.ReactType[_] | java.lang.String = null,
    readOnly: scala.Boolean | js.Array[_] = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[ComboBoxClass] = null,
    suggest: js.UndefOr[scala.Boolean] = js.undefined,
    textField: java.lang.String | (js.Function1[/* dataItem */ js.Any, java.lang.String]) = null,
    value: js.Any = null,
    valueField: java.lang.String = null
  ): ComboBoxProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(busy)) __obj.updateDynamic("busy")(busy)
    if (busySpinner != null) __obj.updateDynamic("busySpinner")(busySpinner.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dropUp)) __obj.updateDynamic("dropUp")(dropUp)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (!js.isUndefined(isRtl)) __obj.updateDynamic("isRtl")(isRtl)
    if (itemComponent != null) __obj.updateDynamic("itemComponent")(itemComponent.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (listComponent != null) __obj.updateDynamic("listComponent")(listComponent.asInstanceOf[js.Any])
    if (listProps != null) __obj.updateDynamic("listProps")(listProps)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (popupTransition != null) __obj.updateDynamic("popupTransition")(popupTransition.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(suggest)) __obj.updateDynamic("suggest")(suggest)
    if (textField != null) __obj.updateDynamic("textField")(textField.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueField != null) __obj.updateDynamic("valueField")(valueField)
    __obj.asInstanceOf[ComboBoxProps]
  }
}

