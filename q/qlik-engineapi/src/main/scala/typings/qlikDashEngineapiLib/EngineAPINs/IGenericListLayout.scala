package typings
package qlikDashEngineapiLib.EngineAPINs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qInfo")(qInfo)
    __obj.updateDynamic("qListObject")(qListObject)
    __obj.updateDynamic("qMeta")(qMeta)
    __obj.asInstanceOf[IGenericListLayout]
  }
}

