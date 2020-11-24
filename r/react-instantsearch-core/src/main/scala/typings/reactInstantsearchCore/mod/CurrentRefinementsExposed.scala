package typings.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentRefinementsExposed extends js.Object {
  
  /** Pass true to also clear the search query */
  var clearsQuery: js.UndefOr[Boolean] = js.native
  
  /**
    * Function to modify the items being displayed, e.g. for filtering or sorting them.
    * Takes an items as parameter and expects it back in return.
    */
  var transformItems: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}
object CurrentRefinementsExposed {
  
  @scala.inline
  def apply(): CurrentRefinementsExposed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentRefinementsExposed]
  }
  
  @scala.inline
  implicit class CurrentRefinementsExposedOps[Self <: CurrentRefinementsExposed] (val x: Self) extends AnyVal {
    
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
    def setClearsQuery(value: Boolean): Self = this.set("clearsQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearsQuery: Self = this.set("clearsQuery", js.undefined)
    
    @scala.inline
    def setTransformItems(value: /* repeated */ js.Any => _): Self = this.set("transformItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransformItems: Self = this.set("transformItems", js.undefined)
  }
}
