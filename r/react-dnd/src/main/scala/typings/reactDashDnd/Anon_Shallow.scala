package typings.reactDashDnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Shallow extends js.Object {
  var shallow: js.UndefOr[Boolean] = js.undefined
}

object Anon_Shallow {
  @scala.inline
  def apply(shallow: js.UndefOr[Boolean] = js.undefined): Anon_Shallow = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(shallow)) __obj.updateDynamic("shallow")(shallow)
    __obj.asInstanceOf[Anon_Shallow]
  }
}

