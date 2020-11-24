package typings.socketIo.anon

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateId extends js.Object {
  
  def generateId(id: IncomingMessage): String = js.native
  
  var ws: js.Any = js.native
}
object GenerateId {
  
  @scala.inline
  def apply(generateId: IncomingMessage => String, ws: js.Any): GenerateId = {
    val __obj = js.Dynamic.literal(generateId = js.Any.fromFunction1(generateId), ws = ws.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateId]
  }
  
  @scala.inline
  implicit class GenerateIdOps[Self <: GenerateId] (val x: Self) extends AnyVal {
    
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
    def setGenerateId(value: IncomingMessage => String): Self = this.set("generateId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWs(value: js.Any): Self = this.set("ws", value.asInstanceOf[js.Any])
  }
}
