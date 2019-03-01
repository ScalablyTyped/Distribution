package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Conditions extends js.Object {
  var conditions: js.Array[Anon_JobName]
  var logical: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Conditions {
  @scala.inline
  def apply(conditions: js.Array[Anon_JobName], logical: java.lang.String = null): Anon_Conditions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("conditions")(conditions)
    if (logical != null) __obj.updateDynamic("logical")(logical)
    __obj.asInstanceOf[Anon_Conditions]
  }
}

