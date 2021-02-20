package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CharRange...
  */
@js.native
trait ICharRange extends StObject {
  
  /*
    * Number of occurrences found
    */
  var qCharCount: Double = js.native
  
  /**
    * Position of the first search occurrence
    */
  var qCharPos: Double = js.native
}
object ICharRange {
  
  @scala.inline
  def apply(qCharCount: Double, qCharPos: Double): ICharRange = {
    val __obj = js.Dynamic.literal(qCharCount = qCharCount.asInstanceOf[js.Any], qCharPos = qCharPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICharRange]
  }
  
  @scala.inline
  implicit class ICharRangeMutableBuilder[Self <: ICharRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQCharCount(value: Double): Self = StObject.set(x, "qCharCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQCharPos(value: Double): Self = StObject.set(x, "qCharPos", value.asInstanceOf[js.Any])
  }
}
