package typings.sharepoint.SP

import typings.microsoftAjax.Sys.Net.WebRequestExecutor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebRequestExecutorFactory extends js.Object {
  
  def createWebRequestExecutor(): WebRequestExecutor = js.native
}
object IWebRequestExecutorFactory {
  
  @scala.inline
  def apply(createWebRequestExecutor: () => WebRequestExecutor): IWebRequestExecutorFactory = {
    val __obj = js.Dynamic.literal(createWebRequestExecutor = js.Any.fromFunction0(createWebRequestExecutor))
    __obj.asInstanceOf[IWebRequestExecutorFactory]
  }
  
  @scala.inline
  implicit class IWebRequestExecutorFactoryOps[Self <: IWebRequestExecutorFactory] (val x: Self) extends AnyVal {
    
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
    def setCreateWebRequestExecutor(value: () => WebRequestExecutor): Self = this.set("createWebRequestExecutor", js.Any.fromFunction0(value))
  }
}
