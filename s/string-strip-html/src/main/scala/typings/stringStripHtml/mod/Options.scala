package typings.stringStripHtml.mod

import typings.stringStripHtml.stringStripHtmlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var dumpLinkHrefsNearby: js.UndefOr[DumpLinkHrefsNearby | `false`] = js.native
  var ignoreTags: js.UndefOr[js.Array[String]] = js.native
  var onlyStripTags: js.UndefOr[js.Array[String]] = js.native
  var returnRangeOnly: js.UndefOr[Boolean] = js.native
  var skipHtmlDecoding: js.UndefOr[Boolean] = js.native
  var stripTogetherWithTheirContents: js.UndefOr[js.Array[String] | `false`] = js.native
  var trimOnlySpaces: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDumpLinkHrefsNearby(value: DumpLinkHrefsNearby | `false`): Self = this.set("dumpLinkHrefsNearby", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDumpLinkHrefsNearby: Self = this.set("dumpLinkHrefsNearby", js.undefined)
    @scala.inline
    def setIgnoreTagsVarargs(value: String*): Self = this.set("ignoreTags", js.Array(value :_*))
    @scala.inline
    def setIgnoreTags(value: js.Array[String]): Self = this.set("ignoreTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreTags: Self = this.set("ignoreTags", js.undefined)
    @scala.inline
    def setOnlyStripTagsVarargs(value: String*): Self = this.set("onlyStripTags", js.Array(value :_*))
    @scala.inline
    def setOnlyStripTags(value: js.Array[String]): Self = this.set("onlyStripTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyStripTags: Self = this.set("onlyStripTags", js.undefined)
    @scala.inline
    def setReturnRangeOnly(value: Boolean): Self = this.set("returnRangeOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnRangeOnly: Self = this.set("returnRangeOnly", js.undefined)
    @scala.inline
    def setSkipHtmlDecoding(value: Boolean): Self = this.set("skipHtmlDecoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipHtmlDecoding: Self = this.set("skipHtmlDecoding", js.undefined)
    @scala.inline
    def setStripTogetherWithTheirContentsVarargs(value: String*): Self = this.set("stripTogetherWithTheirContents", js.Array(value :_*))
    @scala.inline
    def setStripTogetherWithTheirContents(value: js.Array[String] | `false`): Self = this.set("stripTogetherWithTheirContents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripTogetherWithTheirContents: Self = this.set("stripTogetherWithTheirContents", js.undefined)
    @scala.inline
    def setTrimOnlySpaces(value: Boolean): Self = this.set("trimOnlySpaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrimOnlySpaces: Self = this.set("trimOnlySpaces", js.undefined)
  }
  
}

