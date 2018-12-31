package typings
package shuffleDashArrayLib.shuffleDashArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * picks - Specifies how many random elements you want to pick. By default it picks 1.
  * rng - Specifies a custom random number generator.
  */
trait PickOption extends js.Object {
  var picks: js.UndefOr[scala.Double] = js.undefined
  var rng: js.UndefOr[js.Function0[scala.Double]] = js.undefined
}

