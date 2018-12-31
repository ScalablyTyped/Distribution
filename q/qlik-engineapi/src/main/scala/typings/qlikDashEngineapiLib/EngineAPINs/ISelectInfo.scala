package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SelectInfo...
  */
trait ISelectInfo extends js.Object {
  /**
    * List of information about ranges for selections.
    */
  var qContinuousRangeInfo: js.Array[IRange]
  /**
    * Gives information about the formatting of the range.
    * This parameter is used when performing range selections or text searches in dimensions.
    */
  var qNumberFormat: IFieldAttributes
  /**
    * Highest value of the search range.
    * This parameter is used when performing range selections or text searches in dimensions.
    * Default is Null.
    */
  var qRangeHi: scala.Double
  /**
    * This parameter is used when performing range selections or text searches in measures.
    * Gives information about the range of selections.
    * bool SoftLock = false;
    */
  var qRangeInfo: js.Array[INxRangeSelectInfo]
  /**
    * Lower value of the search range.
    * This parameter is used when performing range selections or text searches in dimensions.
    * Default is Null.
    */
  var qRangeLo: scala.Double
  /**
    * Text search string.
    * Everything that matches the text is selected.
    * >> This parameter is optional.
    */
  var qTextSearch: js.UndefOr[java.lang.String] = js.undefined
}

