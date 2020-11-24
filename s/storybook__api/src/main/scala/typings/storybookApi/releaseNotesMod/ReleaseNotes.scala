package typings.storybookApi.releaseNotesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseNotes extends js.Object {
  
  var currentVersion: js.UndefOr[String] = js.native
  
  var showOnFirstLaunch: js.UndefOr[Boolean] = js.native
  
  var success: js.UndefOr[Boolean] = js.native
}
object ReleaseNotes {
  
  @scala.inline
  def apply(): ReleaseNotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReleaseNotes]
  }
  
  @scala.inline
  implicit class ReleaseNotesOps[Self <: ReleaseNotes] (val x: Self) extends AnyVal {
    
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
    def setCurrentVersion(value: String): Self = this.set("currentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentVersion: Self = this.set("currentVersion", js.undefined)
    
    @scala.inline
    def setShowOnFirstLaunch(value: Boolean): Self = this.set("showOnFirstLaunch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOnFirstLaunch: Self = this.set("showOnFirstLaunch", js.undefined)
    
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
