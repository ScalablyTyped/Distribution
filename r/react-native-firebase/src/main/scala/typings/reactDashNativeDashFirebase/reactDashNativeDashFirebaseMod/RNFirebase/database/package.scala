package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object database {
  import typings.std.Error

  type QueryErrorCallback = js.Function1[/* e */ Error, Unit]
  type QuerySuccessCallback = js.Function2[/* snapshot */ DataSnapshot, /* previousChildId */ js.UndefOr[String | Null], Unit]
}
