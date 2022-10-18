package typings.rxjsCompat.anon

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisAccumulatorSeedConcurrent extends StObject {
  
  def apply[T, R](accumulator: js.Function2[/* acc */ R, /* value */ T, ObservableInput[R]], seed: R): Observable_[R] = js.native
  def apply[T, R](
    accumulator: js.Function2[/* acc */ R, /* value */ T, ObservableInput[R]],
    seed: R,
    concurrent: Double
  ): Observable_[R] = js.native
}
