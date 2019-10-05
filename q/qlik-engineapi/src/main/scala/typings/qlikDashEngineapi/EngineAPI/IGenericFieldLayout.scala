package typings.qlikDashEngineapi.EngineAPI

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
    val __obj = js.Dynamic.literal(qFieldListObject = qFieldListObject, qInfo = qInfo, qMeta = qMeta)
  
    __obj.asInstanceOf[IGenericFieldLayout]
  }
}

