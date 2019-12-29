package typings.reactDashWidgets.libDropdownListMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactType
import typings.reactDashWidgets.libCommonPropsMod.AutoFocus
import typings.reactDashWidgets.libCommonPropsMod.ReactWidgetsCommonDropdownProps
import typings.reactDashWidgets.reactDashWidgetsBooleans.`false`
import typings.reactDashWidgets.reactDashWidgetsStrings.contains
import typings.reactDashWidgets.reactDashWidgetsStrings.endsWith
import typings.reactDashWidgets.reactDashWidgetsStrings.onFilter
import typings.reactDashWidgets.reactDashWidgetsStrings.startsWith
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownListProps
  extends ReactWidgetsCommonDropdownProps[DropdownListClass]
     with AutoFocus {
  /**
    * Allow to create a new option on the data list.
    */
  var allowCreate: js.UndefOr[Boolean | onFilter] = js.undefined
  /**
    * Mark whether the widget is in a busy or loading state. If true the widget will display a
    * spinner gif, useful when loading data via an ajax call.
    * @default false
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
    * @default false
    */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /**
    * Adds a css class to the input container element.
    */
  var containerClassName: js.UndefOr[String] = js.undefined
  /**
    * Provide an array of possible values for the DropdownList. If an array of objects is
    * provided you should use the valueField and textField props, to specify which object
    * properties comprise the value field (such as an id) and the field used to label the item.
    */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The defaultOpen prop can be used to set an
    * initialization value for uncontrolled widgets.
    */
  var defaultOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * Default value.
    */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  /**
    * Delay
    * @default 250
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * The speed, in milliseconds, of the dropdown animation.
    * @default 250
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Specify a filtering method used to reduce the items in the dropdown as you type.
    * There are a few built-in filtering methods that can be specified by passing the String name.
    * To handle custom filtering techniques provide a function that returns true or false
    * for each passed in item (analogous to the array.filter builtin)
    */
  var filter: js.UndefOr[
    `false` | startsWith | endsWith | contains | (js.Function2[/* dataItem */ js.Any, /* str */ String, Boolean])
  ] = js.undefined
  /**
    * Determines how to group the DropdownList. Providing a string will group the data array by
    * that property. You can also provide a function which should return the group value.
    */
  var groupBy: js.UndefOr[String | (js.Function1[/* dataItem */ js.Any, _])] = js.undefined
  /**
    * This component is used to render each option group, when groupBy is specified. By default
    * the groupBy value will be used.
    */
  var groupComponent: js.UndefOr[ReactType[_]] = js.undefined
  /**
    * This component is used to render each possible item in the DropdownList. The default
    * component renders the text of the selected item (specified by textfield)
    */
  var itemComponent: js.UndefOr[ReactType[_] | String] = js.undefined
  var listComponent: js.UndefOr[ReactType[_] | String] = js.undefined
  /**
    * An object of props that is passed directly to the underlying List component.
    */
  var listProps: js.UndefOr[js.Object] = js.undefined
  /**
    * Object hash containing display text and/or text for screen readers. Use the messages
    * object to localize widget text and increase accessibility.
    */
  var messages: js.UndefOr[DropdownListMessages] = js.undefined
  /**
    * Use in conjunction with the filter prop. Start filtering the list only after the value
    * has reached a minimum length.
    * @default 1
    */
  var minLength: js.UndefOr[Double] = js.undefined
  /**
    * Whether or not the SelectList allows multiple selection or not.
    * when false the SelectList will render as a list of radio buttons, and checkboxes when true.
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /**
    * The HTML name attribute used to group checkboxes and radio buttons together.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Change event Handler that is called when the value is changed.
    */
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  /**
    * Create event Handler that is called when a new option is added to the data list.
    */
  var onCreate: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  /**
    * The native onKeyDown event, called preventDefault will prevent any custom behavior, included keyboard shortcuts.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
  /**
    * The native onKeyPress event, called preventDefault will stop any custom behavior.
    */
  var onKeyPress: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
  /**
    * Called when the value of the filter input changes either from typing or a pasted value.
    * onSearch should be used when the searchTerm prop is set.
    */
  var onSearch: js.UndefOr[js.Function1[/* searchTerm */ String, Unit]] = js.undefined
  /**
    * This handler fires when an item has been selected from the list. It fires before the
    * onChange handler, and fires regardless of whether the value has actually changed.
    */
  var onSelect: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  /**
    * Called when the DropdownList is about to open or close. onToggle should be used when the
    * open prop is set otherwise the widget open buttons won't work.
    */
  var onToggle: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.undefined
  /**
    * Whether or not the DropdownList is open. When unset (undefined) the DropdownList will
    * handle the opening and closing internally.
    */
  var open: js.UndefOr[Boolean] = js.undefined
  /**
    * Text to display when the value is empty.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
    * The string value of the current search being typed into the DropdownList. When unset
    * (undefined) the DropdownList will handle the filtering internally. The defaultSearchTerm
    * prop can be used to set an initialization value for uncontrolled widgets. searchTerm is
    * only relevant when the filter prop is set.
    */
  var searchTerm: js.UndefOr[String] = js.undefined
  /**
    * Specify which data item field to display in the DropdownList and selected item.
    * ThetextFieldprop may also also used as to find an item in the list as you type. Providing
    * an accessor function allows for computed text values
    */
  var textField: js.UndefOr[String | (js.Function1[/* dataItem */ js.Any, String])] = js.undefined
  /**
    * The current value of the DropdownList. This can be an object (such as a member of the
    * data array) or a primitive value, hinted to by the valueField. The widget value does not
    * need to be in the data array; widgets can have values that are not in their list.
    */
  var value: js.UndefOr[js.Any] = js.undefined
  /**
    * This component is used to render the selected value of the DropdownList. The default
    * component renders the text of the selected item (specified by textfield)
    */
  var valueComponent: js.UndefOr[ReactType[_]] = js.undefined
  /**
    * A dataItem field name for uniquely identifying items in the data list. A valueField is
    * required when the value prop is not itself a dataItem. A valueField is useful when
    * specifying the selected item, by its id instead of using the model as the value.
    * When a valueField is not provided, the DropdownList will use strict equality checks (===)
    * to locate the value in the data list.
    */
  var valueField: js.UndefOr[String] = js.undefined
}

