package typings.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchBoxProvided extends js.Object {
  
  /** the current query used */
  var currentRefinement: String = js.native
  
  /** a flag that indicates if InstantSearch has detected that searches are stalled */
  var isSearchStalled: Boolean = js.native
  
  /** a function to change the current query */
  def refine(args: js.Any*): js.Any = js.native
}
object SearchBoxProvided {
  
  @scala.inline
  def apply(currentRefinement: String, isSearchStalled: Boolean, refine: /* repeated */ js.Any => js.Any): SearchBoxProvided = {
    val __obj = js.Dynamic.literal(currentRefinement = currentRefinement.asInstanceOf[js.Any], isSearchStalled = isSearchStalled.asInstanceOf[js.Any], refine = js.Any.fromFunction1(refine))
    __obj.asInstanceOf[SearchBoxProvided]
  }
  
  @scala.inline
  implicit class SearchBoxProvidedOps[Self <: SearchBoxProvided] (val x: Self) extends AnyVal {
    
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
    def setCurrentRefinement(value: String): Self = this.set("currentRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSearchStalled(value: Boolean): Self = this.set("isSearchStalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefine(value: /* repeated */ js.Any => js.Any): Self = this.set("refine", js.Any.fromFunction1(value))
  }
}
