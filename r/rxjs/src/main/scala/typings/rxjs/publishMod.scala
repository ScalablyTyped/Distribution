package typings.rxjs

import typings.rxjs.connectableObservableMod.ConnectableObservable
import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.ObservedValueOf
import typings.rxjs.typesMod.OperatorFunction
import typings.rxjs.typesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publishMod {
  
  @JSImport("rxjs/internal/operators/publish", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def publish[T](): UnaryFunction[Observable[T], ConnectableObservable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("publish")().asInstanceOf[UnaryFunction[Observable[T], ConnectableObservable[T]]]
  @scala.inline
  def publish[T](selector: MonoTypeOperatorFunction[T]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("publish")(selector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def publish_TO_ObservableInputAny_OperatorFunction[T, O /* <: ObservableInput[js.Any] */](selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("publish")(selector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
}
