package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ________________________________________________________________________
@js.native
trait SjclExceptions extends js.Object {
  
  var bug: SjclExceptionFactory = js.native
  
  var corrupt: SjclExceptionFactory = js.native
  
  var invalid: SjclExceptionFactory = js.native
  
  var notReady: SjclExceptionFactory = js.native
}
object SjclExceptions {
  
  @scala.inline
  def apply(
    bug: SjclExceptionFactory,
    corrupt: SjclExceptionFactory,
    invalid: SjclExceptionFactory,
    notReady: SjclExceptionFactory
  ): SjclExceptions = {
    val __obj = js.Dynamic.literal(bug = bug.asInstanceOf[js.Any], corrupt = corrupt.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], notReady = notReady.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclExceptions]
  }
  
  @scala.inline
  implicit class SjclExceptionsOps[Self <: SjclExceptions] (val x: Self) extends AnyVal {
    
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
    def setBug(value: SjclExceptionFactory): Self = this.set("bug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrupt(value: SjclExceptionFactory): Self = this.set("corrupt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalid(value: SjclExceptionFactory): Self = this.set("invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotReady(value: SjclExceptionFactory): Self = this.set("notReady", value.asInstanceOf[js.Any])
  }
}
