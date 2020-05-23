package typings.qlik.anon

import typings.qlik.mod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetContent extends js.Object {
  def getContent(variable: String, callback: js.Function2[/* value */ Variable, /* app */ this.type, Unit]): js.Promise[_]
  def setContent(variable: String, value: String): Unit
}

object GetContent {
  @scala.inline
  def apply(
    getContent: (String, js.Function2[/* value */ Variable, GetContent, Unit]) => js.Promise[_],
    setContent: (String, String) => Unit
  ): GetContent = {
    val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction2(getContent), setContent = js.Any.fromFunction2(setContent))
    __obj.asInstanceOf[GetContent]
  }
}

