package typings.sqlite

import typings.sqlite.interfacesMod.IMigrate.MigrationData
import typings.sqlite.interfacesMod.IMigrate.MigrationParams
import typings.sqlite.sqlite3Mod.Database
import typings.sqlite.sqlite3Mod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object migrateMod {
  
  @JSImport("sqlite/build/utils/migrate", "migrate")
  @js.native
  def migrate(db: typings.sqlite.databaseMod.Database[Database, Statement]): js.Promise[Unit] = js.native
  @JSImport("sqlite/build/utils/migrate", "migrate")
  @js.native
  def migrate(db: typings.sqlite.databaseMod.Database[Database, Statement], config: MigrationParams): js.Promise[Unit] = js.native
  
  @JSImport("sqlite/build/utils/migrate", "readMigrations")
  @js.native
  def readMigrations(): js.Promise[js.Array[MigrationData]] = js.native
  @JSImport("sqlite/build/utils/migrate", "readMigrations")
  @js.native
  def readMigrations(migrationPath: String): js.Promise[js.Array[MigrationData]] = js.native
}
