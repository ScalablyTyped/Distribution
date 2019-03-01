package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericFieldLayout width extend GenericObjectLayout
  */
trait IGenericFieldLayout extends IGenericBaseLayout {
  /**
    * FieldListObject...
    */
  var qFieldListObject: IFieldList
}

object IGenericFieldLayout {
  @scala.inline
  def apply(qFieldListObject: IFieldList, qInfo: INxInfo, qMeta: INxMeta): IGenericFieldLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qFieldListObject")(qFieldListObject)
    __obj.updateDynamic("qInfo")(qInfo)
    __obj.updateDynamic("qMeta")(qMeta)
    __obj.asInstanceOf[IGenericFieldLayout]
  }
}

