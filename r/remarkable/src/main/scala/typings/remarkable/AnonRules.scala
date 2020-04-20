package typings.remarkable

import typings.remarkable.libMod.Rules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRules extends js.Object {
  var rules: Rules
}

object AnonRules {
  @scala.inline
  def apply(rules: Rules): AnonRules = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRules]
  }
}

