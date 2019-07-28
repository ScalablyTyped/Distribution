package typings.reduxDashPersist

import typings.reduxDashPersist.esCreateMigrateMod.MigrationConfig
import typings.reduxDashPersist.esCreateMigrateMod.MigrationDispatch
import typings.reduxDashPersist.esTypesMod.MigrationManifest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/lib/createMigrate", JSImport.Namespace)
@js.native
object libCreateMigrateMod extends js.Object {
  def createMigrate(migrations: MigrationManifest): MigrationDispatch = js.native
  def createMigrate(migrations: MigrationManifest, config: MigrationConfig): MigrationDispatch = js.native
}

