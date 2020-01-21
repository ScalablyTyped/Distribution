package typings.reactTether.mod.ReactTether

import typings.reactTether.reactTetherStrings.together
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraints extends js.Object {
  var attachment: js.UndefOr[String | together] = js.undefined
  var outOfBoundsClass: js.UndefOr[String] = js.undefined
  var pin: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var pinnedClass: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[ContraintsTo] = js.undefined
}

object Constraints {
  @scala.inline
  def apply(
    attachment: String | together = null,
    outOfBoundsClass: String = null,
    pin: Boolean | js.Array[String] = null,
    pinnedClass: String = null,
    to: ContraintsTo = null
  ): Constraints = {
    val __obj = js.Dynamic.literal()
    if (attachment != null) __obj.updateDynamic("attachment")(attachment.asInstanceOf[js.Any])
    if (outOfBoundsClass != null) __obj.updateDynamic("outOfBoundsClass")(outOfBoundsClass.asInstanceOf[js.Any])
    if (pin != null) __obj.updateDynamic("pin")(pin.asInstanceOf[js.Any])
    if (pinnedClass != null) __obj.updateDynamic("pinnedClass")(pinnedClass.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constraints]
  }
}

