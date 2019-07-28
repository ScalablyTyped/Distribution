package typings.qlikDashEngineapi.EngineAPINs

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
  var qDefinition: String
  /**
    * Description of the variable.
    */
  var qDescription: String
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
  var qIsConfig: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, it means that the variable is reserved.
    * >> This parameter is optional.
    * >> The default value is false.
    *
    * Examples:
    * - ScriptError is a reserved variable, set by the engine.
    * - DayNames is a reserved variable, set by the user.
    */
  var qIsReserved: js.UndefOr[Boolean] = js.undefined
   // ? nicht dokumentiert
  /**
    * If set to true, it means that the variable was defined via script.
    */
  var qIsScriptCreated: Boolean
  /**
    * Information about publishing and permissions.
    * >> This parameter is optional.
    */
  var qMeta: js.UndefOr[INxMeta] = js.undefined
  /**
    * Name of the variable.
    */
  var qName: String
}

object INxVariableListItem {
  @scala.inline
  def apply(
    qData: js.Any,
    qDefinition: String,
    qDescription: String,
    qInfo: INxInfo,
    qIsScriptCreated: Boolean,
    qName: String,
    qIsConfig: js.UndefOr[Boolean] = js.undefined,
    qIsReserved: js.UndefOr[Boolean] = js.undefined,
    qMeta: INxMeta = null
  ): INxVariableListItem = {
    val __obj = js.Dynamic.literal(qData = qData, qDefinition = qDefinition, qDescription = qDescription, qInfo = qInfo, qIsScriptCreated = qIsScriptCreated, qName = qName)
    if (!js.isUndefined(qIsConfig)) __obj.updateDynamic("qIsConfig")(qIsConfig)
    if (!js.isUndefined(qIsReserved)) __obj.updateDynamic("qIsReserved")(qIsReserved)
    if (qMeta != null) __obj.updateDynamic("qMeta")(qMeta)
    __obj.asInstanceOf[INxVariableListItem]
  }
}

