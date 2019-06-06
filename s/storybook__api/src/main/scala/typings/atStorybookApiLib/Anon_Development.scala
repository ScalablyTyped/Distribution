package typings
package atStorybookApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Development extends js.Object {
  var mode: js.UndefOr[
    atStorybookApiLib.atStorybookApiLibStrings.production | atStorybookApiLib.atStorybookApiLibStrings.development
  ] = js.undefined
}

object Anon_Development {
  @scala.inline
  def apply(
    mode: atStorybookApiLib.atStorybookApiLibStrings.production | atStorybookApiLib.atStorybookApiLibStrings.development = null
  ): Anon_Development = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Development]
  }
}

