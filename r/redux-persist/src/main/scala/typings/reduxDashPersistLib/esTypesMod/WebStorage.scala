package typings
package reduxDashPersistLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebStorage extends js.Object {
  /**
    * Fetches key and returns item in a promise.
    */
  def getItem(key: java.lang.String): js.Promise[java.lang.String]
  /**
    * Removes value for key.
    */
  def removeItem(key: java.lang.String): js.Promise[scala.Unit]
  /**
    * Sets value for key and returns item in a promise.
    */
  def setItem(key: java.lang.String, item: java.lang.String): js.Promise[java.lang.String]
}

object WebStorage {
  @scala.inline
  def apply(
    getItem: js.Function1[java.lang.String, js.Promise[java.lang.String]],
    removeItem: js.Function1[java.lang.String, js.Promise[scala.Unit]],
    setItem: js.Function2[java.lang.String, java.lang.String, js.Promise[java.lang.String]]
  ): WebStorage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getItem")(getItem)
    __obj.updateDynamic("removeItem")(removeItem)
    __obj.updateDynamic("setItem")(setItem)
    __obj.asInstanceOf[WebStorage]
  }
}

