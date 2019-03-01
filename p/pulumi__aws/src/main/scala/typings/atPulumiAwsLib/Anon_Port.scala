package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Port extends js.Object {
  var port: scala.Double
  var protocol: java.lang.String
}

object Anon_Port {
  @scala.inline
  def apply(port: scala.Double, protocol: java.lang.String): Anon_Port = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("protocol")(protocol)
    __obj.asInstanceOf[Anon_Port]
  }
}

