package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class describes all the methods that apply at generic variable level.
  * The handle member in the JSON request for all methods listed in this section is the handle of the generic variable.
  */
trait IGenericVariable
  extends qlikDashEngineapiLib.enigmaJSNs.IGeneratedAPI {
  /**
    * Applies a patch to the properties of a variable. Allows an update to some of the properties.
    *
    * Note: Applying a patch takes less time than resetting all the properties.
    * @param qPatches - Array of NxPatch
    */
  def applyPatches(qPatches: js.Array[INxPatch]): js.Promise[scala.Unit]
  /**
    * Returns the type and identifier of the object.
    */
  def getInfo(): js.Promise[INxInfo]
  /**
    * Evaluates an object and displays its properties including the dynamic properties.
    * If the member delta is set to true in the request object, only the delta is evaluated.
    * @returns GenericVariableLayout Information on the object
    */
  def getLayout(): js.Promise[IGenericVariableLayout]
  /**
    * Shows the properties of an object.
    *
    * Note: If the member delta is set to true in the request, only the delta is retrieved.
    * @returns GenericVariableProperties Information about the generic object
    */
  def getProperties(): js.Promise[IGenericVariableProperties]
  /**
    * Sets the value of a dual variable.
    *
    * Note: These changes are not persistent. They only last the duration of the engine session.
    * @param qText - String representation of a dual value. Set this parameter to "",
    * if the string representation is to be Null.
    * >> This parameter is mandatory.
    * @param qNum - Numeric representation of a dual value.
    * >> This parameter is mandatory.
    */
  def setDualValue(qText: java.lang.String, qNum: scala.Double): js.Promise[scala.Unit]
  /**
    * Sets a numerical value to a variable.
    *
    * Note: These changes are not persistent. They only last the duration of the engine session.
    * @param qVal - Value of the variable.
    */
  def setNumValue(qVal: scala.Double): js.Promise[scala.Unit]
  /**
    * Sets some properties for a variable.
    *
    * Note: The identifier of a variable cannot be modified.
    * You cannot update the properties of a script-defined variable using the SetProperties method.
    * @param - Information about the variable.
    * >> This parameter is mandatory.
    */
  def setProperties(qProp: IGenericVariableProperties): js.Promise[scala.Unit]
  /**
    * Sets a string value to a variable.
    * Note: These changes are not persistent. They only last the duration of the engine session.
    * @param qVal - Value of the variable. The string can contain an expression.
    */
  def setStringValue(qVal: java.lang.String): js.Promise[scala.Unit]
}

