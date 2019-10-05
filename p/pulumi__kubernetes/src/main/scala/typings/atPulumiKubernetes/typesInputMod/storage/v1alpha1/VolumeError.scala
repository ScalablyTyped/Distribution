package typings.atPulumiKubernetes.typesInputMod.storage.v1alpha1

import typings.atPulumiPulumi.outputMod.Input
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
  var message: js.UndefOr[Input[String]] = js.undefined
  /**
    * Time the error was encountered.
    */
  var time: js.UndefOr[Input[String]] = js.undefined
}

object VolumeError {
  @scala.inline
  def apply(message: Input[String] = null, time: Input[String] = null): VolumeError = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeError]
  }
}

