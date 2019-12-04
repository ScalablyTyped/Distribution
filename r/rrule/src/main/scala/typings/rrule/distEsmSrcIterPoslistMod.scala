package typings.rrule

import typings.rrule.distEsmSrcDatetimeMod.Time
import typings.rrule.distEsmSrcIterinfoMod.default
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/iter/poslist", JSImport.Namespace)
@js.native
object distEsmSrcIterPoslistMod extends js.Object {
  def buildPoslist(
    bysetpos: js.Array[Double],
    timeset: js.Array[Time],
    start: Double,
    end: Double,
    ii: default,
    dayset: js.Array[Double | Null]
  ): js.Array[Date] = js.native
}

