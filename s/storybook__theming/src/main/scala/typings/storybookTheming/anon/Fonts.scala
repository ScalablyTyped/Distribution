package typings.storybookTheming.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fonts extends js.Object {
  var fonts: Base = js.native
  var size: Code = js.native
  var weight: Black = js.native
}

object Fonts {
  @scala.inline
  def apply(fonts: Base, size: Code, weight: Black): Fonts = {
    val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fonts]
  }
  @scala.inline
  implicit class FontsOps[Self <: Fonts] (val x: Self) extends AnyVal {
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
    def setFonts(value: Base): Self = this.set("fonts", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Code): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeight(value: Black): Self = this.set("weight", value.asInstanceOf[js.Any])
  }
  
}

