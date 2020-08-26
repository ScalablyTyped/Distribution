package typings.storybookReactNative.previewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncStorage extends js.Object {
  def getItem[T](key: String): js.Promise[T] = js.native
  def setItem[T](key: String, value: T): js.Promise[Unit] = js.native
}

object AsyncStorage {
  @scala.inline
  def apply(getItem: String => js.Promise[js.Any], setItem: (String, js.Any) => js.Promise[Unit]): AsyncStorage = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[AsyncStorage]
  }
  @scala.inline
  implicit class AsyncStorageOps[Self <: AsyncStorage] (val x: Self) extends AnyVal {
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
    def setGetItem(value: String => js.Promise[js.Any]): Self = this.set("getItem", js.Any.fromFunction1(value))
    @scala.inline
    def setSetItem(value: (String, js.Any) => js.Promise[Unit]): Self = this.set("setItem", js.Any.fromFunction2(value))
  }
  
}

