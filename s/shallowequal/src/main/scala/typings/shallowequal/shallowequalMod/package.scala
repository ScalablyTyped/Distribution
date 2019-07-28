package typings.shallowequal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shallowequalMod {
  type Customizer[T] = js.ThisFunction3[
    /* this */ T, 
    /* objA */ js.Any, 
    /* objB */ js.Any, 
    /* indexOrKey */ js.UndefOr[Double | String], 
    Boolean | Unit
  ]
}
