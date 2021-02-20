package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObserverStatic extends StObject {
  
  /**
    *  Creates an observer from the specified OnNext, along with optional OnError, and OnCompleted actions.
    * @param {Function} [onNext] Observer's OnNext action implementation.
    * @param {Function} [onError] Observer's OnError action implementation.
    * @param {Function} [onCompleted] Observer's OnCompleted action implementation.
    * @returns {Observer} The observer object implemented using the given actions.
    */
  def create[T](): Observer[T] = js.native
  def create[T](
    onNext: js.UndefOr[scala.Nothing],
    onError: js.UndefOr[scala.Nothing],
    onCompleted: js.Function0[Unit]
  ): Observer[T] = js.native
  def create[T](onNext: js.UndefOr[scala.Nothing], onError: js.Function1[/* exception */ js.Any, Unit]): Observer[T] = js.native
  def create[T](
    onNext: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* exception */ js.Any, Unit],
    onCompleted: js.Function0[Unit]
  ): Observer[T] = js.native
  def create[T](onNext: js.Function1[/* value */ T, Unit]): Observer[T] = js.native
  def create[T](
    onNext: js.Function1[/* value */ T, Unit],
    onError: js.UndefOr[scala.Nothing],
    onCompleted: js.Function0[Unit]
  ): Observer[T] = js.native
  def create[T](onNext: js.Function1[/* value */ T, Unit], onError: js.Function1[/* exception */ js.Any, Unit]): Observer[T] = js.native
  def create[T](
    onNext: js.Function1[/* value */ T, Unit],
    onError: js.Function1[/* exception */ js.Any, Unit],
    onCompleted: js.Function0[Unit]
  ): Observer[T] = js.native
  
  /**
    *  Creates an observer from a notification callback.
    *
    * @static
    * @memberOf Observer
    * @param {Function} handler Action that handles a notification.
    * @returns The observer object that invokes the specified handler using a notification corresponding to each message it receives.
    */
  def fromNotifier[T](handler: js.Function2[/* notification */ Notification[T], /* thisArg */ js.UndefOr[js.Any], Unit]): Observer[T] = js.native
}
