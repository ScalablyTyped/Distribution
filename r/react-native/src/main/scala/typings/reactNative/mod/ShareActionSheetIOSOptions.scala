package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareActionSheetIOSOptions extends js.Object {
  /** The activities to exclude from the ActionSheet.
    * For example: ['com.apple.UIKit.activity.PostToTwitter']
    */
  var excludedActivityTypes: js.UndefOr[js.Array[String]] = js.native
  var message: js.UndefOr[String] = js.native
  var subject: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object ShareActionSheetIOSOptions {
  @scala.inline
  def apply(): ShareActionSheetIOSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareActionSheetIOSOptions]
  }
  @scala.inline
  implicit class ShareActionSheetIOSOptionsOps[Self <: ShareActionSheetIOSOptions] (val x: Self) extends AnyVal {
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
    def setExcludedActivityTypesVarargs(value: String*): Self = this.set("excludedActivityTypes", js.Array(value :_*))
    @scala.inline
    def setExcludedActivityTypes(value: js.Array[String]): Self = this.set("excludedActivityTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedActivityTypes: Self = this.set("excludedActivityTypes", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

