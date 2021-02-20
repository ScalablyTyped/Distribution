package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object singleMod {
  
  @JSImport("rxjs/internal/operators/single", "single")
  @js.native
  def single[T](): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/single", "single")
  @js.native
  def single[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): MonoTypeOperatorFunction[T] = js.native
}
