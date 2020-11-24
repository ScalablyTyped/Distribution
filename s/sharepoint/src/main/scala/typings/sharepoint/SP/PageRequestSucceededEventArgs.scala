package typings.sharepoint.SP

import typings.microsoftAjax.Sys.EventArgs
import typings.microsoftAjax.Sys.Net.WebRequestExecutor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageRequestSucceededEventArgs extends EventArgs {
  
  def get_executor(): WebRequestExecutor = js.native
}
object PageRequestSucceededEventArgs {
  
  @scala.inline
  def apply(Empty: EventArgs, get_executor: () => WebRequestExecutor): PageRequestSucceededEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_executor = js.Any.fromFunction0(get_executor))
    __obj.asInstanceOf[PageRequestSucceededEventArgs]
  }
  
  @scala.inline
  implicit class PageRequestSucceededEventArgsOps[Self <: PageRequestSucceededEventArgs] (val x: Self) extends AnyVal {
    
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
    def setGet_executor(value: () => WebRequestExecutor): Self = this.set("get_executor", js.Any.fromFunction0(value))
  }
}
