package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentRefinement extends StObject {
  
  var currentRefinement: String = js.native
  
  var items: js.UndefOr[scala.Nothing] = js.native
}
object CurrentRefinement {
  
  @scala.inline
  def apply(currentRefinement: String): CurrentRefinement = {
    val __obj = js.Dynamic.literal(currentRefinement = currentRefinement.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentRefinement]
  }
  
  @scala.inline
  implicit class CurrentRefinementMutableBuilder[Self <: CurrentRefinement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentRefinement(value: String): Self = StObject.set(x, "currentRefinement", value.asInstanceOf[js.Any])
  }
}
