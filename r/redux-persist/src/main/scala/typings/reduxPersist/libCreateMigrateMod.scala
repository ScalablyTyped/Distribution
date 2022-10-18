package typings.reduxPersist

import typings.reduxPersist.esCreateMigrateMod.MigrationConfig
import typings.reduxPersist.esTypesMod.MigrationManifest
import typings.reduxPersist.esTypesMod.PersistMigrate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCreateMigrateMod {
  
  @JSImport("redux-persist/lib/createMigrate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(migrations: MigrationManifest): PersistMigrate = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(migrations.asInstanceOf[js.Any]).asInstanceOf[PersistMigrate]
  inline def default(migrations: MigrationManifest, config: MigrationConfig): PersistMigrate = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(migrations.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[PersistMigrate]
}
