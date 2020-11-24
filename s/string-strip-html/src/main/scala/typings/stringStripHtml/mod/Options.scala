package typings.stringStripHtml.mod

import typings.stringStripHtml.stringStripHtmlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * The function to call to control the strip behaviour.
    *
    * Gives you full control of the output and lets you tweak it.
    * See the dedicated chapter below called "opts.cb" with explanation and examples.
    */
  var cb: js.UndefOr[js.Function1[/* input */ CallbackInput, Unit | Null | `false`]] = js.native
  
  /** Used to customise the output of link URL's: to enable the feature, also customise the URL location and wrapping. */
  var dumpLinkHrefsNearby: js.UndefOr[DumpLinkHrefsNearby | `false`] = js.native
  
  /** These tags will not be removed */
  var ignoreTags: js.UndefOr[js.Array[String]] = js.native
  
  /** If one or more tag names are given here, only these tags will be stripped, nothing else */
  var onlyStripTags: js.UndefOr[js.Array[String]] = js.native
  
  /** By default, all escaped HTML entities for example &pound; input will be recursively decoded before HTML-stripping. You can turn it off here if you don't need it. */
  var skipHtmlDecoding: js.UndefOr[Boolean] = js.native
  
  /** These tags will be removed from the opening tag up to closing tag, including content in-between opening and closing tags. Set it to something falsey to turn it off. */
  var stripTogetherWithTheirContents: js.UndefOr[js.Array[String] | `false`] = js.native
  
  /** Used mainly in automated setups. It ensures non-spaces are not trimmed from the outer edges of a string. */
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
    def setCb(value: /* input */ CallbackInput => Unit | Null | `false`): Self = this.set("cb", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCb: Self = this.set("cb", js.undefined)
    
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
