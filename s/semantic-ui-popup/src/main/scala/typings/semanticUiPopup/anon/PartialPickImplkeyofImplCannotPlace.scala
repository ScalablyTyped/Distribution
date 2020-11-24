package typings.semanticUiPopup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-popup.SemanticUI.Popup.ErrorSettings._Impl, keyof semantic-ui-popup.SemanticUI.Popup.ErrorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplCannotPlace extends js.Object {
  
  var cannotPlace: js.UndefOr[String] = js.native
  
  var invalidPosition: js.UndefOr[String] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var noTransition: js.UndefOr[String] = js.native
  
  var notFound: js.UndefOr[String] = js.native
}
object PartialPickImplkeyofImplCannotPlace {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplCannotPlace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplCannotPlace]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplCannotPlaceOps[Self <: PartialPickImplkeyofImplCannotPlace] (val x: Self) extends AnyVal {
    
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
    def deleteCannotPlace: Self = this.set("cannotPlace", js.undefined)
    
    @scala.inline
    def setInvalidPosition(value: String): Self = this.set("invalidPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidPosition: Self = this.set("invalidPosition", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setNoTransition(value: String): Self = this.set("noTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoTransition: Self = this.set("noTransition", js.undefined)
    
    @scala.inline
    def setNotFound(value: String): Self = this.set("notFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotFound: Self = this.set("notFound", js.undefined)
  }
}
