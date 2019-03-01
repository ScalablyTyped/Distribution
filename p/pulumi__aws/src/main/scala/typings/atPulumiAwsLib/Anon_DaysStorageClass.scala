package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DaysStorageClass extends js.Object {
  var days: js.UndefOr[scala.Double] = js.undefined
  var storageClass: java.lang.String
}

object Anon_DaysStorageClass {
  @scala.inline
  def apply(storageClass: java.lang.String, days: scala.Int | scala.Double = null): Anon_DaysStorageClass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("storageClass")(storageClass)
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DaysStorageClass]
  }
}

