package typings.reduxPersist

import typings.reduxPersist.typesMod.MigrationManifest
import typings.reduxPersist.typesMod.PersistMigrate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMigrateMod {
  
  @JSImport("redux-persist/es/createMigrate", JSImport.Default)
  @js.native
  def default(migrations: MigrationManifest): PersistMigrate = js.native
  @JSImport("redux-persist/es/createMigrate", JSImport.Default)
  @js.native
  def default(migrations: MigrationManifest, config: MigrationConfig): PersistMigrate = js.native
  
  @js.native
  trait MigrationConfig extends StObject {
    
    var debug: Boolean = js.native
  }
  object MigrationConfig {
    
    @scala.inline
    def apply(debug: Boolean): MigrationConfig = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
      __obj.asInstanceOf[MigrationConfig]
    }
    
    @scala.inline
    implicit class MigrationConfigMutableBuilder[Self <: MigrationConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    }
  }
}
