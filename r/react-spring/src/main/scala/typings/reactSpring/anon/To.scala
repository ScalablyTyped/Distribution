package typings.reactSpring.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait To extends js.Object {
  var to: /* import warning: importer.ImportType#apply Failed type conversion: infer TTo */ js.Any = js.native
}

object To {
  @scala.inline
  def apply(to: /* import warning: importer.ImportType#apply Failed type conversion: infer TTo */ js.Any): To = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[To]
  }
  @scala.inline
  implicit class ToOps[Self <: To] (val x: Self) extends AnyVal {
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
    def setTo(value: /* import warning: importer.ImportType#apply Failed type conversion: infer TTo */ js.Any): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}

