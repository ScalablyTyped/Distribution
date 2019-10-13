package typings.atStorybookUi

import typings.atStorybookAddonDashActions.distModelsHandlerFunctionMod.HandlerFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: String
  var onClick: HandlerFunction
  var title: String
}

object Anon_Id {
  @scala.inline
  def apply(id: String, onClick: /* repeated */ js.Any => Unit, title: String): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id, onClick = js.Any.fromFunction1(onClick), title = title)
  
    __obj.asInstanceOf[Anon_Id]
  }
}

