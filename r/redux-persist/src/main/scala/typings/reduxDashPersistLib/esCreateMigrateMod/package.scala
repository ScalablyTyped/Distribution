package typings
package reduxDashPersistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esCreateMigrateMod {
  type MigrationDispatch = js.Function2[
    /* state */ reduxDashPersistLib.esTypesMod.PersistedState, 
    /* currentVersion */ scala.Double, 
    js.Promise[reduxDashPersistLib.esTypesMod.PersistedState]
  ]
}
