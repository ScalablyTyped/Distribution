package typings
package reactDashWidgetsLib.libMultiselectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiselectProps
  extends reactDashWidgetsLib.libCommonPropsMod.ReactWidgetsCommonDropdownProps[MultiselectClass]
     with reactDashWidgetsLib.libCommonPropsMod.AutoFocus {
  /**
    * Enables the list option creation UI. onFilter will only the UI when actively filtering for a list item.
    * @default 'onFilter'
    */
  var allowCreate: js.UndefOr[scala.Boolean | reactDashWidgetsLib.reactDashWidgetsLibStrings.onFilter] = js.undefined
  /**
    * mark whether the widget is in a busy or loading state. If true the widget will display a
    * spinner gif, useful when loading data via an ajax call.
    * @default false
    */
  var busy: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Use in conjunction with the filter prop. Filter the list without regard for case. This
    * only applies to non function values for filter.
    * @default false
    */
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Adds a css class to the input container element.
    */
  var containerClassName: js.UndefOr[java.lang.String] = js.undefined
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
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specify a filtering method used to reduce the items in the dropdown as you type. There
    * are a few built-in filtering methods that can be specified by passing the String name.
    * You can explicitly opt out of filtering by setting filter to false. To handle custom
    * filtering techniques provide a function that returns true or false for each passed in
    * item (analogous to the array.filter builtin)
    * @default startsWith
    */
  var filter: js.UndefOr[
    reactDashWidgetsLib.reactDashWidgetsLibNumbers.`false` | reactDashWidgetsLib.reactDashWidgetsLibStrings.startsWith | reactDashWidgetsLib.reactDashWidgetsLibStrings.endsWith | reactDashWidgetsLib.reactDashWidgetsLibStrings.contains | (js.Function2[/* dataItem */ js.Any, /* searchTerm */ java.lang.String, scala.Boolean])
  ] = js.undefined
  /**
    * Determines how to group the Multiselect values. Providing a string will group the data
    * array by that property. You can also provide a 'function' which should return the group
    * value.
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
    * This component is used to render each possible item in the list. The default component
    * renders the text of the selected item (specified by textfield).
    */
  var itemComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  /**
    * @default List
    */
  var listComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_] | java.lang.String] = js.undefined
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
  var minLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * Change event Handler that is called when the value is changed. The handler is called with
    * an array of values.
    */
  var onChange: js.UndefOr[
    js.Function2[
      /* dataItems */ js.Array[_], 
      /* metadata */ reactDashWidgetsLib.Anon_Action, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * This handler fires when the user chooses to create a new tag, not in the data list. It is
    * up to the widget parent to implement creation logic, a common implementation is shown
    * below, where the new tag is selected and added to the data list.
    */
  var onCreate: js.UndefOr[js.Function1[/* searchTerm */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * Called when the value of the text box changes either from typing or a pasted value.
    * onSearch should be used when the searchTerm prop is set.
    */
  var onSearch: js.UndefOr[
    js.Function2[
      /* searchTerm */ java.lang.String, 
      /* metadata */ reactDashWidgetsLib.Anon_ActionClear, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * This handler fires when an item has been selected from the list. It fires before the
    * onChange handler, and fires regardless of whether the value has actually changed
    */
  var onSelect: js.UndefOr[
    js.Function2[
      /* value */ js.Any, 
      /* metadata */ reactDashWidgetsLib.Anon_OriginalEvent, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Called when the Multiselect is about to open or close. onToggle should be used when the
    * open prop is set otherwise the widget will never open or close.
    */
  var onToggle: js.UndefOr[js.Function1[/* isOpen */ scala.Boolean, scala.Unit]] = js.undefined
  /**
    * Whether or not the Multiselect is open. When unset (undefined) the Multiselect will
    * handle the opening and closing internally. The defaultOpen prop can be used to set an
    * initialization value for uncontrolled widgets.
    */
  var open: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The same as an input placeholder, only works in browsers that support the placeholder
    * attribute for inputs
    */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A Transition component from react-transition-group v2.
    * The provided component will be used instead of the default SlideDownTransition for fully customizable animations.
    * The transition component is also injected with a dropUp prop indicating the direction it should open.
    */
  var popupTransition: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_] | java.lang.String] = js.undefined
  /**
    * The string value of the current search being typed into the Multiselect. When unset
    * (undefined) the Multiselect will handle the filtering internally. The defaultSearchTerm
    * prop can be used to set an initialization value for uncontrolled widgets.
    */
  var searchTerm: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This component is used to render each selected item. The default component renders the
    * text of the selected item (specified by textfield).
    */
  var tagComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_] | java.lang.String] = js.undefined
  /**
    * Specify which data item field to display in the Multiselect and selected item. The
    * textField prop may also also used as to find an item in the list as you type. Providing
    * an accessor function allows for computed text values.
    */
  var textField: js.UndefOr[java.lang.String | (js.Function1[/* dataItem */ js.Any, java.lang.String])] = js.undefined
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
  var valueField: js.UndefOr[java.lang.String] = js.undefined
}

object MultiselectProps {
  @scala.inline
  def apply(
    allowCreate: scala.Boolean | reactDashWidgetsLib.reactDashWidgetsLibStrings.onFilter = null,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    busy: js.UndefOr[scala.Boolean] = js.undefined,
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    containerClassName: java.lang.String = null,
    data: js.Array[_] = null,
    defaultValue: js.Array[_] = null,
    disabled: scala.Boolean | js.Array[_] = null,
    dropUp: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    filter: reactDashWidgetsLib.reactDashWidgetsLibNumbers.`false` | reactDashWidgetsLib.reactDashWidgetsLibStrings.startsWith | reactDashWidgetsLib.reactDashWidgetsLibStrings.endsWith | reactDashWidgetsLib.reactDashWidgetsLibStrings.contains | (js.Function2[/* dataItem */ js.Any, /* searchTerm */ java.lang.String, scala.Boolean]) = null,
    groupBy: java.lang.String | (js.Function1[/* dataItem */ js.Any, _]) = null,
    groupComponent: reactLib.reactMod.ReactNs.ReactType[_] = null,
    id: java.lang.String = null,
    inputProps: js.Object = null,
    isRtl: js.UndefOr[scala.Boolean] = js.undefined,
    itemComponent: reactLib.reactMod.ReactNs.ReactType[_] = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    listComponent: reactLib.reactMod.ReactNs.ReactType[_] | java.lang.String = null,
    listProps: js.Object = null,
    messages: MultiselectMessages = null,
    minLength: scala.Int | scala.Double = null,
    onChange: (/* dataItems */ js.Array[_], /* metadata */ reactDashWidgetsLib.Anon_Action) => scala.Unit = null,
    onCreate: /* searchTerm */ java.lang.String => scala.Unit = null,
    onSearch: (/* searchTerm */ java.lang.String, /* metadata */ reactDashWidgetsLib.Anon_ActionClear) => scala.Unit = null,
    onSelect: (/* value */ js.Any, /* metadata */ reactDashWidgetsLib.Anon_OriginalEvent) => scala.Unit = null,
    onToggle: /* isOpen */ scala.Boolean => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    placeholder: java.lang.String = null,
    popupTransition: reactLib.reactMod.ReactNs.ReactType[_] | java.lang.String = null,
    readOnly: scala.Boolean | js.Array[_] = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[MultiselectClass] = null,
    searchTerm: java.lang.String = null,
    tagComponent: reactLib.reactMod.ReactNs.ReactType[_] | java.lang.String = null,
    textField: java.lang.String | (js.Function1[/* dataItem */ js.Any, java.lang.String]) = null,
    value: js.Array[_] = null,
    valueField: java.lang.String = null
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

