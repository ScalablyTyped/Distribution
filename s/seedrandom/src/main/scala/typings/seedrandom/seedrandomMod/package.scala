package typings.seedrandom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object seedrandomMod {
  type State = js.Object
  type seedrandomCallback = js.Function4[
    /* prng */ js.UndefOr[prng], 
    /* shortseed */ js.UndefOr[String], 
    /* global */ js.UndefOr[Boolean], 
    /* state */ js.UndefOr[State], 
    prng
  ]
}
