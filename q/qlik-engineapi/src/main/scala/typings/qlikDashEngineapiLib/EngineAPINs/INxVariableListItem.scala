package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxVariableListItem...
  */
trait INxVariableListItem extends js.Object {
  /**
    * Data.
    */
  var qData: js.Any
  /**
    * Definition of the variable. It can be a value or an expression.
    */
  var qDefinition: java.lang.String
  /**
    * Description of the variable.
    */
  var qDescription: java.lang.String
  /**
    * Identifier and type of the object.
    * >> This parameter is mandatory.
    */
  var qInfo: INxInfo
  /**
    * If set to true, it means that the variable is a system variable.
    * A system variable provides information about the system and is set by the engine.
    * The content cannot be changed by the user.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qIsConfig: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set to true, it means that the variable is reserved.
    * >> This parameter is optional.
    * >> The default value is false.
    *
    * Examples:
    * - ScriptError is a reserved variable, set by the engine.
    * - DayNames is a reserved variable, set by the user.
    */
  var qIsReserved: js.UndefOr[scala.Boolean] = js.undefined
   // ? nicht dokumentiert
  /**
    * If set to true, it means that the variable was defined via script.
    */
  var qIsScriptCreated: scala.Boolean
  /**
    * Information about publishing and permissions.
    * >> This parameter is optional.
    */
  var qMeta: js.UndefOr[INxMeta] = js.undefined
  /**
    * Name of the variable.
    */
  var qName: java.lang.String
}

object INxVariableListItem {
  @scala.inline
  def apply(
    qData: js.Any,
    qDefinition: java.lang.String,
    qDescription: java.lang.String,
    qInfo: INxInfo,
    qIsScriptCreated: scala.Boolean,
    qName: java.lang.String,
    qIsConfig: js.UndefOr[scala.Boolean] = js.undefined,
    qIsReserved: js.UndefOr[scala.Boolean] = js.undefined,
    qMeta: INxMeta = null
  ): INxVariableListItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qData")(qData)
    __obj.updateDynamic("qDefinition")(qDefinition)
    __obj.updateDynamic("qDescription")(qDescription)
    __obj.updateDynamic("qInfo")(qInfo)
    __obj.updateDynamic("qIsScriptCreated")(qIsScriptCreated)
    __obj.updateDynamic("qName")(qName)
    if (!js.isUndefined(qIsConfig)) __obj.updateDynamic("qIsConfig")(qIsConfig)
    if (!js.isUndefined(qIsReserved)) __obj.updateDynamic("qIsReserved")(qIsReserved)
    if (qMeta != null) __obj.updateDynamic("qMeta")(qMeta)
    __obj.asInstanceOf[INxVariableListItem]
  }
}

