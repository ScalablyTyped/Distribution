package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodDNSConfigOption defines DNS resolver options of a pod.
  */
trait PodDNSConfigOption extends js.Object {
  /**
    * Required.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  var value: js.UndefOr[Input[String]] = js.undefined
}

object PodDNSConfigOption {
  @scala.inline
  def apply(name: Input[String] = null, value: Input[String] = null): PodDNSConfigOption = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodDNSConfigOption]
  }
}

