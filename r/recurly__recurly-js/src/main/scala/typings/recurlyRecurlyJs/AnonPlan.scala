package typings.recurlyRecurlyJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPlan extends js.Object {
  var addons: StringDictionary[String]
  var plan: AnonSetupfee
}

object AnonPlan {
  @scala.inline
  def apply(addons: StringDictionary[String], plan: AnonSetupfee): AnonPlan = {
    val __obj = js.Dynamic.literal(addons = addons.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPlan]
  }
}

