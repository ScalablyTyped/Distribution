package typings.randomNormal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** The standard deviation of the normal distribution. Defaults to 1 */
  var dev: js.UndefOr[Double] = js.undefined
  /** The mean of the normal distribution. Defaults to 0 */
  var mean: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(dev: js.UndefOr[Double] = js.undefined, mean: js.UndefOr[Double] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mean)) __obj.updateDynamic("mean")(mean.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

