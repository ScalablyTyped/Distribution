package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericSelectionListProperties width extend GenericObjectProperties
  */
trait IGenericSelectionListProperties extends IGenericObjectProperties {
  @JSName("qInfo")
  var qInfo_IGenericSelectionListProperties: IGenericSelectionNxInfo
  var qSelectionObjectDef: js.Any
}

object IGenericSelectionListProperties {
  @scala.inline
  def apply(qInfo: IGenericSelectionNxInfo, qSelectionObjectDef: js.Any, qExtendsId: String = null): IGenericSelectionListProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo, qSelectionObjectDef = qSelectionObjectDef)
    if (qExtendsId != null) __obj.updateDynamic("qExtendsId")(qExtendsId)
    __obj.asInstanceOf[IGenericSelectionListProperties]
  }
}

