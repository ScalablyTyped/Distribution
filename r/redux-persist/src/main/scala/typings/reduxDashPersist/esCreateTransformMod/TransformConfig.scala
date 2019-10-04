package typings.reduxDashPersist.esCreateTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformConfig extends js.Object {
  var blacklist: js.UndefOr[js.Array[String]] = js.undefined
  var whitelist: js.UndefOr[js.Array[String]] = js.undefined
}

object TransformConfig {
  @scala.inline
  def apply(blacklist: js.Array[String] = null, whitelist: js.Array[String] = null): TransformConfig = {
    val __obj = js.Dynamic.literal()
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist)
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist)
    __obj.asInstanceOf[TransformConfig]
  }
}

