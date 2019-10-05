package typings.atPulumiKubernetes.typesOutputMod.core.v1

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
  val kubeletEndpoint: DaemonEndpoint
}

object NodeDaemonEndpoints {
  @scala.inline
  def apply(kubeletEndpoint: DaemonEndpoint): NodeDaemonEndpoints = {
    val __obj = js.Dynamic.literal(kubeletEndpoint = kubeletEndpoint)
  
    __obj.asInstanceOf[NodeDaemonEndpoints]
  }
}

