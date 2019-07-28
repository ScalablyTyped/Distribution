package typings.reactDashWidgets.libMultiselectMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactType
import typings.reactDashWidgets.Anon_Action
import typings.reactDashWidgets.Anon_ActionClear
import typings.reactDashWidgets.Anon_OriginalEvent
import typings.reactDashWidgets.libCommonPropsMod.AutoFocus
import typings.reactDashWidgets.libCommonPropsMod.ReactWidgetsCommonDropdownProps
import typings.reactDashWidgets.reactDashWidgetsNumbers.`false`
import typings.reactDashWidgets.reactDashWidgetsStrings.contains
import typings.reactDashWidgets.reactDashWidgetsStrings.endsWith
import typings.reactDashWidgets.reactDashWidgetsStrings.onFilter
import typings.reactDashWidgets.reactDashWidgetsStrings.startsWith
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiselectProps
  extends ReactWidgetsCommonDropdownProps[MultiselectClass]
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
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Default Value.
    */
  var defaultValue: js.UndefOr[js.Array[_]] = js.undefined
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
    * This component is used to render each possible item in the list. The default component
    * renders the text of the selected item (specified by textfield).
    */
  var itemComponent: js.UndefOr[ReactType[_]] = js.undefined
  /**
    * @default List
    */
  var listComponent: js.UndefOr[ReactType[_] | String] = js.undefined
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
  var onChange: js.UndefOr[js.Function2[/* dataItems */ js.Array[_], /* metadata */ Anon_Action, Unit]] = js.undefined
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
  var onSearch: js.UndefOr[js.Function2[/* searchTerm */ String, /* metadata */ Anon_ActionClear, Unit]] = js.undefined
  /**
    * This handler fires when an item has been selected from the list. It fires before the
    * onChange handler, and fires regardless of whether the value has actually changed
    */
  var onSelect: js.UndefOr[js.Function2[/* value */ js.Any, /* metadata */ Anon_OriginalEvent, Unit]] = js.undefined
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
  var popupTransition: js.UndefOr[ReactType[_] | String] = js.undefined
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
  var tagComponent: js.UndefOr[ReactType[_] | String] = js.undefined
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
  var value: js.UndefOr[js.Array[_]] = js.undefined
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
  @scala.inline
  def apply(
    allowCreate: Boolean | onFilter = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    busy: js.UndefOr[Boolean] = js.undefined,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    containerClassName: String = null,
    data: js.Array[_] = null,
    defaultValue: js.Array[_] = null,
    disabled: Boolean | js.Array[_] = null,
    dropUp: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    filter: `false` | startsWith | endsWith | contains | (js.Function2[/* dataItem */ js.Any, /* searchTerm */ String, Boolean]) = null,
    groupBy: String | (js.Function1[/* dataItem */ js.Any, _]) = null,
    groupComponent: ReactType[_] = null,
    id: String = null,
    inputProps: js.Object = null,
    isRtl: js.UndefOr[Boolean] = js.undefined,
    itemComponent: ReactType[_] = null,
    key: Key = null,
    listComponent: ReactType[_] | String = null,
    listProps: js.Object = null,
    messages: MultiselectMessages = null,
    minLength: Int | Double = null,
    onChange: (/* dataItems */ js.Array[_], /* metadata */ Anon_Action) => Unit = null,
    onCreate: /* searchTerm */ String => Unit = null,
    onSearch: (/* searchTerm */ String, /* metadata */ Anon_ActionClear) => Unit = null,
    onSelect: (/* value */ js.Any, /* metadata */ Anon_OriginalEvent) => Unit = null,
    onToggle: /* isOpen */ Boolean => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    popupTransition: ReactType[_] | String = null,
    readOnly: Boolean | js.Array[_] = null,
    ref: LegacyRef[MultiselectClass] = null,
    searchTerm: String = null,
    tagComponent: ReactType[_] | String = null,
    textField: String | (js.Function1[/* dataItem */ js.Any, String]) = null,
    value: js.Array[_] = null,
    valueField: String = null
  ): MultiselectProps = {
    val __obj = js.Dynamic.literal()
    if (allowCreate != null) __obj.updateDynamic("allowCreate")(allowCreate.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(busy)) __obj.updateDynamic("busy")(busy)
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName)
    if (data != null) __obj.updateDynamic("data")(data)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
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
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onCreate != null) __obj.updateDynamic("onCreate")(js.Any.fromFunction1(onCreate))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction2(onSearch))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (popupTransition != null) __obj.updateDynamic("popupTransition")(popupTransition.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (searchTerm != null) __obj.updateDynamic("searchTerm")(searchTerm)
    if (tagComponent != null) __obj.updateDynamic("tagComponent")(tagComponent.asInstanceOf[js.Any])
    if (textField != null) __obj.updateDynamic("textField")(textField.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueField != null) __obj.updateDynamic("valueField")(valueField)
    __obj.asInstanceOf[MultiselectProps]
  }
}

