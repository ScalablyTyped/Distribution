package typings
package reactDashJsonDashViewLib.reactDashJsonDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactJsonViewProps extends js.Object {
  /**
    * When an integer value is assigned, strings will be cut off at that length.
    * Collapsed strings are followed by an ellipsis.
    * String content can be expanded and collapsed by clicking on the string value.
    *
    * Default: false
    */
  var collapseStringsAfterLength: js.UndefOr[scala.Double | reactDashJsonDashViewLib.reactDashJsonDashViewLibNumbers.`false`] = js.undefined
  /**
    * When set to true, all nodes will be collapsed by default.
    * Use an integer value to collapse at a particular depth.
    *
    * Default: false
    */
  var collapsed: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  /**
    * Set to a value to be used as defaultValue when adding new key to json
    *
    * Default: null
    */
  var defaultValue: js.UndefOr[TypeDefaultValue | js.Array[TypeDefaultValue] | scala.Null] = js.undefined
  /**
    * When set to true, data type labels prefix values.
    *
    * Default: true
    */
  var displayDataTypes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When set to true, objects and arrays are labeled with size.
    *
    * Default: true
    */
  var displayObjectSize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When prop is not false, the user can copy objects and arrays to clipboard by clicking on the clipboard icon.
    * Copy callbacks are supported.
    *
    * Default: true
    */
  var enableClipboard: js.UndefOr[scala.Boolean | (js.Function1[/* copy */ OnCopyProps, scala.Unit])] = js.undefined
  /**
    * When an integer value is assigned, arrays will be displayed in groups by count of the value.
    * Groups are displayed with brakcet notation and can be expanded and collapsed by clickong on the brackets.
    *
    * Default: 100
    */
  var groupArraysAfterLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * Style of expand/collapse icons. Accepted values are "circle", triangle" or "square".
    *
    * Default: {}
    */
  var iconStyle: js.UndefOr[
    reactDashJsonDashViewLib.reactDashJsonDashViewLibStrings.circle | reactDashJsonDashViewLib.reactDashJsonDashViewLibStrings.triangle | reactDashJsonDashViewLib.reactDashJsonDashViewLibStrings.square
  ] = js.undefined
  /**
    * Set the indent-width for nested objects.
    *
    * Default: 4
    */
  var indentWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Contains the name of your root node. Use null or false for no name.
    *
    * Default: "root"
    */
  var name: js.UndefOr[
    java.lang.String | scala.Null | reactDashJsonDashViewLib.reactDashJsonDashViewLibNumbers.`false`
  ] = js.undefined
  /**
    * When a callback function is passed in, add functionality is enabled.
    * The callback is invoked before additions are completed.
    * Returning false from onAdd will prevent the change from being made. see: onAdd docs
    *
    * Default: false
    */
  var onAdd: js.UndefOr[
    (js.Function1[
      /* add */ InteractionProps, 
      reactDashJsonDashViewLib.reactDashJsonDashViewLibNumbers.`false` | _
    ]) | reactDashJsonDashViewLib.reactDashJsonDashViewLibNumbers.`false`
  ] = js.undefined
  /**
    * When a callback function is passed in, delete functionality is enabled.
    * The callback is invoked before deletions are completed.
    * Returning false from onDelete will prevent the change from being made. see: onDelete docs
    *
    * Default: false
    */
  var onDelete: js.UndefOr[
    (js.Function1[
      /* del */ InteractionProps, 
      reactDashJsonDashViewLib.reactDashJsonDashViewLibNumbers.`false` | _
    ]) | reactDashJsonDashViewLib.reactDashJsonDashViewLibNumbers.`false`
  ] = js.undefined
  /**
    * When a callback function is passed in, edit functionality is enabled.
    * The callback is invoked before edits are completed. Returning false
    * from onEdit will prevent the change from being made. see: onEdit docs.
    *
    * Default: false
    */
  var onEdit: js.UndefOr[
    (js.Function1[
      /* edit */ InteractionProps, 
      reactDashJsonDashViewLib.reactDashJsonDashViewLibNumbers.`false` | _
    ]) | reactDashJsonDashViewLib.reactDashJsonDashViewLibNumbers.`false`
  ] = js.undefined
  /**
    * When a function is passed in, clicking a value triggers the onSelect method to be called.
    *
    * Default: false
    */
  var onSelect: js.UndefOr[
    (js.Function1[/* select */ OnSelectProps, scala.Unit]) | reactDashJsonDashViewLib.reactDashJsonDashViewLibNumbers.`false`
  ] = js.undefined
  /**
    * Callback function to provide control over what objects and arrays should be collapsed by default.
    * An object is passed to the callback containing name, src, type ("array" or "object") and namespace.
    *
    * Default: false
    */
  var shouldCollapse: js.UndefOr[
    reactDashJsonDashViewLib.reactDashJsonDashViewLibNumbers.`false` | (js.Function1[/* field */ CollapsedFieldProps, scala.Boolean])
  ] = js.undefined
  /**
    * Set to true to sort object keys.
    *
    * Default: false
    */
  var sortKeys: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This property contains your input JSON.
    *
    * Required.
    */
  var src: js.Object
  /**
    * Style attributes for react-json-view container.
    * Explicit style attributes will override attributes provided by a theme.
    *
    * Default: "rjv-default"
    */
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  /**
    * RJV supports base-16 themes. Check out the list of supported themes in the demo.
    * A custom "rjv-default" theme applies by default.
    *
    * Default: "rjv-default"
    */
  var theme: js.UndefOr[ThemeKeys | ThemeObject] = js.undefined
  /**
    * Custom message for validation failures to onEdit, onAdd, or onDelete callbacks.
    *
    * Default: "Validation Error"
    */
  var validationMessage: js.UndefOr[java.lang.String] = js.undefined
}

