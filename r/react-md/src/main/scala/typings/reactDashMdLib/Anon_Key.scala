package typings
package reactDashMdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var label: reactLib.reactMod.ReactNs.ReactNode
  var value: scala.Double | java.lang.String
}

object Anon_Key {
  @scala.inline
  def apply(
    label: reactLib.reactMod.ReactNs.ReactNode,
    value: scala.Double | java.lang.String,
    key: scala.Double | java.lang.String = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Key]
  }
}

