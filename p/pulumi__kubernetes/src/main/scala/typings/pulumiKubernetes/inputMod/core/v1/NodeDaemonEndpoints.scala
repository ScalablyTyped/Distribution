package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NodeDaemonEndpoints lists ports opened by daemons running on the Node.
  */
trait NodeDaemonEndpoints extends js.Object {
  /**
    * Endpoint on which Kubelet is listening.
    */
  var kubeletEndpoint: js.UndefOr[Input[DaemonEndpoint]] = js.undefined
}

object NodeDaemonEndpoints {
  @scala.inline
  def apply(kubeletEndpoint: Input[DaemonEndpoint] = null): NodeDaemonEndpoints = {
    val __obj = js.Dynamic.literal()
    if (kubeletEndpoint != null) __obj.updateDynamic("kubeletEndpoint")(kubeletEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDaemonEndpoints]
  }
}

