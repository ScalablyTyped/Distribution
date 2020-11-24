package typings.storybookUi.releaseNotesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseNotesProps extends js.Object {
  
  var didHitMaxWaitTime: Boolean = js.native
  
  var isLoaded: Boolean = js.native
  
  def setLoaded(isLoaded: Boolean): Unit = js.native
  
  var version: String = js.native
}
object ReleaseNotesProps {
  
  @scala.inline
  def apply(didHitMaxWaitTime: Boolean, isLoaded: Boolean, setLoaded: Boolean => Unit, version: String): ReleaseNotesProps = {
    val __obj = js.Dynamic.literal(didHitMaxWaitTime = didHitMaxWaitTime.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], setLoaded = js.Any.fromFunction1(setLoaded), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseNotesProps]
  }
  
  @scala.inline
  implicit class ReleaseNotesPropsOps[Self <: ReleaseNotesProps] (val x: Self) extends AnyVal {
    
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
    def setDidHitMaxWaitTime(value: Boolean): Self = this.set("didHitMaxWaitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLoaded(value: Boolean): Self = this.set("isLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetLoaded(value: Boolean => Unit): Self = this.set("setLoaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
