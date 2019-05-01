package typings
package randomDashNumberLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object randomDashNumberMod {
  type Generator = js.Function3[
    /* min */ js.UndefOr[scala.Double | scala.Null], 
    /* max */ js.UndefOr[scala.Double | scala.Null], 
    /* integer */ js.UndefOr[scala.Boolean | scala.Null], 
    scala.Double
  ]
}
