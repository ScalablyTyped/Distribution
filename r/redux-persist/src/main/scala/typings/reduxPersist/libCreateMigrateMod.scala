package typings.reduxPersist

import typings.reduxPersist.createMigrateMod.MigrationConfig
import typings.reduxPersist.typesMod.MigrationManifest
import typings.reduxPersist.typesMod.PersistMigrate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCreateMigrateMod {
  
  @JSImport("redux-persist/lib/createMigrate", JSImport.Default)
  @js.native
  def default(migrations: MigrationManifest): PersistMigrate = js.native
  @JSImport("redux-persist/lib/createMigrate", JSImport.Default)
  @js.native
  def default(migrations: MigrationManifest, config: MigrationConfig): PersistMigrate = js.native
}
