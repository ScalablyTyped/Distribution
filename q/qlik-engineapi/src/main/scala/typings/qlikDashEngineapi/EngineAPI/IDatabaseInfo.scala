package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DatabaseInfo...
  */
trait IDatabaseInfo extends js.Object {
  /**
    *  If set to true, it means that the database is displayed first, before the owners and tables.
    */
  var qDBFirst: Boolean
  /**
    * Name of the product accessed by the provider
    */
  var qDBMSName: String
  /**
    * Character string used after the database name
    * Example with separator ".":
    * FROM LinkedTablesData.dbo.Months
    * Where:
    *       - LinkedTablesData is the database name
    *       - dbo is the owner name
    *       - Months is the table name
    */
  var qDBSeparator: String
  /**
    * If set to true, it means that the data source contains some databases.
    */
  var qDBUsage: Boolean
  /**
    * Name of the default database
    */
  var qDefaultDatabase: String
  /**
    * List of the script keywords
    */
  var qKeywords: js.Array[String]
  /**
    * Character string used after the owner name
    * Example with separator ".":
    * FROM LinkedTablesData.dbo.Months
    * Where:
    *       - LinkedTablesData is the database name
    *       - dbo is the owner name
    *       - Months is the table name
    */
  var qOwnerSeparator: String
  /**
    * If set to true, it means that the data source contains some owners.
    */
  var qOwnerUsage: Boolean
  /**
    * Prefix used with field, database or owner names that contain special characters or keywords.
    */
  var qQuotePreffix: String
  /**
    * Suffix used with field, database or owner names that contain special characters or keywords.
    */
  var qQuoteSuffix: String
  /**
    * List of the special characters
    */
  var qSpecialChars: String
}

object IDatabaseInfo {
  @scala.inline
  def apply(
    qDBFirst: Boolean,
    qDBMSName: String,
    qDBSeparator: String,
    qDBUsage: Boolean,
    qDefaultDatabase: String,
    qKeywords: js.Array[String],
    qOwnerSeparator: String,
    qOwnerUsage: Boolean,
    qQuotePreffix: String,
    qQuoteSuffix: String,
    qSpecialChars: String
  ): IDatabaseInfo = {
    val __obj = js.Dynamic.literal(qDBFirst = qDBFirst.asInstanceOf[js.Any], qDBMSName = qDBMSName.asInstanceOf[js.Any], qDBSeparator = qDBSeparator.asInstanceOf[js.Any], qDBUsage = qDBUsage.asInstanceOf[js.Any], qDefaultDatabase = qDefaultDatabase.asInstanceOf[js.Any], qKeywords = qKeywords.asInstanceOf[js.Any], qOwnerSeparator = qOwnerSeparator.asInstanceOf[js.Any], qOwnerUsage = qOwnerUsage.asInstanceOf[js.Any], qQuotePreffix = qQuotePreffix.asInstanceOf[js.Any], qQuoteSuffix = qQuoteSuffix.asInstanceOf[js.Any], qSpecialChars = qSpecialChars.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDatabaseInfo]
  }
}

