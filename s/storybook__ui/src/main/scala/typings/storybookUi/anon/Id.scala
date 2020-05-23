package typings.storybookUi.anon

import typings.storybookAddonActions.handlerFunctionMod.HandlerFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var id: String
  var onClick: HandlerFunction
  var title: String
}

object Id {
  @scala.inline
  def apply(id: String, onClick: /* repeated */ js.Any => Unit, title: String): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

