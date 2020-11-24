package typings.socketclusterServer.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodecEngine extends js.Object {
  
  def decode(input: js.Any): js.Any = js.native
  
  def encode(`object`: js.Any): js.Any = js.native
}
object CodecEngine {
  
  @scala.inline
  def apply(decode: js.Any => js.Any, encode: js.Any => js.Any): CodecEngine = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[CodecEngine]
  }
  
  @scala.inline
  implicit class CodecEngineOps[Self <: CodecEngine] (val x: Self) extends AnyVal {
    
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
    def setDecode(value: js.Any => js.Any): Self = this.set("decode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncode(value: js.Any => js.Any): Self = this.set("encode", js.Any.fromFunction1(value))
  }
}
