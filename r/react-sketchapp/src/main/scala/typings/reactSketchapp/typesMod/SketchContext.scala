package typings.reactSketchapp.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchContext extends js.Object {
  var document: SketchDocument = js.native
}

object SketchContext {
  @scala.inline
  def apply(document: SketchDocument): SketchContext = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchContext]
  }
  @scala.inline
  implicit class SketchContextOps[Self <: SketchContext] (val x: Self) extends AnyVal {
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
    def setDocument(value: SketchDocument): Self = this.set("document", value.asInstanceOf[js.Any])
  }
  
}

