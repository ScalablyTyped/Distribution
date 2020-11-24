package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceUIFrameContext extends js.Object {
  
  def getCachedFrameMessage(key: java.lang.String): java.lang.String = js.native
  
  def postFrameMessage(key: java.lang.String, data: java.lang.String): Unit = js.native
}
object ServiceUIFrameContext {
  
  @scala.inline
  def apply(
    getCachedFrameMessage: java.lang.String => java.lang.String,
    postFrameMessage: (java.lang.String, java.lang.String) => Unit
  ): ServiceUIFrameContext = {
    val __obj = js.Dynamic.literal(getCachedFrameMessage = js.Any.fromFunction1(getCachedFrameMessage), postFrameMessage = js.Any.fromFunction2(postFrameMessage))
    __obj.asInstanceOf[ServiceUIFrameContext]
  }
  
  @scala.inline
  implicit class ServiceUIFrameContextOps[Self <: ServiceUIFrameContext] (val x: Self) extends AnyVal {
    
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
    def setGetCachedFrameMessage(value: java.lang.String => java.lang.String): Self = this.set("getCachedFrameMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPostFrameMessage(value: (java.lang.String, java.lang.String) => Unit): Self = this.set("postFrameMessage", js.Any.fromFunction2(value))
  }
}
