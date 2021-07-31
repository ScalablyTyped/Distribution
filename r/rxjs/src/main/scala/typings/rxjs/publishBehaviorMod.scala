package typings.rxjs

import typings.rxjs.connectableObservableMod.ConnectableObservable
import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publishBehaviorMod {
  
  @JSImport("rxjs/internal/operators/publishBehavior", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def publishBehavior[T](value: T): UnaryFunction[Observable[T], ConnectableObservable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishBehavior")(value.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[Observable[T], ConnectableObservable[T]]]
}
