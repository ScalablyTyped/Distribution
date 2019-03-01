package typings
package qlikDashEngineapiLib.EngineAPINs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qInfo")(qInfo)
    __obj.updateDynamic("qMeta")(qMeta)
    __obj.updateDynamic("qVariableListObject")(qVariableListObject)
    __obj.asInstanceOf[IGenericVariableListLayout]
  }
}

