package typings.reduxPersist.createMigrateMod

import typings.reduxPersist.typesMod.MigrationManifest
import typings.reduxPersist.typesMod.PersistMigrate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-persist/es/createMigrate", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(migrations: MigrationManifest): PersistMigrate = js.native
  def apply(migrations: MigrationManifest, config: MigrationConfig): PersistMigrate = js.native
}
