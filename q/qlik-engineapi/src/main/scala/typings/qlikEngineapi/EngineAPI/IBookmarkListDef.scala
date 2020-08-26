package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.qlikEngineapiStrings.bookmark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BookmarkListDef
  */
@js.native
trait IBookmarkListDef extends js.Object {
  /**
    * Data typ JSON
    */
  var qData: js.Any = js.native
  /**
    * Type of the list
    */
  var qType: bookmark = js.native
}

object IBookmarkListDef {
  @scala.inline
  def apply(qData: js.Any, qType: bookmark): IBookmarkListDef = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBookmarkListDef]
  }
  @scala.inline
  implicit class IBookmarkListDefOps[Self <: IBookmarkListDef] (val x: Self) extends AnyVal {
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
    def setQData(value: js.Any): Self = this.set("qData", value.asInstanceOf[js.Any])
    @scala.inline
    def setQType(value: bookmark): Self = this.set("qType", value.asInstanceOf[js.Any])
  }
  
}

