package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStreamErrorEventInit extends EventInit {
  
  var error: js.UndefOr[MediaStreamError | Null] = js.native
}
object MediaStreamErrorEventInit {
  
  @scala.inline
  def apply(): MediaStreamErrorEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaStreamErrorEventInit]
  }
  
  @scala.inline
  implicit class MediaStreamErrorEventInitOps[Self <: MediaStreamErrorEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setError(value: MediaStreamError): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
  }
}
