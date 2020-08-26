package typings.reactBootstrapTableNext.anon

import typings.reactBootstrapTableNext.mod.ColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnClick[T /* <: js.Object */, E] extends js.Object {
  def onClick(e: js.Any, column: ColumnDescription[T, E], columnIndex: Double): Unit = js.native
}

object OnClick {
  @scala.inline
  def apply[/* <: js.Object */ T, E](onClick: (js.Any, ColumnDescription[T, E], Double) => Unit): OnClick[T, E] = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction3(onClick))
    __obj.asInstanceOf[OnClick[T, E]]
  }
  @scala.inline
  implicit class OnClickOps[Self <: OnClick[_, _], /* <: js.Object */ T, E] (val x: Self with (OnClick[T, E])) extends AnyVal {
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
    def setOnClick(value: (js.Any, ColumnDescription[T, E], Double) => Unit): Self = this.set("onClick", js.Any.fromFunction3(value))
  }
  
}

