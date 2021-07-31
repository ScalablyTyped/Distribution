package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DatabaseInfo...
  */
trait IDatabaseInfo extends StObject {
  
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
  
  @scala.inline
  implicit class IDatabaseInfoMutableBuilder[Self <: IDatabaseInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDBFirst(value: Boolean): Self = StObject.set(x, "qDBFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDBMSName(value: String): Self = StObject.set(x, "qDBMSName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDBSeparator(value: String): Self = StObject.set(x, "qDBSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDBUsage(value: Boolean): Self = StObject.set(x, "qDBUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDefaultDatabase(value: String): Self = StObject.set(x, "qDefaultDatabase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQKeywords(value: js.Array[String]): Self = StObject.set(x, "qKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQKeywordsVarargs(value: String*): Self = StObject.set(x, "qKeywords", js.Array(value :_*))
    
    @scala.inline
    def setQOwnerSeparator(value: String): Self = StObject.set(x, "qOwnerSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQOwnerUsage(value: Boolean): Self = StObject.set(x, "qOwnerUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQQuotePreffix(value: String): Self = StObject.set(x, "qQuotePreffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQQuoteSuffix(value: String): Self = StObject.set(x, "qQuoteSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSpecialChars(value: String): Self = StObject.set(x, "qSpecialChars", value.asInstanceOf[js.Any])
  }
}
