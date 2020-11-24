package typings.rsocketCore.anon

import typings.rsocketCore.rsocketframeMod.ErrorSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Error & {  source :rsocket-core.rsocket-core/RSocketFrame.ErrorSource} */
@js.native
trait ErrorsourceErrorSource extends js.Object {
  
  var message: String = js.native
  
  var name: String = js.native
  
  var source: ErrorSource = js.native
  
  var stack: js.UndefOr[String] = js.native
}
object ErrorsourceErrorSource {
  
  @scala.inline
  def apply(message: String, name: String, source: ErrorSource): ErrorsourceErrorSource = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorsourceErrorSource]
  }
  
  @scala.inline
  implicit class ErrorsourceErrorSourceOps[Self <: ErrorsourceErrorSource] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: ErrorSource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
}
