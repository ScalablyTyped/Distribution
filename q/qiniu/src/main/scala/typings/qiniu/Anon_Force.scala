package typings.qiniu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Force extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
}

object Anon_Force {
  @scala.inline
  def apply(force: js.UndefOr[Boolean] = js.undefined): Anon_Force = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[Anon_Force]
  }
}

