package typings.semanticUiTransition.SemanticUI.Transition.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impl extends js.Object {
  
  /**
    * @default 'The method you called is not defined'
    */
  var method: String = js.native
  
  /**
    * @default 'There is no CSS animation matching the one you specified.'
    */
  var noAnimation: String = js.native
}
object Impl {
  
  @scala.inline
  def apply(method: String, noAnimation: String): Impl = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], noAnimation = noAnimation.asInstanceOf[js.Any])
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoAnimation(value: String): Self = this.set("noAnimation", value.asInstanceOf[js.Any])
  }
}
