package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromArrayMod {
  
  @JSImport("rxjs/internal/observable/fromArray", "fromArray")
  @js.native
  def fromArray[T](input: ArrayLike[T]): Observable[T] = js.native
  @JSImport("rxjs/internal/observable/fromArray", "fromArray")
  @js.native
  def fromArray[T](input: ArrayLike[T], scheduler: SchedulerLike): Observable[T] = js.native
}
