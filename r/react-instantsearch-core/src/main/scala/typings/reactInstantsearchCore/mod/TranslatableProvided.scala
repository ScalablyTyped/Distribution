package typings.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranslatableProvided extends js.Object {
  
  def translate(key: String, params: js.Any*): String = js.native
}
object TranslatableProvided {
  
  @scala.inline
  def apply(translate: (String, /* repeated */ js.Any) => String): TranslatableProvided = {
    val __obj = js.Dynamic.literal(translate = js.Any.fromFunction2(translate))
    __obj.asInstanceOf[TranslatableProvided]
  }
  
  @scala.inline
  implicit class TranslatableProvidedOps[Self <: TranslatableProvided] (val x: Self) extends AnyVal {
    
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
    def setTranslate(value: (String, /* repeated */ js.Any) => String): Self = this.set("translate", js.Any.fromFunction2(value))
  }
}
