package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
//  Query Types
// ~~~~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/query-types.js
//
@js.native
trait QueryTypes extends js.Object {
  
   // 'BULKUPDATE'
  var BULKDELETE: String = js.native
  
   // 'UPDATE'
  var BULKUPDATE: String = js.native
  
   // 'BULKDELETE'
  var DELETE: String = js.native
  
   // 'SHOWINDEXES'
  var DESCRIBE: String = js.native
  
   // 'RAW'
  var FOREIGNKEYS: String = js.native
  
   // 'SELECT'
  var INSERT: String = js.native
  
   // 'DESCRIBE'
  var RAW: String = js.native
  
  var SELECT: String = js.native
  
   // 'SHOWTABLES'
  var SHOWINDEXES: String = js.native
  
   // 'VERSION'
  var SHOWTABLES: String = js.native
  
   // 'INSERT'
  var UPDATE: String = js.native
  
   // 'DELETE'
  var UPSERT: String = js.native
  
   // 'UPSERT'
  var VERSION: String = js.native
}
object QueryTypes {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class QueryTypesOps[Self <: QueryTypes] (val x: Self) extends AnyVal {
    
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
    def setBULKDELETE(value: String): Self = this.set("BULKDELETE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBULKUPDATE(value: String): Self = this.set("BULKUPDATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDELETE(value: String): Self = this.set("DELETE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDESCRIBE(value: String): Self = this.set("DESCRIBE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFOREIGNKEYS(value: String): Self = this.set("FOREIGNKEYS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINSERT(value: String): Self = this.set("INSERT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRAW(value: String): Self = this.set("RAW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSELECT(value: String): Self = this.set("SELECT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHOWINDEXES(value: String): Self = this.set("SHOWINDEXES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHOWTABLES(value: String): Self = this.set("SHOWTABLES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUPDATE(value: String): Self = this.set("UPDATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUPSERT(value: String): Self = this.set("UPSERT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVERSION(value: String): Self = this.set("VERSION", value.asInstanceOf[js.Any])
  }
}
