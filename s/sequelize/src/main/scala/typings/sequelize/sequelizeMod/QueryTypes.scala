package typings.sequelize.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
//  Query Types
// ~~~~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/query-types.js
//
trait QueryTypes extends js.Object {
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
}

