package typings.storybookApi.releaseNotesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubAPI extends js.Object {
  
  def releaseNotesVersion(): String = js.native
  
  def setDidViewReleaseNotes(): Unit = js.native
  
  def showReleaseNotesOnLaunch(): Boolean = js.native
}
object SubAPI {
  
  @scala.inline
  def apply(
    releaseNotesVersion: () => String,
    setDidViewReleaseNotes: () => Unit,
    showReleaseNotesOnLaunch: () => Boolean
  ): SubAPI = {
    val __obj = js.Dynamic.literal(releaseNotesVersion = js.Any.fromFunction0(releaseNotesVersion), setDidViewReleaseNotes = js.Any.fromFunction0(setDidViewReleaseNotes), showReleaseNotesOnLaunch = js.Any.fromFunction0(showReleaseNotesOnLaunch))
    __obj.asInstanceOf[SubAPI]
  }
  
  @scala.inline
  implicit class SubAPIOps[Self <: SubAPI] (val x: Self) extends AnyVal {
    
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
    def setReleaseNotesVersion(value: () => String): Self = this.set("releaseNotesVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDidViewReleaseNotes(value: () => Unit): Self = this.set("setDidViewReleaseNotes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowReleaseNotesOnLaunch(value: () => Boolean): Self = this.set("showReleaseNotesOnLaunch", js.Any.fromFunction0(value))
  }
}
