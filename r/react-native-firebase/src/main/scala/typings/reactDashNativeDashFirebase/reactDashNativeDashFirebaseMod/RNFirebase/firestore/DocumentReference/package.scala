package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DocumentReference {
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.DocumentSnapshot
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Query.SnapshotError

  type ObserverOnError = js.Function1[/* err */ SnapshotError, Unit]
  type ObserverOnNext = js.Function1[/* documentSnapshot */ DocumentSnapshot, Unit]
}
