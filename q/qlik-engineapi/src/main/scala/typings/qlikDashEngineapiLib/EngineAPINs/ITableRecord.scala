package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qComment: java.lang.String
  /**
           * Information about the fields in the table.
           */
  var qFields: js.Array[IFieldInTableData]
  /**
           * If set to true, Direct Discovery is used.
           * Direct Discovery fields are not loaded into memory and remain in the external database.
           */
  var qIsDirectDiscovery: scala.Boolean
  /**
           * This property is set to true if the table contains a synthetic key.
           */
  var qIsSynthetic: scala.Boolean
  /**
           * This property is set to true if the table is loose.
           */
  var qLoose: scala.Boolean
  /**
           * Name of the table.
           */
  var qName: java.lang.String
  /**
           * Number of rows in the table.
           */
  var qNoOfRows: scala.Double
  /**
           * Information about the position of the table.
           */
  var qPos: IPoint
}

