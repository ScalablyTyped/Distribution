package typings.pulumiKubernetes.outputMod.core.v1

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
  val hostnames: js.Array[String]
  /**
    * IP address of the host file entry.
    */
  val ip: String
}

object HostAlias {
  @scala.inline
  def apply(hostnames: js.Array[String], ip: String): HostAlias = {
    val __obj = js.Dynamic.literal(hostnames = hostnames.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HostAlias]
  }
}

