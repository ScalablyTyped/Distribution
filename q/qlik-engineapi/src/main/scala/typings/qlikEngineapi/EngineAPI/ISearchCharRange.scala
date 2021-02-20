package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchCharRange...
  */
@js.native
trait ISearchCharRange extends StObject {
  
  /**
    * Length of the match in the search result.
    */
  var qCharCount: Double = js.native
  
  /**
    * Starting position of the match in the search result, starting from 0.
    */
  var qCharPos: Double = js.native
  
  /**
    * Position of the term in the list of search terms, starting from 0.
    */
  var qTerm: Double = js.native
}
object ISearchCharRange {
  
  @scala.inline
  def apply(qCharCount: Double, qCharPos: Double, qTerm: Double): ISearchCharRange = {
    val __obj = js.Dynamic.literal(qCharCount = qCharCount.asInstanceOf[js.Any], qCharPos = qCharPos.asInstanceOf[js.Any], qTerm = qTerm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchCharRange]
  }
  
  @scala.inline
  implicit class ISearchCharRangeMutableBuilder[Self <: ISearchCharRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQCharCount(value: Double): Self = StObject.set(x, "qCharCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQCharPos(value: Double): Self = StObject.set(x, "qCharPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTerm(value: Double): Self = StObject.set(x, "qTerm", value.asInstanceOf[js.Any])
  }
}
