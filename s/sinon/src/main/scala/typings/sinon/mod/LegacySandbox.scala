package typings.sinon.mod

import typings.sinon.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegacySandbox extends js.Object {
  
  var sandbox: `0` = js.native
}
object LegacySandbox {
  
  @scala.inline
  def apply(sandbox: `0`): LegacySandbox = {
    val __obj = js.Dynamic.literal(sandbox = sandbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacySandbox]
  }
  
  @scala.inline
  implicit class LegacySandboxOps[Self <: LegacySandbox] (val x: Self) extends AnyVal {
    
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
    def setSandbox(value: `0`): Self = this.set("sandbox", value.asInstanceOf[js.Any])
  }
}
