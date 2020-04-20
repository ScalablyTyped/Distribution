package typings.reactNativeShareExtension.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareExtension extends js.Object {
  def close(): Unit
  def data(): js.Promise[ShareData]
  def openURL(uri: String): Unit
}

object ShareExtension {
  @scala.inline
  def apply(close: () => Unit, data: () => js.Promise[ShareData], openURL: String => Unit): ShareExtension = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), data = js.Any.fromFunction0(data), openURL = js.Any.fromFunction1(openURL))
    __obj.asInstanceOf[ShareExtension]
  }
}

