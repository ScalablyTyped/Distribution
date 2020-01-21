package typings.storybookReactNative.previewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncStorage extends js.Object {
  def getItem[T](key: String): js.Promise[T]
  def setItem[T](key: String, value: T): js.Promise[Unit]
}

object AsyncStorage {
  @scala.inline
  def apply(getItem: String => js.Promise[js.Any], setItem: (String, js.Any) => js.Promise[Unit]): AsyncStorage = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), setItem = js.Any.fromFunction2(setItem))
  
    __obj.asInstanceOf[AsyncStorage]
  }
}

