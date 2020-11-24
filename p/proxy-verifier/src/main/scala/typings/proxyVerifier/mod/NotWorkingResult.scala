package typings.proxyVerifier.mod

import typings.proxyVerifier.anon.Code
import typings.proxyVerifier.proxyVerifierBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotWorkingResult extends Result {
  
  var error: Code = js.native
  
  var ok: `false` = js.native
}
object NotWorkingResult {
  
  @scala.inline
  def apply(error: Code, ok: `false`): NotWorkingResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotWorkingResult]
  }
  
  @scala.inline
  implicit class NotWorkingResultOps[Self <: NotWorkingResult] (val x: Self) extends AnyVal {
    
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
    def setError(value: Code): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOk(value: `false`): Self = this.set("ok", value.asInstanceOf[js.Any])
  }
}
