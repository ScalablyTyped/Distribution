package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qType: qlikDashEngineapiLib.qlikDashEngineapiLibStrings.bookmark
}

object IBookmarkListDef {
  @scala.inline
  def apply(qData: js.Any, qType: qlikDashEngineapiLib.qlikDashEngineapiLibStrings.bookmark): IBookmarkListDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qData")(qData)
    __obj.updateDynamic("qType")(qType)
    __obj.asInstanceOf[IBookmarkListDef]
  }
}

