package typings.sqlite

import typings.sqlite.interfacesMod.IMigrate.MigrationParams
import typings.sqlite.sqlite3Mod.Database
import typings.sqlite.sqlite3Mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sqlite/build/utils/migrate", JSImport.Namespace)
@js.native
object migrateMod extends js.Object {
  def migrate(db: typings.sqlite.databaseMod.Database[Database, Statement]): js.Promise[Unit] = js.native
  def migrate(db: typings.sqlite.databaseMod.Database[Database, Statement], config: MigrationParams): js.Promise[Unit] = js.native
}

