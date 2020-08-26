package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericBookmarkListProperties width extend GenericProperties
  */
@js.native
trait IGenericBookmarkListProperties extends IGenericProperties {
  var qBookmarkListDef: IBookmarkListDef = js.native
  @JSName("qInfo")
  var qInfo_IGenericBookmarkListProperties: IGenericBookmarkListNxInfo = js.native
}

object IGenericBookmarkListProperties {
  @scala.inline
  def apply(qBookmarkListDef: IBookmarkListDef, qInfo: IGenericBookmarkListNxInfo): IGenericBookmarkListProperties = {
    val __obj = js.Dynamic.literal(qBookmarkListDef = qBookmarkListDef.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericBookmarkListProperties]
  }
  @scala.inline
  implicit class IGenericBookmarkListPropertiesOps[Self <: IGenericBookmarkListProperties] (val x: Self) extends AnyVal {
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
    def setQBookmarkListDef(value: IBookmarkListDef): Self = this.set("qBookmarkListDef", value.asInstanceOf[js.Any])
    @scala.inline
    def setQInfo(value: IGenericBookmarkListNxInfo): Self = this.set("qInfo", value.asInstanceOf[js.Any])
  }
  
}

