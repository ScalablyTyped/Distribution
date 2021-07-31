package typings.sqlite

import typings.sqlite.interfacesMod.IMigrate.MigrationData
import typings.sqlite.interfacesMod.IMigrate.MigrationParams
import typings.sqlite.sqlite3Mod.Database
import typings.sqlite.sqlite3Mod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object migrateMod {
  
  @JSImport("sqlite/build/utils/migrate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def migrate(db: typings.sqlite.databaseMod.Database[Database, Statement]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("migrate")(db.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def migrate(db: typings.sqlite.databaseMod.Database[Database, Statement], config: MigrationParams): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("migrate")(db.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def readMigrations(): js.Promise[js.Array[MigrationData]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readMigrations")().asInstanceOf[js.Promise[js.Array[MigrationData]]]
  @scala.inline
  def readMigrations(migrationPath: String): js.Promise[js.Array[MigrationData]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readMigrations")(migrationPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MigrationData]]]
}
