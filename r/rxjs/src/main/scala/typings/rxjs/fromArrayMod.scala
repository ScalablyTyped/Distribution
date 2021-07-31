package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromArrayMod {
  
  @JSImport("rxjs/internal/observable/fromArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromArray[T](input: ArrayLike[T]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(input.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  @scala.inline
  def fromArray[T](input: ArrayLike[T], scheduler: SchedulerLike): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(input.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
}
