package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DataTableEx...
  */
trait IDataTableEx extends js.Object {
  /**
    * List of the fields in the table.
    */
  var qFields: js.Array[IDataField]
  /**
    * List of format specification items, within brackets.
    * Examples of specification items:
    *
    *    - file type
    *    - embedded labels, no labels
    *    - table is <table name>
    */
  var qFormatSpec: java.lang.String
  /**
    * Name of the table.
    */
  var qName: java.lang.String
}

object IDataTableEx {
  @scala.inline
  def apply(qFields: js.Array[IDataField], qFormatSpec: java.lang.String, qName: java.lang.String): IDataTableEx = {
    val __obj = js.Dynamic.literal(qFields = qFields, qFormatSpec = qFormatSpec, qName = qName)
  
    __obj.asInstanceOf[IDataTableEx]
  }
}

