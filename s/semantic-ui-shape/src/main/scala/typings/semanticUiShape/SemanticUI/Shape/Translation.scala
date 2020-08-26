package typings.semanticUiShape.SemanticUI.Shape

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Translation extends js.Object {
  var transform: String = js.native
}

object Translation {
  @scala.inline
  def apply(transform: String): Translation = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Translation]
  }
  @scala.inline
  implicit class TranslationOps[Self <: Translation] (val x: Self) extends AnyVal {
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
    def setTransform(value: String): Self = this.set("transform", value.asInstanceOf[js.Any])
  }
  
}

