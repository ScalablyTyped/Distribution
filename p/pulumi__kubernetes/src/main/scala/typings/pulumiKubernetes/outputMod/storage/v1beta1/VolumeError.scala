package typings.pulumiKubernetes.outputMod.storage.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VolumeError captures an error encountered during a volume operation.
  */
@js.native
trait VolumeError extends js.Object {
  
  /**
    * String detailing the error encountered during Attach or Detach operation. This string may be logged, so it should not contain sensitive information.
    */
  var message: String = js.native
  
  /**
    * Time the error was encountered.
    */
  var time: String = js.native
}
object VolumeError {
  
  @scala.inline
  def apply(message: String, time: String): VolumeError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeError]
  }
  
  @scala.inline
  implicit class VolumeErrorOps[Self <: VolumeError] (val x: Self) extends AnyVal {
    
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
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
  }
}
