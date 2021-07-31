package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INxPageTreeLevel extends StObject {
  
  /**
    * Number of dimensions to include in the tree.
    */
  var qDepth: Double
  
  /**
    * The first dimension that is to be part of the tree, counted from the left.
    * For example, if qLeft is equal to 1, omit nodes from the first dimension in the current sort order.
    */
  var qLeft: Double
}
object INxPageTreeLevel {
  
  @scala.inline
  def apply(qDepth: Double, qLeft: Double): INxPageTreeLevel = {
    val __obj = js.Dynamic.literal(qDepth = qDepth.asInstanceOf[js.Any], qLeft = qLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxPageTreeLevel]
  }
  
  @scala.inline
  implicit class INxPageTreeLevelMutableBuilder[Self <: INxPageTreeLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDepth(value: Double): Self = StObject.set(x, "qDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLeft(value: Double): Self = StObject.set(x, "qLeft", value.asInstanceOf[js.Any])
  }
}
