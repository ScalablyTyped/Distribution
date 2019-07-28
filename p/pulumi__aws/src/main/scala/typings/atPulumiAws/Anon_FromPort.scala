package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromPort extends js.Object {
  var fromPort: Double
  var ipRange: String
  var protocol: String
  var toPort: Double
}

object Anon_FromPort {
  @scala.inline
  def apply(fromPort: Double, ipRange: String, protocol: String, toPort: Double): Anon_FromPort = {
    val __obj = js.Dynamic.literal(fromPort = fromPort, ipRange = ipRange, protocol = protocol, toPort = toPort)
  
    __obj.asInstanceOf[Anon_FromPort]
  }
}

