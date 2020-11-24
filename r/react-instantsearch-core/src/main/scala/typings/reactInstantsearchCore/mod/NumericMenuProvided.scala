package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.anon.IsRefined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumericMenuProvided extends js.Object {
  
  /** a function to generate a URL for the corresponding search state */
  def createURL(args: js.Any*): js.Any = js.native
  
  /**
    * the refinement currently applied. follow the shape of a string with a pattern of '{start}:{end}' which corresponds to the current selected item.
    * For instance, when the selected item is {start: 10, end: 20}, the searchState of the widget is '10:20'. When start isn’t defined, the searchState
    * of the widget is ':{end}', and the same way around when end isn’t defined. However, when neither start nor end are defined, the searchState is an empty string.
    */
  var currentRefinement: String = js.native
  
  /** the list of ranges the NumericMenu can display. */
  var items: js.Array[IsRefined] = js.native
  
  /** a function to select a range. */
  def refine(args: js.Any*): js.Any = js.native
}
object NumericMenuProvided {
  
  @scala.inline
  def apply(
    createURL: /* repeated */ js.Any => js.Any,
    currentRefinement: String,
    items: js.Array[IsRefined],
    refine: /* repeated */ js.Any => js.Any
  ): NumericMenuProvided = {
    val __obj = js.Dynamic.literal(createURL = js.Any.fromFunction1(createURL), currentRefinement = currentRefinement.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], refine = js.Any.fromFunction1(refine))
    __obj.asInstanceOf[NumericMenuProvided]
  }
  
  @scala.inline
  implicit class NumericMenuProvidedOps[Self <: NumericMenuProvided] (val x: Self) extends AnyVal {
    
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
    def setCreateURL(value: /* repeated */ js.Any => js.Any): Self = this.set("createURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrentRefinement(value: String): Self = this.set("currentRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: IsRefined*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[IsRefined]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefine(value: /* repeated */ js.Any => js.Any): Self = this.set("refine", js.Any.fromFunction1(value))
  }
}
