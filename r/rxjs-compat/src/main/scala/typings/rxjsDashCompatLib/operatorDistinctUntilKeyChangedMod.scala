package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/distinctUntilKeyChanged", JSImport.Namespace)
@js.native
object operatorDistinctUntilKeyChangedMod extends js.Object {
  def distinctUntilKeyChanged[T](`this`: rxjsLib.rxjsMod.Observable[T], key: java.lang.String): rxjsLib.rxjsMod.Observable[T] = js.native
  def distinctUntilKeyChanged[T, K /* <: java.lang.String */](
    `this`: rxjsLib.rxjsMod.Observable[T],
    key: K,
    compare: js.Function2[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))) *//* x */ js.Any, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))) *//* y */ js.Any, 
      scala.Boolean
    ]
  ): rxjsLib.rxjsMod.Observable[T] = js.native
}

