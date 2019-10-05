package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericListLayout...
  */
trait IGenericListLayout extends IGenericBaseLayout {
  var qListObject: IListObject
}

object IGenericListLayout {
  @scala.inline
  def apply(qInfo: INxInfo, qListObject: IListObject, qMeta: INxMeta): IGenericListLayout = {
    val __obj = js.Dynamic.literal(qInfo = qInfo, qListObject = qListObject, qMeta = qMeta)
  
    __obj.asInstanceOf[IGenericListLayout]
  }
}

