package typings.scDashBrokerDashCluster

import typings.scDashBrokerDashCluster.scDashBrokerDashClusterMod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Targets extends js.Object {
  var targets: js.Array[Client]
  var `type`: String
}

object Anon_Targets {
  @scala.inline
  def apply(targets: js.Array[Client], `type`: String): Anon_Targets = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Targets]
  }
}

