package typings.solidAuthClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncStorage extends js.Object {
  def getItem(key: String): js.Promise[js.UndefOr[String]]
  def removeItem(key: String): js.Promise[Unit]
  def setItem(key: String, value: String): js.Promise[Unit]
}

object AsyncStorage {
  @scala.inline
  def apply(
    getItem: String => js.Promise[js.UndefOr[String]],
    removeItem: String => js.Promise[Unit],
    setItem: (String, String) => js.Promise[Unit]
  ): AsyncStorage = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
  
    __obj.asInstanceOf[AsyncStorage]
  }
}

