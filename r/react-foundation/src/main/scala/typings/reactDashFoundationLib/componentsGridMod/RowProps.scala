package typings
package reactDashFoundationLib.componentsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactLib.reactMod.HTMLAttributes because var conflicts: className. Inlined about, accessKey, autoCapitalize, autoCorrect, autoSave, color, contentEditable, contextMenu, datatype, defaultChecked, defaultValue, dir, draggable, hidden, id, inlist, inputMode, is, itemID, itemProp, itemRef, itemScope, itemType, lang, placeholder, prefix, property, radioGroup, resource, results, role, security, slot, spellCheck, style, suppressContentEditableWarning, suppressHydrationWarning, tabIndex, title, typeof, unselectable, vocab */ trait RowProps
  extends reactDashFoundationLib.utilsMod.FlexboxPropTypes {
  // RDFa Attributes
  var about: js.UndefOr[java.lang.String] = js.undefined
  // Standard HTML Attributes
  var accessKey: js.UndefOr[java.lang.String] = js.undefined
  // Non-standard Attributes
  var autoCapitalize: js.UndefOr[java.lang.String] = js.undefined
  var autoCorrect: js.UndefOr[java.lang.String] = js.undefined
  var autoSave: js.UndefOr[java.lang.String] = js.undefined
  var collapseOnLarge: js.UndefOr[scala.Boolean] = js.undefined
  var collapseOnMedium: js.UndefOr[scala.Boolean] = js.undefined
  var collapseOnSmall: js.UndefOr[scala.Boolean] = js.undefined
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
  var horizontalAlignment: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  // Unknown
  var inputMode: js.UndefOr[java.lang.String] = js.undefined
  var is: js.UndefOr[java.lang.String] = js.undefined
  var isCollapsed: js.UndefOr[scala.Boolean] = js.undefined
  var isColumn: js.UndefOr[scala.Boolean] = js.undefined
  var isExpanded: js.UndefOr[scala.Boolean] = js.undefined
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
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[scala.Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[scala.Boolean] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var typeof: js.UndefOr[java.lang.String] = js.undefined
  var uncollapseOnLarge: js.UndefOr[scala.Boolean] = js.undefined
  var uncollapseOnMedium: js.UndefOr[scala.Boolean] = js.undefined
  var uncollapseOnSmall: js.UndefOr[scala.Boolean] = js.undefined
  var unselectable: js.UndefOr[reactLib.reactLibStrings.on | reactLib.reactLibStrings.off] = js.undefined
  var unstackOnLarge: js.UndefOr[scala.Boolean] = js.undefined
  var unstackOnMedium: js.UndefOr[scala.Boolean] = js.undefined
  var unstackOnSmall: js.UndefOr[scala.Boolean] = js.undefined
  var upOnLarge: js.UndefOr[scala.Double] = js.undefined
  var upOnMedium: js.UndefOr[scala.Double] = js.undefined
  var upOnSmall: js.UndefOr[scala.Double] = js.undefined
  var verticalAlignment: js.UndefOr[java.lang.String] = js.undefined
  var vocab: js.UndefOr[java.lang.String] = js.undefined
}

object RowProps {
  @scala.inline
  def apply(
    FlexboxPropTypes: reactDashFoundationLib.utilsMod.FlexboxPropTypes = null,
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] = null,
    collapseOnLarge: js.UndefOr[scala.Boolean] = js.undefined,
    collapseOnMedium: js.UndefOr[scala.Boolean] = js.undefined,
    collapseOnSmall: js.UndefOr[scala.Boolean] = js.undefined,
    horizontalAlignment: java.lang.String = null,
    isCollapsed: js.UndefOr[scala.Boolean] = js.undefined,
    isColumn: js.UndefOr[scala.Boolean] = js.undefined,
    isExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    uncollapseOnLarge: js.UndefOr[scala.Boolean] = js.undefined,
    uncollapseOnMedium: js.UndefOr[scala.Boolean] = js.undefined,
    uncollapseOnSmall: js.UndefOr[scala.Boolean] = js.undefined,
    unstackOnLarge: js.UndefOr[scala.Boolean] = js.undefined,
    unstackOnMedium: js.UndefOr[scala.Boolean] = js.undefined,
    unstackOnSmall: js.UndefOr[scala.Boolean] = js.undefined,
    upOnLarge: scala.Int | scala.Double = null,
    upOnMedium: scala.Int | scala.Double = null,
    upOnSmall: scala.Int | scala.Double = null,
    verticalAlignment: java.lang.String = null
  ): RowProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, FlexboxPropTypes)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(collapseOnLarge)) __obj.updateDynamic("collapseOnLarge")(collapseOnLarge)
    if (!js.isUndefined(collapseOnMedium)) __obj.updateDynamic("collapseOnMedium")(collapseOnMedium)
    if (!js.isUndefined(collapseOnSmall)) __obj.updateDynamic("collapseOnSmall")(collapseOnSmall)
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment)
    if (!js.isUndefined(isCollapsed)) __obj.updateDynamic("isCollapsed")(isCollapsed)
    if (!js.isUndefined(isColumn)) __obj.updateDynamic("isColumn")(isColumn)
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded)
    if (!js.isUndefined(uncollapseOnLarge)) __obj.updateDynamic("uncollapseOnLarge")(uncollapseOnLarge)
    if (!js.isUndefined(uncollapseOnMedium)) __obj.updateDynamic("uncollapseOnMedium")(uncollapseOnMedium)
    if (!js.isUndefined(uncollapseOnSmall)) __obj.updateDynamic("uncollapseOnSmall")(uncollapseOnSmall)
    if (!js.isUndefined(unstackOnLarge)) __obj.updateDynamic("unstackOnLarge")(unstackOnLarge)
    if (!js.isUndefined(unstackOnMedium)) __obj.updateDynamic("unstackOnMedium")(unstackOnMedium)
    if (!js.isUndefined(unstackOnSmall)) __obj.updateDynamic("unstackOnSmall")(unstackOnSmall)
    if (upOnLarge != null) __obj.updateDynamic("upOnLarge")(upOnLarge.asInstanceOf[js.Any])
    if (upOnMedium != null) __obj.updateDynamic("upOnMedium")(upOnMedium.asInstanceOf[js.Any])
    if (upOnSmall != null) __obj.updateDynamic("upOnSmall")(upOnSmall.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment)
    __obj.asInstanceOf[RowProps]
  }
}

