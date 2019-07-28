package typings.atPulumiKubernetes.typesOutputMod.storageNs.v1Ns

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
    val __obj = js.Dynamic.literal(message = message, time = time)
  
    __obj.asInstanceOf[VolumeError]
  }
}

