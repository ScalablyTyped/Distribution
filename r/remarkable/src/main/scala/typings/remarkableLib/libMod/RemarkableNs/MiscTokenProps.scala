package typings
package remarkableLib.libMod.RemarkableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiscTokenProps extends js.Object {
  /**
    * Image alt.
    */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Code: `true` if block, `false` if inline.
    */
  var block: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Heading level.
    */
  var hLevel: js.UndefOr[scala.Double] = js.undefined
  /**
    * Link url.
    */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Footnote id.
    */
  var id: js.UndefOr[scala.Double] = js.undefined
  /**
    * Footnote label.
    */
  var label: js.UndefOr[js.Any] = js.undefined
  /**
    * Ordered list marker value.
    */
  var order: js.UndefOr[scala.Double] = js.undefined
  /**
    * Fenced block params.
    */
  var params: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Image url.
    */
  var src: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Footnote sub id.
    */
  var subId: js.UndefOr[scala.Double] = js.undefined
  /**
    * Absence of empty line before current tag: `true` if absent, `false`
    * if present. List is tight if any list item is tight.
    */
  var tight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Abbreviation title.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object MiscTokenProps {
  @scala.inline
  def apply(
    alt: java.lang.String = null,
    block: js.UndefOr[scala.Boolean] = js.undefined,
    hLevel: scala.Int | scala.Double = null,
    href: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    label: js.Any = null,
    order: scala.Int | scala.Double = null,
    params: js.Array[_] = null,
    src: java.lang.String = null,
    subId: scala.Int | scala.Double = null,
    tight: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): MiscTokenProps = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (hLevel != null) __obj.updateDynamic("hLevel")(hLevel.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    if (src != null) __obj.updateDynamic("src")(src)
    if (subId != null) __obj.updateDynamic("subId")(subId.asInstanceOf[js.Any])
    if (!js.isUndefined(tight)) __obj.updateDynamic("tight")(tight)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[MiscTokenProps]
  }
}

