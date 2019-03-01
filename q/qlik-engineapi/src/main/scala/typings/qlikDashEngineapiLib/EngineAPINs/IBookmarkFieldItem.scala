package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BookmarkFieldItem...
  */
trait IBookmarkFieldItem extends js.Object {
  /**
    * If set to true, selections within a list object are made in AND mode;
    * If you have a list object that lists all customers, by selecting Customer 1 and
    * Customer 2 while in and-mode, all records that are associated with Customer 1 and Customer 2 are selected.
    *
    * The default value is false; selections within a list object are made in OR mode. If you have a list object
    * that lists all customers, by selecting Customer 1 and Customer 2 while in or-mode, all records that are
    * associated with either Customer 1 or Customer 2 are selected.
    * This parameter is not returned if set to false.
    */
  var qAndMode: scala.Boolean
  /**
    * Name and type of the field
    */
  var qDef: IFieldDefEx
  /**
    * List of excluded values.
    * Either the list of selected values or the list of excluded values is displayed.
    */
  var qExcludedValues: js.Array[IFieldValue]
  /**
    * Indicates if the field is locked.
    * Default is false.
    */
  var qLocked: scala.Boolean
  /**
    * If set to true, the field has always one selection (not 0 and not more than 1).
    * If another value is selected, the previous one is unselected.
    * The default value is false. This parameter is not returned if set to false.
    */
  var qOneAndOnlyOne: scala.Boolean
  /**
    * Information on the selections criteria
    */
  var qSelectInfo: ISelectInfo
  /**
    * List of the selected values
    * Either the list of selected values or the list of excluded values is displayed.
    */
  var qValues: js.Array[IFieldValue]
}

object IBookmarkFieldItem {
  @scala.inline
  def apply(
    qAndMode: scala.Boolean,
    qDef: IFieldDefEx,
    qExcludedValues: js.Array[IFieldValue],
    qLocked: scala.Boolean,
    qOneAndOnlyOne: scala.Boolean,
    qSelectInfo: ISelectInfo,
    qValues: js.Array[IFieldValue]
  ): IBookmarkFieldItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qAndMode")(qAndMode)
    __obj.updateDynamic("qDef")(qDef)
    __obj.updateDynamic("qExcludedValues")(qExcludedValues)
    __obj.updateDynamic("qLocked")(qLocked)
    __obj.updateDynamic("qOneAndOnlyOne")(qOneAndOnlyOne)
    __obj.updateDynamic("qSelectInfo")(qSelectInfo)
    __obj.updateDynamic("qValues")(qValues)
    __obj.asInstanceOf[IBookmarkFieldItem]
  }
}

