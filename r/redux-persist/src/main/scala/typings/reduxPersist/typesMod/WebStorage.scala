package typings.reduxPersist.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebStorage extends Storage {
  /**
    * @desc Fetches key and returns item in a promise.
    */
  def getItem(key: String): js.Promise[String | Null]
  /**
    * @desc Removes value for key.
    */
  def removeItem(key: String): js.Promise[Unit]
  /**
    * @desc Sets value for key and returns item in a promise.
    */
  def setItem(key: String, item: String): js.Promise[Unit]
}

object WebStorage {
  @scala.inline
  def apply(
    getItem: String => js.Promise[String | Null],
    removeItem: String => js.Promise[Unit],
    setItem: (String, String) => js.Promise[Unit]
  ): WebStorage = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[WebStorage]
  }
}

