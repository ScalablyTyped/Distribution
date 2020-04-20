package typings.pulumiKubernetes.outputMod.storage.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeError captures an error encountered during a volume operation.
  */
trait VolumeError extends js.Object {
  /**
    * String detailing the error encountered during Attach or Detach operation. This string may
    * be logged, so it should not contain sensitive information.
    */
  val message: String
  /**
    * Time the error was encountered.
    */
  val time: String
}

object VolumeError {
  @scala.inline
  def apply(message: String, time: String): VolumeError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeError]
  }
}

