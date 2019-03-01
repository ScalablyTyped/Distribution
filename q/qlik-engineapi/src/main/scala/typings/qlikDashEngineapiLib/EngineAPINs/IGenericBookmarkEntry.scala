package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericBookmarkEntry...
  */
trait IGenericBookmarkEntry extends js.Object {
  /**
    * Information about the bookmark.
    */
  var qBookmark: INxBookmark
  /**
    * Information about the properties of the bookmark.
    */
  var qProperties: IGenericBookmarkProperties
}

object IGenericBookmarkEntry {
  @scala.inline
  def apply(qBookmark: INxBookmark, qProperties: IGenericBookmarkProperties): IGenericBookmarkEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qBookmark")(qBookmark)
    __obj.updateDynamic("qProperties")(qProperties)
    __obj.asInstanceOf[IGenericBookmarkEntry]
  }
}

