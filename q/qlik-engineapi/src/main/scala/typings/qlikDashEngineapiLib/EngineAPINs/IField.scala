package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class describes all the methods that apply at field level.
  * The handle member in the JSON request for all methods listed in this section is the handle of the field.
  */
@js.native
trait IField extends js.Object {
  /**
    * Clears the selections in a specific field.
    *
    * Note: The operation is successful if qReturn is set to true.
    * @returns - A promise true or false
    */
  def clear(): js.Promise[scala.Boolean] = js.native
  /**
    * Maintains the selections in the current field while clearing the selections in the other fields.
    * @param qSoftLock - Set to true to ignore locks; in that case, locked fields can be selected.
    * The default value is false.
    * This parameter is optional.
    * @returns - A promise of a Qlik engine reply.
    */
  def clearAllButThis(): js.Promise[scala.Boolean] = js.native
  def clearAllButThis(qSoftLock: scala.Boolean): js.Promise[scala.Boolean] = js.native
  /**
    * Returns the AND mode status of a field.
    *
    * Note: The field is in AND mode if qReturn is set to true.
    * @returns - A promise true or false
    */
  def getAndMode(): js.Promise[scala.Boolean] = js.native
  /**
    * Retrieves the number of distinct values in a field.
    *
    * Note: The field is in AND mode if qReturn is set to true.
    * @returns - A promise a number <cardinal value>
    */
  def getCardinal(): js.Promise[scala.Double] = js.native
  /**
    * Gets the properties of a field.
    * @returns - A promise of NxFieldProperties
    */
  def getNxProperties(): js.Promise[INxFieldProperties] = js.native
  /**
    * Locks all selected values of a specific field.
    *
    * Note: The operation is successful if Return is set to true.
    * @returns - A promise true or false
    */
  def lock(): js.Promise[scala.Boolean] = js.native
  /**
    * Selects some values in a field, by entering the element numbers related to the values to select.
    *
    * Note: The operation is successful if qReturn is set to true.
    * @param qValues - Indexes (or element numbers) of the values to select.
    * @param qToggleMode - Set to true to keep any selections present in the list object.
    * If this parameter is set to false, selections made before accepting the list object search become alternative.
    * >> This parameter is mandatory.
    * @param qSoftLock - Set to true to ignore locks; in that case, locked fields can be selected.
    * The default value is false.
    * This parameter is optional.
    * @returns - A promise of a Qlik engine reply.
    */
  def lowLevelSelect(qValues: js.Array[scala.Double], qToggleMode: scala.Boolean): js.Promise[scala.Boolean] = js.native
  def lowLevelSelect(qValues: js.Array[scala.Double], qToggleMode: scala.Boolean, qSoftLock: scala.Boolean): js.Promise[scala.Boolean] = js.native
  /**
    * Selects field values matching a search string.
    *
    * Note: In a field that contains at least one selected value,
    * the values that are neither selected nor excluded are alternatives values.
    * @param qMatch - String to search for. Can contain wild cards or numeric search criteria.
    * @param qSoftLock - Set to true to ignore locks; in that case, locked fields can be selected.
    * The default value is false.
    * This parameter is optional.
    * @param qExcludedValuesMode - Include excluded values in search. This parameter is optional.
    * @returns - A promise true or false
    */
  def select(qMatch: java.lang.String): js.Promise[scala.Boolean] = js.native
  def select(qMatch: java.lang.String, qSoftLock: scala.Boolean): js.Promise[scala.Boolean] = js.native
  def select(qMatch: java.lang.String, qSoftLock: scala.Boolean, qExcludedValuesMode: scala.Double): js.Promise[scala.Boolean] = js.native
  /**
    * Selects all values of a field. Excluded values are also selected.
    *
    * Note: The operation is successful if qReturn is set to true.
    * @param qSoftLock - Set to true to ignore locks; in that case, locked fields can be selected.
    * The default value is false.
    * This parameter is optional.
    * @returns - A promise true or false
    */
  def selectAll(): js.Promise[scala.Boolean] = js.native
  def selectAll(qSoftLock: scala.Boolean): js.Promise[scala.Boolean] = js.native
  /**
    * Selects all alternatives values in a specific field.
    *
    * Note: In a field that contains at least one selected value, the values that are neither selected nor excluded are alternatives values.
    * @param qSoftLock - Set to true to ignore locks; in that case, locked fields can be selected.
    * The default value is false.
    * This parameter is optional.
    * @returns - A promise true or false
    */
  def selectAlternative(): js.Promise[scala.Boolean] = js.native
  def selectAlternative(qSoftLock: scala.Boolean): js.Promise[scala.Boolean] = js.native
  /**
    * Inverts the current selections.
    *
    * Note: In a field that contains at least one selected value, the values that are neither selected nor excluded are alternatives values.
    * @param qSoftLock - Set to true to ignore locks; in that case, locked fields can be selected.
    * The default value is false.
    * This parameter is optional.
    * @returns - A promise true or false
    */
  def selectExcluded(): js.Promise[scala.Boolean] = js.native
  def selectExcluded(qSoftLock: scala.Boolean): js.Promise[scala.Boolean] = js.native
  /**
    * Selects all possible values in a specific field.
    *
    * Note: The operation is successful if qReturn is set to true.
    * @param qSoftLock - Set to true to ignore locks; in that case, locked fields can be selected.
    * The default value is false.
    * This parameter is optional.
    * @returns - A promise true or false
    */
  def selectPossible(): js.Promise[scala.Boolean] = js.native
  def selectPossible(qSoftLock: scala.Boolean): js.Promise[scala.Boolean] = js.native
  /**
    * Selects some values in a field, by entering the values to select.
    *
    * Note: The operation is successful if qReturn is set to true.
    * @param qFieldValues - List of the values to select.
    * @param qToggleMode - The default value is false. This parameter is optional.
    * @param qSoftLock - Set to true to ignore locks; in that case, locked fields can be selected.
    * The default value is false.
    * This parameter is optional.
    * @returns - A promise true or false
    */
  def selectValues(qFieldValues: js.Array[IFieldValue]): js.Promise[scala.Boolean] = js.native
  def selectValues(qFieldValues: js.Array[IFieldValue], qToggleMode: scala.Boolean): js.Promise[scala.Boolean] = js.native
  def selectValues(qFieldValues: js.Array[IFieldValue], qToggleMode: scala.Boolean, qSoftLock: scala.Boolean): js.Promise[scala.Boolean] = js.native
  /**
    * Sets a field in the AND mode.
    *
    * Note: The operation is successful if Return is set to true.
    * @param qAndMode - Specifies if the AND mode applies to the field.
    * Set this parameter to true to enter the AND mode.
    * >> This parameter is mandatory.
    * @returns - A promise of a Qlik engine reply.
    */
  def setAndMode(qAndMode: scala.Boolean): js.Promise[scala.Unit] = js.native
  /**
    * Sets some properties to a field.
    *
    * In addition to the properties described below, dynamic properties can be added.
    * @param qProperties - Information about the properties of the field
    * @returns - A promise of a Qlik engine reply.
    */
  def setNxProperties(qProperties: INxFieldProperties): js.Promise[scala.Unit] = js.native
  /**
    * Toggle selects field values matching a search string.
    *
    * In addition to the properties described below, dynamic properties can be added.
    * @param qMatch - String to search for. Can contain wild cards or numeric search criteria.
    * @param qSoftLock - Set to true to ignore locks; in that case, locked fields can be selected.
    * The default value is false.
    * This parameter is optional.
    * @param qExcludedValuesMode - Include excluded values in search.
    * This parameter is optional.
    * @returns - A promise true or false
    */
  def toggleSelect(qMatch: java.lang.String): js.Promise[scala.Boolean] = js.native
  def toggleSelect(qMatch: java.lang.String, qSoftLock: scala.Boolean): js.Promise[scala.Boolean] = js.native
  def toggleSelect(qMatch: java.lang.String, qSoftLock: scala.Boolean, qExcludedValuesMode: scala.Double): js.Promise[scala.Boolean] = js.native
  /**
    * Unlocks all selected values of a specific field if the target (or handle ) is a field.
    * @returns - A promise true or false
    */
  def unlock(): js.Promise[scala.Boolean] = js.native
}

