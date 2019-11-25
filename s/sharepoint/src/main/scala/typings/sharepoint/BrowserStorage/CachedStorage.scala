package typings.sharepoint.BrowserStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Available only in SharePoint Online*/
trait CachedStorage extends js.Object {
  var length: Double
  def clead(): Unit
  def getItem(key: String): String
  def removeItem(key: String): Unit
  def setItem(key: String, value: String): Unit
}

object CachedStorage {
  @scala.inline
  def apply(
    clead: () => Unit,
    getItem: String => String,
    length: Double,
    removeItem: String => Unit,
    setItem: (String, String) => Unit
  ): CachedStorage = {
    val __obj = js.Dynamic.literal(clead = js.Any.fromFunction0(clead), getItem = js.Any.fromFunction1(getItem), length = length.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
  
    __obj.asInstanceOf[CachedStorage]
  }
}

