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

