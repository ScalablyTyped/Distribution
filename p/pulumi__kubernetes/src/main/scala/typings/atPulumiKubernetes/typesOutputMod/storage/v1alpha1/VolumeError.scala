package typings.atPulumiKubernetes.typesOutputMod.storage.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeError captures an error encountered during a volume operation.
  */
trait VolumeError extends js.Object {
  /**
    * String detailing the error encountered during Attach or Detach operation. This string maybe
    * logged, so it should not contain sensitive information.
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

