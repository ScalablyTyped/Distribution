package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/operators/scan", JSImport.Namespace)
@js.native
object operatorsScanMod extends js.Object {
  def scan[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]): js.Any = js.native
  def scan[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T], seed: T): js.Any = js.native
  @JSName("scan")
  def scan_TR[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R]): js.Any = js.native
  @JSName("scan")
  def scan_TR[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R], seed: R): js.Any = js.native
}

