package typings.randomDashNumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object randomDashNumberMod {
  type Generator = js.Function3[
    /* min */ js.UndefOr[Double | Null], 
    /* max */ js.UndefOr[Double | Null], 
    /* integer */ js.UndefOr[Boolean | Null], 
    Double
  ]
}
