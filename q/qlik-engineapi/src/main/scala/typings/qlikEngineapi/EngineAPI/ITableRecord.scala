package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TableRecord...
  */
trait ITableRecord extends js.Object {
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
  @scala.inline
  def apply(
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
}

