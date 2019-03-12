package typings
package reactDashFoundationLib.componentsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactLib.reactMod.ReactNs.HTMLAttributes because var conflicts: className. Inlined about, accessKey, `aria-activedescendant`, `aria-atomic`, `aria-autocomplete`, `aria-busy`, `aria-checked`, `aria-colcount`, `aria-colindex`, `aria-colspan`, `aria-controls`, `aria-current`, `aria-describedby`, `aria-details`, `aria-disabled`, `aria-dropeffect`, `aria-errormessage`, `aria-expanded`, `aria-flowto`, `aria-grabbed`, `aria-haspopup`, `aria-hidden`, `aria-invalid`, `aria-keyshortcuts`, `aria-label`, `aria-labelledby`, `aria-level`, `aria-live`, `aria-modal`, `aria-multiline`, `aria-multiselectable`, `aria-orientation`, `aria-owns`, `aria-placeholder`, `aria-posinset`, `aria-pressed`, `aria-readonly`, `aria-relevant`, `aria-required`, `aria-roledescription`, `aria-rowcount`, `aria-rowindex`, `aria-rowspan`, `aria-selected`, `aria-setsize`, `aria-sort`, `aria-valuemax`, `aria-valuemin`, `aria-valuenow`, `aria-valuetext`, autoCapitalize, autoCorrect, autoSave, color, contentEditable, contextMenu, datatype, defaultChecked, defaultValue, dir, draggable, hidden, id, inlist, inputMode, is, itemID, itemProp, itemRef, itemScope, itemType, lang, placeholder, prefix, property, radioGroup, resource, results, role, security, slot, spellCheck, style, suppressContentEditableWarning, suppressHydrationWarning, tabIndex, title, typeof, unselectable, vocab */ trait ColumnProps
  extends reactDashFoundationLib.utilsMod.FlexboxPropTypes {
  // RDFa Attributes
  var about: js.UndefOr[java.lang.String] = js.undefined
  // Standard HTML Attributes
  var accessKey: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
  var `aria-activedescendant`: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
  var `aria-atomic`: js.UndefOr[
    scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true`
  ] = js.undefined
  /**
    * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
    * presented if they are made.
    */
  var `aria-autocomplete`: js.UndefOr[
    reactLib.reactLibStrings.none | reactLib.reactLibStrings.`inline` | reactLib.reactLibStrings.list | reactLib.reactLibStrings.both
  ] = js.undefined
  /** Indicates an element is being modified and that assistive technologies MAY want to wait until the modifications are complete before exposing them to the user. */
  var `aria-busy`: js.UndefOr[
    scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true`
  ] = js.undefined
  /**
    * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets.
    * @see aria-pressed @see aria-selected.
    */
  var `aria-checked`: js.UndefOr[
    scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.mixed | reactLib.reactLibStrings.`true`
  ] = js.undefined
  /**
    * Defines the total number of columns in a table, grid, or treegrid.
    * @see aria-colindex.
    */
  var `aria-colcount`: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid.
    * @see aria-colcount @see aria-colspan.
    */
  var `aria-colindex`: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-colindex @see aria-rowspan.
    */
  var `aria-colspan`: js.UndefOr[scala.Double] = js.undefined
  /**
    * Identifies the element (or elements) whose contents or presence are controlled by the current element.
    * @see aria-owns.
    */
  var `aria-controls`: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates the element that represents the current item within a container or set of related elements. */
  var `aria-current`: js.UndefOr[
    scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true` | reactLib.reactLibStrings.page | reactLib.reactLibStrings.step | reactLib.reactLibStrings.location | reactLib.reactLibStrings.date | reactLib.reactLibStrings.time
  ] = js.undefined
  /**
    * Identifies the element (or elements) that describes the object.
    * @see aria-labelledby
    */
  var `aria-describedby`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifies the element that provides a detailed, extended description for the object.
    * @see aria-describedby.
    */
  var `aria-details`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
    * @see aria-hidden @see aria-readonly.
    */
  var `aria-disabled`: js.UndefOr[
    scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true`
  ] = js.undefined
  /**
    * Indicates what functions can be performed when a dragged object is released on the drop target.
    * @deprecated in ARIA 1.1
    */
  var `aria-dropeffect`: js.UndefOr[
    reactLib.reactLibStrings.none | reactLib.reactLibStrings.copy | reactLib.reactLibStrings.execute | reactLib.reactLibStrings.link | reactLib.reactLibStrings.move | reactLib.reactLibStrings.popup
  ] = js.undefined
  /**
    * Identifies the element that provides an error message for the object.
    * @see aria-invalid @see aria-describedby.
    */
  var `aria-errormessage`: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed. */
  var `aria-expanded`: js.UndefOr[
    scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true`
  ] = js.undefined
  /**
    * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion,
    * allows assistive technology to override the general default of reading in document source order.
    */
  var `aria-flowto`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates an element's "grabbed" state in a drag-and-drop operation.
    * @deprecated in ARIA 1.1
    */
  var `aria-grabbed`: js.UndefOr[
    scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true`
  ] = js.undefined
  /** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
  var `aria-haspopup`: js.UndefOr[
    scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true` | reactLib.reactLibStrings.menu | reactLib.reactLibStrings.listbox | reactLib.reactLibStrings.tree | reactLib.reactLibStrings.grid | reactLib.reactLibStrings.dialog
  ] = js.undefined
  /**
    * Indicates whether the element is exposed to an accessibility API.
    * @see aria-disabled.
    */
  var `aria-hidden`: js.UndefOr[
    scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true`
  ] = js.undefined
  /**
    * Indicates the entered value does not conform to the format expected by the application.
    * @see aria-errormessage.
    */
  var `aria-invalid`: js.UndefOr[
    scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true` | reactLib.reactLibStrings.grammar | reactLib.reactLibStrings.spelling
  ] = js.undefined
  /** Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. */
  var `aria-keyshortcuts`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines a string value that labels the current element.
    * @see aria-labelledby.
    */
  var `aria-label`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifies the element (or elements) that labels the current element.
    * @see aria-describedby.
    */
  var `aria-labelledby`: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the hierarchical level of an element within a structure. */
  var `aria-level`: js.UndefOr[scala.Double] = js.undefined
  /** Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region. */
  var `aria-live`: js.UndefOr[
    reactLib.reactLibStrings.off | reactLib.reactLibStrings.assertive | reactLib.reactLibStrings.polite
  ] = js.undefined
  /** Indicates whether an element is modal when displayed. */
  var `aria-modal`: js.UndefOr[
    scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true`
  ] = js.undefined
  /** Indicates whether a text box accepts multiple lines of input or only a single line. */
  var `aria-multiline`: js.UndefOr[
    scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true`
  ] = js.undefined
  /** Indicates that the user may select more than one item from the current selectable descendants. */
  var `aria-multiselectable`: js.UndefOr[
    scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true`
  ] = js.undefined
  /** Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. */
  var `aria-orientation`: js.UndefOr[reactLib.reactLibStrings.horizontal | reactLib.reactLibStrings.vertical] = js.undefined
  /**
    * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship
    * between DOM elements where the DOM hierarchy cannot be used to represent the relationship.
    * @see aria-controls.
    */
  var `aria-owns`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value.
    * A hint could be a sample value or a brief description of the expected format.
    */
  var `aria-placeholder`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-setsize.
    */
  var `aria-posinset`: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates the current "pressed" state of toggle buttons.
    * @see aria-checked @see aria-selected.
    */
  var `aria-pressed`: js.UndefOr[
    scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.mixed | reactLib.reactLibStrings.`true`
  ] = js.undefined
  /**
    * Indicates that the element is not editable, but is otherwise operable.
    * @see aria-disabled.
    */
  var `aria-readonly`: js.UndefOr[
    scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true`
  ] = js.undefined
  /**
    * Indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified.
    * @see aria-atomic.
    */
  var `aria-relevant`: js.UndefOr[
    reactLib.reactLibStrings.additions | (reactLib.reactLibStrings.`additions text`) | reactLib.reactLibStrings.all | reactLib.reactLibStrings.removals | reactLib.reactLibStrings.text
  ] = js.undefined
  /** Indicates that user input is required on the element before a form may be submitted. */
  var `aria-required`: js.UndefOr[
    scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true`
  ] = js.undefined
  /** Defines a human-readable, author-localized description for the role of an element. */
  var `aria-roledescription`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines the total number of rows in a table, grid, or treegrid.
    * @see aria-rowindex.
    */
  var `aria-rowcount`: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid.
    * @see aria-rowcount @see aria-rowspan.
    */
  var `aria-rowindex`: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-rowindex @see aria-colspan.
    */
  var `aria-rowspan`: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates the current "selected" state of various widgets.
    * @see aria-checked @see aria-pressed.
    */
  var `aria-selected`: js.UndefOr[
    scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true`
  ] = js.undefined
  /**
    * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-posinset.
    */
  var `aria-setsize`: js.UndefOr[scala.Double] = js.undefined
  /** Indicates if items in a table or grid are sorted in ascending or descending order. */
  var `aria-sort`: js.UndefOr[
    reactLib.reactLibStrings.none | reactLib.reactLibStrings.ascending | reactLib.reactLibStrings.descending | reactLib.reactLibStrings.other
  ] = js.undefined
  /** Defines the maximum allowed value for a range widget. */
  var `aria-valuemax`: js.UndefOr[scala.Double] = js.undefined
  /** Defines the minimum allowed value for a range widget. */
  var `aria-valuemin`: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defines the current value for a range widget.
    * @see aria-valuetext.
    */
  var `aria-valuenow`: js.UndefOr[scala.Double] = js.undefined
  /** Defines the human readable text alternative of aria-valuenow for a range widget. */
  var `aria-valuetext`: js.UndefOr[java.lang.String] = js.undefined
  // Non-standard Attributes
  var autoCapitalize: js.UndefOr[java.lang.String] = js.undefined
  var autoCorrect: js.UndefOr[java.lang.String] = js.undefined
  var autoSave: js.UndefOr[java.lang.String] = js.undefined
  var centerOnLarge: js.UndefOr[scala.Boolean] = js.undefined
  var centerOnMedium: js.UndefOr[scala.Boolean] = js.undefined
  var centerOnSmall: js.UndefOr[scala.Boolean] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var contentEditable: js.UndefOr[scala.Boolean] = js.undefined
  var contextMenu: js.UndefOr[java.lang.String] = js.undefined
  var datatype: js.UndefOr[java.lang.String] = js.undefined
  // React-specific Attributes
  var defaultChecked: js.UndefOr[scala.Boolean] = js.undefined
  var defaultValue: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var expandOnLarge: js.UndefOr[scala.Boolean] = js.undefined
  var expandOnMedium: js.UndefOr[scala.Boolean] = js.undefined
  var expandOnSmall: js.UndefOr[scala.Boolean] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  // Unknown
  var inputMode: js.UndefOr[java.lang.String] = js.undefined
  var is: js.UndefOr[java.lang.String] = js.undefined
  var isColumn: js.UndefOr[scala.Boolean] = js.undefined
  var isLast: js.UndefOr[scala.Boolean] = js.undefined
  var isShrunk: js.UndefOr[scala.Boolean] = js.undefined
  var itemID: js.UndefOr[java.lang.String] = js.undefined
  var itemProp: js.UndefOr[java.lang.String] = js.undefined
  var itemRef: js.UndefOr[java.lang.String] = js.undefined
  var itemScope: js.UndefOr[scala.Boolean] = js.undefined
  var itemType: js.UndefOr[java.lang.String] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var large: js.UndefOr[scala.Double] = js.undefined
  var medium: js.UndefOr[scala.Double] = js.undefined
  var offsetOnLarge: js.UndefOr[scala.Double] = js.undefined
  var offsetOnMedium: js.UndefOr[scala.Double] = js.undefined
  var offsetOnSmall: js.UndefOr[scala.Double] = js.undefined
  var orderOnLarge: js.UndefOr[scala.Double] = js.undefined
  var orderOnMedium: js.UndefOr[scala.Double] = js.undefined
  var orderOnSmall: js.UndefOr[scala.Double] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var property: js.UndefOr[java.lang.String] = js.undefined
  var pullOnLarge: js.UndefOr[scala.Double] = js.undefined
  var pullOnMedium: js.UndefOr[scala.Double] = js.undefined
  var pullOnSmall: js.UndefOr[scala.Double] = js.undefined
  var pushOnLarge: js.UndefOr[scala.Double] = js.undefined
  var pushOnMedium: js.UndefOr[scala.Double] = js.undefined
  var pushOnSmall: js.UndefOr[scala.Double] = js.undefined
  var radioGroup: js.UndefOr[java.lang.String] = js.undefined
  var resource: js.UndefOr[java.lang.String] = js.undefined
  var results: js.UndefOr[scala.Double] = js.undefined
   // <command>, <menuitem>
  // WAI-ARIA
  var role: js.UndefOr[java.lang.String] = js.undefined
  var security: js.UndefOr[java.lang.String] = js.undefined
  var slot: js.UndefOr[java.lang.String] = js.undefined
  var small: js.UndefOr[scala.Double] = js.undefined
  var spellCheck: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[scala.Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[scala.Boolean] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var typeof: js.UndefOr[java.lang.String] = js.undefined
  var uncenterOnLarge: js.UndefOr[scala.Boolean] = js.undefined
  var uncenterOnMedium: js.UndefOr[scala.Boolean] = js.undefined
  var uncenterOnSmall: js.UndefOr[scala.Boolean] = js.undefined
  var unselectable: js.UndefOr[reactLib.reactLibStrings.on | reactLib.reactLibStrings.off] = js.undefined
  var upOnSmall: js.UndefOr[scala.Double] = js.undefined
  var vocab: js.UndefOr[java.lang.String] = js.undefined
}

object ColumnProps {
  @scala.inline
  def apply(
    FlexboxPropTypes: reactDashFoundationLib.utilsMod.FlexboxPropTypes = null,
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLDivElement] = null,
    centerOnLarge: js.UndefOr[scala.Boolean] = js.undefined,
    centerOnMedium: js.UndefOr[scala.Boolean] = js.undefined,
    centerOnSmall: js.UndefOr[scala.Boolean] = js.undefined,
    expandOnLarge: js.UndefOr[scala.Boolean] = js.undefined,
    expandOnMedium: js.UndefOr[scala.Boolean] = js.undefined,
    expandOnSmall: js.UndefOr[scala.Boolean] = js.undefined,
    isColumn: js.UndefOr[scala.Boolean] = js.undefined,
    isLast: js.UndefOr[scala.Boolean] = js.undefined,
    isShrunk: js.UndefOr[scala.Boolean] = js.undefined,
    large: scala.Int | scala.Double = null,
    medium: scala.Int | scala.Double = null,
    offsetOnLarge: scala.Int | scala.Double = null,
    offsetOnMedium: scala.Int | scala.Double = null,
    offsetOnSmall: scala.Int | scala.Double = null,
    orderOnLarge: scala.Int | scala.Double = null,
    orderOnMedium: scala.Int | scala.Double = null,
    orderOnSmall: scala.Int | scala.Double = null,
    pullOnLarge: scala.Int | scala.Double = null,
    pullOnMedium: scala.Int | scala.Double = null,
    pullOnSmall: scala.Int | scala.Double = null,
    pushOnLarge: scala.Int | scala.Double = null,
    pushOnMedium: scala.Int | scala.Double = null,
    pushOnSmall: scala.Int | scala.Double = null,
    small: scala.Int | scala.Double = null,
    uncenterOnLarge: js.UndefOr[scala.Boolean] = js.undefined,
    uncenterOnMedium: js.UndefOr[scala.Boolean] = js.undefined,
    uncenterOnSmall: js.UndefOr[scala.Boolean] = js.undefined,
    upOnSmall: scala.Int | scala.Double = null
  ): ColumnProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, FlexboxPropTypes)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(centerOnLarge)) __obj.updateDynamic("centerOnLarge")(centerOnLarge)
    if (!js.isUndefined(centerOnMedium)) __obj.updateDynamic("centerOnMedium")(centerOnMedium)
    if (!js.isUndefined(centerOnSmall)) __obj.updateDynamic("centerOnSmall")(centerOnSmall)
    if (!js.isUndefined(expandOnLarge)) __obj.updateDynamic("expandOnLarge")(expandOnLarge)
    if (!js.isUndefined(expandOnMedium)) __obj.updateDynamic("expandOnMedium")(expandOnMedium)
    if (!js.isUndefined(expandOnSmall)) __obj.updateDynamic("expandOnSmall")(expandOnSmall)
    if (!js.isUndefined(isColumn)) __obj.updateDynamic("isColumn")(isColumn)
    if (!js.isUndefined(isLast)) __obj.updateDynamic("isLast")(isLast)
    if (!js.isUndefined(isShrunk)) __obj.updateDynamic("isShrunk")(isShrunk)
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (offsetOnLarge != null) __obj.updateDynamic("offsetOnLarge")(offsetOnLarge.asInstanceOf[js.Any])
    if (offsetOnMedium != null) __obj.updateDynamic("offsetOnMedium")(offsetOnMedium.asInstanceOf[js.Any])
    if (offsetOnSmall != null) __obj.updateDynamic("offsetOnSmall")(offsetOnSmall.asInstanceOf[js.Any])
    if (orderOnLarge != null) __obj.updateDynamic("orderOnLarge")(orderOnLarge.asInstanceOf[js.Any])
    if (orderOnMedium != null) __obj.updateDynamic("orderOnMedium")(orderOnMedium.asInstanceOf[js.Any])
    if (orderOnSmall != null) __obj.updateDynamic("orderOnSmall")(orderOnSmall.asInstanceOf[js.Any])
    if (pullOnLarge != null) __obj.updateDynamic("pullOnLarge")(pullOnLarge.asInstanceOf[js.Any])
    if (pullOnMedium != null) __obj.updateDynamic("pullOnMedium")(pullOnMedium.asInstanceOf[js.Any])
    if (pullOnSmall != null) __obj.updateDynamic("pullOnSmall")(pullOnSmall.asInstanceOf[js.Any])
    if (pushOnLarge != null) __obj.updateDynamic("pushOnLarge")(pushOnLarge.asInstanceOf[js.Any])
    if (pushOnMedium != null) __obj.updateDynamic("pushOnMedium")(pushOnMedium.asInstanceOf[js.Any])
    if (pushOnSmall != null) __obj.updateDynamic("pushOnSmall")(pushOnSmall.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (!js.isUndefined(uncenterOnLarge)) __obj.updateDynamic("uncenterOnLarge")(uncenterOnLarge)
    if (!js.isUndefined(uncenterOnMedium)) __obj.updateDynamic("uncenterOnMedium")(uncenterOnMedium)
    if (!js.isUndefined(uncenterOnSmall)) __obj.updateDynamic("uncenterOnSmall")(uncenterOnSmall)
    if (upOnSmall != null) __obj.updateDynamic("upOnSmall")(upOnSmall.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnProps]
  }
}

