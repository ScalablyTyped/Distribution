package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SerachMatchCombination...
  */
@js.native
trait ISerachMatchCombination extends StObject {
  
  /**
    * Information about the search matches.
    */
  var qFieldMatches: js.Array[ISerachFieldMatch] = js.native
  
  /**
    * Index of the search result, starting from 0.
    */
  var qId: Double = js.native
}
object ISerachMatchCombination {
  
  @scala.inline
  def apply(qFieldMatches: js.Array[ISerachFieldMatch], qId: Double): ISerachMatchCombination = {
    val __obj = js.Dynamic.literal(qFieldMatches = qFieldMatches.asInstanceOf[js.Any], qId = qId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISerachMatchCombination]
  }
  
  @scala.inline
  implicit class ISerachMatchCombinationMutableBuilder[Self <: ISerachMatchCombination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQFieldMatches(value: js.Array[ISerachFieldMatch]): Self = StObject.set(x, "qFieldMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFieldMatchesVarargs(value: ISerachFieldMatch*): Self = StObject.set(x, "qFieldMatches", js.Array(value :_*))
    
    @scala.inline
    def setQId(value: Double): Self = StObject.set(x, "qId", value.asInstanceOf[js.Any])
  }
}
