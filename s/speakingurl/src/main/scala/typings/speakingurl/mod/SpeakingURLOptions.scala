package typings.speakingurl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeakingURLOptions extends js.Object {
  var custom: js.UndefOr[js.Array[String] | Dictionary[String]] = js.native
  var lang: js.UndefOr[String | Boolean] = js.native
  var maintainCase: js.UndefOr[Boolean] = js.native
  var mark: js.UndefOr[Boolean] = js.native
  var separator: js.UndefOr[String] = js.native
  var symbols: js.UndefOr[Boolean] = js.native
  var titleCase: js.UndefOr[js.Array[String] | Boolean] = js.native
  var truncate: js.UndefOr[Double] = js.native
  var uric: js.UndefOr[Boolean] = js.native
  var uricNoSlash: js.UndefOr[Boolean] = js.native
}

object SpeakingURLOptions {
  @scala.inline
  def apply(): SpeakingURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpeakingURLOptions]
  }
  @scala.inline
  implicit class SpeakingURLOptionsOps[Self <: SpeakingURLOptions] (val x: Self) extends AnyVal {
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
    def setCustomVarargs(value: String*): Self = this.set("custom", js.Array(value :_*))
    @scala.inline
    def setCustom(value: js.Array[String] | Dictionary[String]): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setLang(value: String | Boolean): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setMaintainCase(value: Boolean): Self = this.set("maintainCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintainCase: Self = this.set("maintainCase", js.undefined)
    @scala.inline
    def setMark(value: Boolean): Self = this.set("mark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMark: Self = this.set("mark", js.undefined)
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setSymbols(value: Boolean): Self = this.set("symbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
    @scala.inline
    def setTitleCaseVarargs(value: String*): Self = this.set("titleCase", js.Array(value :_*))
    @scala.inline
    def setTitleCase(value: js.Array[String] | Boolean): Self = this.set("titleCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleCase: Self = this.set("titleCase", js.undefined)
    @scala.inline
    def setTruncate(value: Double): Self = this.set("truncate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncate: Self = this.set("truncate", js.undefined)
    @scala.inline
    def setUric(value: Boolean): Self = this.set("uric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUric: Self = this.set("uric", js.undefined)
    @scala.inline
    def setUricNoSlash(value: Boolean): Self = this.set("uricNoSlash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUricNoSlash: Self = this.set("uricNoSlash", js.undefined)
  }
  
}

