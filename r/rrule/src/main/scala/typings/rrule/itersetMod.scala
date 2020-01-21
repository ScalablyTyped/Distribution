package typings.rrule

import typings.rrule.iterresultMod.default
import typings.rrule.typesMod.IterResultType
import typings.rrule.typesMod.QueryMethodTypes
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/iterset", JSImport.Namespace)
@js.native
object itersetMod extends js.Object {
  def iterSet[M /* <: QueryMethodTypes */](
    iterResult: default[M],
    _rrule: js.Array[typings.rrule.rruleMod.default],
    _exrule: js.Array[typings.rrule.rruleMod.default],
    _rdate: js.Array[Date],
    _exdate: js.Array[Date]
  ): IterResultType[M] = js.native
  def iterSet[M /* <: QueryMethodTypes */](
    iterResult: default[M],
    _rrule: js.Array[typings.rrule.rruleMod.default],
    _exrule: js.Array[typings.rrule.rruleMod.default],
    _rdate: js.Array[Date],
    _exdate: js.Array[Date],
    tzid: String
  ): IterResultType[M] = js.native
}

