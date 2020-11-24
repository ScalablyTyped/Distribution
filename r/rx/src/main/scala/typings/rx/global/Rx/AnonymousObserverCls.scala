package typings.rx.global.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Rx.AnonymousObserver")
@js.native
/**
  * Creates an observer from the specified OnNext, OnError, and OnCompleted actions.
  * @param {Any} onNext Observer's OnNext action implementation.
  * @param {Any} onError Observer's OnError action implementation.
  * @param {Any} onCompleted Observer's OnCompleted action implementation.
  */
class AnonymousObserverCls[T] ()
  extends typings.rx.Rx.AnonymousObserver[T] {
  def this(onNext: js.Function1[/* value */ T, Unit]) = this()
  def this(onNext: js.UndefOr[scala.Nothing], onError: js.Function1[/* exception */ js.Any, Unit]) = this()
  def this(onNext: js.Function1[/* value */ T, Unit], onError: js.Function1[/* exception */ js.Any, Unit]) = this()
  def this(
    onNext: js.UndefOr[scala.Nothing],
    onError: js.UndefOr[scala.Nothing],
    onCompleted: js.Function0[Unit]
  ) = this()
  def this(
    onNext: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* exception */ js.Any, Unit],
    onCompleted: js.Function0[Unit]
  ) = this()
  def this(
    onNext: js.Function1[/* value */ T, Unit],
    onError: js.UndefOr[scala.Nothing],
    onCompleted: js.Function0[Unit]
  ) = this()
  def this(
    onNext: js.Function1[/* value */ T, Unit],
    onError: js.Function1[/* exception */ js.Any, Unit],
    onCompleted: js.Function0[Unit]
  ) = this()
}
