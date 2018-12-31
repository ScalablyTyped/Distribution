package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qComment: java.lang.String
  /**
    * List of the derived fields.
    */
  var qDerivedFields: IDerivedFieldsInTableData
  /**
    * This property is set to true if the field contains some duplicate values.
    */
  var qHasDuplicates: scala.Boolean
  /**
    * This property is set to true if the field contains some Null values.
    */
  var qHasNull: scala.Boolean
  /**
    * ...
    */
  var qHasWild: scala.Boolean
  /**
    * Number of records that have values (i.e. not NULL) in the field as compared to the total number of records in the table.
    */
  var qInformationDensity: scala.Double
  /**
    * This property is set to true if the field contains a synthetic key.
    */
  var qIsSynthetic: scala.Boolean
  /**
    * Tells if the field is a key field.
    */
  var qKeyType: TableRecordKeyType
  /**
    * Name of the field.
    */
  var qName: java.lang.String
  /**
    * Is shown for fixed records.
    * qOriginalFieldName and qName are identical if no field names are used in the file.
    * qOriginalFieldName differs from qName if embedded file names are used in the file.
    */
  var qOriginalFields: js.Array[java.lang.String]
  /**
    * ...
    */
  var qPresent: scala.Boolean
  /**
    * Number of distinct values in the field (in the current table) as
    * compared to the total number of distinct values of this field (in all tables).
    */
  var qSubsetRatio: scala.Double
  /**
    * List of tags related to the field.
    */
  var qTags: js.Array[java.lang.String]
  /**
    * Number of values that are non Null.
    */
  var qnNonNulls: scala.Double
  /**
    * ...
    */
  var qnPresentDistinctValues: scala.Double
  /**
    * Number of rows in the field
    */
  var qnRows: scala.Double
  /**
    * Number of distinct values in the field.
    */
  var qnTotalDistinctValues: scala.Double
}

