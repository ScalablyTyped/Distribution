package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object functions {
  import org.scalablytyped.runtime.StringDictionary

  /**
    * An HttpsCallable is a reference to a "callable" http trigger in
    * Google Cloud Functions.
    */
  type HttpsCallable[Params, Result] = (js.Function1[/* data */ Params, js.Promise[HttpsCallableResult[Result]]]) | js.Function0[js.Promise[HttpsCallableResult[Result]]]
  type HttpsErrorCode = StringDictionary[FunctionsErrorCode]
}
