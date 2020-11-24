package typings.spex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStreamReadResult extends js.Object {
  
  var calls: Double = js.native
  
  var duration: Double = js.native
  
  var length: Double = js.native
  
  var reads: Double = js.native
}
object IStreamReadResult {
  
  @scala.inline
  def apply(calls: Double, duration: Double, length: Double, reads: Double): IStreamReadResult = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], reads = reads.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamReadResult]
  }
  
  @scala.inline
  implicit class IStreamReadResultOps[Self <: IStreamReadResult] (val x: Self) extends AnyVal {
    
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
    def setCalls(value: Double): Self = this.set("calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReads(value: Double): Self = this.set("reads", value.asInstanceOf[js.Any])
  }
}
