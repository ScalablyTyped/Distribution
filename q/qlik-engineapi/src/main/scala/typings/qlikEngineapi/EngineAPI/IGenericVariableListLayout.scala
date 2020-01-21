package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericVariableLayout width extend GenericObjectLayout
  */
trait IGenericVariableListLayout extends IGenericBaseLayout {
  var qVariableListObject: IVariableList
}

object IGenericVariableListLayout {
  @scala.inline
  def apply(qInfo: INxInfo, qMeta: INxMeta, qVariableListObject: IVariableList): IGenericVariableListLayout = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qVariableListObject = qVariableListObject.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGenericVariableListLayout]
  }
}

