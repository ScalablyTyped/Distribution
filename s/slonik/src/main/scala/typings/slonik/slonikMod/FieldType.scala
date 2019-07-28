package typings.slonik.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldType extends js.Object {
  var columnID: Double
  var dataTypeID: Double
  var dataTypeModifier: Double
  var dataTypeSize: Double
  var format: String
  var name: String
  var tableID: Double
}

object FieldType {
  @scala.inline
  def apply(
    columnID: Double,
    dataTypeID: Double,
    dataTypeModifier: Double,
    dataTypeSize: Double,
    format: String,
    name: String,
    tableID: Double
  ): FieldType = {
    val __obj = js.Dynamic.literal(columnID = columnID, dataTypeID = dataTypeID, dataTypeModifier = dataTypeModifier, dataTypeSize = dataTypeSize, format = format, name = name, tableID = tableID)
  
    __obj.asInstanceOf[FieldType]
  }
}

