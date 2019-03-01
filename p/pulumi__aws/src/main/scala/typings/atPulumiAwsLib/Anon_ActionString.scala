package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionString extends js.Object {
  var action: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ActionString {
  @scala.inline
  def apply(action: java.lang.String = null): Anon_ActionString = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    __obj.asInstanceOf[Anon_ActionString]
  }
}

