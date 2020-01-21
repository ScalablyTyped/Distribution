package typings.scBrokerCluster

import typings.scBrokerCluster.mod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTargets extends js.Object {
  var targets: js.Array[Client]
  var `type`: String
}

object AnonTargets {
  @scala.inline
  def apply(targets: js.Array[Client], `type`: String): AnonTargets = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTargets]
  }
}

