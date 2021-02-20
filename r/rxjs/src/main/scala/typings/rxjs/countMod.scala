package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object countMod {
  
  @JSImport("rxjs/internal/operators/count", "count")
  @js.native
  def count[T](): OperatorFunction[T, Double] = js.native
  @JSImport("rxjs/internal/operators/count", "count")
  @js.native
  def count[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, Double] = js.native
}
