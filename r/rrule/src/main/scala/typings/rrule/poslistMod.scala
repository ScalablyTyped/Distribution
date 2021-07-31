package typings.rrule

import typings.rrule.datetimeMod.Time
import typings.rrule.iterinfoMod.default
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object poslistMod {
  
  @JSImport("rrule/dist/esm/src/iter/poslist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def buildPoslist(
    bysetpos: js.Array[Double],
    timeset: js.Array[Time],
    start: Double,
    end: Double,
    ii: default,
    dayset: js.Array[Double | Null]
  ): js.Array[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPoslist")(bysetpos.asInstanceOf[js.Any], timeset.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], ii.asInstanceOf[js.Any], dayset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
}
