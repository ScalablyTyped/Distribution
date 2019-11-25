package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FieldInTableData...
  */
trait IFieldInTableData extends js.Object {
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
  @scala.inline
  def apply(
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
}

