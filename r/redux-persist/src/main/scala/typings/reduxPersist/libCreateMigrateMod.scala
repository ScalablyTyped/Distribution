package typings.reduxPersist

import typings.reduxPersist.createMigrateMod.MigrationConfig
import typings.reduxPersist.typesMod.MigrationManifest
import typings.reduxPersist.typesMod.PersistMigrate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/lib/createMigrate", JSImport.Namespace)
@js.native
object libCreateMigrateMod extends js.Object {
  def default(migrations: MigrationManifest): PersistMigrate = js.native
  def default(migrations: MigrationManifest, config: MigrationConfig): PersistMigrate = js.native
}

