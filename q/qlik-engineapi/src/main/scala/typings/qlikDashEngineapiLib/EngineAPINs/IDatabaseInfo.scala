package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qDBFirst: scala.Boolean
  /**
    * Name of the product accessed by the provider
    */
  var qDBMSName: java.lang.String
  /**
    * Character string used after the database name
    * Example with separator ".":
    * FROM LinkedTablesData.dbo.Months
    * Where:
    *       - LinkedTablesData is the database name
    *       - dbo is the owner name
    *       - Months is the table name
    */
  var qDBSeparator: java.lang.String
  /**
    * If set to true, it means that the data source contains some databases.
    */
  var qDBUsage: scala.Boolean
  /**
    * Name of the default database
    */
  var qDefaultDatabase: java.lang.String
  /**
    * List of the script keywords
    */
  var qKeywords: js.Array[java.lang.String]
  /**
    * Character string used after the owner name
    * Example with separator ".":
    * FROM LinkedTablesData.dbo.Months
    * Where:
    *       - LinkedTablesData is the database name
    *       - dbo is the owner name
    *       - Months is the table name
    */
  var qOwnerSeparator: java.lang.String
  /**
    * If set to true, it means that the data source contains some owners.
    */
  var qOwnerUsage: scala.Boolean
  /**
    * Prefix used with field, database or owner names that contain special characters or keywords.
    */
  var qQuotePreffix: java.lang.String
  /**
    * Suffix used with field, database or owner names that contain special characters or keywords.
    */
  var qQuoteSuffix: java.lang.String
  /**
    * List of the special characters
    */
  var qSpecialChars: java.lang.String
}

object IDatabaseInfo {
  @scala.inline
  def apply(
    qDBFirst: scala.Boolean,
    qDBMSName: java.lang.String,
    qDBSeparator: java.lang.String,
    qDBUsage: scala.Boolean,
    qDefaultDatabase: java.lang.String,
    qKeywords: js.Array[java.lang.String],
    qOwnerSeparator: java.lang.String,
    qOwnerUsage: scala.Boolean,
    qQuotePreffix: java.lang.String,
    qQuoteSuffix: java.lang.String,
    qSpecialChars: java.lang.String
  ): IDatabaseInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qDBFirst")(qDBFirst)
    __obj.updateDynamic("qDBMSName")(qDBMSName)
    __obj.updateDynamic("qDBSeparator")(qDBSeparator)
    __obj.updateDynamic("qDBUsage")(qDBUsage)
    __obj.updateDynamic("qDefaultDatabase")(qDefaultDatabase)
    __obj.updateDynamic("qKeywords")(qKeywords)
    __obj.updateDynamic("qOwnerSeparator")(qOwnerSeparator)
    __obj.updateDynamic("qOwnerUsage")(qOwnerUsage)
    __obj.updateDynamic("qQuotePreffix")(qQuotePreffix)
    __obj.updateDynamic("qQuoteSuffix")(qQuoteSuffix)
    __obj.updateDynamic("qSpecialChars")(qSpecialChars)
    __obj.asInstanceOf[IDatabaseInfo]
  }
}

