package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DaysStorageClass extends js.Object {
  var days: js.UndefOr[Double] = js.undefined
  var storageClass: String
}

object Anon_DaysStorageClass {
  @scala.inline
  def apply(storageClass: String, days: Int | Double = null): Anon_DaysStorageClass = {
    val __obj = js.Dynamic.literal(storageClass = storageClass)
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DaysStorageClass]
  }
}

