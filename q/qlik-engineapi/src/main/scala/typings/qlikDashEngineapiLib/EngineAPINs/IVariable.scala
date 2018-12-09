package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This class describes all the methods that apply at variable level.
     *
     * Note: Methods in this class are deprecated. Use methods in the GenericVariable class instead.
     *
     * The handle member in the JSON request for all methods listed in this section is the handle of the variable.
     */

trait IVariable
  extends qlikDashEngineapiLib.enigmaJSNs.IGeneratedAPI {
  /**
           * Sets the value of a dual variable overriding any input constraints.
           *
           * Note: This method is deprecated (not recommended to use). Use SetProperties method instead.
           * Note: The ForceContent method does not evaluate any expression.
           * @param qs - String representation of a dual value.
           * Set this parameter to "", if the string representation is to be Null.
           * >> This parameter is mandatory.
           * @param qd - Numeric representation of a dual value.
           * >> This parameter is mandatory.
           */
  def forceContent(qs: java.lang.String, qd: scala.Double): js.Promise[scala.Unit]
  /**
           * Returns the calculated value of a variable.
           *
           * Note: This method is deprecated (not recommended to use). Use GetProperties method instead.
           */
  def getContent(): js.Promise[IAlfaNumString]
  /**
           * Gets the properties of a variable.
           *
           * Note: This method is deprecated (not recommended to use). Use GetProperties method instead.
           */
  def getNxProperties(): js.Promise[INxVariableProperties]
  /**
           * Returns the raw value of a variable.
           *
           * Note: This method is deprecated (not recommended to use). Use GetProperties method instead.
           */
  def getRawContent(): js.Promise[java.lang.String]
  /**
           * Sets a value to a variable.
           *
           * Note: This method is deprecated (not recommended to use). Use SetProperties method instead.
           * @param qContent - Value of the variable.
           * >> This parameter is mandatory.
           * @param qUpdateMRU - If set to true, the value is added to the Most Recently Used (MRU) list.
           * >> This parameter is mandatory.
           */
  def setContent(qContent: java.lang.String, qUpdateMRU: scala.Boolean): js.Promise[scala.Boolean]
  /**
           * Sets some properties to a variable.
           *
           * Note: This method is deprecated (not recommended to use). Use SetProperties method instead.
           *
           * In addition to the properties described below, dynamic properties can be added.
           * @param qProperties - Information about the properties of the variable
           */
  def setNxProperties(qProperties: INxVariableProperties): js.Promise[scala.Unit]
}

