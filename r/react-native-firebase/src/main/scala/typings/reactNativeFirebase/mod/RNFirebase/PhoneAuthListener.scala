package typings.reactNativeFirebase.mod.RNFirebase

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneAuthListener extends js.Object {
  def `catch`(fn: js.Function1[/* error */ Error, Unit]): js.Promise[_] = js.native
  def on(event: String, observer: js.Function1[/* snapshot */ PhoneAuthSnapshot, Unit]): PhoneAuthListener = js.native
  def on(
    event: String,
    observer: js.Function1[/* snapshot */ PhoneAuthSnapshot, Unit],
    errorCb: js.UndefOr[scala.Nothing],
    successCb: js.Function1[/* snapshot */ PhoneAuthSnapshot, Unit]
  ): PhoneAuthListener = js.native
  def on(
    event: String,
    observer: js.Function1[/* snapshot */ PhoneAuthSnapshot, Unit],
    errorCb: js.Function1[/* error */ PhoneAuthError, Unit]
  ): PhoneAuthListener = js.native
  def on(
    event: String,
    observer: js.Function1[/* snapshot */ PhoneAuthSnapshot, Unit],
    errorCb: js.Function1[/* error */ PhoneAuthError, Unit],
    successCb: js.Function1[/* snapshot */ PhoneAuthSnapshot, Unit]
  ): PhoneAuthListener = js.native
  def `then`(fn: js.Function1[/* snapshot */ PhoneAuthSnapshot, Unit]): js.Promise[_] = js.native
}

