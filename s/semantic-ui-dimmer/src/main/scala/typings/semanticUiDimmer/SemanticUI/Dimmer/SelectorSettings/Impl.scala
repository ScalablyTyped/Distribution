package typings.semanticUiDimmer.SemanticUI.Dimmer.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impl extends js.Object {
  
  /**
    * @default '.ui.dimmer > .content, .ui.dimmer > .content > .center'
    */
  var content: String = js.native
  
  /**
    * @default '.dimmable'
    */
  var dimmable: String = js.native
  
  /**
    * @default '.ui.dimmer'
    */
  var dimmer: String = js.native
}
object Impl {
  
  @scala.inline
  def apply(content: String, dimmable: String, dimmer: String): Impl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], dimmable = dimmable.asInstanceOf[js.Any], dimmer = dimmer.asInstanceOf[js.Any])
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimmable(value: String): Self = this.set("dimmable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimmer(value: String): Self = this.set("dimmer", value.asInstanceOf[js.Any])
  }
}
