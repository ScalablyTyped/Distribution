package typings.reactTransitionGroup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Appear extends js.Object {
  var appear: js.UndefOr[Double] = js.undefined
  var enter: js.UndefOr[Double] = js.undefined
  var exit: js.UndefOr[Double] = js.undefined
}

object Appear {
  @scala.inline
  def apply(
    appear: js.UndefOr[Double] = js.undefined,
    enter: js.UndefOr[Double] = js.undefined,
    exit: js.UndefOr[Double] = js.undefined
  ): Appear = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enter)) __obj.updateDynamic("enter")(enter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exit)) __obj.updateDynamic("exit")(exit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appear]
  }
}

