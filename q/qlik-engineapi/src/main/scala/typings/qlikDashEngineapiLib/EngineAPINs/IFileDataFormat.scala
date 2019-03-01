package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FileDataFormat...
  */
trait IFileDataFormat extends js.Object {
  /**
    * Character set used in the file.
    */
  var qCodePage: scala.Double
  /**
    * String that marks the beginning of the comment line.
    * Example: # or //
    * The engine ignores the commented lines during the data load.
    * This property is only used for delimited files.
    */
  var qComment: java.lang.String
  /**
    * Information about the delimiter.
    * This property is used for delimited files.
    */
  var qDelimiter: IDelimiterInfo
  /**
    * Positions of the field breaks in the table.
    * This property is used for fixed record data files.
    */
  var qFixedWidthDelimiters: java.lang.String
  /**
    * Size of the header.
    * Example: If the header size is 2, the first two rows in the file are considered as header and not as data.
    * The header can contain the field names.
    */
  var qHeaderSize: scala.Double
  /**
    * Is set to true, the end-of-file character is not taken into account during reload.
    * This property is used for delimited files and fixed record data files.
    */
  var qIgnoreEOF: scala.Boolean
  /**
    * One of:
    *
    * - embedded labels (field names are present in the file)
    * - no labels
    * - explicit labels (for DIFfiles)
    */
  var qLabel: java.lang.String
  /**
    * One of:
    *
    * - None (no quotes)
    * - MSQ (Modern Style Quoting)
    * - Standard (quotes " " or ' ' can be used, but only if they
    * are the first and last non blank characters of a field value.)
    * This property is used for delimited files.
    */
  var qQuote: java.lang.String
  /**
    * Record length.
    * Each record (row of data) contains a number of columns with a fixed field size.
    * This property is used for fixed record data files.
    */
  var qRecordSize: scala.Double
  /**
    * Number of spaces that one tab character represents in the table file.
    * This property is used for fixed record data files.
    */
  var qTabSize: scala.Double
  /**
    * Type of the file.
    */
  var qType: FileDataFormatType
}

object IFileDataFormat {
  @scala.inline
  def apply(
    qCodePage: scala.Double,
    qComment: java.lang.String,
    qDelimiter: IDelimiterInfo,
    qFixedWidthDelimiters: java.lang.String,
    qHeaderSize: scala.Double,
    qIgnoreEOF: scala.Boolean,
    qLabel: java.lang.String,
    qQuote: java.lang.String,
    qRecordSize: scala.Double,
    qTabSize: scala.Double,
    qType: FileDataFormatType
  ): IFileDataFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qCodePage")(qCodePage)
    __obj.updateDynamic("qComment")(qComment)
    __obj.updateDynamic("qDelimiter")(qDelimiter)
    __obj.updateDynamic("qFixedWidthDelimiters")(qFixedWidthDelimiters)
    __obj.updateDynamic("qHeaderSize")(qHeaderSize)
    __obj.updateDynamic("qIgnoreEOF")(qIgnoreEOF)
    __obj.updateDynamic("qLabel")(qLabel)
    __obj.updateDynamic("qQuote")(qQuote)
    __obj.updateDynamic("qRecordSize")(qRecordSize)
    __obj.updateDynamic("qTabSize")(qTabSize)
    __obj.updateDynamic("qType")(qType)
    __obj.asInstanceOf[IFileDataFormat]
  }
}

