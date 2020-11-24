package typings.scriptExtHtmlWebpackPlugin.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptMatchingPatternHash extends js.Object {
  
  var test: ScriptMatchingPatternBase = js.native
}
object ScriptMatchingPatternHash {
  
  @scala.inline
  def apply(test: ScriptMatchingPatternBase): ScriptMatchingPatternHash = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptMatchingPatternHash]
  }
  
  @scala.inline
  implicit class ScriptMatchingPatternHashOps[Self <: ScriptMatchingPatternHash] (val x: Self) extends AnyVal {
    
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
    def setTestVarargs(value: (String | RegExp)*): Self = this.set("test", js.Array(value :_*))
    
    @scala.inline
    def setTest(value: ScriptMatchingPatternBase): Self = this.set("test", value.asInstanceOf[js.Any])
  }
}
