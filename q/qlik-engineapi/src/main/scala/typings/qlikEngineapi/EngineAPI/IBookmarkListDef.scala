package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.qlikEngineapiStrings.bookmark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BookmarkListDef
  */
trait IBookmarkListDef extends js.Object {
  /**
    * Data typ JSON
    */
  var qData: js.Any
  /**
    * Type of the list
    */
  var qType: bookmark
}

object IBookmarkListDef {
  @scala.inline
  def apply(qData: js.Any, qType: bookmark): IBookmarkListDef = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBookmarkListDef]
  }
}

