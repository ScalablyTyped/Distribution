package typings.rxLite.Rx

import typings.rxCore.Rx.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObservable[T] extends StObject {
  
  def subscribe(): IDisposable = js.native
  def subscribe(observer: Observer[T]): IDisposable = js.native
  def subscribe(onNext: js.Function1[/* value */ T, Unit]): IDisposable = js.native
  def subscribe(onNext: js.Function1[/* value */ T, Unit], onError: js.Function1[/* exception */ Any, Unit]): IDisposable = js.native
  def subscribe(
    onNext: js.Function1[/* value */ T, Unit],
    onError: js.Function1[/* exception */ Any, Unit],
    onCompleted: js.Function0[Unit]
  ): IDisposable = js.native
  def subscribe(onNext: js.Function1[/* value */ T, Unit], onError: Unit, onCompleted: js.Function0[Unit]): IDisposable = js.native
  def subscribe(onNext: Unit, onError: js.Function1[/* exception */ Any, Unit]): IDisposable = js.native
  def subscribe(onNext: Unit, onError: js.Function1[/* exception */ Any, Unit], onCompleted: js.Function0[Unit]): IDisposable = js.native
  def subscribe(onNext: Unit, onError: Unit, onCompleted: js.Function0[Unit]): IDisposable = js.native
  
  def subscribeOnCompleted(onCompleted: js.Function0[Unit]): IDisposable = js.native
  def subscribeOnCompleted(onCompleted: js.Function0[Unit], thisArg: Any): IDisposable = js.native
  
  def subscribeOnError(onError: js.Function1[/* exception */ Any, Unit]): IDisposable = js.native
  def subscribeOnError(onError: js.Function1[/* exception */ Any, Unit], thisArg: Any): IDisposable = js.native
  
  def subscribeOnNext(onNext: js.Function1[/* value */ T, Unit]): IDisposable = js.native
  def subscribeOnNext(onNext: js.Function1[/* value */ T, Unit], thisArg: Any): IDisposable = js.native
}
