package typings.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollatorOptions extends js.Object {
  var caseFirst: js.UndefOr[String] = js.native
  var ignorePunctuation: js.UndefOr[Boolean] = js.native
  var localeMatcher: js.UndefOr[String] = js.native
  var numeric: js.UndefOr[Boolean] = js.native
  var sensitivity: js.UndefOr[String] = js.native
  var usage: js.UndefOr[String] = js.native
}

object CollatorOptions {
  @scala.inline
  def apply(): CollatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollatorOptions]
  }
  @scala.inline
  implicit class CollatorOptionsOps[Self <: CollatorOptions] (val x: Self) extends AnyVal {
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
    def setCaseFirst(value: String): Self = this.set("caseFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseFirst: Self = this.set("caseFirst", js.undefined)
    @scala.inline
    def setIgnorePunctuation(value: Boolean): Self = this.set("ignorePunctuation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnorePunctuation: Self = this.set("ignorePunctuation", js.undefined)
    @scala.inline
    def setLocaleMatcher(value: String): Self = this.set("localeMatcher", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocaleMatcher: Self = this.set("localeMatcher", js.undefined)
    @scala.inline
    def setNumeric(value: Boolean): Self = this.set("numeric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumeric: Self = this.set("numeric", js.undefined)
    @scala.inline
    def setSensitivity(value: String): Self = this.set("sensitivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSensitivity: Self = this.set("sensitivity", js.undefined)
    @scala.inline
    def setUsage(value: String): Self = this.set("usage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
  }
  
}

