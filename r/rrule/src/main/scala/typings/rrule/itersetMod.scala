package typings.rrule

import typings.rrule.iterresultMod.default
import typings.rrule.typesMod.IterResultType
import typings.rrule.typesMod.QueryMethodTypes
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itersetMod {
  
  @JSImport("rrule/dist/esm/src/iterset", "iterSet")
  @js.native
  def iterSet[M /* <: QueryMethodTypes */](
    iterResult: default[M],
    _rrule: js.Array[typings.rrule.rruleMod.default],
    _exrule: js.Array[typings.rrule.rruleMod.default],
    _rdate: js.Array[Date],
    _exdate: js.Array[Date]
  ): IterResultType[M] = js.native
  @JSImport("rrule/dist/esm/src/iterset", "iterSet")
  @js.native
  def iterSet[M /* <: QueryMethodTypes */](
    iterResult: default[M],
    _rrule: js.Array[typings.rrule.rruleMod.default],
    _exrule: js.Array[typings.rrule.rruleMod.default],
    _rdate: js.Array[Date],
    _exdate: js.Array[Date],
    tzid: String
  ): IterResultType[M] = js.native
}
