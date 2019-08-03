package typings.slate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Target extends js.Object {
  var target: js.UndefOr[Double] = js.undefined
}

object Anon_Target {
  @scala.inline
  def apply(target: Int | Double = null): Anon_Target = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Target]
  }
}

