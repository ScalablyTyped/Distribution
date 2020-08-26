package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.
  */
@js.native
trait HostAlias extends js.Object {
  /**
    * Hostnames for the above IP address.
    */
  var hostnames: js.Array[String] = js.native
  /**
    * IP address of the host file entry.
    */
  var ip: String = js.native
}

object HostAlias {
  @scala.inline
  def apply(hostnames: js.Array[String], ip: String): HostAlias = {
    val __obj = js.Dynamic.literal(hostnames = hostnames.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostAlias]
  }
  @scala.inline
  implicit class HostAliasOps[Self <: HostAlias] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHostnamesVarargs(value: String*): Self = this.set("hostnames", js.Array(value :_*))
    @scala.inline
    def setHostnames(value: js.Array[String]): Self = this.set("hostnames", value.asInstanceOf[js.Any])
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
  }
  
}

