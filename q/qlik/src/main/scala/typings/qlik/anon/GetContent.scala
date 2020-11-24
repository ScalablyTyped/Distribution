package typings.qlik.anon

import typings.qlik.mod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContent extends js.Object {
  
  def getContent(variable: String, callback: js.Function2[/* value */ Variable, /* app */ this.type, Unit]): js.Promise[_] = js.native
  
  def setContent(variable: String, value: String): Unit = js.native
}
object GetContent {
  
  @scala.inline
  def apply(
    getContent: (String, js.Function2[/* value */ Variable, GetContent, Unit]) => js.Promise[_],
    setContent: (String, String) => Unit
  ): GetContent = {
    val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction2(getContent), setContent = js.Any.fromFunction2(setContent))
    __obj.asInstanceOf[GetContent]
  }
  
  @scala.inline
  implicit class GetContentOps[Self <: GetContent] (val x: Self) extends AnyVal {
    
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
    def setGetContent(value: (String, js.Function2[/* value */ Variable, GetContent, Unit]) => js.Promise[_]): Self = this.set("getContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetContent(value: (String, String) => Unit): Self = this.set("setContent", js.Any.fromFunction2(value))
  }
}
