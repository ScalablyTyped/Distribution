package typings.store2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Storage extends js.Object {
  var length: Double = js.native
  def clear(): Unit = js.native
  def getItem(key: String): String = js.native
  def key(index: Double): String = js.native
  def removeItem(key: String): Unit = js.native
  def setItem(key: String, value: String): Unit = js.native
}

object Storage {
  @scala.inline
  def apply(
    clear: () => Unit,
    getItem: String => String,
    key: Double => String,
    length: Double,
    removeItem: String => Unit,
    setItem: (String, String) => Unit
  ): Storage = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), key = js.Any.fromFunction1(key), length = length.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[Storage]
  }
  @scala.inline
  implicit class StorageOps[Self <: Storage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setGetItem(value: String => String): Self = this.set("getItem", js.Any.fromFunction1(value))
    @scala.inline
    def setKey(value: Double => String): Self = this.set("key", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveItem(value: String => Unit): Self = this.set("removeItem", js.Any.fromFunction1(value))
    @scala.inline
    def setSetItem(value: (String, String) => Unit): Self = this.set("setItem", js.Any.fromFunction2(value))
  }
  
}

