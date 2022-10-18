package typings.rxjsCompat.anon

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisAccumulatorSeed extends StObject {
  
  def apply[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]): Observable_[T] = js.native
  def apply[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T], seed: T): Observable_[T] = js.native
}
