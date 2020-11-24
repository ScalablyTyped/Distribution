package typings.reactBeautifulDnd.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TryGetLockOptions extends js.Object {
  
  var sourceEvent: js.UndefOr[Event] = js.native
}
object TryGetLockOptions {
  
  @scala.inline
  def apply(): TryGetLockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TryGetLockOptions]
  }
  
  @scala.inline
  implicit class TryGetLockOptionsOps[Self <: TryGetLockOptions] (val x: Self) extends AnyVal {
    
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
    def setSourceEvent(value: Event): Self = this.set("sourceEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceEvent: Self = this.set("sourceEvent", js.undefined)
  }
}