object DropdownListProps {
  @scala.inline
  def apply(
    allowCreate: Boolean | onFilter = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    busy: js.UndefOr[Boolean] = js.undefined,
    busySpinner: ReactNode = null,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    containerClassName: String = null,
    data: js.Array[_] = null,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    defaultValue: js.Any = null,
    delay: Int | Double = null,
    disabled: Boolean | js.Array[_] = null,
    dropUp: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    filter: `false` | startsWith | endsWith | contains | (js.Function2[/* dataItem */ js.Any, /* str */ String, Boolean]) = null,
    groupBy: String | (js.Function1[/* dataItem */ js.Any, _]) = null,
    groupComponent: ReactType[_] = null,
    id: String = null,
    isRtl: js.UndefOr[Boolean] = js.undefined,
    itemComponent: ReactType[_] | String = null,
    key: Key = null,
    listComponent: ReactType[_] | String = null,
    listProps: js.Object = null,
    messages: DropdownListMessages = null,
    minLength: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onChange: /* value */ js.Any => Unit = null,
    onCreate: /* value */ js.Any => Unit = null,
    onKeyDown: /* event */ KeyboardEvent => Unit = null,
    onKeyPress: /* event */ KeyboardEvent => Unit = null,
    onSearch: /* searchTerm */ String => Unit = null,
    onSelect: /* value */ js.Any => Unit = null,
    onToggle: /* isOpen */ Boolean => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    readOnly: Boolean | js.Array[_] = null,
    ref: LegacyRef[DropdownListClass] = null,
    searchTerm: String = null,
    textField: String | (js.Function1[/* dataItem */ js.Any, String]) = null,
    value: js.Any = null,
    valueComponent: ReactType[_] = null,
    valueField: String = null
  ): DropdownListProps = {
    val __obj = js.Dynamic.literal()
    if (allowCreate != null) __obj.updateDynamic("allowCreate")(allowCreate.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(busy)) __obj.updateDynamic("busy")(busy.asInstanceOf[js.Any])
    if (busySpinner != null) __obj.updateDynamic("busySpinner")(busySpinner.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dropUp)) __obj.updateDynamic("dropUp")(dropUp.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isRtl)) __obj.updateDynamic("isRtl")(isRtl.asInstanceOf[js.Any])
    if (itemComponent != null) __obj.updateDynamic("itemComponent")(itemComponent.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (listComponent != null) __obj.updateDynamic("listComponent")(listComponent.asInstanceOf[js.Any])
    if (listProps != null) __obj.updateDynamic("listProps")(listProps.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onCreate != null) __obj.updateDynamic("onCreate")(js.Any.fromFunction1(onCreate))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (searchTerm != null) __obj.updateDynamic("searchTerm")(searchTerm.asInstanceOf[js.Any])
    if (textField != null) __obj.updateDynamic("textField")(textField.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueComponent != null) __obj.updateDynamic("valueComponent")(valueComponent.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownListProps]
  }
}