object ReactJsonViewProps {
  @scala.inline
  def apply(
    src: js.Object,
    collapseStringsAfterLength: scala.Double | reactDashJsonDashViewLib.reactDashJsonDashViewLibNumbers.`false` = null,
    collapsed: scala.Boolean | scala.Double = null,
    defaultValue: TypeDefaultValue | js.Array[TypeDefaultValue] = null,
    displayDataTypes: js.UndefOr[scala.Boolean] = js.undefined,
    displayObjectSize: js.UndefOr[scala.Boolean] = js.undefined,
    enableClipboard: scala.Boolean | (js.Function1[/* copy */ OnCopyProps, scala.Unit]) = null,
    groupArraysAfterLength: scala.Int | scala.Double = null,
    iconStyle: reactDashJsonDashViewLib.reactDashJsonDashViewLibStrings.circle | reactDashJsonDashViewLib.reactDashJsonDashViewLibStrings.triangle | reactDashJsonDashViewLib.reactDashJsonDashViewLibStrings.square = null,
    indentWidth: scala.Int | scala.Double = null,
    name: java.lang.String | reactDashJsonDashViewLib.reactDashJsonDashViewLibNumbers.`false` = null,
    onAdd: (js.Function1[
      /* add */ InteractionProps, 
      reactDashJsonDashViewLib.reactDashJsonDashViewLibNumbers.`false` | _
    ]) | reactDashJsonDashViewLib.reactDashJsonDashViewLibNumbers.`false` = null,
    onDelete: (js.Function1[
      /* del */ InteractionProps, 
      reactDashJsonDashViewLib.reactDashJsonDashViewLibNumbers.`false` | _
    ]) | reactDashJsonDashViewLib.reactDashJsonDashViewLibNumbers.`false` = null,
    onEdit: (js.Function1[
      /* edit */ InteractionProps, 
      reactDashJsonDashViewLib.reactDashJsonDashViewLibNumbers.`false` | _
    ]) | reactDashJsonDashViewLib.reactDashJsonDashViewLibNumbers.`false` = null,
    onSelect: (js.Function1[/* select */ OnSelectProps, scala.Unit]) | reactDashJsonDashViewLib.reactDashJsonDashViewLibNumbers.`false` = null,
    shouldCollapse: reactDashJsonDashViewLib.reactDashJsonDashViewLibNumbers.`false` | (js.Function1[/* field */ CollapsedFieldProps, scala.Boolean]) = null,
    sortKeys: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    theme: ThemeKeys | ThemeObject = null,
    validationMessage: java.lang.String = null
  ): ReactJsonViewProps = {
    val __obj = js.Dynamic.literal(src = src)
    if (collapseStringsAfterLength != null) __obj.updateDynamic("collapseStringsAfterLength")(collapseStringsAfterLength.asInstanceOf[js.Any])
    if (collapsed != null) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(displayDataTypes)) __obj.updateDynamic("displayDataTypes")(displayDataTypes)
    if (!js.isUndefined(displayObjectSize)) __obj.updateDynamic("displayObjectSize")(displayObjectSize)
    if (enableClipboard != null) __obj.updateDynamic("enableClipboard")(enableClipboard.asInstanceOf[js.Any])
    if (groupArraysAfterLength != null) __obj.updateDynamic("groupArraysAfterLength")(groupArraysAfterLength.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (indentWidth != null) __obj.updateDynamic("indentWidth")(indentWidth.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(onAdd.asInstanceOf[js.Any])
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete.asInstanceOf[js.Any])
    if (onEdit != null) __obj.updateDynamic("onEdit")(onEdit.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect.asInstanceOf[js.Any])
    if (shouldCollapse != null) __obj.updateDynamic("shouldCollapse")(shouldCollapse.asInstanceOf[js.Any])
    if (!js.isUndefined(sortKeys)) __obj.updateDynamic("sortKeys")(sortKeys)
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (validationMessage != null) __obj.updateDynamic("validationMessage")(validationMessage)
    __obj.asInstanceOf[ReactJsonViewProps]
  }
}

