package typings.reduxPersist

import typings.reduxPersist.typesMod.MigrationManifest
import typings.reduxPersist.typesMod.PersistMigrate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMigrateMod {
  
  @JSImport("redux-persist/es/createMigrate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(migrations: MigrationManifest): PersistMigrate = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(migrations.asInstanceOf[js.Any]).asInstanceOf[PersistMigrate]
  inline def default(migrations: MigrationManifest, config: MigrationConfig): PersistMigrate = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(migrations.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[PersistMigrate]
  
  trait MigrationConfig extends StObject {
    
    var debug: Boolean
  }
  object MigrationConfig {
    
    inline def apply(debug: Boolean): MigrationConfig = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
      __obj.asInstanceOf[MigrationConfig]
    }
    
    extension [Self <: MigrationConfig](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    }
  }
}
