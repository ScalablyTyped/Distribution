package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plan extends js.Object {
  var addons: StringDictionary[String]
  var plan: Setupfee
}

object Plan {
  @scala.inline
  def apply(addons: StringDictionary[String], plan: Setupfee): Plan = {
    val __obj = js.Dynamic.literal(addons = addons.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plan]
  }
}

