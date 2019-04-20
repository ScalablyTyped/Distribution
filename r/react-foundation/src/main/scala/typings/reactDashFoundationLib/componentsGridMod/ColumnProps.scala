package typings
package reactDashFoundationLib.componentsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactLib.reactMod.HTMLAttributes because var conflicts: className. Inlined about, accessKey, autoCapitalize, autoCorrect, autoSave, color, contentEditable, contextMenu, datatype, defaultChecked, defaultValue, dir, draggable, hidden, id, inlist, inputMode, is, itemID, itemProp, itemRef, itemScope, itemType, lang, placeholder, prefix, property, radioGroup, resource, results, role, security, slot, spellCheck, style, suppressContentEditableWarning, suppressHydrationWarning, tabIndex, title, typeof, unselectable, vocab */ trait ColumnProps
  extends reactDashFoundationLib.utilsMod.FlexboxPropTypes {
  // RDFa Attributes
  var about: js.UndefOr[java.lang.String] = js.undefined
  // Standard HTML Attributes
  var accessKey: js.UndefOr[java.lang.String] = js.undefined
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
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
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
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] = null,
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

