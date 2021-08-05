package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
//  Query Types
// ~~~~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/query-types.js
//
trait QueryTypes extends StObject {
  
  // 'BULKUPDATE'
  var BULKDELETE: String
  
  // 'UPDATE'
  var BULKUPDATE: String
  
  // 'BULKDELETE'
  var DELETE: String
  
  // 'SHOWINDEXES'
  var DESCRIBE: String
  
  // 'RAW'
  var FOREIGNKEYS: String
  
  // 'SELECT'
  var INSERT: String
  
  // 'DESCRIBE'
  var RAW: String
  
  var SELECT: String
  
  // 'SHOWTABLES'
  var SHOWINDEXES: String
  
  // 'VERSION'
  var SHOWTABLES: String
  
  // 'INSERT'
  var UPDATE: String
  
  // 'DELETE'
  var UPSERT: String
  
  // 'UPSERT'
  var VERSION: String
}
object QueryTypes {
  
  inline def apply(
    BULKDELETE: String,
    BULKUPDATE: String,
    DELETE: String,
    DESCRIBE: String,
    FOREIGNKEYS: String,
    INSERT: String,
    RAW: String,
    SELECT: String,
    SHOWINDEXES: String,
    SHOWTABLES: String,
    UPDATE: String,
    UPSERT: String,
    VERSION: String
  ): QueryTypes = {
    val __obj = js.Dynamic.literal(BULKDELETE = BULKDELETE.asInstanceOf[js.Any], BULKUPDATE = BULKUPDATE.asInstanceOf[js.Any], DELETE = DELETE.asInstanceOf[js.Any], DESCRIBE = DESCRIBE.asInstanceOf[js.Any], FOREIGNKEYS = FOREIGNKEYS.asInstanceOf[js.Any], INSERT = INSERT.asInstanceOf[js.Any], RAW = RAW.asInstanceOf[js.Any], SELECT = SELECT.asInstanceOf[js.Any], SHOWINDEXES = SHOWINDEXES.asInstanceOf[js.Any], SHOWTABLES = SHOWTABLES.asInstanceOf[js.Any], UPDATE = UPDATE.asInstanceOf[js.Any], UPSERT = UPSERT.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryTypes]
  }
  
  extension [Self <: QueryTypes](x: Self) {
    
    inline def setBULKDELETE(value: String): Self = StObject.set(x, "BULKDELETE", value.asInstanceOf[js.Any])
    
    inline def setBULKUPDATE(value: String): Self = StObject.set(x, "BULKUPDATE", value.asInstanceOf[js.Any])
    
    inline def setDELETE(value: String): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
    
    inline def setDESCRIBE(value: String): Self = StObject.set(x, "DESCRIBE", value.asInstanceOf[js.Any])
    
    inline def setFOREIGNKEYS(value: String): Self = StObject.set(x, "FOREIGNKEYS", value.asInstanceOf[js.Any])
    
    inline def setINSERT(value: String): Self = StObject.set(x, "INSERT", value.asInstanceOf[js.Any])
    
    inline def setRAW(value: String): Self = StObject.set(x, "RAW", value.asInstanceOf[js.Any])
    
    inline def setSELECT(value: String): Self = StObject.set(x, "SELECT", value.asInstanceOf[js.Any])
    
    inline def setSHOWINDEXES(value: String): Self = StObject.set(x, "SHOWINDEXES", value.asInstanceOf[js.Any])
    
    inline def setSHOWTABLES(value: String): Self = StObject.set(x, "SHOWTABLES", value.asInstanceOf[js.Any])
    
    inline def setUPDATE(value: String): Self = StObject.set(x, "UPDATE", value.asInstanceOf[js.Any])
    
    inline def setUPSERT(value: String): Self = StObject.set(x, "UPSERT", value.asInstanceOf[js.Any])
    
    inline def setVERSION(value: String): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
  }
}
