package typings.reactNativeFirebase.mod.RNFirebase.functions

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `FirebaseFunctions` represents a Functions app, and is the entry point for
  * all Functions operations.
  */
@js.native
trait Functions
  extends /* key */ StringDictionary[js.Any] {
  
  /**
    * Gets an `HttpsCallable` instance that refers to the function with the given
    * name.
    *
    * @param name The name of the https callable function.
    * @return The `HttpsCallable` instance.
    */
  def httpsCallable[Params, Result](name: String): HttpsCallable[Params, Result] = js.native
  
  /**
    * Changes this instance to point to a Cloud Functions emulator running
    * locally.
    *
    * See https://firebase.google.com/docs/functions/local-emulator
    *
    * @param origin the origin string of the local emulator started via firebase tools
    * "http://10.0.0.8:1337".
    */
  def useFunctionsEmulator(origin: String): js.Promise[Null] = js.native
}
object Functions {
  
  @scala.inline
  def apply(
    httpsCallable: String => HttpsCallable[js.Any, js.Any],
    useFunctionsEmulator: String => js.Promise[Null]
  ): Functions = {
    val __obj = js.Dynamic.literal(httpsCallable = js.Any.fromFunction1(httpsCallable), useFunctionsEmulator = js.Any.fromFunction1(useFunctionsEmulator))
    __obj.asInstanceOf[Functions]
  }
  
  @scala.inline
  implicit class FunctionsOps[Self <: Functions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHttpsCallable(value: String => HttpsCallable[js.Any, js.Any]): Self = this.set("httpsCallable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUseFunctionsEmulator(value: String => js.Promise[Null]): Self = this.set("useFunctionsEmulator", js.Any.fromFunction1(value))
  }
}
