package typings.reactSketchapp.anon

import typings.reactSketchapp.typesMod.SketchContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearExistingStyles extends js.Object {
  var clearExistingStyles: js.UndefOr[Boolean] = js.native
  var context: SketchContext = js.native
}

object ClearExistingStyles {
  @scala.inline
  def apply(context: SketchContext): ClearExistingStyles = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearExistingStyles]
  }
  @scala.inline
  implicit class ClearExistingStylesOps[Self <: ClearExistingStyles] (val x: Self) extends AnyVal {
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
    def setContext(value: SketchContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearExistingStyles(value: Boolean): Self = this.set("clearExistingStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearExistingStyles: Self = this.set("clearExistingStyles", js.undefined)
  }
  
}

