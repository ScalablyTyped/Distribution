package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalAnimationOptions extends ViewAnimationOptions {
  
  /**
    * Animations to be applied on views in the appearing or disappearing screens
    */
  var elementTransitions: js.UndefOr[js.Array[ElementTransition]] = js.native
  
  /**
    * Animations to be applied on elements which are shared between the appearing and disappearing screens
    */
  var sharedElementTransitions: js.UndefOr[js.Array[SharedElementTransition]] = js.native
}
object ModalAnimationOptions {
  
  @scala.inline
  def apply(): ModalAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalAnimationOptions]
  }
  
  @scala.inline
  implicit class ModalAnimationOptionsOps[Self <: ModalAnimationOptions] (val x: Self) extends AnyVal {
    
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
    def setElementTransitionsVarargs(value: ElementTransition*): Self = this.set("elementTransitions", js.Array(value :_*))
    
    @scala.inline
    def setElementTransitions(value: js.Array[ElementTransition]): Self = this.set("elementTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementTransitions: Self = this.set("elementTransitions", js.undefined)
    
    @scala.inline
    def setSharedElementTransitionsVarargs(value: SharedElementTransition*): Self = this.set("sharedElementTransitions", js.Array(value :_*))
    
    @scala.inline
    def setSharedElementTransitions(value: js.Array[SharedElementTransition]): Self = this.set("sharedElementTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedElementTransitions: Self = this.set("sharedElementTransitions", js.undefined)
  }
}
