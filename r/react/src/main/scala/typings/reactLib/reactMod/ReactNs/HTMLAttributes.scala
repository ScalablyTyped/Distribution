package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// All the WAI-ARIA 1.1 attributes from https://www.w3.org/TR/wai-aria-1.1/
trait HTMLAttributes[T] extends DOMAttributes[T] {
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
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var contentEditable: js.UndefOr[scala.Boolean] = js.undefined
  var contextMenu: js.UndefOr[java.lang.String] = js.undefined
  var datatype: js.UndefOr[java.lang.String] = js.undefined
  // React-specific Attributes
  var defaultChecked: js.UndefOr[scala.Boolean] = js.undefined
  var defaultValue: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  // Unknown
  var inputMode: js.UndefOr[java.lang.String] = js.undefined
  var is: js.UndefOr[java.lang.String] = js.undefined
  var itemID: js.UndefOr[java.lang.String] = js.undefined
  var itemProp: js.UndefOr[java.lang.String] = js.undefined
  var itemRef: js.UndefOr[java.lang.String] = js.undefined
  var itemScope: js.UndefOr[scala.Boolean] = js.undefined
  var itemType: js.UndefOr[java.lang.String] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var property: js.UndefOr[java.lang.String] = js.undefined
  var radioGroup: js.UndefOr[java.lang.String] = js.undefined
  var resource: js.UndefOr[java.lang.String] = js.undefined
  var results: js.UndefOr[scala.Double] = js.undefined
   // <command>, <menuitem>
  // WAI-ARIA
  var role: js.UndefOr[java.lang.String] = js.undefined
  var security: js.UndefOr[java.lang.String] = js.undefined
  var slot: js.UndefOr[java.lang.String] = js.undefined
  var spellCheck: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[scala.Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[scala.Boolean] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var typeof: js.UndefOr[java.lang.String] = js.undefined
  var unselectable: js.UndefOr[reactLib.reactLibStrings.on | reactLib.reactLibStrings.off] = js.undefined
  var vocab: js.UndefOr[java.lang.String] = js.undefined
}

object HTMLAttributes {
  @scala.inline
  def apply[T](
    DOMAttributes: DOMAttributes[T] = null,
    about: java.lang.String = null,
    accessKey: java.lang.String = null,
    `aria-activedescendant`: java.lang.String = null,
    `aria-atomic`: scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true` = null,
    `aria-autocomplete`: reactLib.reactLibStrings.none | reactLib.reactLibStrings.`inline` | reactLib.reactLibStrings.list | reactLib.reactLibStrings.both = null,
    `aria-busy`: scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true` = null,
    `aria-checked`: scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.mixed | reactLib.reactLibStrings.`true` = null,
    `aria-colcount`: scala.Int | scala.Double = null,
    `aria-colindex`: scala.Int | scala.Double = null,
    `aria-colspan`: scala.Int | scala.Double = null,
    `aria-controls`: java.lang.String = null,
    `aria-current`: scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true` | reactLib.reactLibStrings.page | reactLib.reactLibStrings.step | reactLib.reactLibStrings.location | reactLib.reactLibStrings.date | reactLib.reactLibStrings.time = null,
    `aria-describedby`: java.lang.String = null,
    `aria-details`: java.lang.String = null,
    `aria-disabled`: scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true` = null,
    `aria-dropeffect`: reactLib.reactLibStrings.none | reactLib.reactLibStrings.copy | reactLib.reactLibStrings.execute | reactLib.reactLibStrings.link | reactLib.reactLibStrings.move | reactLib.reactLibStrings.popup = null,
    `aria-errormessage`: java.lang.String = null,
    `aria-expanded`: scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true` = null,
    `aria-flowto`: java.lang.String = null,
    `aria-grabbed`: scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true` = null,
    `aria-haspopup`: scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true` | reactLib.reactLibStrings.menu | reactLib.reactLibStrings.listbox | reactLib.reactLibStrings.tree | reactLib.reactLibStrings.grid | reactLib.reactLibStrings.dialog = null,
    `aria-hidden`: scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true` = null,
    `aria-invalid`: scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true` | reactLib.reactLibStrings.grammar | reactLib.reactLibStrings.spelling = null,
    `aria-keyshortcuts`: java.lang.String = null,
    `aria-label`: java.lang.String = null,
    `aria-labelledby`: java.lang.String = null,
    `aria-level`: scala.Int | scala.Double = null,
    `aria-live`: reactLib.reactLibStrings.off | reactLib.reactLibStrings.assertive | reactLib.reactLibStrings.polite = null,
    `aria-modal`: scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true` = null,
    `aria-multiline`: scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true` = null,
    `aria-multiselectable`: scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true` = null,
    `aria-orientation`: reactLib.reactLibStrings.horizontal | reactLib.reactLibStrings.vertical = null,
    `aria-owns`: java.lang.String = null,
    `aria-placeholder`: java.lang.String = null,
    `aria-posinset`: scala.Int | scala.Double = null,
    `aria-pressed`: scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.mixed | reactLib.reactLibStrings.`true` = null,
    `aria-readonly`: scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true` = null,
    `aria-relevant`: reactLib.reactLibStrings.additions | (reactLib.reactLibStrings.`additions text`) | reactLib.reactLibStrings.all | reactLib.reactLibStrings.removals | reactLib.reactLibStrings.text = null,
    `aria-required`: scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true` = null,
    `aria-roledescription`: java.lang.String = null,
    `aria-rowcount`: scala.Int | scala.Double = null,
    `aria-rowindex`: scala.Int | scala.Double = null,
    `aria-rowspan`: scala.Int | scala.Double = null,
    `aria-selected`: scala.Boolean | reactLib.reactLibStrings.`false` | reactLib.reactLibStrings.`true` = null,
    `aria-setsize`: scala.Int | scala.Double = null,
    `aria-sort`: reactLib.reactLibStrings.none | reactLib.reactLibStrings.ascending | reactLib.reactLibStrings.descending | reactLib.reactLibStrings.other = null,
    `aria-valuemax`: scala.Int | scala.Double = null,
    `aria-valuemin`: scala.Int | scala.Double = null,
    `aria-valuenow`: scala.Int | scala.Double = null,
    `aria-valuetext`: java.lang.String = null,
    autoCapitalize: java.lang.String = null,
    autoCorrect: java.lang.String = null,
    autoSave: java.lang.String = null,
    className: java.lang.String = null,
    color: java.lang.String = null,
    contentEditable: js.UndefOr[scala.Boolean] = js.undefined,
    contextMenu: java.lang.String = null,
    datatype: java.lang.String = null,
    defaultChecked: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: java.lang.String | js.Array[java.lang.String] = null,
    dir: java.lang.String = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    inlist: js.Any = null,
    inputMode: java.lang.String = null,
    is: java.lang.String = null,
    itemID: java.lang.String = null,
    itemProp: java.lang.String = null,
    itemRef: java.lang.String = null,
    itemScope: js.UndefOr[scala.Boolean] = js.undefined,
    itemType: java.lang.String = null,
    lang: java.lang.String = null,
    placeholder: java.lang.String = null,
    prefix: java.lang.String = null,
    property: java.lang.String = null,
    radioGroup: java.lang.String = null,
    resource: java.lang.String = null,
    results: scala.Int | scala.Double = null,
    role: java.lang.String = null,
    security: java.lang.String = null,
    slot: java.lang.String = null,
    spellCheck: js.UndefOr[scala.Boolean] = js.undefined,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[scala.Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[scala.Boolean] = js.undefined,
    tabIndex: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    typeof: java.lang.String = null,
    unselectable: reactLib.reactLibStrings.on | reactLib.reactLibStrings.off = null,
    vocab: java.lang.String = null
  ): HTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, DOMAttributes)
    if (about != null) __obj.updateDynamic("about")(about)
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey)
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`)
    if (`aria-atomic` != null) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (`aria-busy` != null) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`)
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`)
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`)
    if (`aria-disabled` != null) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`)
    if (`aria-expanded` != null) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`)
    if (`aria-grabbed` != null) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (`aria-hidden` != null) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`)
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (`aria-modal` != null) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (`aria-multiline` != null) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (`aria-multiselectable` != null) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`)
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`)
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (`aria-readonly` != null) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (`aria-required` != null) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`)
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (`aria-selected` != null) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`)
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize)
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect)
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(contentEditable)) __obj.updateDynamic("contentEditable")(contentEditable)
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu)
    if (datatype != null) __obj.updateDynamic("datatype")(datatype)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inlist != null) __obj.updateDynamic("inlist")(inlist)
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode)
    if (is != null) __obj.updateDynamic("is")(is)
    if (itemID != null) __obj.updateDynamic("itemID")(itemID)
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp)
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef)
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope)
    if (itemType != null) __obj.updateDynamic("itemType")(itemType)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (property != null) __obj.updateDynamic("property")(property)
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role)
    if (security != null) __obj.updateDynamic("security")(security)
    if (slot != null) __obj.updateDynamic("slot")(slot)
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning)
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (typeof != null) __obj.updateDynamic("typeof")(typeof)
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab)
    __obj.asInstanceOf[HTMLAttributes[T]]
  }
}

