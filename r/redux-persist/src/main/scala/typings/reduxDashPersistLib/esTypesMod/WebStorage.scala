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
    getItem: java.lang.String => js.Promise[java.lang.String],
    removeItem: java.lang.String => js.Promise[scala.Unit],
    setItem: (java.lang.String, java.lang.String) => js.Promise[java.lang.String]
  ): WebStorage = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
  
    __obj.asInstanceOf[WebStorage]
  }
}

