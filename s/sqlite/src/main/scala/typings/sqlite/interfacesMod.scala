package typings.sqlite

import typings.sqlite.sqlTemplateStringsMod.SQLStatement
import typings.sqlite.sqlite3Mod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  object IMigrate {
    
    trait MigrationData extends StObject {
      
      var down: String
      
      var id: Double
      
      var name: String
      
      var up: String
    }
    object MigrationData {
      
      inline def apply(down: String, id: Double, name: String, up: String): MigrationData = {
        val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
        __obj.asInstanceOf[MigrationData]
      }
      
      extension [Self <: MigrationData](x: Self) {
        
        inline def setDown(value: String): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
        
        inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setUp(value: String): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      }
    }
    
    trait MigrationFile extends StObject {
      
      var filename: String
      
      var id: Double
      
      var name: String
    }
    object MigrationFile {
      
      inline def apply(filename: String, id: Double, name: String): MigrationFile = {
        val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[MigrationFile]
      }
      
      extension [Self <: MigrationFile](x: Self) {
        
        inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    trait MigrationParams extends StObject {
      
      /**
        * If true, will force the migration API to rollback and re-apply the latest migration over
        * again each time when Node.js app launches.
        */
      var force: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Migration data read from migrations folder. `migrationsPath` will be ignored if this is
        * provided.
        */
      var migrations: js.UndefOr[js.Array[MigrationData]] = js.undefined
      
      /**
        * Path to the migrations folder. Default is `path.join(process.cwd(), 'migrations')`
        */
      var migrationsPath: js.UndefOr[String] = js.undefined
      
      /**
        * Migrations table name. Default is 'migrations'
        */
      var table: js.UndefOr[String] = js.undefined
    }
    object MigrationParams {
      
      inline def apply(): MigrationParams = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MigrationParams]
      }
      
      extension [Self <: MigrationParams](x: Self) {
        
        inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
        
        inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
        
        inline def setMigrations(value: js.Array[MigrationData]): Self = StObject.set(x, "migrations", value.asInstanceOf[js.Any])
        
        inline def setMigrationsPath(value: String): Self = StObject.set(x, "migrationsPath", value.asInstanceOf[js.Any])
        
        inline def setMigrationsPathUndefined: Self = StObject.set(x, "migrationsPath", js.undefined)
        
        inline def setMigrationsUndefined: Self = StObject.set(x, "migrations", js.undefined)
        
        inline def setMigrationsVarargs(value: MigrationData*): Self = StObject.set(x, "migrations", js.Array(value :_*))
        
        inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
        
        inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      }
    }
  }
  
  object ISqlite {
    
    trait Config extends StObject {
      
      /**
        * The database driver. Most will install `sqlite3` and use the `Database` class from it.
        * As long as the library you are using conforms to the `sqlite3` API, you can use it as
        * the driver.
        *
        * @example
        *
        * ```
        * import sqlite from 'sqlite3'
        *
        * const driver = sqlite.Database
        * ```
        */
      var driver: js.Any
      
      /**
        * Valid values are filenames, ":memory:" for an anonymous in-memory
        * database and an empty string for an anonymous disk-based database.
        * Anonymous databases are not persisted and when closing the database
        * handle, their contents are lost.
        */
      var filename: String
      
      /**
        * One or more of sqlite3.OPEN_READONLY, sqlite3.OPEN_READWRITE and
        * sqlite3.OPEN_CREATE. The default value is OPEN_READWRITE | OPEN_CREATE.
        */
      var mode: js.UndefOr[Double] = js.undefined
    }
    object Config {
      
      inline def apply(driver: js.Any, filename: String): Config = {
        val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
        __obj.asInstanceOf[Config]
      }
      
      extension [Self <: Config](x: Self) {
        
        inline def setDriver(value: js.Any): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
        
        inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.sqlite.sqliteStrings.trace
      - typings.sqlite.sqliteStrings.profile
      - typings.sqlite.sqliteStrings.busyTimeout
    */
    trait ConfigureOption extends StObject
    object ConfigureOption {
      
      inline def busyTimeout: typings.sqlite.sqliteStrings.busyTimeout = "busyTimeout".asInstanceOf[typings.sqlite.sqliteStrings.busyTimeout]
      
      inline def profile: typings.sqlite.sqliteStrings.profile = "profile".asInstanceOf[typings.sqlite.sqliteStrings.profile]
      
      inline def trace: typings.sqlite.sqliteStrings.trace = "trace".asInstanceOf[typings.sqlite.sqliteStrings.trace]
    }
    
    trait RunResult[Stmt /* <: Statement */] extends StObject {
      
      /**
        * Number of rows changed.
        *
        * Only contains valid information when the query was a
        * successfully completed UPDATE or DELETE statement.
        */
      var changes: js.UndefOr[Double] = js.undefined
      
      /**
        * Row id of the inserted row.
        *
        * Only contains valid information when the query was a successfully
        * completed INSERT statement.
        */
      var lastID: js.UndefOr[Double] = js.undefined
      
      /**
        * Statement object.
        *
        * It is not possible to run the statement again because it is
        * automatically finalized after running for the first time.
        * Any subsequent attempts to run the statement again will fail.
        */
      var stmt: typings.sqlite.statementMod.Statement[Stmt]
    }
    object RunResult {
      
      inline def apply[Stmt /* <: Statement */](stmt: typings.sqlite.statementMod.Statement[Stmt]): RunResult[Stmt] = {
        val __obj = js.Dynamic.literal(stmt = stmt.asInstanceOf[js.Any])
        __obj.asInstanceOf[RunResult[Stmt]]
      }
      
      extension [Self <: RunResult[?], Stmt /* <: Statement */](x: Self & RunResult[Stmt]) {
        
        inline def setChanges(value: Double): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
        
        inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
        
        inline def setLastID(value: Double): Self = StObject.set(x, "lastID", value.asInstanceOf[js.Any])
        
        inline def setLastIDUndefined: Self = StObject.set(x, "lastID", js.undefined)
        
        inline def setStmt(value: typings.sqlite.statementMod.Statement[Stmt]): Self = StObject.set(x, "stmt", value.asInstanceOf[js.Any])
      }
    }
    
    trait SqlObj extends StObject {
      
      var params: js.UndefOr[js.Array[js.Any]] = js.undefined
      
      var sql: String
    }
    object SqlObj {
      
      inline def apply(sql: String): SqlObj = {
        val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any])
        __obj.asInstanceOf[SqlObj]
      }
      
      extension [Self <: SqlObj](x: Self) {
        
        inline def setParams(value: js.Array[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        inline def setParamsVarargs(value: js.Any*): Self = StObject.set(x, "params", js.Array(value :_*))
        
        inline def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Allows for input of a normal SQL string or
      * `sql-template-strings` object
      */
    type SqlType = SQLStatement | String
  }
}
