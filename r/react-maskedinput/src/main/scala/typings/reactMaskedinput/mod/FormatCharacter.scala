package typings.reactMaskedinput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatCharacter extends js.Object {
  
  var transform: js.UndefOr[js.Function1[/* char */ String, String]] = js.native
  
  def validate(char: String): String = js.native
}
object FormatCharacter {
  
  @scala.inline
  def apply(validate: String => String): FormatCharacter = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[FormatCharacter]
  }
  
  @scala.inline
  implicit class FormatCharacterOps[Self <: FormatCharacter] (val x: Self) extends AnyVal {
    
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
    def setValidate(value: String => String): Self = this.set("validate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransform(value: /* char */ String => String): Self = this.set("transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
