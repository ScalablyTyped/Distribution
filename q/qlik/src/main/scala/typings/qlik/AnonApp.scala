package typings.qlik

import typings.qlik.mod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApp extends js.Object {
  def getContent(variable: String, callback: js.Function2[/* value */ Variable, /* app */ this.type, Unit]): js.Promise[_]
  def setContent(variable: String, value: String): Unit
}

object AnonApp {
  @scala.inline
  def apply(
    getContent: (String, js.Function2[/* value */ Variable, AnonApp, Unit]) => js.Promise[_],
    setContent: (String, String) => Unit
  ): AnonApp = {
    val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction2(getContent), setContent = js.Any.fromFunction2(setContent))
  
    __obj.asInstanceOf[AnonApp]
  }
}

