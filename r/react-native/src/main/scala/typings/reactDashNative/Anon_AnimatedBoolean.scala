package typings.reactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimatedBoolean extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
}

object Anon_AnimatedBoolean {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined): Anon_AnimatedBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    __obj.asInstanceOf[Anon_AnimatedBoolean]
  }
}

