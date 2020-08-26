package typings.remarkable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rules extends js.Object {
  var rules: typings.remarkable.libMod.Rules = js.native
}

object Rules {
  @scala.inline
  def apply(rules: typings.remarkable.libMod.Rules): Rules = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rules]
  }
  @scala.inline
  implicit class RulesOps[Self <: Rules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRules(value: typings.remarkable.libMod.Rules): Self = this.set("rules", value.asInstanceOf[js.Any])
  }
  
}

