package typings.sqltoolsFormatter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Input extends js.Object {
  
  var input: js.Any = js.native
  
  var parseKey: js.Any = js.native
  
  var regex: js.Any = js.native
}
object Input {
  
  @scala.inline
  def apply(input: js.Any, parseKey: js.Any, regex: js.Any): Input = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], parseKey = parseKey.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
  
  @scala.inline
  implicit class InputOps[Self <: Input] (val x: Self) extends AnyVal {
    
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
    def setInput(value: js.Any): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseKey(value: js.Any): Self = this.set("parseKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegex(value: js.Any): Self = this.set("regex", value.asInstanceOf[js.Any])
  }
}
