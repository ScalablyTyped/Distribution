package typings
package sharepointLib.BrowserStorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Available only in SharePoint Online*/
trait CachedStorage extends js.Object {
  var length: scala.Double
  def clead(): scala.Unit
  def getItem(key: java.lang.String): java.lang.String
  def removeItem(key: java.lang.String): scala.Unit
  def setItem(key: java.lang.String, value: java.lang.String): scala.Unit
}

object CachedStorage {
  @scala.inline
  def apply(
    clead: () => scala.Unit,
    getItem: java.lang.String => java.lang.String,
    length: scala.Double,
    removeItem: java.lang.String => scala.Unit,
    setItem: (java.lang.String, java.lang.String) => scala.Unit
  ): CachedStorage = {
    val __obj = js.Dynamic.literal(clead = js.Any.fromFunction0(clead), getItem = js.Any.fromFunction1(getItem), length = length, removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
  
    __obj.asInstanceOf[CachedStorage]
  }
}

