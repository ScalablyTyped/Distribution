package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Is the layout for GenericVariableProperties.
  */
trait IGenericVariableLayout extends IGenericBaseLayout {
  /**
    * If set to true, it means that the variable was defined via script.
    */
  var qIsScriptCreated: Boolean
  /**
    * A value.
    */
  var qNum: Double
  /**
    * Some text.
    */
  var qText: String
}

object IGenericVariableLayout {
  @scala.inline
  def apply(qInfo: INxInfo, qIsScriptCreated: Boolean, qMeta: INxMeta, qNum: Double, qText: String): IGenericVariableLayout = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qIsScriptCreated = qIsScriptCreated.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qNum = qNum.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericVariableLayout]
  }
}

