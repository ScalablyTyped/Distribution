package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DaemonEndpoint contains information about a single Daemon endpoint.
  */
trait DaemonEndpoint extends js.Object {
  /**
    * Port number of the given endpoint.
    */
  var Port: Input[Double]
}

object DaemonEndpoint {
  @scala.inline
  def apply(Port: Input[Double]): DaemonEndpoint = {
    val __obj = js.Dynamic.literal(Port = Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaemonEndpoint]
  }
}

