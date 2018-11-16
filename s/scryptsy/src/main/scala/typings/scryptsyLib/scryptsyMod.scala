package typings
package scryptsyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scryptsy", JSImport.Namespace)
@js.native
object scryptsyMod extends js.Object {
  def apply(
    key: nodeLib.Buffer | java.lang.String,
    salt: nodeLib.Buffer | java.lang.String,
    N: scala.Double,
    r: scala.Double,
    p: scala.Double,
    dkLen: scala.Double
  ): nodeLib.Buffer = js.native
  def apply(
    key: nodeLib.Buffer | java.lang.String,
    salt: nodeLib.Buffer | java.lang.String,
    N: scala.Double,
    r: scala.Double,
    p: scala.Double,
    dkLen: scala.Double,
    progressCallback: js.Function1[/* status */ scryptsyLib.Anon_Total, scala.Unit]
  ): nodeLib.Buffer = js.native
}

