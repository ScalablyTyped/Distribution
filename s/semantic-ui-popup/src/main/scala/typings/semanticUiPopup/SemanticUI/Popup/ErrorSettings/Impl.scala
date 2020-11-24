package typings.semanticUiPopup.SemanticUI.Popup.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impl extends js.Object {
  
  /**
    * @default 'Popup does not fit within the boundaries of the viewport'
    */
  var cannotPlace: String = js.native
  
  /**
    * @default 'The position you specified is not a valid position'
    */
  var invalidPosition: String = js.native
  
  /**
    * @default 'The method you called is not defined.'
    */
  var method: String = js.native
  
  /**
    * @default 'This module requires ui transitions <https: github.com="" semantic-org="" ui-transition="">'
    */
  var noTransition: String = js.native
  
  /**
    * @default 'The target or popup you specified does not exist on the page'
    */
  var notFound: String = js.native
}
object Impl {
  
  @scala.inline
  def apply(
    cannotPlace: String,
    invalidPosition: String,
    method: String,
    noTransition: String,
    notFound: String
  ): Impl = {
    val __obj = js.Dynamic.literal(cannotPlace = cannotPlace.asInstanceOf[js.Any], invalidPosition = invalidPosition.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], noTransition = noTransition.asInstanceOf[js.Any], notFound = notFound.asInstanceOf[js.Any])
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
    def setCannotPlace(value: String): Self = this.set("cannotPlace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidPosition(value: String): Self = this.set("invalidPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoTransition(value: String): Self = this.set("noTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFound(value: String): Self = this.set("notFound", value.asInstanceOf[js.Any])
  }
}
