package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Purge extends js.Object {
  
  var assert: Boolean = js.native
  
  var options: Durable = js.native
  
  var purge: Boolean = js.native
}
object Purge {
  
  @scala.inline
  def apply(assert: Boolean, options: Durable, purge: Boolean): Purge = {
    val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], purge = purge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Purge]
  }
  
  @scala.inline
  implicit class PurgeOps[Self <: Purge] (val x: Self) extends AnyVal {
    
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
    def setAssert(value: Boolean): Self = this.set("assert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Durable): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurge(value: Boolean): Self = this.set("purge", value.asInstanceOf[js.Any])
  }
}
