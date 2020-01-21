package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the
  * pod's hosts file.
  */
trait HostAlias extends js.Object {
  /**
    * Hostnames for the above IP address.
    */
  var hostnames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * IP address of the host file entry.
    */
  var ip: js.UndefOr[Input[String]] = js.undefined
}

object HostAlias {
  @scala.inline
  def apply(hostnames: Input[js.Array[Input[String]]] = null, ip: Input[String] = null): HostAlias = {
    val __obj = js.Dynamic.literal()
    if (hostnames != null) __obj.updateDynamic("hostnames")(hostnames.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostAlias]
  }
}

