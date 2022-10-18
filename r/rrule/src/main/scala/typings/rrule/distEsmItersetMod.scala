package typings.rrule

import typings.rrule.distEsmIterresultMod.default
import typings.rrule.distEsmRruleMod.RRule
import typings.rrule.distEsmTypesMod.IterResultType
import typings.rrule.distEsmTypesMod.QueryMethodTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmItersetMod {
  
  @JSImport("rrule/dist/esm/iterset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def iterSet[M /* <: QueryMethodTypes */](
    iterResult: default[M],
    _rrule: js.Array[RRule],
    _exrule: js.Array[RRule],
    _rdate: js.Array[js.Date],
    _exdate: js.Array[js.Date]
  ): IterResultType[M] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterSet")(iterResult.asInstanceOf[js.Any], _rrule.asInstanceOf[js.Any], _exrule.asInstanceOf[js.Any], _rdate.asInstanceOf[js.Any], _exdate.asInstanceOf[js.Any])).asInstanceOf[IterResultType[M]]
  inline def iterSet[M /* <: QueryMethodTypes */](
    iterResult: default[M],
    _rrule: js.Array[RRule],
    _exrule: js.Array[RRule],
    _rdate: js.Array[js.Date],
    _exdate: js.Array[js.Date],
    tzid: String
  ): IterResultType[M] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterSet")(iterResult.asInstanceOf[js.Any], _rrule.asInstanceOf[js.Any], _exrule.asInstanceOf[js.Any], _rdate.asInstanceOf[js.Any], _exdate.asInstanceOf[js.Any], tzid.asInstanceOf[js.Any])).asInstanceOf[IterResultType[M]]
}
