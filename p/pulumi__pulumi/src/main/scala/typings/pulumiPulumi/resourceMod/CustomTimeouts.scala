package typings.pulumiPulumi.resourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTimeouts extends js.Object {
  /**
    * The optional create timeout represented as a string e.g. 5m, 40s, 1d.
    */
  var create: js.UndefOr[String] = js.undefined
  /**
    * The optional delete timeout represented as a string e.g. 5m, 40s, 1d.
    */
  var delete: js.UndefOr[String] = js.undefined
  /**
    * The optional update timeout represented as a string e.g. 5m, 40s, 1d.
    */
  var update: js.UndefOr[String] = js.undefined
}

object CustomTimeouts {
  @scala.inline
  def apply(create: String = null, delete: String = null, update: String = null): CustomTimeouts = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTimeouts]
  }
}

