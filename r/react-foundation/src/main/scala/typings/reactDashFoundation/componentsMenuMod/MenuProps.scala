package typings.reactDashFoundation.componentsMenuMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.HTMLAttributes
import typings.react.reactStrings.off
import typings.react.reactStrings.on
import typings.reactDashFoundation.enumsMod.MenuAlignments
import typings.reactDashFoundation.utilsMod.FlexboxPropTypes
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.react.reactMod.HTMLAttributes because var conflicts: className. Inlined about, accessKey, autoCapitalize, autoCorrect, autoSave, color, contentEditable, contextMenu, datatype, defaultChecked, defaultValue, dir, draggable, hidden, id, inlist, inputMode, is, itemID, itemProp, itemRef, itemScope, itemType, lang, placeholder, prefix, property, radioGroup, resource, results, role, security, slot, spellCheck, style, suppressContentEditableWarning, suppressHydrationWarning, tabIndex, title, typeof, unselectable, vocab */ trait MenuProps extends FlexboxPropTypes {
  // RDFa Attributes
  var about: js.UndefOr[String] = js.undefined
  // Standard HTML Attributes
  var accessKey: js.UndefOr[String] = js.undefined
  var alignment: js.UndefOr[MenuAlignments] = js.undefined
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
  var horizontalOnMedium: js.UndefOr[Boolean] = js.undefined
  var iconsOnTop: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  // Unknown
  var inputMode: js.UndefOr[String] = js.undefined
  var is: js.UndefOr[String] = js.undefined
  var isDropdown: js.UndefOr[Boolean] = js.undefined
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  var isNested: js.UndefOr[Boolean] = js.undefined
  var isSimple: js.UndefOr[Boolean] = js.undefined
  var isVertical: js.UndefOr[Boolean] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
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
  var slot: js.UndefOr[String] = js.undefined
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

object MenuProps {
  @scala.inline
  def apply(
    FlexboxPropTypes: FlexboxPropTypes = null,
    HTMLAttributes: HTMLAttributes[HTMLUListElement] = null,
    alignment: MenuAlignments = null,
    horizontalOnMedium: js.UndefOr[Boolean] = js.undefined,
    iconsOnTop: js.UndefOr[Boolean] = js.undefined,
    isDropdown: js.UndefOr[Boolean] = js.undefined,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    isNested: js.UndefOr[Boolean] = js.undefined,
    isSimple: js.UndefOr[Boolean] = js.undefined,
    isVertical: js.UndefOr[Boolean] = js.undefined
  ): MenuProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, FlexboxPropTypes)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (!js.isUndefined(horizontalOnMedium)) __obj.updateDynamic("horizontalOnMedium")(horizontalOnMedium)
    if (!js.isUndefined(iconsOnTop)) __obj.updateDynamic("iconsOnTop")(iconsOnTop)
    if (!js.isUndefined(isDropdown)) __obj.updateDynamic("isDropdown")(isDropdown)
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded)
    if (!js.isUndefined(isNested)) __obj.updateDynamic("isNested")(isNested)
    if (!js.isUndefined(isSimple)) __obj.updateDynamic("isSimple")(isSimple)
    if (!js.isUndefined(isVertical)) __obj.updateDynamic("isVertical")(isVertical)
    __obj.asInstanceOf[MenuProps]
  }
}

