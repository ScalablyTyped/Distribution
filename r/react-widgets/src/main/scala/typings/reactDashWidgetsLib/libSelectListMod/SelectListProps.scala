package typings
package reactDashWidgetsLib.libSelectListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectListProps
  extends reactDashWidgetsLib.libCommonPropsMod.ReactWidgetsCommonProps[SelectListClass]
     with reactDashWidgetsLib.libCommonPropsMod.AutoFocus {
  /**
    * Mark whether the widget is in a busy or loading state. If true the widget will display a
    * spinner gif, useful when loading data via an ajax call.
    * @default false
    */
  var busy: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Provide an array of possible values for the SelectList. If an array of objects is
    * provided you should use the valueField and textField props, to specify which object
    * properties comprise the value field (such as an id) and the field used to label the item.
    */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Default Value.
    */
  var defaultValue: js.UndefOr[js.Any | js.Array[_]] = js.undefined
  /**
    * Delay
    * @default 250
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Determines how to group the SelectList dropdown list. Providing a string will group the
    * data array by that property. You can also provide a 'function' which should return the
    * group value.
    */
  var groupBy: js.UndefOr[java.lang.String | (js.Function1[/* dataItem */ js.Any, _])] = js.undefined
  /**
    * This component is used to render each option group, when groupBy is specified. By default
    * the groupBy value will be used.
    */
  var groupComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  /**
    * This component is used to render each item in the SelectList. The default component
    * renders the text of the selected item (specified by textfield)
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
  var messages: js.UndefOr[SelectListMessages] = js.undefined
  /**
    * Whether or not the SelectList allows multiple selection or not. when false the SelectList
    * will render as a list of radio buttons, and checkboxes when true.
    */
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The HTML name attribute used to group checkboxes and radio buttons together.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Change event handler that is called when the value is changed. values will be an array
    * when multiple prop is set.
    */
  var onChange: js.UndefOr[js.Function1[/* values */ js.Any | js.Array[_], scala.Unit]] = js.undefined
  /**
    * The native onKeyDown event, called preventDefault will prevent any custom behavior, included keyboard shortcuts.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* event */ stdLib.KeyboardEvent, scala.Unit]] = js.undefined
  /**
    * The native onKeyPress event, called preventDefault will stop any custom behavior.
    */
  var onKeyPress: js.UndefOr[js.Function1[/* event */ stdLib.KeyboardEvent, scala.Unit]] = js.undefined
  /**
    * A handler called when focus shifts on the SelectList. Internally this is used to ensure
    * the focused item is in view. If you want to define your own "scrollTo" behavior or just
    * disable the default one specify an onMove handler. The handler is called with the
    * relevant DOM nodes needed to implement scroll behavior: the list element, the element
    * that is currently focused, and a focused value.
    */
  var onMove: js.UndefOr[
    js.Function3[
      /* list */ stdLib.HTMLElement, 
      /* focusedNode */ stdLib.HTMLElement, 
      /* focusedItem */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * The HTML tabindex attribute, controls the order in which focus moves via the TAB key
    */
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specify which data item field to display in the SelectList and selected item. The
    * textField prop may also also used as to find an item in the list as you type. Providing
    * an accessor function allows for computed text values.
    */
  var textField: js.UndefOr[java.lang.String | (js.Function1[/* dataItem */ js.Any, java.lang.String])] = js.undefined
  /**
    * The current value or values of the SelectList. This can be an object (such as a member of
    * the data array) or a primitive value, hinted to by the valueField. The widget value does
    * not need to be in the data array; widgets can have values that are not in their list.
    */
  var value: js.UndefOr[js.Any | js.Array[_]] = js.undefined
  /**
    * A dataItem field name for uniquely identifying items in the data list. A valueField is
    * required when the value prop is not itself a dataItem. A valueField is useful when
    * specifying the selected item, by its id instead of using the model as the value.
    * When a valueField is not provided, the SelectList will use strict equality checks (===)
    * to locate the value in the data list.
    */
  var valueField: js.UndefOr[java.lang.String] = js.undefined
}

object SelectListProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    busy: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    data: js.Array[_] = null,
    defaultValue: js.Any | js.Array[_] = null,
    delay: scala.Int | scala.Double = null,
    disabled: scala.Boolean | js.Array[_] = null,
    groupBy: java.lang.String | (js.Function1[/* dataItem */ js.Any, _]) = null,
    groupComponent: reactLib.reactMod.ReactNs.ReactType[_] = null,
    id: java.lang.String = null,
    isRtl: js.UndefOr[scala.Boolean] = js.undefined,
    itemComponent: reactLib.reactMod.ReactNs.ReactType[_] = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    listComponent: reactLib.reactMod.ReactNs.ReactType[_] | java.lang.String = null,
    listProps: js.Object = null,
    messages: SelectListMessages = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    onChange: /* values */ js.Any | js.Array[_] => scala.Unit = null,
    onKeyDown: /* event */ stdLib.KeyboardEvent => scala.Unit = null,
    onKeyPress: /* event */ stdLib.KeyboardEvent => scala.Unit = null,
    onMove: (/* list */ stdLib.HTMLElement, /* focusedNode */ stdLib.HTMLElement, /* focusedItem */ js.Any) => scala.Unit = null,
    readOnly: scala.Boolean | js.Array[_] = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[SelectListClass] = null,
    tabIndex: scala.Int | scala.Double = null,
    textField: java.lang.String | (js.Function1[/* dataItem */ js.Any, java.lang.String]) = null,
    value: js.Any | js.Array[_] = null,
    valueField: java.lang.String = null
  ): SelectListProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(busy)) __obj.updateDynamic("busy")(busy)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isRtl)) __obj.updateDynamic("isRtl")(isRtl)
    if (itemComponent != null) __obj.updateDynamic("itemComponent")(itemComponent.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (listComponent != null) __obj.updateDynamic("listComponent")(listComponent.asInstanceOf[js.Any])
    if (listProps != null) __obj.updateDynamic("listProps")(listProps)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onMove != null) __obj.updateDynamic("onMove")(js.Any.fromFunction3(onMove))
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (textField != null) __obj.updateDynamic("textField")(textField.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField)
    __obj.asInstanceOf[SelectListProps]
  }
}

