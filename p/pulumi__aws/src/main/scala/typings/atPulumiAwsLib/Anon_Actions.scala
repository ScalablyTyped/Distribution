package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actions extends js.Object {
  var actions: js.Array[Anon_Category]
  var name: java.lang.String
}

object Anon_Actions {
  @scala.inline
  def apply(actions: js.Array[Anon_Category], name: java.lang.String): Anon_Actions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actions")(actions)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Actions]
  }
}

