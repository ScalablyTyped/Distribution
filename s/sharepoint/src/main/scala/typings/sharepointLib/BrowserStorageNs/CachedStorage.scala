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
    clead: js.Function0[scala.Unit],
    getItem: js.Function1[java.lang.String, java.lang.String],
    length: scala.Double,
    removeItem: js.Function1[java.lang.String, scala.Unit],
    setItem: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): CachedStorage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clead")(clead)
    __obj.updateDynamic("getItem")(getItem)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("removeItem")(removeItem)
    __obj.updateDynamic("setItem")(setItem)
    __obj.asInstanceOf[CachedStorage]
  }
}

