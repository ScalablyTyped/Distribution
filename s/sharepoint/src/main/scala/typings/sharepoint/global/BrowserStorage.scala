package typings.sharepoint.global

import typings.sharepoint.BrowserStorage.CachedStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Available only in SharePoint Online*/
@JSGlobal("BrowserStorage")
@js.native
object BrowserStorage extends js.Object {
  val local: CachedStorage = js.native
  val session: CachedStorage = js.native
}

