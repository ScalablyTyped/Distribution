package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NumNodeGroups extends js.Object {
  var numNodeGroups: scala.Double
  var replicasPerNodeGroup: scala.Double
}

object Anon_NumNodeGroups {
  @scala.inline
  def apply(numNodeGroups: scala.Double, replicasPerNodeGroup: scala.Double): Anon_NumNodeGroups = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("numNodeGroups")(numNodeGroups)
    __obj.updateDynamic("replicasPerNodeGroup")(replicasPerNodeGroup)
    __obj.asInstanceOf[Anon_NumNodeGroups]
  }
}

