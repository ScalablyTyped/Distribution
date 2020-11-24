package typings.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@storybook/ui.@storybook/ui/dist/settings/release_notes.ReleaseNotesProps, 'isLoaded' | 'setLoaded' | 'didHitMaxWaitTime'> */
@js.native
trait OmitReleaseNotesPropsisLo extends js.Object {
  
  var version: String = js.native
}
object OmitReleaseNotesPropsisLo {
  
  @scala.inline
  def apply(version: String): OmitReleaseNotesPropsisLo = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitReleaseNotesPropsisLo]
  }
  
  @scala.inline
  implicit class OmitReleaseNotesPropsisLoOps[Self <: OmitReleaseNotesPropsisLo] (val x: Self) extends AnyVal {
    
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
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
