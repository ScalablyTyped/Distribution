package typings
package shrinkDashRayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shrinkDashRayMod {
  type FilterFunction = js.Function2[
    /* req */ expressLib.expressMod.Request, 
    /* res */ expressLib.expressMod.Response, 
    scala.Boolean
  ]
}
