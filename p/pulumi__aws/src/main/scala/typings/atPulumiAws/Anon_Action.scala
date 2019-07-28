package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  var action: Anon_WeightedTargets
  var `match`: Anon_Prefix
}

object Anon_Action {
  @scala.inline
  def apply(action: Anon_WeightedTargets, `match`: Anon_Prefix): Anon_Action = {
    val __obj = js.Dynamic.literal(action = action)
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[Anon_Action]
  }
}

