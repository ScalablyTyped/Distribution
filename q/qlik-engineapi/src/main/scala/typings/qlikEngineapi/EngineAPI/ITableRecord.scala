package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TableRecord...
  */
trait ITableRecord extends StObject {
  
  /**
    * Comment related to the table.
    */
  var qComment: String
  
  /**
    * Information about the fields in the table.
    */
  var qFields: js.Array[IFieldInTableData]
  
  /**
    * If set to true, Direct Discovery is used.
    * Direct Discovery fields are not loaded into memory and remain in the external database.
    */
  var qIsDirectDiscovery: Boolean
  
  /**
    * This property is set to true if the table contains a synthetic key.
    */
  var qIsSynthetic: Boolean
  
  /**
    * This property is set to true if the table is loose.
    */
  var qLoose: Boolean
  
  /**
    * Name of the table.
    */
  var qName: String
  
  /**
    * Number of rows in the table.
    */
  var qNoOfRows: Double
  
  /**
    * Information about the position of the table.
    */
  var qPos: IPoint
}
object ITableRecord {
  
  inline def apply(
    qComment: String,
    qFields: js.Array[IFieldInTableData],
    qIsDirectDiscovery: Boolean,
    qIsSynthetic: Boolean,
    qLoose: Boolean,
    qName: String,
    qNoOfRows: Double,
    qPos: IPoint
  ): ITableRecord = {
    val __obj = js.Dynamic.literal(qComment = qComment.asInstanceOf[js.Any], qFields = qFields.asInstanceOf[js.Any], qIsDirectDiscovery = qIsDirectDiscovery.asInstanceOf[js.Any], qIsSynthetic = qIsSynthetic.asInstanceOf[js.Any], qLoose = qLoose.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qNoOfRows = qNoOfRows.asInstanceOf[js.Any], qPos = qPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITableRecord] (val x: Self) extends AnyVal {
    
    inline def setQComment(value: String): Self = StObject.set(x, "qComment", value.asInstanceOf[js.Any])
    
    inline def setQFields(value: js.Array[IFieldInTableData]): Self = StObject.set(x, "qFields", value.asInstanceOf[js.Any])
    
    inline def setQFieldsVarargs(value: IFieldInTableData*): Self = StObject.set(x, "qFields", js.Array(value*))
    
    inline def setQIsDirectDiscovery(value: Boolean): Self = StObject.set(x, "qIsDirectDiscovery", value.asInstanceOf[js.Any])
    
    inline def setQIsSynthetic(value: Boolean): Self = StObject.set(x, "qIsSynthetic", value.asInstanceOf[js.Any])
    
    inline def setQLoose(value: Boolean): Self = StObject.set(x, "qLoose", value.asInstanceOf[js.Any])
    
    inline def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    inline def setQNoOfRows(value: Double): Self = StObject.set(x, "qNoOfRows", value.asInstanceOf[js.Any])
    
    inline def setQPos(value: IPoint): Self = StObject.set(x, "qPos", value.asInstanceOf[js.Any])
  }
}
