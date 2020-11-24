package typings.semanticUiApi.SemanticUI.Api.RegExpSettings

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impl extends js.Object {
  
  /**
    * @default /\{\/\$*[A-z0-9]+\}/g
    */
  var optional: RegExp = js.native
  
  /**
    * @default /\{\$*[A-z0-9]+\}/g
    */
  var required: RegExp = js.native
}
object Impl {
  
  @scala.inline
  def apply(optional: RegExp, required: RegExp): Impl = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
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
    def setOptional(value: RegExp): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: RegExp): Self = this.set("required", value.asInstanceOf[js.Any])
  }
}
