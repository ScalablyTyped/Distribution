package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageQueue extends js.Object {
  def getCallableModule(name: String): js.Object
  def registerCallableModule(name: String, module: js.Object): Unit
  def registerLazyCallableModule(name: String, factory: js.Function0[js.Object]): Unit
}

object MessageQueue {
  @scala.inline
  def apply(
    getCallableModule: String => js.Object,
    registerCallableModule: (String, js.Object) => Unit,
    registerLazyCallableModule: (String, js.Function0[js.Object]) => Unit
  ): MessageQueue = {
    val __obj = js.Dynamic.literal(getCallableModule = js.Any.fromFunction1(getCallableModule), registerCallableModule = js.Any.fromFunction2(registerCallableModule), registerLazyCallableModule = js.Any.fromFunction2(registerLazyCallableModule))
    __obj.asInstanceOf[MessageQueue]
  }
}

