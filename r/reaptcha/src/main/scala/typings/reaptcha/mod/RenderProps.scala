package typings.reaptcha.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderProps extends js.Object {
  
  def execute(): js.Promise[Unit] = js.native
  
  def getResponse(): js.Promise[String] = js.native
  
  var recaptchaComponent: ReactNode = js.native
  
  def renderExplicitly(): js.Promise[Unit] = js.native
  
  def reset(): js.Promise[Unit] = js.native
}
object RenderProps {
  
  @scala.inline
  def apply(
    execute: () => js.Promise[Unit],
    getResponse: () => js.Promise[String],
    renderExplicitly: () => js.Promise[Unit],
    reset: () => js.Promise[Unit]
  ): RenderProps = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getResponse = js.Any.fromFunction0(getResponse), renderExplicitly = js.Any.fromFunction0(renderExplicitly), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[RenderProps]
  }
  
  @scala.inline
  implicit class RenderPropsOps[Self <: RenderProps] (val x: Self) extends AnyVal {
    
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
    def setExecute(value: () => js.Promise[Unit]): Self = this.set("execute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResponse(value: () => js.Promise[String]): Self = this.set("getResponse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderExplicitly(value: () => js.Promise[Unit]): Self = this.set("renderExplicitly", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => js.Promise[Unit]): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRecaptchaComponent(value: ReactNode): Self = this.set("recaptchaComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecaptchaComponent: Self = this.set("recaptchaComponent", js.undefined)
  }
}
