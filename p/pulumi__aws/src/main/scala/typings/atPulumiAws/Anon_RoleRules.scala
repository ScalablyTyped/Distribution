package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RoleRules extends js.Object {
  var role: Input[String]
  var rules: Input[js.Array[Input[Anon_DestinationFilter]]]
}

object Anon_RoleRules {
  @scala.inline
  def apply(role: Input[String], rules: Input[js.Array[Input[Anon_DestinationFilter]]]): Anon_RoleRules = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_RoleRules]
  }
}

