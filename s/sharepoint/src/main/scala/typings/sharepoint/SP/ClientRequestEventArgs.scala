package typings.sharepoint.SP

import typings.microsoftAjax.Sys.EventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientRequestEventArgs extends EventArgs {
  
  def get_request(): ClientRequest = js.native
}
object ClientRequestEventArgs {
  
  @scala.inline
  def apply(Empty: EventArgs, get_request: () => ClientRequest): ClientRequestEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_request = js.Any.fromFunction0(get_request))
    __obj.asInstanceOf[ClientRequestEventArgs]
  }
  
  @scala.inline
  implicit class ClientRequestEventArgsOps[Self <: ClientRequestEventArgs] (val x: Self) extends AnyVal {
    
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
    def setGet_request(value: () => ClientRequest): Self = this.set("get_request", js.Any.fromFunction0(value))
  }
}
