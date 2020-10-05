package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/scan", JSImport.Namespace)
@js.native
object scanMod extends js.Object {
  def scan[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]): MonoTypeOperatorFunction[T] = js.native
  def scan[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T], seed: T): MonoTypeOperatorFunction[T] = js.native
  @JSName("scan")
  def scan_TR_OperatorFunction[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R]): OperatorFunction[T, R] = js.native
  @JSName("scan")
  def scan_TR_OperatorFunction[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R], seed: R): OperatorFunction[T, R] = js.native
}

