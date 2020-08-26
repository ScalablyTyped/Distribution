package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericFieldLayout width extend GenericObjectLayout
  */
@js.native
trait IGenericFieldLayout extends IGenericBaseLayout {
  /**
    * FieldListObject...
    */
  var qFieldListObject: IFieldList = js.native
}

object IGenericFieldLayout {
  @scala.inline
  def apply(qFieldListObject: IFieldList, qInfo: INxInfo, qMeta: INxMeta): IGenericFieldLayout = {
    val __obj = js.Dynamic.literal(qFieldListObject = qFieldListObject.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericFieldLayout]
  }
  @scala.inline
  implicit class IGenericFieldLayoutOps[Self <: IGenericFieldLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQFieldListObject(value: IFieldList): Self = this.set("qFieldListObject", value.asInstanceOf[js.Any])
  }
  
}

