package typings.reactJsonView.mod

import typings.react.mod.CSSProperties
import typings.reactJsonView.reactJsonViewBooleans.`false`
import typings.reactJsonView.reactJsonViewStrings.circle
import typings.reactJsonView.reactJsonViewStrings.square
import typings.reactJsonView.reactJsonViewStrings.triangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactJsonViewProps extends js.Object {
  /**
    * When an integer value is assigned, strings will be cut off at that length.
    * Collapsed strings are followed by an ellipsis.
    * String content can be expanded and collapsed by clicking on the string value.
    *
    * Default: false
    */
  var collapseStringsAfterLength: js.UndefOr[Double | `false`] = js.native
  /**
    * When set to true, all nodes will be collapsed by default.
    * Use an integer value to collapse at a particular depth.
    *
    * Default: false
    */
  var collapsed: js.UndefOr[Boolean | Double] = js.native
  /**
    * Set to a value to be used as defaultValue when adding new key to json
    *
    * Default: null
    */
  var defaultValue: js.UndefOr[TypeDefaultValue | js.Array[TypeDefaultValue] | Null] = js.native
  /**
    * When set to true, data type labels prefix values.
    *
    * Default: true
    */
  var displayDataTypes: js.UndefOr[Boolean] = js.native
  /**
    * When set to true, objects and arrays are labeled with size.
    *
    * Default: true
    */
  var displayObjectSize: js.UndefOr[Boolean] = js.native
  /**
    * When prop is not false, the user can copy objects and arrays to clipboard by clicking on the clipboard icon.
    * Copy callbacks are supported.
    *
    * Default: true
    */
  var enableClipboard: js.UndefOr[Boolean | (js.Function1[/* copy */ OnCopyProps, Unit])] = js.native
  /**
    * When an integer value is assigned, arrays will be displayed in groups by count of the value.
    * Groups are displayed with brakcet notation and can be expanded and collapsed by clickong on the brackets.
    *
    * Default: 100
    */
  var groupArraysAfterLength: js.UndefOr[Double] = js.native
  /**
    * Style of expand/collapse icons. Accepted values are "circle", triangle" or "square".
    *
    * Default: {}
    */
  var iconStyle: js.UndefOr[circle | triangle | square] = js.native
  /**
    * Set the indent-width for nested objects.
    *
    * Default: 4
    */
  var indentWidth: js.UndefOr[Double] = js.native
  /**
    * Contains the name of your root node. Use null or false for no name.
    *
    * Default: "root"
    */
  var name: js.UndefOr[String | Null | `false`] = js.native
  /**
    * When a callback function is passed in, add functionality is enabled.
    * The callback is invoked before additions are completed.
    * Returning false from onAdd will prevent the change from being made. see: onAdd docs
    *
    * Default: false
    */
  var onAdd: js.UndefOr[(js.Function1[/* add */ InteractionProps, `false` | _]) | `false`] = js.native
  /**
    * When a callback function is passed in, delete functionality is enabled.
    * The callback is invoked before deletions are completed.
    * Returning false from onDelete will prevent the change from being made. see: onDelete docs
    *
    * Default: false
    */
  var onDelete: js.UndefOr[(js.Function1[/* del */ InteractionProps, `false` | _]) | `false`] = js.native
  /**
    * When a callback function is passed in, edit functionality is enabled.
    * The callback is invoked before edits are completed. Returning false
    * from onEdit will prevent the change from being made. see: onEdit docs.
    *
    * Default: false
    */
  var onEdit: js.UndefOr[(js.Function1[/* edit */ InteractionProps, `false` | _]) | `false`] = js.native
  /**
    * When a function is passed in, clicking a value triggers the onSelect method to be called.
    *
    * Default: false
    */
  var onSelect: js.UndefOr[(js.Function1[/* select */ OnSelectProps, Unit]) | `false`] = js.native
  /**
    * Callback function to provide control over what objects and arrays should be collapsed by default.
    * An object is passed to the callback containing name, src, type ("array" or "object") and namespace.
    *
    * Default: false
    */
  var shouldCollapse: js.UndefOr[`false` | (js.Function1[/* field */ CollapsedFieldProps, Boolean])] = js.native
  /**
    * Set to true to sort object keys.
    *
    * Default: false
    */
  var sortKeys: js.UndefOr[Boolean] = js.native
  /**
    * This property contains your input JSON.
    *
    * Required.
    */
  var src: js.Object = js.native
  /**
    * Style attributes for react-json-view container.
    * Explicit style attributes will override attributes provided by a theme.
    *
    * Default: "rjv-default"
    */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * RJV supports base-16 themes. Check out the list of supported themes in the demo.
    * A custom "rjv-default" theme applies by default.
    *
    * Default: "rjv-default"
    */
  var theme: js.UndefOr[ThemeKeys | ThemeObject] = js.native
  /**
    * Custom message for validation failures to onEdit, onAdd, or onDelete callbacks.
    *
    * Default: "Validation Error"
    */
  var validationMessage: js.UndefOr[String] = js.native
}

