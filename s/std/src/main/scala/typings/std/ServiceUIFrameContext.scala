package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceUIFrameContext extends js.Object {
  def getCachedFrameMessage(key: java.lang.String): java.lang.String
  def postFrameMessage(key: java.lang.String, data: java.lang.String): Unit
}

object ServiceUIFrameContext {
  @scala.inline
  def apply(
    getCachedFrameMessage: java.lang.String => java.lang.String,
    postFrameMessage: (java.lang.String, java.lang.String) => Unit
  ): ServiceUIFrameContext = {
    val __obj = js.Dynamic.literal(getCachedFrameMessage = js.Any.fromFunction1(getCachedFrameMessage), postFrameMessage = js.Any.fromFunction2(postFrameMessage))
    __obj.asInstanceOf[ServiceUIFrameContext]
  }
}

