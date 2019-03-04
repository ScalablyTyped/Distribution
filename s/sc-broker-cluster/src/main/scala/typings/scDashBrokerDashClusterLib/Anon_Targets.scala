package typings
package scDashBrokerDashClusterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Targets extends js.Object {
  var targets: js.Array[scDashBrokerDashClusterLib.scDashBrokerDashClusterMod.Client]
  var `type`: java.lang.String
}

object Anon_Targets {
  @scala.inline
  def apply(
    targets: js.Array[scDashBrokerDashClusterLib.scDashBrokerDashClusterMod.Client],
    `type`: java.lang.String
  ): Anon_Targets = {
    val __obj = js.Dynamic.literal(targets = targets)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Targets]
  }
}

