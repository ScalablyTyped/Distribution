package typings.ssh2DashStreams.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Versions extends js.Object {
  /**
    * The SSH protocol version supported by the remote party.
    */
  var protocol: String
  /**
    * The software name and version used by the remote party.
    */
  var software: String
}

object Versions {
  @scala.inline
  def apply(protocol: String, software: String): Versions = {
    val __obj = js.Dynamic.literal(protocol = protocol, software = software)
  
    __obj.asInstanceOf[Versions]
  }
}

