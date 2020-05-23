package typings.reactMarkdown.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkdownAbstractSyntaxTree extends js.Object {
  var align: js.UndefOr[js.Array[AlignType]] = js.undefined
  var alt: js.UndefOr[String | Null] = js.undefined
  var checked: js.UndefOr[Boolean | Null] = js.undefined
  var children: js.UndefOr[js.Array[MarkdownAbstractSyntaxTree]] = js.undefined
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var depth: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var identifier: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var lang: js.UndefOr[String | Null] = js.undefined
  var loose: js.UndefOr[Boolean] = js.undefined
  var ordered: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[Position] = js.undefined
  var referenceType: js.UndefOr[ReferenceType] = js.undefined
  var start: js.UndefOr[Double | Null] = js.undefined
  var title: js.UndefOr[String | Null] = js.undefined
  var `type`: String
  var url: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object MarkdownAbstractSyntaxTree {
  @scala.inline
  def apply(
    `type`: String,
    align: js.Array[AlignType] = null,
    alt: js.UndefOr[Null | String] = js.undefined,
    checked: js.UndefOr[Null | Boolean] = js.undefined,
    children: js.Array[MarkdownAbstractSyntaxTree] = null,
    data: StringDictionary[js.Any] = null,
    depth: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    identifier: String = null,
    index: js.UndefOr[Double] = js.undefined,
    lang: js.UndefOr[Null | String] = js.undefined,
    loose: js.UndefOr[Boolean] = js.undefined,
    ordered: js.UndefOr[Boolean] = js.undefined,
    position: Position = null,
    referenceType: ReferenceType = null,
    start: js.UndefOr[Null | Double] = js.undefined,
    title: js.UndefOr[Null | String] = js.undefined,
    url: String = null,
    value: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): MarkdownAbstractSyntaxTree = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(alt)) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lang)) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(loose)) __obj.updateDynamic("loose")(loose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (referenceType != null) __obj.updateDynamic("referenceType")(referenceType.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkdownAbstractSyntaxTree]
  }
}

