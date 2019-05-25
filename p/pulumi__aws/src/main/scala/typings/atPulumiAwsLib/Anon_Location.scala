package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Location extends js.Object {
  var location: js.UndefOr[java.lang.String] = js.undefined
  var modes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Location {
  @scala.inline
  def apply(
    location: java.lang.String = null,
    modes: js.Array[java.lang.String] = null,
    `type`: java.lang.String = null
  ): Anon_Location = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location)
    if (modes != null) __obj.updateDynamic("modes")(modes)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Location]
  }
}

