package typings
package raspiDashI2cLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object raspiDashI2cMod {
  type ReadCallback = js.Function2[
    /* err */ scala.Null | nodeLib.Error | java.lang.String, 
    /* data */ scala.Null | nodeLib.Buffer | scala.Double, 
    scala.Unit
  ]
  type WriteCallback = js.Function1[/* err */ scala.Null | nodeLib.Error | java.lang.String, scala.Unit]
}
