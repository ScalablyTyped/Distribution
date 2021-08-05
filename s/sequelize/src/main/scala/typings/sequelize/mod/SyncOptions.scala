package typings.sequelize.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sync Options
  *
  * @see Sequelize.sync
  */
trait SyncOptions extends StObject {
  
  /**
    * Alters tables to fit models. Not recommended for production use. Deletes data in columns
    * that were removed or had their type changed in the model.
    */
  var alter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If force is true, each DAO will do DROP TABLE IF EXISTS ..., before it tries to create its own table
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If hooks is true then beforeSync, afterSync, beforBulkSync, afterBulkSync hooks will be called
    */
  var hooks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function that logs sql queries, or false for no logging
    */
  var logging: js.UndefOr[js.Function | Boolean] = js.undefined
  
  /**
    * Match a regex against the database name before syncing, a safety check for cases where force: true is
    * used in tests but not live code
    */
  var `match`: js.UndefOr[RegExp] = js.undefined
  
  /**
    * The schema that the tables should be created in. This can be overriden for each table in sequelize.define
    */
  var schema: js.UndefOr[String] = js.undefined
  
  /**
    * An optional parameter to specify the schema search_path (Postgres only)
    */
  var searchPath: js.UndefOr[String] = js.undefined
}
object SyncOptions {
  
  inline def apply(): SyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncOptions]
  }
  
  extension [Self <: SyncOptions](x: Self) {
    
    inline def setAlter(value: Boolean): Self = StObject.set(x, "alter", value.asInstanceOf[js.Any])
    
    inline def setAlterUndefined: Self = StObject.set(x, "alter", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setHooks(value: Boolean): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setLogging(value: js.Function | Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setMatch(value: RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSearchPath(value: String): Self = StObject.set(x, "searchPath", value.asInstanceOf[js.Any])
    
    inline def setSearchPathUndefined: Self = StObject.set(x, "searchPath", js.undefined)
  }
}
