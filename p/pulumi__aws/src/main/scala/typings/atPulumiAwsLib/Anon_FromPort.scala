package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromPort extends js.Object {
  var fromPort: scala.Double
  var ipRange: java.lang.String
  var protocol: java.lang.String
  var toPort: scala.Double
}

object Anon_FromPort {
  @scala.inline
  def apply(
    fromPort: scala.Double,
    ipRange: java.lang.String,
    protocol: java.lang.String,
    toPort: scala.Double
  ): Anon_FromPort = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromPort")(fromPort)
    __obj.updateDynamic("ipRange")(ipRange)
    __obj.updateDynamic("protocol")(protocol)
    __obj.updateDynamic("toPort")(toPort)
    __obj.asInstanceOf[Anon_FromPort]
  }
}

