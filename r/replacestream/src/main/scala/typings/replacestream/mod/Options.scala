package typings.replacestream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The text encoding used during search and replace.
    *
    * Default: `"utf8"`
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * When doing string match (not relevant for regex matching) whether to do a
    * case insensitive search.
    *
    * Default: `true`
    */
  var ignoreCase: js.UndefOr[Boolean] = js.native
  /**
    * Sets a limit on the number of times the replacement will be made. This
    * is forced to one when a regex without the global flag is provided.
    *
    * Default: `Infinity`
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * When doing cross-chunk replacing, this sets the maximum length match
    * that will be supported.
    *
    * Default: `100`
    */
  var maxMatchLen: js.UndefOr[Double] = js.native
  /**
    * When provided, these flags will be used when creating the search regexes
    * internally.
    *
    * @deprecated as the flags set on the regex provided are no longer mutated
    * if this is not provided.
    */
  var regExpOptions: js.UndefOr[String] = js.native
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
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreCase: Self = this.set("ignoreCase", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setMaxMatchLen(value: Double): Self = this.set("maxMatchLen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxMatchLen: Self = this.set("maxMatchLen", js.undefined)
    @scala.inline
    def setRegExpOptions(value: String): Self = this.set("regExpOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegExpOptions: Self = this.set("regExpOptions", js.undefined)
  }
  
}

