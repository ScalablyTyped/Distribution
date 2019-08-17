package typings.reduxDashPersist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esCreateMigrateMod {
  import typings.reduxDashPersist.esTypesMod.PersistedState

  type MigrationDispatch = js.Function2[/* state */ PersistedState, /* currentVersion */ Double, js.Promise[PersistedState]]
}
