package typings.storybookUi.anon

import typings.storybookAddonActions.handlerFunctionMod.HandlerFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Id extends js.Object {
  var id: String = js.native
  var onClick: HandlerFunction = js.native
  var title: String = js.native
}

object Id {
  @scala.inline
  def apply(id: String, onClick: /* repeated */ js.Any => Unit, title: String): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  @scala.inline
  implicit class IdOps[Self <: Id] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClick(value: /* repeated */ js.Any => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

