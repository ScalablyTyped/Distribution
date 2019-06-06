package typings
package store2Lib.store2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Storage extends js.Object {
  var length: scala.Double
  def clear(): scala.Unit
  def getItem(key: java.lang.String): java.lang.String
  def key(index: scala.Double): java.lang.String
  def removeItem(key: java.lang.String): scala.Unit
  def setItem(key: java.lang.String, value: java.lang.String): scala.Unit
}

object Storage {
  @scala.inline
  def apply(
    clear: () => scala.Unit,
    getItem: java.lang.String => java.lang.String,
    key: scala.Double => java.lang.String,
    length: scala.Double,
    removeItem: java.lang.String => scala.Unit,
    setItem: (java.lang.String, java.lang.String) => scala.Unit
  ): Storage = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), key = js.Any.fromFunction1(key), length = length, removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
  
    __obj.asInstanceOf[Storage]
  }
}

