package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentRefinement extends StObject {
  
  var currentRefinement: String
  
  var items: Unit
}
object CurrentRefinement {
  
  @scala.inline
  def apply(currentRefinement: String, items: Unit): CurrentRefinement = {
    val __obj = js.Dynamic.literal(currentRefinement = currentRefinement.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentRefinement]
  }
  
  @scala.inline
  implicit class CurrentRefinementMutableBuilder[Self <: CurrentRefinement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentRefinement(value: String): Self = StObject.set(x, "currentRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: Unit): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
  }
}
