package typings.reduxDashPersist.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebStorage extends js.Object {
  /**
    * Fetches key and returns item in a promise.
    */
  def getItem(key: String): js.Promise[String]
  /**
    * Removes value for key.
    */
  def removeItem(key: String): js.Promise[Unit]
  /**
    * Sets value for key and returns item in a promise.
    */
  def setItem(key: String, item: String): js.Promise[String]
}

object WebStorage {
  @scala.inline
  def apply(
    getItem: String => js.Promise[String],
    removeItem: String => js.Promise[Unit],
    setItem: (String, String) => js.Promise[String]
  ): WebStorage = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
  
    __obj.asInstanceOf[WebStorage]
  }
}

