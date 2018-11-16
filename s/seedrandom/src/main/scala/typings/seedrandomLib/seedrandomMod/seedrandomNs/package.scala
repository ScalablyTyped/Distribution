package typings
package seedrandomLib.seedrandomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object seedrandomNs {
  type seedrandomCallback = js.Function4[
    /* prng */ js.UndefOr[prng], 
    /* shortseed */ js.UndefOr[java.lang.String], 
    /* global */ js.UndefOr[scala.Boolean], 
    /* state */ js.UndefOr[seedrandomStateType], 
    prng
  ]
  type seedrandomStateType = scala.Boolean | js.Function0[prng]
}
