package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FieldInTableData...
  */
trait IFieldInTableData extends StObject {
  
  /**
    * Comment related to the field.
    */
  var qComment: String
  
  /**
    * List of the derived fields.
    */
  var qDerivedFields: IDerivedFieldsInTableData
  
  /**
    * This property is set to true if the field contains some duplicate values.
    */
  var qHasDuplicates: Boolean
  
  /**
    * This property is set to true if the field contains some Null values.
    */
  var qHasNull: Boolean
  
  /**
    * ...
    */
  var qHasWild: Boolean
  
  /**
    * Number of records that have values (i.e. not NULL) in the field as compared to the total number of records in the table.
    */
  var qInformationDensity: Double
  
  /**
    * This property is set to true if the field contains a synthetic key.
    */
  var qIsSynthetic: Boolean
  
  /**
    * Tells if the field is a key field.
    */
  var qKeyType: TableRecordKeyType
  
  /**
    * Name of the field.
    */
  var qName: String
  
  /**
    * Is shown for fixed records.
    * qOriginalFieldName and qName are identical if no field names are used in the file.
    * qOriginalFieldName differs from qName if embedded file names are used in the file.
    */
  var qOriginalFields: js.Array[String]
  
  /**
    * ...
    */
  var qPresent: Boolean
  
  /**
    * Number of distinct values in the field (in the current table) as
    * compared to the total number of distinct values of this field (in all tables).
    */
  var qSubsetRatio: Double
  
  /**
    * List of tags related to the field.
    */
  var qTags: js.Array[String]
  
  /**
    * Number of values that are non Null.
    */
  var qnNonNulls: Double
  
  /**
    * ...
    */
  var qnPresentDistinctValues: Double
  
  /**
    * Number of rows in the field
    */
  var qnRows: Double
  
  /**
    * Number of distinct values in the field.
    */
  var qnTotalDistinctValues: Double
}
object IFieldInTableData {
  
  inline def apply(
    qComment: String,
    qDerivedFields: IDerivedFieldsInTableData,
    qHasDuplicates: Boolean,
    qHasNull: Boolean,
    qHasWild: Boolean,
    qInformationDensity: Double,
    qIsSynthetic: Boolean,
    qKeyType: TableRecordKeyType,
    qName: String,
    qOriginalFields: js.Array[String],
    qPresent: Boolean,
    qSubsetRatio: Double,
    qTags: js.Array[String],
    qnNonNulls: Double,
    qnPresentDistinctValues: Double,
    qnRows: Double,
    qnTotalDistinctValues: Double
  ): IFieldInTableData = {
    val __obj = js.Dynamic.literal(qComment = qComment.asInstanceOf[js.Any], qDerivedFields = qDerivedFields.asInstanceOf[js.Any], qHasDuplicates = qHasDuplicates.asInstanceOf[js.Any], qHasNull = qHasNull.asInstanceOf[js.Any], qHasWild = qHasWild.asInstanceOf[js.Any], qInformationDensity = qInformationDensity.asInstanceOf[js.Any], qIsSynthetic = qIsSynthetic.asInstanceOf[js.Any], qKeyType = qKeyType.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qOriginalFields = qOriginalFields.asInstanceOf[js.Any], qPresent = qPresent.asInstanceOf[js.Any], qSubsetRatio = qSubsetRatio.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any], qnNonNulls = qnNonNulls.asInstanceOf[js.Any], qnPresentDistinctValues = qnPresentDistinctValues.asInstanceOf[js.Any], qnRows = qnRows.asInstanceOf[js.Any], qnTotalDistinctValues = qnTotalDistinctValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldInTableData]
  }
  
  extension [Self <: IFieldInTableData](x: Self) {
    
    inline def setQComment(value: String): Self = StObject.set(x, "qComment", value.asInstanceOf[js.Any])
    
    inline def setQDerivedFields(value: IDerivedFieldsInTableData): Self = StObject.set(x, "qDerivedFields", value.asInstanceOf[js.Any])
    
    inline def setQHasDuplicates(value: Boolean): Self = StObject.set(x, "qHasDuplicates", value.asInstanceOf[js.Any])
    
    inline def setQHasNull(value: Boolean): Self = StObject.set(x, "qHasNull", value.asInstanceOf[js.Any])
    
    inline def setQHasWild(value: Boolean): Self = StObject.set(x, "qHasWild", value.asInstanceOf[js.Any])
    
    inline def setQInformationDensity(value: Double): Self = StObject.set(x, "qInformationDensity", value.asInstanceOf[js.Any])
    
    inline def setQIsSynthetic(value: Boolean): Self = StObject.set(x, "qIsSynthetic", value.asInstanceOf[js.Any])
    
    inline def setQKeyType(value: TableRecordKeyType): Self = StObject.set(x, "qKeyType", value.asInstanceOf[js.Any])
    
    inline def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    inline def setQOriginalFields(value: js.Array[String]): Self = StObject.set(x, "qOriginalFields", value.asInstanceOf[js.Any])
    
    inline def setQOriginalFieldsVarargs(value: String*): Self = StObject.set(x, "qOriginalFields", js.Array(value*))
    
    inline def setQPresent(value: Boolean): Self = StObject.set(x, "qPresent", value.asInstanceOf[js.Any])
    
    inline def setQSubsetRatio(value: Double): Self = StObject.set(x, "qSubsetRatio", value.asInstanceOf[js.Any])
    
    inline def setQTags(value: js.Array[String]): Self = StObject.set(x, "qTags", value.asInstanceOf[js.Any])
    
    inline def setQTagsVarargs(value: String*): Self = StObject.set(x, "qTags", js.Array(value*))
    
    inline def setQnNonNulls(value: Double): Self = StObject.set(x, "qnNonNulls", value.asInstanceOf[js.Any])
    
    inline def setQnPresentDistinctValues(value: Double): Self = StObject.set(x, "qnPresentDistinctValues", value.asInstanceOf[js.Any])
    
    inline def setQnRows(value: Double): Self = StObject.set(x, "qnRows", value.asInstanceOf[js.Any])
    
    inline def setQnTotalDistinctValues(value: Double): Self = StObject.set(x, "qnTotalDistinctValues", value.asInstanceOf[js.Any])
  }
}