object ReactJsonViewProps {
  @scala.inline
  def apply(src: js.Object): ReactJsonViewProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactJsonViewProps]
  }
  @scala.inline
  implicit class ReactJsonViewPropsOps[Self <: ReactJsonViewProps] (val x: Self) extends AnyVal {
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
    def setSrc(value: js.Object): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollapseStringsAfterLength(value: Double | `false`): Self = this.set("collapseStringsAfterLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseStringsAfterLength: Self = this.set("collapseStringsAfterLength", js.undefined)
    @scala.inline
    def setCollapsed(value: Boolean | Double): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setDefaultValueVarargs(value: TypeDefaultValue*): Self = this.set("defaultValue", js.Array(value :_*))
    @scala.inline
    def setDefaultValue(value: TypeDefaultValue | js.Array[TypeDefaultValue]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDefaultValueNull: Self = this.set("defaultValue", null)
    @scala.inline
    def setDisplayDataTypes(value: Boolean): Self = this.set("displayDataTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayDataTypes: Self = this.set("displayDataTypes", js.undefined)
    @scala.inline
    def setDisplayObjectSize(value: Boolean): Self = this.set("displayObjectSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayObjectSize: Self = this.set("displayObjectSize", js.undefined)
    @scala.inline
    def setEnableClipboardFunction1(value: /* copy */ OnCopyProps => Unit): Self = this.set("enableClipboard", js.Any.fromFunction1(value))
    @scala.inline
    def setEnableClipboard(value: Boolean | (js.Function1[/* copy */ OnCopyProps, Unit])): Self = this.set("enableClipboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableClipboard: Self = this.set("enableClipboard", js.undefined)
    @scala.inline
    def setGroupArraysAfterLength(value: Double): Self = this.set("groupArraysAfterLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupArraysAfterLength: Self = this.set("groupArraysAfterLength", js.undefined)
    @scala.inline
    def setIconStyle(value: circle | triangle | square): Self = this.set("iconStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconStyle: Self = this.set("iconStyle", js.undefined)
    @scala.inline
    def setIndentWidth(value: Double): Self = this.set("indentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentWidth: Self = this.set("indentWidth", js.undefined)
    @scala.inline
    def setName(value: String | `false`): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setOnAddFunction1(value: /* add */ InteractionProps => `false` | _): Self = this.set("onAdd", js.Any.fromFunction1(value))
    @scala.inline
    def setOnAdd(value: (js.Function1[/* add */ InteractionProps, `false` | _]) | `false`): Self = this.set("onAdd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAdd: Self = this.set("onAdd", js.undefined)
    @scala.inline
    def setOnDeleteFunction1(value: /* del */ InteractionProps => `false` | _): Self = this.set("onDelete", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDelete(value: (js.Function1[/* del */ InteractionProps, `false` | _]) | `false`): Self = this.set("onDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDelete: Self = this.set("onDelete", js.undefined)
    @scala.inline
    def setOnEditFunction1(value: /* edit */ InteractionProps => `false` | _): Self = this.set("onEdit", js.Any.fromFunction1(value))
    @scala.inline
    def setOnEdit(value: (js.Function1[/* edit */ InteractionProps, `false` | _]) | `false`): Self = this.set("onEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEdit: Self = this.set("onEdit", js.undefined)
    @scala.inline
    def setOnSelectFunction1(value: /* select */ OnSelectProps => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def setOnSelect(value: (js.Function1[/* select */ OnSelectProps, Unit]) | `false`): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setShouldCollapseFunction1(value: /* field */ CollapsedFieldProps => Boolean): Self = this.set("shouldCollapse", js.Any.fromFunction1(value))
    @scala.inline
    def setShouldCollapse(value: `false` | (js.Function1[/* field */ CollapsedFieldProps, Boolean])): Self = this.set("shouldCollapse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldCollapse: Self = this.set("shouldCollapse", js.undefined)
    @scala.inline
    def setSortKeys(value: Boolean): Self = this.set("sortKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortKeys: Self = this.set("sortKeys", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTheme(value: ThemeKeys | ThemeObject): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setValidationMessage(value: String): Self = this.set("validationMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationMessage: Self = this.set("validationMessage", js.undefined)
  }
  
}

