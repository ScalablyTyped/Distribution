package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Query {
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.QuerySnapshot

  type ObserverOnError = js.Function1[/* err */ SnapshotError, Unit]
  type ObserverOnNext = js.Function1[/* querySnapshot */ QuerySnapshot, Unit]
}
