package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'glyphWidth'> */
@js.native
trait PickImplglyphWidth extends js.Object {
  var glyphWidth: Double = js.native
}

object PickImplglyphWidth {
  @scala.inline
  def apply(glyphWidth: Double): PickImplglyphWidth = {
    val __obj = js.Dynamic.literal(glyphWidth = glyphWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplglyphWidth]
  }
  @scala.inline
  implicit class PickImplglyphWidthOps[Self <: PickImplglyphWidth] (val x: Self) extends AnyVal {
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
    def setGlyphWidth(value: Double): Self = this.set("glyphWidth", value.asInstanceOf[js.Any])
  }
  
}

