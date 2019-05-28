package typings
package rxDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Arg1Arg2 extends js.Object {
  // with any function without selector
  def apply[T](func: js.Function): js.Function1[/* repeated */ js.Any, rxDashLiteLib.RxNs.Observable[T]] = js.native
  // with any callback without selector
  def apply[TR](func: js.Function1[/* callback */ js.Function, _]): js.Function0[rxDashLiteLib.RxNs.Observable[TR]] = js.native
  def apply[TR](func: js.Function1[/* callback */ js.Function, _], context: js.Any): js.Function0[rxDashLiteLib.RxNs.Observable[TR]] = js.native
  def apply[T](func: js.Function, context: js.Any): js.Function1[/* repeated */ js.Any, rxDashLiteLib.RxNs.Observable[T]] = js.native
  // with any callback with selector
  def apply[TC, TR](
    func: js.Function1[/* callback */ js.Function, _],
    context: js.Any,
    selector: js.Function1[/* results */ js.Array[TC], TR]
  ): js.Function0[rxDashLiteLib.RxNs.Observable[TR]] = js.native
  def apply[T1, TR](func: js.Function2[/* arg1 */ T1, /* callback */ js.Function, _]): js.Function1[/* arg1 */ T1, rxDashLiteLib.RxNs.Observable[TR]] = js.native
  def apply[T1, TR](func: js.Function2[/* arg1 */ T1, /* callback */ js.Function, _], context: js.Any): js.Function1[/* arg1 */ T1, rxDashLiteLib.RxNs.Observable[TR]] = js.native
  // with any function with selector
  def apply[TC, T](func: js.Function, context: js.Any, selector: js.Function1[/* results */ js.Array[TC], T]): js.Function1[/* repeated */ js.Any, rxDashLiteLib.RxNs.Observable[T]] = js.native
  def apply[T1, TC, TR](
    func: js.Function2[/* arg1 */ T1, /* callback */ js.Function, _],
    context: js.Any,
    selector: js.Function1[/* results */ js.Array[TC], TR]
  ): js.Function1[/* arg1 */ T1, rxDashLiteLib.RxNs.Observable[TR]] = js.native
  def apply[T1, T2, TR](func: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* callback */ js.Function, _]): js.Function2[/* arg1 */ T1, /* arg2 */ T2, rxDashLiteLib.RxNs.Observable[TR]] = js.native
  def apply[T1, T2, TR](func: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* callback */ js.Function, _], context: js.Any): js.Function2[/* arg1 */ T1, /* arg2 */ T2, rxDashLiteLib.RxNs.Observable[TR]] = js.native
  def apply[T1, T2, TC, TR](
    func: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* callback */ js.Function, _],
    context: js.Any,
    selector: js.Function1[/* results */ js.Array[TC], TR]
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, rxDashLiteLib.RxNs.Observable[TR]] = js.native
  def apply[T1, T2, T3, T](
    func: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ T, _], 
      _
    ]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, rxDashLiteLib.RxNs.Observable[T]] = js.native
  def apply[T1, T2, T3, T](
    func: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ T, _], 
      _
    ],
    context: js.Any
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, rxDashLiteLib.RxNs.Observable[T]] = js.native
  def apply[T1, T2, T3, TC, TR](
    func: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* callback */ js.Function, _],
    context: js.Any,
    selector: js.Function1[/* results */ js.Array[TC], TR]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, rxDashLiteLib.RxNs.Observable[TR]] = js.native
}

