package typings.rrule

import typings.rrule.distEsmSrcIterresultMod.default
import typings.rrule.distEsmSrcTypesMod.IterResultType
import typings.rrule.distEsmSrcTypesMod.QueryMethodTypes
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/iterset", JSImport.Namespace)
@js.native
object distEsmSrcItersetMod extends js.Object {
  def iterSet[M /* <: QueryMethodTypes */](
    iterResult: default[M],
    _rrule: js.Array[typings.rrule.distEsmSrcRruleMod.default],
    _exrule: js.Array[typings.rrule.distEsmSrcRruleMod.default],
    _rdate: js.Array[Date],
    _exdate: js.Array[Date]
  ): IterResultType[M] = js.native
  def iterSet[M /* <: QueryMethodTypes */](
    iterResult: default[M],
    _rrule: js.Array[typings.rrule.distEsmSrcRruleMod.default],
    _exrule: js.Array[typings.rrule.distEsmSrcRruleMod.default],
    _rdate: js.Array[Date],
    _exdate: js.Array[Date],
    tzid: String
  ): IterResultType[M] = js.native
}

