package typings
package reactDashMarkdownLib.reactDashMarkdownMod.ReactMarkdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkdownAbstractSyntaxTree extends js.Object {
  var align: js.UndefOr[js.Array[AlignType]] = js.undefined
  var alt: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var checked: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  var children: js.UndefOr[js.Array[MarkdownAbstractSyntaxTree]] = js.undefined
  var data: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var depth: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var identifier: js.UndefOr[java.lang.String] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var lang: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var loose: js.UndefOr[scala.Boolean] = js.undefined
  var ordered: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[Position] = js.undefined
  var referenceType: js.UndefOr[ReferenceType] = js.undefined
  var start: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var title: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var `type`: java.lang.String
  var url: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object MarkdownAbstractSyntaxTree {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    align: js.Array[AlignType] = null,
    alt: java.lang.String = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    children: js.Array[MarkdownAbstractSyntaxTree] = null,
    data: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    depth: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    identifier: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    lang: java.lang.String = null,
    loose: js.UndefOr[scala.Boolean] = js.undefined,
    ordered: js.UndefOr[scala.Boolean] = js.undefined,
    position: Position = null,
    referenceType: ReferenceType = null,
    start: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    url: java.lang.String = null,
    value: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): MarkdownAbstractSyntaxTree = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (align != null) __obj.updateDynamic("align")(align)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (children != null) __obj.updateDynamic("children")(children)
    if (data != null) __obj.updateDynamic("data")(data)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (!js.isUndefined(loose)) __obj.updateDynamic("loose")(loose)
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered)
    if (position != null) __obj.updateDynamic("position")(position)
    if (referenceType != null) __obj.updateDynamic("referenceType")(referenceType)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (value != null) __obj.updateDynamic("value")(value)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkdownAbstractSyntaxTree]
  }
}

