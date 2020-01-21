package typings.stringStripHtml.mod

import typings.stringStripHtml.stringStripHtmlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var dumpLinkHrefsNearby: js.UndefOr[DumpLinkHrefsNearby | `false`] = js.undefined
  var ignoreTags: js.UndefOr[js.Array[String]] = js.undefined
  var onlyStripTags: js.UndefOr[js.Array[String]] = js.undefined
  var returnRangeOnly: js.UndefOr[Boolean] = js.undefined
  var skipHtmlDecoding: js.UndefOr[Boolean] = js.undefined
  var stripTogetherWithTheirContents: js.UndefOr[js.Array[String] | `false`] = js.undefined
  var trimOnlySpaces: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dumpLinkHrefsNearby: DumpLinkHrefsNearby | `false` = null,
    ignoreTags: js.Array[String] = null,
    onlyStripTags: js.Array[String] = null,
    returnRangeOnly: js.UndefOr[Boolean] = js.undefined,
    skipHtmlDecoding: js.UndefOr[Boolean] = js.undefined,
    stripTogetherWithTheirContents: js.Array[String] | `false` = null,
    trimOnlySpaces: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (dumpLinkHrefsNearby != null) __obj.updateDynamic("dumpLinkHrefsNearby")(dumpLinkHrefsNearby.asInstanceOf[js.Any])
    if (ignoreTags != null) __obj.updateDynamic("ignoreTags")(ignoreTags.asInstanceOf[js.Any])
    if (onlyStripTags != null) __obj.updateDynamic("onlyStripTags")(onlyStripTags.asInstanceOf[js.Any])
    if (!js.isUndefined(returnRangeOnly)) __obj.updateDynamic("returnRangeOnly")(returnRangeOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(skipHtmlDecoding)) __obj.updateDynamic("skipHtmlDecoding")(skipHtmlDecoding.asInstanceOf[js.Any])
    if (stripTogetherWithTheirContents != null) __obj.updateDynamic("stripTogetherWithTheirContents")(stripTogetherWithTheirContents.asInstanceOf[js.Any])
    if (!js.isUndefined(trimOnlySpaces)) __obj.updateDynamic("trimOnlySpaces")(trimOnlySpaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

