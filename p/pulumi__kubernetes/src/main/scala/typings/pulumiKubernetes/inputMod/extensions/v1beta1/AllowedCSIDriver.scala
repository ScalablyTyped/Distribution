package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AllowedCSIDriver represents a single inline CSI Driver that is allowed to be used.
  */
trait AllowedCSIDriver extends js.Object {
  /**
    * Name is the registered name of the CSI driver
    */
  var name: Input[String]
}

object AllowedCSIDriver {
  @scala.inline
  def apply(name: Input[String]): AllowedCSIDriver = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedCSIDriver]
  }
}

