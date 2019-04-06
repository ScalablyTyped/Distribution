package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColdStorageAfter extends js.Object {
  var coldStorageAfter: js.UndefOr[scala.Double] = js.undefined
  var deleteAfter: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ColdStorageAfter {
  @scala.inline
  def apply(coldStorageAfter: scala.Int | scala.Double = null, deleteAfter: scala.Int | scala.Double = null): Anon_ColdStorageAfter = {
    val __obj = js.Dynamic.literal()
    if (coldStorageAfter != null) __obj.updateDynamic("coldStorageAfter")(coldStorageAfter.asInstanceOf[js.Any])
    if (deleteAfter != null) __obj.updateDynamic("deleteAfter")(deleteAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColdStorageAfter]
  }
}

