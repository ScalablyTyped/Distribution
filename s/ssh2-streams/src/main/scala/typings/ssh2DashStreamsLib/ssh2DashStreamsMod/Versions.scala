package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Versions extends js.Object {
  /**
    * The SSH protocol version supported by the remote party.
    */
  var protocol: java.lang.String
  /**
    * The software name and version used by the remote party.
    */
  var software: java.lang.String
}

object Versions {
  @scala.inline
  def apply(protocol: java.lang.String, software: java.lang.String): Versions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("protocol")(protocol)
    __obj.updateDynamic("software")(software)
    __obj.asInstanceOf[Versions]
  }
}

