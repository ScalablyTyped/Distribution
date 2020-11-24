package typings.sentryBrowser.helpersMod

import org.scalablytyped.runtime.StringDictionary
import typings.sentryBrowser.anon.Email
import typings.sentryTypes.dsnMod.DsnLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportDialogOptions
  extends /* key */ StringDictionary[js.Any] {
  
  var dsn: js.UndefOr[DsnLike] = js.native
  
  var errorFormEntry: js.UndefOr[String] = js.native
  
  var errorGeneric: js.UndefOr[String] = js.native
  
  var eventId: js.UndefOr[String] = js.native
  
  var labelClose: js.UndefOr[String] = js.native
  
  var labelComments: js.UndefOr[String] = js.native
  
  var labelEmail: js.UndefOr[String] = js.native
  
  var labelName: js.UndefOr[String] = js.native
  
  var labelSubmit: js.UndefOr[String] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  /** Callback after reportDialog showed up */
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
  
  var subtitle: js.UndefOr[String] = js.native
  
  var subtitle2: js.UndefOr[String] = js.native
  
  var successMessage: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var user: js.UndefOr[Email] = js.native
}
object ReportDialogOptions {
  
  @scala.inline
  def apply(): ReportDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportDialogOptions]
  }
  
  @scala.inline
  implicit class ReportDialogOptionsOps[Self <: ReportDialogOptions] (val x: Self) extends AnyVal {
    
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
    def setDsn(value: DsnLike): Self = this.set("dsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDsn: Self = this.set("dsn", js.undefined)
    
    @scala.inline
    def setErrorFormEntry(value: String): Self = this.set("errorFormEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorFormEntry: Self = this.set("errorFormEntry", js.undefined)
    
    @scala.inline
    def setErrorGeneric(value: String): Self = this.set("errorGeneric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorGeneric: Self = this.set("errorGeneric", js.undefined)
    
    @scala.inline
    def setEventId(value: String): Self = this.set("eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventId: Self = this.set("eventId", js.undefined)
    
    @scala.inline
    def setLabelClose(value: String): Self = this.set("labelClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelClose: Self = this.set("labelClose", js.undefined)
    
    @scala.inline
    def setLabelComments(value: String): Self = this.set("labelComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelComments: Self = this.set("labelComments", js.undefined)
    
    @scala.inline
    def setLabelEmail(value: String): Self = this.set("labelEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelEmail: Self = this.set("labelEmail", js.undefined)
    
    @scala.inline
    def setLabelName(value: String): Self = this.set("labelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelName: Self = this.set("labelName", js.undefined)
    
    @scala.inline
    def setLabelSubmit(value: String): Self = this.set("labelSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelSubmit: Self = this.set("labelSubmit", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setOnLoad(value: () => Unit): Self = this.set("onLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    
    @scala.inline
    def setSubtitle2(value: String): Self = this.set("subtitle2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle2: Self = this.set("subtitle2", js.undefined)
    
    @scala.inline
    def setSuccessMessage(value: String): Self = this.set("successMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessMessage: Self = this.set("successMessage", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUser(value: Email): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
