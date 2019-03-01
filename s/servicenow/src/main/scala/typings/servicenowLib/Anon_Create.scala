package typings
package servicenowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Create extends js.Object {
  def create(): js.Any
}

object Anon_Create {
  @scala.inline
  def apply(create: js.Function0[js.Any]): Anon_Create = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.asInstanceOf[Anon_Create]
  }
}

