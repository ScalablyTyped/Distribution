package typings.storybookApi.releaseNotesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubState extends js.Object {
  
  var releaseNotesViewed: js.Array[String] = js.native
}
object SubState {
  
  @scala.inline
  def apply(releaseNotesViewed: js.Array[String]): SubState = {
    val __obj = js.Dynamic.literal(releaseNotesViewed = releaseNotesViewed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubState]
  }
  
  @scala.inline
  implicit class SubStateOps[Self <: SubState] (val x: Self) extends AnyVal {
    
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
    def setReleaseNotesViewedVarargs(value: String*): Self = this.set("releaseNotesViewed", js.Array(value :_*))
    
    @scala.inline
    def setReleaseNotesViewed(value: js.Array[String]): Self = this.set("releaseNotesViewed", value.asInstanceOf[js.Any])
  }
}
