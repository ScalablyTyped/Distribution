package typings
package reduxDashPersistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esTypesMod {
  type MigrationManifest = org.scalablytyped.runtime.StringDictionary[js.Function1[/* state */ PersistedState, PersistedState]]
  type PersistorAction = RehydrateAction[js.Any] | RegisterAction
  type PersistorSubscribeCallback = js.Function0[js.Any]
  type RehydrateErrorType = js.Any
}
