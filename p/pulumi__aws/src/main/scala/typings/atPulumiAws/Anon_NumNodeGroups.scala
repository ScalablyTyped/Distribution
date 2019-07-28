package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NumNodeGroups extends js.Object {
  var numNodeGroups: Double
  var replicasPerNodeGroup: Double
}

object Anon_NumNodeGroups {
  @scala.inline
  def apply(numNodeGroups: Double, replicasPerNodeGroup: Double): Anon_NumNodeGroups = {
    val __obj = js.Dynamic.literal(numNodeGroups = numNodeGroups, replicasPerNodeGroup = replicasPerNodeGroup)
  
    __obj.asInstanceOf[Anon_NumNodeGroups]
  }
}

