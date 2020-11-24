package typings.reactInstantsearchCore.anon

import typings.reactInstantsearchCore.mod.Refinement
import typings.reactInstantsearchCore.mod.RefinementValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.CurrentRefinementsProvided> */
@js.native
trait PartialCurrentRefinements extends js.Object {
  
  var items: js.UndefOr[js.Array[Refinement]] = js.native
  
  var query: js.UndefOr[String] = js.native
  
  var refine: js.UndefOr[
    js.Function1[/* refinement */ RefinementValue | (js.Array[Refinement | RefinementValue]), Unit]
  ] = js.native
}
object PartialCurrentRefinements {
  
  @scala.inline
  def apply(): PartialCurrentRefinements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCurrentRefinements]
  }
  
  @scala.inline
  implicit class PartialCurrentRefinementsOps[Self <: PartialCurrentRefinements] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: Refinement*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Refinement]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setRefine(value: /* refinement */ RefinementValue | (js.Array[Refinement | RefinementValue]) => Unit): Self = this.set("refine", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRefine: Self = this.set("refine", js.undefined)
  }
}
