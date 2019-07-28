package typings.qlik

import typings.qlik.qlikMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_App extends js.Object {
  def getContent(variable: String, callback: js.Function2[/* value */ Variable, /* app */ this.type, Unit]): js.Promise[_]
  def setContent(variable: String, value: String): Unit
}

object Anon_App {
  @scala.inline
  def apply(
    getContent: (String, js.Function2[/* value */ Variable, Anon_App, Unit]) => js.Promise[_],
    setContent: (String, String) => Unit
  ): Anon_App = {
    val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction2(getContent), setContent = js.Any.fromFunction2(setContent))
  
    __obj.asInstanceOf[Anon_App]
  }
}

