package typings
package rxDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Arg1 extends js.Object {
  // with any function without selector
  def apply[TResult](func: js.Function): js.Function1[/* repeated */ js.Any, rxDashLiteLib.RxNs.Observable[TResult]] = js.native
  // with single result callback without selector
  // with any callback without selector
  def apply[TResult](
    func: js.Function1[
      (/* callback */ js.Function) | (/* callback */ js.Function1[/* result */ TResult, _]), 
      _
    ]
  ): js.Function0[rxDashLiteLib.RxNs.Observable[TResult]] = js.native
  def apply[TResult](
    func: js.Function1[
      (/* callback */ js.Function) | (/* callback */ js.Function1[/* result */ TResult, _]), 
      _
    ],
    context: js.Any
  ): js.Function0[rxDashLiteLib.RxNs.Observable[TResult]] = js.native
  def apply[TResult](func: js.Function, context: js.Any): js.Function1[/* repeated */ js.Any, rxDashLiteLib.RxNs.Observable[TResult]] = js.native
  // with any callback with selector
  def apply[TCallbackResult, TResult](
    func: js.Function1[/* callback */ js.Function, _],
    context: js.Any,
    selector: js.Function1[/* args */ js.Array[TCallbackResult], TResult]
  ): js.Function0[rxDashLiteLib.RxNs.Observable[TResult]] = js.native
  def apply[T1, TResult](
    func: js.Function2[
      /* arg1 */ T1, 
      (/* callback */ js.Function) | (/* callback */ js.Function1[/* result */ TResult, _]), 
      _
    ]
  ): js.Function1[/* arg1 */ T1, rxDashLiteLib.RxNs.Observable[TResult]] = js.native
  def apply[T1, TResult](
    func: js.Function2[
      /* arg1 */ T1, 
      (/* callback */ js.Function) | (/* callback */ js.Function1[/* result */ TResult, _]), 
      _
    ],
    context: js.Any
  ): js.Function1[/* arg1 */ T1, rxDashLiteLib.RxNs.Observable[TResult]] = js.native
  // with any function with selector
  def apply[TCallbackResult, TResult](
    func: js.Function,
    context: js.Any,
    selector: js.Function1[/* args */ js.Array[TCallbackResult], TResult]
  ): js.Function1[/* repeated */ js.Any, rxDashLiteLib.RxNs.Observable[TResult]] = js.native
  def apply[T1, TCallbackResult, TResult](
    func: js.Function2[/* arg1 */ T1, /* callback */ js.Function, _],
    context: js.Any,
    selector: js.Function1[/* args */ js.Array[TCallbackResult], TResult]
  ): js.Function1[/* arg1 */ T1, rxDashLiteLib.RxNs.Observable[TResult]] = js.native
  def apply[T1, T2, TResult](
    func: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      (/* callback */ js.Function) | (/* callback */ js.Function1[/* result */ TResult, _]), 
      _
    ]
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, rxDashLiteLib.RxNs.Observable[TResult]] = js.native
  def apply[T1, T2, TResult](
    func: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      (/* callback */ js.Function) | (/* callback */ js.Function1[/* result */ TResult, _]), 
      _
    ],
    context: js.Any
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, rxDashLiteLib.RxNs.Observable[TResult]] = js.native
  def apply[T1, T2, TCallbackResult, TResult](
    func: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* callback */ js.Function, _],
    context: js.Any,
    selector: js.Function1[/* args */ js.Array[TCallbackResult], TResult]
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, rxDashLiteLib.RxNs.Observable[TResult]] = js.native
  def apply[T1, T2, T3, TResult](
    func: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      (/* callback */ js.Function) | (/* callback */ js.Function1[/* result */ TResult, _]), 
      _
    ]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, rxDashLiteLib.RxNs.Observable[TResult]] = js.native
  def apply[T1, T2, T3, TResult](
    func: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      (/* callback */ js.Function) | (/* callback */ js.Function1[/* result */ TResult, _]), 
      _
    ],
    context: js.Any
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, rxDashLiteLib.RxNs.Observable[TResult]] = js.native
  def apply[T1, T2, T3, TCallbackResult, TResult](
    func: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* callback */ js.Function, _],
    context: js.Any,
    selector: js.Function1[/* args */ js.Array[TCallbackResult], TResult]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, rxDashLiteLib.RxNs.Observable[TResult]] = js.native
}

