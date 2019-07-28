package typings.reactDashFoundation.componentsSwitchMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.HTMLAttributes
import typings.react.reactStrings.off
import typings.react.reactStrings.on
import typings.reactDashFoundation.enumsMod.SwitchSizes
import typings.reactDashFoundation.utilsMod.FlexboxPropTypes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.react.reactMod.HTMLAttributes because var conflicts: className. Inlined about, accessKey, autoCapitalize, autoCorrect, autoSave, color, contentEditable, contextMenu, datatype, defaultChecked, defaultValue, dir, draggable, hidden, id, inlist, inputMode, is, itemID, itemProp, itemRef, itemScope, itemType, lang, placeholder, prefix, property, radioGroup, resource, results, role, security, slot, spellCheck, style, suppressContentEditableWarning, suppressHydrationWarning, tabIndex, title, typeof, unselectable, vocab */ trait SwitchProps extends FlexboxPropTypes {
  // RDFa Attributes
  var about: js.UndefOr[String] = js.undefined
  // Standard HTML Attributes
  var accessKey: js.UndefOr[String] = js.undefined
  var active: js.UndefOr[SwitchActiveProps] = js.undefined
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
  var defaultValue: js.UndefOr[String | js.Array[String]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inactive: js.UndefOr[SwitchInactiveProps] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  var input: js.UndefOr[SwitchInputProps] = js.undefined
  // Unknown
  var inputMode: js.UndefOr[String] = js.undefined
  var is: js.UndefOr[String] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var paddle: js.UndefOr[SwitchPaddleProps] = js.undefined
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
  var size: js.UndefOr[SwitchSizes] = js.undefined
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

object SwitchProps {
  @scala.inline
  def apply(
    FlexboxPropTypes: FlexboxPropTypes = null,
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    active: SwitchActiveProps = null,
    id: String = null,
    inactive: SwitchInactiveProps = null,
    input: SwitchInputProps = null,
    paddle: SwitchPaddleProps = null,
    size: SwitchSizes = null
  ): SwitchProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, FlexboxPropTypes)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (active != null) __obj.updateDynamic("active")(active)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (input != null) __obj.updateDynamic("input")(input)
    if (paddle != null) __obj.updateDynamic("paddle")(paddle)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[SwitchProps]
  }
}

