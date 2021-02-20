package typings.rrule

import typings.rrule.datetimeMod.Time
import typings.rrule.iterinfoMod.default
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object poslistMod {
  
  @JSImport("rrule/dist/esm/src/iter/poslist", "buildPoslist")
  @js.native
  def buildPoslist(
    bysetpos: js.Array[Double],
    timeset: js.Array[Time],
    start: Double,
    end: Double,
    ii: default,
    dayset: js.Array[Double | Null]
  ): js.Array[Date] = js.native
}
