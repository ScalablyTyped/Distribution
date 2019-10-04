package typings.reactDashFoundation.componentsXyDashGridMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.HTMLAttributes
import typings.react.reactStrings.off
import typings.react.reactStrings.on
import typings.reactDashFoundation.enumsMod.ExtendedBreakpoints
import typings.reactDashFoundation.utilsMod.FlexboxPropTypes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.react.reactMod.HTMLAttributes because var conflicts: className. Inlined about, accessKey, autoCapitalize, autoCorrect, autoSave, color, contentEditable, contextMenu, datatype, defaultChecked, defaultValue, dir, draggable, hidden, id, inlist, inputMode, is, itemID, itemProp, itemRef, itemScope, itemType, lang, placeholder, prefix, property, radioGroup, resource, results, role, security, slot, spellCheck, style, suppressContentEditableWarning, suppressHydrationWarning, tabIndex, title, typeof, unselectable, vocab */ trait CellProps extends FlexboxPropTypes {
  // RDFa Attributes
  var about: js.UndefOr[String] = js.undefined
  // Standard HTML Attributes
  var accessKey: js.UndefOr[String] = js.undefined
  var auto: js.UndefOr[ExtendedBreakpoints] = js.undefined
  // Non-standard Attributes
  var autoCapitalize: js.UndefOr[String] = js.undefined
  var autoCorrect: js.UndefOr[String] = js.undefined
  var autoSave: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var contentEditable: js.UndefOr[Boolean] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  // React-specific Attributes
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  // Unknown
  var inputMode: js.UndefOr[String] = js.undefined
  var is: js.UndefOr[String] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var large: js.UndefOr[Double] = js.undefined
  var medium: js.UndefOr[Double] = js.undefined
  var offsetOnLarge: js.UndefOr[Double] = js.undefined
  var offsetOnMedium: js.UndefOr[Double] = js.undefined
  var offsetOnSmall: js.UndefOr[Double] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var radioGroup: js.UndefOr[String] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
   // <command>, <menuitem>
  // WAI-ARIA
  var role: js.UndefOr[String] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var shrink: js.UndefOr[ExtendedBreakpoints] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var small: js.UndefOr[Double] = js.undefined
  var spellCheck: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  var vocab: js.UndefOr[String] = js.undefined
}

object CellProps {
  @scala.inline
  def apply(
    FlexboxPropTypes: FlexboxPropTypes = null,
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    auto: ExtendedBreakpoints = null,
    large: Int | Double = null,
    medium: Int | Double = null,
    offsetOnLarge: Int | Double = null,
    offsetOnMedium: Int | Double = null,
    offsetOnSmall: Int | Double = null,
    shrink: ExtendedBreakpoints = null,
    small: Int | Double = null
  ): CellProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, FlexboxPropTypes)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (auto != null) __obj.updateDynamic("auto")(auto)
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (offsetOnLarge != null) __obj.updateDynamic("offsetOnLarge")(offsetOnLarge.asInstanceOf[js.Any])
    if (offsetOnMedium != null) __obj.updateDynamic("offsetOnMedium")(offsetOnMedium.asInstanceOf[js.Any])
    if (offsetOnSmall != null) __obj.updateDynamic("offsetOnSmall")(offsetOnSmall.asInstanceOf[js.Any])
    if (shrink != null) __obj.updateDynamic("shrink")(shrink)
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellProps]
  }
}

