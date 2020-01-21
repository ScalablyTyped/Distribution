package typings.storybookUi

import typings.storybookAddonActions.handlerFunctionMod.HandlerFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: String
  var onClick: HandlerFunction
  var title: String
}

object AnonId {
  @scala.inline
  def apply(id: String, onClick: /* repeated */ js.Any => Unit, title: String): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonId]
  }
}

