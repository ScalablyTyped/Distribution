package typings.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impl extends js.Object {
  
  /**
    * returns html for iframe
    */
  def iframe(url: String, parameters: String): String = js.native
  
  /**
    * returns html for placeholder element
    */
  def placeholder(image: String, icon: String): String = js.native
}
object Impl {
  
  @scala.inline
  def apply(iframe: (String, String) => String, placeholder: (String, String) => String): Impl = {
    val __obj = js.Dynamic.literal(iframe = js.Any.fromFunction2(iframe), placeholder = js.Any.fromFunction2(placeholder))
    __obj.asInstanceOf[Impl]
  }
  
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    
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
    def setIframe(value: (String, String) => String): Self = this.set("iframe", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPlaceholder(value: (String, String) => String): Self = this.set("placeholder", js.Any.fromFunction2(value))
  }
}
