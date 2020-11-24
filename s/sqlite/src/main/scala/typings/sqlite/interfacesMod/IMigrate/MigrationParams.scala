package typings.sqlite.interfacesMod.IMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationParams extends js.Object {
  
  /**
    * If true, will force the migration API to rollback and re-apply the latest migration over
    * again each time when Node.js app launches.
    */
  var force: js.UndefOr[Boolean] = js.native
  
  /**
    * Migration data read from migrations folder. `migrationsPath` will be ignored if this is
    * provided.
    */
  var migrations: js.UndefOr[js.Array[MigrationData]] = js.native
  
  /**
    * Path to the migrations folder. Default is `path.join(process.cwd(), 'migrations')`
    */
  var migrationsPath: js.UndefOr[String] = js.native
  
  /**
    * Migrations table name. Default is 'migrations'
    */
  var table: js.UndefOr[String] = js.native
}
object MigrationParams {
  
  @scala.inline
  def apply(): MigrationParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationParams]
  }
  
  @scala.inline
  implicit class MigrationParamsOps[Self <: MigrationParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setMigrationsVarargs(value: MigrationData*): Self = this.set("migrations", js.Array(value :_*))
    
    @scala.inline
    def setMigrations(value: js.Array[MigrationData]): Self = this.set("migrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMigrations: Self = this.set("migrations", js.undefined)
    
    @scala.inline
    def setMigrationsPath(value: String): Self = this.set("migrationsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMigrationsPath: Self = this.set("migrationsPath", js.undefined)
    
    @scala.inline
    def setTable(value: String): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
  }
}
