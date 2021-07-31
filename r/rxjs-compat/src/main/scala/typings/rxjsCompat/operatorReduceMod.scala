package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorReduceMod {
  
  @JSImport("rxjs-compat/operator/reduce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def reduce[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(accumulator.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def reduce[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T], seed: T): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def reduce_TR[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(accumulator.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def reduce_TR[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R], seed: R): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
