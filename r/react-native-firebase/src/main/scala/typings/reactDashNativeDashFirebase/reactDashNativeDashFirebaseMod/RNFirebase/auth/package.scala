package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object auth {
  import typings.reactDashNativeDashFirebase.Anon_Authenticated
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.User

  type AuthListenerCallback = js.Function1[/* user */ OrNull[User], Unit]
  type AuthResult = Anon_Authenticated | Null
  type OrNull[T] = T | Null
}
