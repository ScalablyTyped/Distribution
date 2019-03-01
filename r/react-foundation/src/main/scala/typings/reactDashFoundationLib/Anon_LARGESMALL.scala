package typings
package reactDashFoundationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LARGESMALL extends js.Object {
  var LARGE: reactDashFoundationLib.enumsMod.CalloutSizes
  var SMALL: reactDashFoundationLib.enumsMod.CalloutSizes
}

object Anon_LARGESMALL {
  @scala.inline
  def apply(
    LARGE: reactDashFoundationLib.enumsMod.CalloutSizes,
    SMALL: reactDashFoundationLib.enumsMod.CalloutSizes
  ): Anon_LARGESMALL = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LARGE")(LARGE)
    __obj.updateDynamic("SMALL")(SMALL)
    __obj.asInstanceOf[Anon_LARGESMALL]
  }
}

