package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Versions extends js.Object {
  /**
    * The SSH protocol version supported by the remote party.
    */
  var protocol: String = js.native
  /**
    * The software name and version used by the remote party.
    */
  var software: String = js.native
}

object Versions {
  @scala.inline
  def apply(protocol: String, software: String): Versions = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any], software = software.asInstanceOf[js.Any])
    __obj.asInstanceOf[Versions]
  }
  @scala.inline
  implicit class VersionsOps[Self <: Versions] (val x: Self) extends AnyVal {
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
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setSoftware(value: String): Self = this.set("software", value.asInstanceOf[js.Any])
  }
  
}

