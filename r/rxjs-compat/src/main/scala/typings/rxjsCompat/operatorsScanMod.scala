package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsScanMod {
  
  @JSImport("rxjs-compat/operators/scan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scan[V, A](accumulator: js.Function3[/* acc */ A | V, /* value */ V, /* index */ Double, A]): OperatorFunction[V, V | A] = ^.asInstanceOf[js.Dynamic].applyDynamic("scan")(accumulator.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[V, V | A]]
  inline def scan[V, A](accumulator: js.Function3[/* acc */ A, /* value */ V, /* index */ Double, A], seed: A): OperatorFunction[V, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[V, A]]
  
  inline def scan_VAS[V, A, S](accumulator: js.Function3[/* acc */ A | S, /* value */ V, /* index */ Double, A], seed: S): OperatorFunction[V, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[V, A]]
}
