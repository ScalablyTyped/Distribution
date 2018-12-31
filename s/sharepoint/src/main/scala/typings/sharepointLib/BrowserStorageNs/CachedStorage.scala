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

