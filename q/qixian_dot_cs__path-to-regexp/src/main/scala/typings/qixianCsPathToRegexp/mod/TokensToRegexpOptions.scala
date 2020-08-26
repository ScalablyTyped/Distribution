package typings.qixianCsPathToRegexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokensToRegexpOptions extends js.Object {
  /**
    * Sets the final character for non-ending optimistic matches. (default: `/`)
    */
  var delimiter: js.UndefOr[String] = js.native
  /**
    * Encode path tokens for use in the `RegExp`.
    */
  var encode: js.UndefOr[js.Function1[/* value */ String, String]] = js.native
  /**
    * When `true` the regexp will match to the end of the string. (default: `true`)
    */
  var end: js.UndefOr[Boolean] = js.native
  /**
    * List of characters that can also be "end" characters.
    */
  var endsWith: js.UndefOr[String] = js.native
  /**
    * When `true` the regexp will be case sensitive. (default: `false`)
    */
  var sensitive: js.UndefOr[Boolean] = js.native
  /**
    * When `true` the regexp will match from the beginning of the string. (default: `true`)
    */
  var start: js.UndefOr[Boolean] = js.native
  /**
    * When `true` the regexp allows an optional trailing delimiter to match. (default: `false`)
    */
  var strict: js.UndefOr[Boolean] = js.native
}

object TokensToRegexpOptions {
  @scala.inline
  def apply(): TokensToRegexpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokensToRegexpOptions]
  }
  @scala.inline
  implicit class TokensToRegexpOptionsOps[Self <: TokensToRegexpOptions] (val x: Self) extends AnyVal {
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
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setEncode(value: /* value */ String => String): Self = this.set("encode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
    @scala.inline
    def setEnd(value: Boolean): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setEndsWith(value: String): Self = this.set("endsWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndsWith: Self = this.set("endsWith", js.undefined)
    @scala.inline
    def setSensitive(value: Boolean): Self = this.set("sensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSensitive: Self = this.set("sensitive", js.undefined)
    @scala.inline
    def setStart(value: Boolean): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
  
}

