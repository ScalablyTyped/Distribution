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
  def apply(dev: Int | Double = null, mean: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (dev != null) __obj.updateDynamic("dev")(dev.asInstanceOf[js.Any])
    if (mean != null) __obj.updateDynamic("mean")(mean.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

