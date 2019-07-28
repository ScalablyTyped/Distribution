package typings.reactDashFoundation.componentsGridMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.HTMLAttributes
import typings.react.reactStrings.off
import typings.react.reactStrings.on
import typings.reactDashFoundation.utilsMod.FlexboxPropTypes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.react.reactMod.HTMLAttributes because var conflicts: className. Inlined about, accessKey, autoCapitalize, autoCorrect, autoSave, color, contentEditable, contextMenu, datatype, defaultChecked, defaultValue, dir, draggable, hidden, id, inlist, inputMode, is, itemID, itemProp, itemRef, itemScope, itemType, lang, placeholder, prefix, property, radioGroup, resource, results, role, security, slot, spellCheck, style, suppressContentEditableWarning, suppressHydrationWarning, tabIndex, title, typeof, unselectable, vocab */ trait ColumnProps extends FlexboxPropTypes {
  // RDFa Attributes
  var about: js.UndefOr[String] = js.undefined
  // Standard HTML Attributes
  var accessKey: js.UndefOr[String] = js.undefined
  // Non-standard Attributes
  var autoCapitalize: js.UndefOr[String] = js.undefined
  var autoCorrect: js.UndefOr[String] = js.undefined
  var autoSave: js.UndefOr[String] = js.undefined
  var centerOnLarge: js.UndefOr[Boolean] = js.undefined
  var centerOnMedium: js.UndefOr[Boolean] = js.undefined
  var centerOnSmall: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var contentEditable: js.UndefOr[Boolean] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  // React-specific Attributes
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | js.Array[String]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var expandOnLarge: js.UndefOr[Boolean] = js.undefined
  var expandOnMedium: js.UndefOr[Boolean] = js.undefined
  var expandOnSmall: js.UndefOr[Boolean] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  // Unknown
  var inputMode: js.UndefOr[String] = js.undefined
  var is: js.UndefOr[String] = js.undefined
  var isColumn: js.UndefOr[Boolean] = js.undefined
  var isLast: js.UndefOr[Boolean] = js.undefined
  var isShrunk: js.UndefOr[Boolean] = js.undefined
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
  var orderOnLarge: js.UndefOr[Double] = js.undefined
  var orderOnMedium: js.UndefOr[Double] = js.undefined
  var orderOnSmall: js.UndefOr[Double] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var pullOnLarge: js.UndefOr[Double] = js.undefined
  var pullOnMedium: js.UndefOr[Double] = js.undefined
  var pullOnSmall: js.UndefOr[Double] = js.undefined
  var pushOnLarge: js.UndefOr[Double] = js.undefined
  var pushOnMedium: js.UndefOr[Double] = js.undefined
  var pushOnSmall: js.UndefOr[Double] = js.undefined
  var radioGroup: js.UndefOr[String] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
   // <command>, <menuitem>
  // WAI-ARIA
  var role: js.UndefOr[String] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var small: js.UndefOr[Double] = js.undefined
  var spellCheck: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var uncenterOnLarge: js.UndefOr[Boolean] = js.undefined
  var uncenterOnMedium: js.UndefOr[Boolean] = js.undefined
  var uncenterOnSmall: js.UndefOr[Boolean] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  var upOnSmall: js.UndefOr[Double] = js.undefined
  var vocab: js.UndefOr[String] = js.undefined
}

object ColumnProps {
  @scala.inline
  def apply(
    FlexboxPropTypes: FlexboxPropTypes = null,
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    centerOnLarge: js.UndefOr[Boolean] = js.undefined,
    centerOnMedium: js.UndefOr[Boolean] = js.undefined,
    centerOnSmall: js.UndefOr[Boolean] = js.undefined,
    expandOnLarge: js.UndefOr[Boolean] = js.undefined,
    expandOnMedium: js.UndefOr[Boolean] = js.undefined,
    expandOnSmall: js.UndefOr[Boolean] = js.undefined,
    isColumn: js.UndefOr[Boolean] = js.undefined,
    isLast: js.UndefOr[Boolean] = js.undefined,
    isShrunk: js.UndefOr[Boolean] = js.undefined,
    large: Int | Double = null,
    medium: Int | Double = null,
    offsetOnLarge: Int | Double = null,
    offsetOnMedium: Int | Double = null,
    offsetOnSmall: Int | Double = null,
    orderOnLarge: Int | Double = null,
    orderOnMedium: Int | Double = null,
    orderOnSmall: Int | Double = null,
    pullOnLarge: Int | Double = null,
    pullOnMedium: Int | Double = null,
    pullOnSmall: Int | Double = null,
    pushOnLarge: Int | Double = null,
    pushOnMedium: Int | Double = null,
    pushOnSmall: Int | Double = null,
    small: Int | Double = null,
    uncenterOnLarge: js.UndefOr[Boolean] = js.undefined,
    uncenterOnMedium: js.UndefOr[Boolean] = js.undefined,
    uncenterOnSmall: js.UndefOr[Boolean] = js.undefined,
    upOnSmall: Int | Double = null
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

