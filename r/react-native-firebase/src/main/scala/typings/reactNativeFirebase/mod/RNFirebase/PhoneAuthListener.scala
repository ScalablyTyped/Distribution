package typings.reactNativeFirebase.mod.RNFirebase

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhoneAuthListener extends StObject {
  
  def `catch`(fn: js.Function1[/* error */ Error, Unit]): js.Promise[js.Any] = js.native
  
  def on(event: String, observer: js.Function1[/* snapshot */ PhoneAuthSnapshot, Unit]): PhoneAuthListener = js.native
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
  def on(
    event: String,
    observer: js.Function1[/* snapshot */ PhoneAuthSnapshot, Unit],
    errorCb: Unit,
    successCb: js.Function1[/* snapshot */ PhoneAuthSnapshot, Unit]
  ): PhoneAuthListener = js.native
  
  def `then`(fn: js.Function1[/* snapshot */ PhoneAuthSnapshot, Unit]): js.Promise[js.Any] = js.native
}
