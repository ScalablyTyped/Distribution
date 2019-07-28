package typings.reduxDashPersist

import typings.reduxDashPersist.esTypesMod.PersistedState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esCreateMigrateMod {
  type MigrationDispatch = js.Function2[/* state */ PersistedState, /* currentVersion */ Double, js.Promise[PersistedState]]
}
