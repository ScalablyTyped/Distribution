package typings.pulumiKubernetes.outputMod.core.v1

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
  val Port: Double
}

object DaemonEndpoint {
  @scala.inline
  def apply(Port: Double): DaemonEndpoint = {
    val __obj = js.Dynamic.literal(Port = Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaemonEndpoint]
  }
}

