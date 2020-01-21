package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericBookmarkListProperties width extend GenericProperties
  */
trait IGenericBookmarkListProperties extends IGenericProperties {
  var qBookmarkListDef: IBookmarkListDef
  @JSName("qInfo")
  var qInfo_IGenericBookmarkListProperties: IGenericBookmarkListNxInfo
}

object IGenericBookmarkListProperties {
  @scala.inline
  def apply(qBookmarkListDef: IBookmarkListDef, qInfo: IGenericBookmarkListNxInfo): IGenericBookmarkListProperties = {
    val __obj = js.Dynamic.literal(qBookmarkListDef = qBookmarkListDef.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGenericBookmarkListProperties]
  }
}

